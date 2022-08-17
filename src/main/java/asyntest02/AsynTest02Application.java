package asyntest02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author ymx
 * @Name AsynTest02SpringApplication
 * @CreateTime 2022/8/17
 * @ProjectName AsynTest02
 * @Description:
 */

@SpringBootApplication
@ComponentScan("asyntest02")
public class AsynTest02Application {
    public static void main(String[] args) {
        SpringApplication.run(AsynTest02Application.class, args);
    }
}
