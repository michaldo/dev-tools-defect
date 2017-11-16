package my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// uncomment this line to run smoothly
//(exclude=org.springframework.boot.devtools.autoconfigure.DevToolsDataSourceAutoConfiguration.class)
@ImportResource("classpath:/my-beans.xml")
public class MyApplication {

	public static void main(String[] args) {
		new SpringApplication(MyApplication.class).run(args);
	}

}
