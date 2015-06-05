package jp.avengers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//起動クラス
@RestController
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("jp.avengers")
public class AlertApplication {


	//処理実行
	public static void main(String[] args) {
		SpringApplication.run(AlertApplication.class, args);
	}

}


