package service;

public final class ApiConstants {
    public static final String GET_WEATHER_URL = "https://api.weatherbit.io/v2.0/current?city=";
    public static final String MY_KEY = "&key=4ce0a7867c94449b8dfc28494ec9eaf3";
    public static final String GET_TOMORROW_WEATHER_URL = "https://api.weatherbit.io/v2.0/forecast/hourly?city=";
    public static final String MY_KEY_24_HOURS = "key=4ce0a7867c94449b8dfc28494ec9eaf3&hours=24";
    public static final String CURRENT_WEATHER = "Current-weather";
    public static final String WEATHER_FOR_TOMORROW = "Weather-for-tomorrow-(not-working-now)";

    private ApiConstants() {

    }
}
