
package bot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import service.impl.WeatherOneWeekServise;
import service.impl.WeatherServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static service.ApiConstants.CURRENT_WEATHER;
import static service.ApiConstants.WEATHER_FOR_TOMORROW;

public class Bot extends TelegramLongPollingBot {
    boolean booleanMarker = false;


    @Override
    public String getBotToken() {
        return "1169898674:AAE8zwi_m3PcZzOEPBDiBJgjyHXkCMe38fw";
    }


    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

    @SneakyThrows
    @Override
    public synchronized void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());



        KeyboardRow OneWeatherKeyboardRow = new KeyboardRow();
        KeyboardRow TwoWeatherKeyboardRow = new KeyboardRow();
        KeyboardRow ThreeWeatherKeyboardRow = new KeyboardRow();

        OneWeatherKeyboardRow.add("Current weather");
        OneWeatherKeyboardRow.add("Weather for tomorrow (test)");


        var sendMessage = new SendMessage();

        sendMessage.setText("Wait a moment...");
        sendMessage.setChatId(update.getMessage().getChatId());

        sendMessage.setReplyMarkup(replyKeyboardMarkup);


        List<KeyboardRow> rowArrayList = new ArrayList<>(List.of(OneWeatherKeyboardRow));

        replyKeyboardMarkup.setKeyboard(rowArrayList);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);

        String mainText = update.getMessage().getText().replace(' ', '-');
        execute(sendMessage);

        if (mainText.equals("Return-to-main-menu") || mainText.equals("Wait-a-moment...")) {
            sendMessage.setText("Make your choice");
            execute(sendMessage);

        } else  if(!mainText.equals(WEATHER_FOR_TOMORROW) && !mainText.equals(CURRENT_WEATHER) && booleanMarker) {
            var service = new WeatherOneWeekServise();
            sendMessage.enableMarkdown(true);
            sendMessage.setChatId(update.getMessage().getChatId());
            try {
                sendMessage.setText(service.getByCityName(mainText) + "\n \n \nPlease, make your next choice");
            } catch (NullPointerException e) {
                sendMessage.setText("Invalid input");
            }
            execute(sendMessage);
            booleanMarker = false;

        } else  if(!mainText.equals(CURRENT_WEATHER) && !mainText.equals(WEATHER_FOR_TOMORROW)) {
            var service = new WeatherServiceImpl();
            sendMessage.enableMarkdown(true);
            sendMessage.setChatId(update.getMessage().getChatId());
            try {
                sendMessage.setText(service.getByCityName(mainText) + "\n \n \nPlease, make your next choice");
            } catch (NullPointerException e) {
                sendMessage.setText("Invalid Input");
            }
            execute(sendMessage);


        } else   if (mainText.equals(CURRENT_WEATHER)) {
                rowArrayList.clear();
                OneWeatherKeyboardRow.clear();

                sendMessage.setText("Please, enter your city: ");
                sendMessage.setChatId(update.getMessage().getChatId());
                replyKeyboardMarkup.setKeyboard(rowArrayList);

                rowArrayList.add(OneWeatherKeyboardRow);
                rowArrayList.add(TwoWeatherKeyboardRow);
                rowArrayList.add(ThreeWeatherKeyboardRow);
                OneWeatherKeyboardRow.add("Днепр");
                OneWeatherKeyboardRow.add("Киев");
                OneWeatherKeyboardRow.add("Одесса");
                TwoWeatherKeyboardRow.add("Kolitzheim");
                TwoWeatherKeyboardRow.add("Schwebheim");
                TwoWeatherKeyboardRow.add("Gerolzhofen");
                ThreeWeatherKeyboardRow.add("Return to main menu");

                execute(sendMessage);
                booleanMarker = false;


            } else  if (mainText.equals(WEATHER_FOR_TOMORROW)) {
            rowArrayList.clear();
            OneWeatherKeyboardRow.clear();

            sendMessage.setText("Please, enter your city: ");
            sendMessage.setChatId(update.getMessage().getChatId());
            replyKeyboardMarkup.setKeyboard(rowArrayList);

            rowArrayList.add(OneWeatherKeyboardRow);
            rowArrayList.add(TwoWeatherKeyboardRow);
            rowArrayList.add(ThreeWeatherKeyboardRow);
            OneWeatherKeyboardRow.add("Днепр");
            OneWeatherKeyboardRow.add("Киев");
            OneWeatherKeyboardRow.add("Одесса");
            TwoWeatherKeyboardRow.add("Kolitzheim");
            TwoWeatherKeyboardRow.add("Schwebheim");
            TwoWeatherKeyboardRow.add("Gerolzhofen");
            ThreeWeatherKeyboardRow.add("Return to main menu");

            execute(sendMessage);
            booleanMarker = true;



        }

    }


    @Override
    public String getBotUsername() {
        return "Weather_Man_Today_Bot";
    }
}


