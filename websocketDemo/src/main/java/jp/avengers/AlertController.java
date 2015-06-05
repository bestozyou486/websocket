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
//		return new Alert();
		return new Alert("demo, " + message.getName() + "!");
//		return readJsonDataFile("alertData.json") ;
	}

//	
//	// 注意喚起一覧 データ	
//		@RequestMapping(value="category-Alert", method=RequestMethod.GET, produces = "application/json")
//		public String alertDataRead(Model model){
//
//			return readJsonDataFile("alertData.json") ;
//		}
//		
//		protected String filePath = "C:\\Users\\hong_s\\Documents\\demo\\websocketDemo\\src\\main\\resources\\static\\data\\";
//		protected String readJsonDataFile(String fileName) {
//			try {
//				return new String(Files.readAllBytes(Paths.get(filePath + fileName)), StandardCharsets.UTF_8);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return null;
//		}
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
