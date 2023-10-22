package ru.gapisovii.supersimple89bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class BotConfig {
    @Value("${bot.name}")
    private String name;

    @Value("${bot.ket}")
    private String key;

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }
}
