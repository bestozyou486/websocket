package jp.avengers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlertController {
	
	
	@MessageMapping("/aisatu")
	@SendTo("/topic/alert")
	public Alert alert(AlertMessage message) throws Exception {
		Thread.sleep(3000);
		return new Alert("demo, " + message.getName() + "!");
	}


	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
