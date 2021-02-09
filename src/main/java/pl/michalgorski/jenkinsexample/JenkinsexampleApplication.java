package pl.michalgorski.jenkinsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsexampleApplication.class, args);
	}

	public int add(int a, int b) {
		return a * b;
//		return a + b;
	}

}
