package ru.gapisovii.supersimple89bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {
    BotConfig botConfig = new BotConfig();

    @Override
    public String getBotUsername() {
        return botConfig.getName();
    }

    @Override
    public String getBotToken() {
        return botConfig.getKey();
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
    }

    public void asd() {
        System.out.println("P O I U");
    }
}
