package ru.gapisovii.supersimple89bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws TelegramApiException {
        SpringApplication.run(Main.class);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Bot bot = context.getBean("bot", Bot.class);
        bot.asd();

        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);

        botsApi.registerBot(bot);
    }
}
