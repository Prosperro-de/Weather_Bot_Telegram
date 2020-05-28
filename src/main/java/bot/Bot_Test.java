/*
package bot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import service.impl.WeatherServiceImpl;

import java.awt.*;
import java.util.List;

public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotToken() {
        return "1169898674:AAE8zwi_m3PcZzOEPBDiBJgjyHXkCMe38fw";
    }


    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();


    @SneakyThrows
    @Override
    public synchronized void onUpdateReceived(Update update) {

        String cityName = update.getMessage().getText();
        var service = new WeatherServiceImpl();
        var sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(update.getMessage().getChatId());
        sendMessage.setText(service.getByCityName(cityName) + "\n \n \nPlease, enter the next city");

        System.out.println(update.getMessage().getText());

        KeyboardRow firstKeyboardRow = new KeyboardRow();
        firstKeyboardRow.add("Днепр");
        KeyboardRow secondKeyboardRow = new KeyboardRow();
        firstKeyboardRow.add("Schwebheim");
        KeyboardRow threeKeyboardRow = new KeyboardRow();
        firstKeyboardRow.add("Одесса");
        KeyboardRow fourKeyboardRow = new KeyboardRow();
        firstKeyboardRow.add("Киев");
        KeyboardRow fiveKeyboardRow = new KeyboardRow();
        firstKeyboardRow.add("Львов");
        KeyboardRow sixKeyboardRow = new KeyboardRow();
        secondKeyboardRow.add("Варшава");
        KeyboardRow sevenKeyboardRow = new KeyboardRow();
        secondKeyboardRow.add("München");
        KeyboardRow eightKeyboardRow = new KeyboardRow();
        secondKeyboardRow.add("Gerolzhofen");
        KeyboardRow nineKeyboardRow = new KeyboardRow();
        threeKeyboardRow.add("Schweinfurt");
        KeyboardRow tenKeyboardRow = new KeyboardRow();
        threeKeyboardRow.add("Kolitzheim");


        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setKeyboard(List.of(firstKeyboardRow, secondKeyboardRow, threeKeyboardRow, fourKeyboardRow,
                fiveKeyboardRow, sixKeyboardRow, sevenKeyboardRow, eightKeyboardRow, nineKeyboardRow, tenKeyboardRow));
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);

        execute(sendMessage);
    }




    @Override
    public String getBotUsername() {
        return "Weather_Man_Today_Bot";
    }
}


 */