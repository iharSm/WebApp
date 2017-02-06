package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException {
//    	String s;
//    	Process p = Runtime.getRuntime().exec("python C:\\Users\\deazz-dell2\\Dropbox\\Cornell\\2016Fall\\CS5786-Machine_Learning_for_Data_Science\\projects\\Invesco\\Invesco_p1.py");
//    	BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
//    	BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
//
//    	 while ((s = in.readLine()) != null) {
//
//             System.out.println(s);
//
//         }
//    	 
//         while ((s = stdError.readLine()) != null) {
//
//             System.out.println(s);
//
//         }
        SpringApplication.run(Application.class, args);
    }

}