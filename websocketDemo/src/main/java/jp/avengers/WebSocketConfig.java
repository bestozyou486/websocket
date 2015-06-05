package jp.avengers;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{
	
	
	//メッセージブローカーの設定を行う
	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		//メッセージを処理する Controller の呼び出しパスのプレフィックスを設定する
		config.setApplicationDestinationPrefixes("/alert");
		//購読セッションに対して配信するためのブローカーのプレフィックスを設定する
		config.enableSimpleBroker("/topic");
		
		config.enableSimpleBroker("/subscribe");
//		config.setApplicationDestinationPrefixes("/app");
		
	}
	
	
	//WebSocket のエンドポイントを登録する
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
//		registry.addEndpoint("/websocket").withSockJS();
		registry.addEndpoint("/aisatu").withSockJS();
//		registry.addEndpoint("/endpoint").withSockJS();
	}
	

}
