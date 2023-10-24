package ru.gapisovii.supersimple89bot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public BotConfig botConfig(){
        return new BotConfig();
    }

    @Bean
    public Bot bot() {
        return new Bot();
    }
}
