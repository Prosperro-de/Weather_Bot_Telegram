package service.impl;

import com.google.gson.Gson;
import lombok.SneakyThrows;
import model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import service.WeatherService;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static service.ApiConstants.*;

@Service
public class WeatherOneWeekServise implements WeatherService {

    @Value("${api.key}")
    private String apiKey;

    @SneakyThrows
    public String getByCityName(String city) {


        var gson = new Gson();

        var httpClient = HttpClient.newBuilder().build();

        var request = HttpRequest.newBuilder().GET().uri(URI.create(GET_TOMORROW_WEATHER_URL + city + MY_KEY_24_HOURS)).build();

        var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        var weathers = gson.fromJson(response.body(), WeatherResponse.class);

        String responseStr = "";

        if (weathers.data[0] != null) {
            responseStr = weathers.data[0].toString();
        } else responseStr = "Invalid input";


        return  responseStr;
    }
    public class WeatherResponse {

        Weather[] data;
    }
}
