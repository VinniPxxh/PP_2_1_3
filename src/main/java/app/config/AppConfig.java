package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean("dog")
    public Dog getDog() {
        Dog dog = new Dog();
        return dog;
    }

    @Bean("getTimer")
    public Timer getTimer() {
        Timer getTimer = new Timer();
        return getTimer;
    }
}
