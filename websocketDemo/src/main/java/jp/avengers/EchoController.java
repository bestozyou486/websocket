package jp.avengers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class EchoController {
    @MessageMapping("/echo")
    @SendTo("/subscribe/echo")
    public Hello sendEcho(Hello hello) throws Exception {
        System.out.println("receive message : " + hello.toString());
        Hello echoHello = new Hello();
        echoHello.setMessage(hello.getName());
        echoHello.setName(hello.getMessage());
        return echoHello;
    }
}