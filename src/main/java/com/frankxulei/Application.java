package com.frankxulei;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 
/**
 * @Package: com.frankxulei 
 * @ClassName: Application  
 * @Description: 《阿里巴巴Java Spring Boot2.0实战开发课程》参考代码
 *第1讲：Spring Boot2.0新特性和入门实战,https://yq.aliyun.com/live/583  
 *第2讲：Spring Boot2.0开发MVC网站并显示图片,https://yq.aliyun.com/live/592
 *第3课：Spring Boot2.0实战MySQL和3个高级面试题，https://yq.aliyun.com/live/612
 * @author: 阿里巴巴特邀Java专家讲师： 徐雷 Frank Xu Lei 
*/
@SpringBootApplication
public class Application implements CommandLineRunner {

 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("阿里巴巴Java Spring Boot2.0实战开发课程");
	}
}