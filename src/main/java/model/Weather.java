package model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Weather {
    private String city_name;
    private String country_code;
    private double temp;
    int clouds;
    float wind_spd;
    String wind_cdir_full;
    int rh;


    @Override
    public String toString() {
        return
                "City                              " + city_name +  "\n" +
                "Country                 " + getCountyFlagAndName() + "\n" +
                "Temperatur           "+ "\uD83C\uDF21 " + temp + " \u2103" + " \n" +
                "Clouds                   " + getCloudsStatus() +" " + clouds + "%" + "\n" +
                "Wind speed           " + "\uD83C\uDF2C"+ " " + wind_spd + " m/s" + "\n" +
                "Wind direction             " + wind_cdir_full + "\n" +
                "Relative humidity    " + "\uD83D\uDCA7" + rh + "%";


    }

    public String getWindDirection () {
        String windDirection = null;



        return windDirection;
    }

    public String getCloudsStatus() {
        String cloudsStatus = null;
        if (clouds <= 30) {
            cloudsStatus = "☀";
        } else if (clouds > 30 && clouds <=50) {
            cloudsStatus = "\uD83C\uDF24";
        } else if (clouds > 50 && clouds <=70) {
            cloudsStatus = "⛅";
        } else if (clouds >70 && clouds <= 85) {
            cloudsStatus = "\uD83C\uDF25";
        }else cloudsStatus = "☁";


        return cloudsStatus;
    }


    public String getCountyFlagAndName() {
        String countryFlagAndName = country_code;

        if (country_code.equals("AU")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDFA" + " Australia";
        }
        if (country_code.equals("AT")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDF9" + " Austria";
        }
        if (country_code.equals("DE")) {
            countryFlagAndName = "\uD83C\uDDE9\uD83C\uDDEA" + " Germany";
        }
        if (country_code.equals("UA")) {
            countryFlagAndName = "\uD83C\uDDFA\uD83C\uDDE6"+ " Ukraine";
        }
        if (country_code.equals("RU")) {
            countryFlagAndName = "\uD83C\uDDF7\uD83C\uDDFA" + " Russia";
        }
        if (country_code.equals("AW")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDFC" + " Aruba";
        }
        if (country_code.equals("AF")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDEB" + " Afghanistan";
        }
        if (country_code.equals("AO")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDF4" + " Angola";
        }
        if (country_code.equals("AI")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDEE" + " Anguilla";
        }
        if (country_code.equals("AL")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDF1" + " Albania";
        }
        if (country_code.equals("AD")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDE9" + " Andorra";
        }
        if (country_code.equals("AE")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDEA" + " United Arab Emirates";
        }
        if (country_code.equals("AR")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDF7" + " Argentina";
        }
        if (country_code.equals("AM")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDF2" + " Armenia";
        }
        if (country_code.equals("AS")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDF8" + " American Samoa";
        }
        if (country_code.equals("AG")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDEC" + " Antigua and Barbuda";
        }
        if (country_code.equals("AZ")) {
            countryFlagAndName = "\uD83C\uDDE6\uD83C\uDDFF" + " Azerbaijan";
        }
        if (country_code.equals("BI")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDEE" + " Burundi";
        }
        if (country_code.equals("BE")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDEA" + " Belgium";
        }
        if (country_code.equals("BJ")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDEF" + " Benin";
        }
        if (country_code.equals("BF")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDEB" + " Burkina Faso";
        }
        if (country_code.equals("BD")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDE9" + " Bangladesh";
        }
        if (country_code.equals("BG")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDEC" + " Bulgaria";
        }
        if (country_code.equals("BH")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDED" + " Bahrain";
        }
        if (country_code.equals("BS")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDF8" + " The Bahamas";
        }
        if (country_code.equals("BA")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDE6" + " Bosnia and Herzegovina";
        }
        if (country_code.equals("BY")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDFE" + " Belarus";
        }
        if (country_code.equals("BZ")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDFF" + " Belize";
        }
        if (country_code.equals("BM")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDF2" + " Bermuda";
        }
        if (country_code.equals("BO")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDF4" + " Bolivia";
        }
        if (country_code.equals("BR")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDF7" + " Brazil";
        }
        if (country_code.equals("BB")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDE7" + " Barbados";
        }
        if (country_code.equals("BN")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDF3" + " Brunei";
        }
        if (country_code.equals("BT")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDF9" + " Bhutan";
        }
        if (country_code.equals("BW")) {
            countryFlagAndName = "\uD83C\uDDE7\uD83C\uDDFC" + " Botswana";
        }
        if (country_code.equals("CF")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDEB" + " Central African Republic";
        }
        if (country_code.equals("CA")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDE6" + " Canada";
        }
        if (country_code.equals("CC")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDE8" + " Cocos Islands";
        }
        if (country_code.equals("CH")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDED" + " Switzerland";
        }
        if (country_code.equals("CL")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDF1" + " Chile";
        }
        if (country_code.equals("CN")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDF3" + " China";
        }
        if (country_code.equals("CI")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDEE" + " Ivory Coast";
        }
        if (country_code.equals("CM")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDF2" + " Cameroon";
        }
        if (country_code.equals("CD")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDE9" + " Democratic Republic of the Congo";
        }
        if (country_code.equals("CG")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDEC" + " Republic of the Congo";
        }
        if (country_code.equals("CK")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDF0" + " Cook Islands";
        }
        if (country_code.equals("CO")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDF4" + " Colombia";
        }
        if (country_code.equals("KM")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDF2" + " Comoros";
        }
        if (country_code.equals("CV")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDFB" + " Cape Verde";
        }
        if (country_code.equals("CR")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDF7" + " Costa Rica";
        }
        if (country_code.equals("CU")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDFA" + " Cuba";
        }
        if (country_code.equals("CW")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDFC" + " Curaçao";
        }
        if (country_code.equals("CX")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDFD" + " Christmas Island";
        }
        if (country_code.equals("KY")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDFE" + " Cayman Islands";
        }
        if (country_code.equals("CY")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDFE" + " Cyprus";
        }
        if (country_code.equals("CZ")) {
            countryFlagAndName = "\uD83C\uDDE8\uD83C\uDDFF" + " Czech Republic";
        }
        if (country_code.equals("DJ")) {
            countryFlagAndName = "\uD83C\uDDE9\uD83C\uDDEF" + " Djibouti";
        }
        if (country_code.equals("DM")) {
            countryFlagAndName = "\uD83C\uDDE9\uD83C\uDDF2" + " Dominica";
        }
        if (country_code.equals("DK")) {
            countryFlagAndName = "\uD83C\uDDE9\uD83C\uDDF0" + " Denmark";
        }
        if (country_code.equals("DO")) {
            countryFlagAndName = "\uD83C\uDDE9\uD83C\uDDF4" + " Dominican Republic";
        }
        if (country_code.equals("DZ")) {
            countryFlagAndName = "\uD83C\uDDE9\uD83C\uDDFF" + " Algeria";
        }
        if (country_code.equals("EC")) {
            countryFlagAndName = "\uD83C\uDDEA\uD83C\uDDE8" + " Ecuador";
        }
        if (country_code.equals("EG")) {
            countryFlagAndName = "\uD83C\uDDEA\uD83C\uDDEC" + " Egypt";
        }
        if (country_code.equals("ER")) {
            countryFlagAndName = "\uD83C\uDDEA\uD83C\uDDF7" + " Eritrea";
        }
        if (country_code.equals("EH")) {
            countryFlagAndName = "\uD83C\uDDEA\uD83C\uDDED" + " Sahrawi Arab Democratic Republic";
        }
        if (country_code.equals("GB")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDE7" + " United Kingdom";
        }
        if (country_code.equals("ES")) {
            countryFlagAndName = "\uD83C\uDDEA\uD83C\uDDF8" + " Spain";
        }
        if (country_code.equals("EE")) {
            countryFlagAndName = "\uD83C\uDDEA\uD83C\uDDEA" + " Estonia";
        }
        if (country_code.equals("ET")) {
            countryFlagAndName = "\uD83C\uDDEA\uD83C\uDDF9" + " Ethiopia";
        }
        if (country_code.equals("FI")) {
            countryFlagAndName = "\uD83C\uDDEB\uD83C\uDDEE" + " Finland";
        }
        if (country_code.equals("FJ")) {
            countryFlagAndName = "\uD83C\uDDEB\uD83C\uDDEF" + " Fiji";
        }
        if (country_code.equals("FK")) {
            countryFlagAndName = "\uD83C\uDDEB\uD83C\uDDF0" + " Falkland Islands";
        }
        if (country_code.equals("FR")) {
            countryFlagAndName = "\uD83C\uDDEB\uD83C\uDDF7" + " France";
        }
        if (country_code.equals("FO")) {
            countryFlagAndName = "\uD83C\uDDEB\uD83C\uDDF4" + " Faroe Islands";
        }
        if (country_code.equals("FM")) {
            countryFlagAndName = "\uD83C\uDDEB\uD83C\uDDF2" + " Federated States of Micronesia";
        }
        if (country_code.equals("GA")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDE6" + " Gabon";
        }
        if (country_code.equals("GE")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDEA" + " Georgia";
        }
        if (country_code.equals("GH")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDED" + " Ghana";
        }
        if (country_code.equals("GI")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDEE" + " Gibraltar";
        }
        if (country_code.equals("GN")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDF3" + " Guinea";
        }
        if (country_code.equals("GP")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDF5" + " Guadeloupe";
        }
        if (country_code.equals("GM")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDF2" + " The Gambia";
        }
        if (country_code.equals("GW")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDFC" + " Guinea-Bissau";
        }
        if (country_code.equals("GQ")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDF6" + " Equatorial Guinea";
        }
        if (country_code.equals("GR")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDF7" + " Greece";
        }
        if (country_code.equals("GD")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDE9" + " Grenada";
        }
        if (country_code.equals("GT")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDF9" + " Guatemala";
        }
        if (country_code.equals("GU")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDFA" + " Guam";
        }
        if (country_code.equals("GY")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDFE" + " Guyana";
        }
        if (country_code.equals("HK")) {
            countryFlagAndName = "\uD83C\uDDED\uD83C\uDDF0" + " Hong Kong";
        }
        if (country_code.equals("HN")) {
            countryFlagAndName = "\uD83C\uDDED\uD83C\uDDF3" + " Honduras";
        }
        if (country_code.equals("HR")) {
            countryFlagAndName = "\uD83C\uDDED\uD83C\uDDF7" + " Croatia";
        }
        if (country_code.equals("HT")) {
            countryFlagAndName = "\uD83C\uDDED\uD83C\uDDF9" + " Haiti";
        }
        if (country_code.equals("HU")) {
            countryFlagAndName = "\uD83C\uDDED\uD83C\uDDFA" + " Hungary";
        }
        if (country_code.equals("IS")) {
            countryFlagAndName = "\uD83C\uDDEE\uD83C\uDDF8" + " Iceland";
        }
        if (country_code.equals("ID")) {
            countryFlagAndName = "\uD83C\uDDEE\uD83C\uDDE9" + " Indonesia";
        }
        if (country_code.equals("IN")) {
            countryFlagAndName = "\uD83C\uDDEE\uD83C\uDDF3" + " India";
        }
        if (country_code.equals("IO")) {
            countryFlagAndName = "\uD83C\uDDEE\uD83C\uDDF4" + " British Indian Ocean Territory";
        }
        if (country_code.equals("IE")) {
            countryFlagAndName = "\uD83C\uDDEE\uD83C\uDDEA" + " Ireland";
        }
        if (country_code.equals("IR")) {
            countryFlagAndName = "\uD83C\uDDEE\uD83C\uDDF7" + " Iran";
        }
        if (country_code.equals("IQ")) {
            countryFlagAndName = "\uD83C\uDDEE\uD83C\uDDF6" + " Iraq";
        }
        if (country_code.equals("IL")) {
            countryFlagAndName = "\uD83C\uDDEE\uD83C\uDDF1" + " Israel";
        }
        if (country_code.equals("IT")) {
            countryFlagAndName = "\uD83C\uDDEE\uD83C\uDDF9" + " Italy";
        }
        if (country_code.equals("JM")) {
            countryFlagAndName = "\uD83C\uDDEF\uD83C\uDDF2" + " Jamaica";
        }
        if (country_code.equals("JO")) {
            countryFlagAndName = "\uD83C\uDDEF\uD83C\uDDF4" + " Jordan";
        }
        if (country_code.equals("JP")) {
            countryFlagAndName = "\uD83C\uDDEF\uD83C\uDDF5" + " Japan";
        }
        if (country_code.equals("KZ")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDFF" + " Kazakhstan";
        }
        if (country_code.equals("KE")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDEA" + " Kenya";
        }
        if (country_code.equals("KG")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDEC" + " Kyrgyzstan";
        }
        if (country_code.equals("KH")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDED" + " Cambodia";
        }
        if (country_code.equals("KI")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDEE" + " Kiribati";
        }
        if (country_code.equals("KN")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDF3" + " Saint Kitts and Nevis";
        }
        if (country_code.equals("KR")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDF7" + " South Korea";
        }
        if (country_code.equals("XK")) {
            countryFlagAndName = "\uD83C\uDDFD\uD83C\uDDF0" + " Kosovo";
        }
        if (country_code.equals("KW")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDFC" + " Kuwait";
        }
        if (country_code.equals("LA")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDE6" + " Laos";
        }
        if (country_code.equals("LB")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDE7" + " Lebanon";
        }
        if (country_code.equals("LR")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDF7" + " Liberia";
        }
        if (country_code.equals("LY")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDFE" + " Libya";
        }
        if (country_code.equals("LC")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDE8" + " Saint Lucia";
        }
        if (country_code.equals("LI")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDEE" + " Liechtenstein";
        }
        if (country_code.equals("LK")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDF0" + " Sri Lanka";
        }
        if (country_code.equals("LS")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDF8" + " Lesotho";
        }
        if (country_code.equals("LT")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDF9" + " Lithuania";
        }
        if (country_code.equals("LU")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDFA" + " Luxembourg";
        }
        if (country_code.equals("LV")) {
            countryFlagAndName = "\uD83C\uDDF1\uD83C\uDDFB" + " Latvia";
        }
        if (country_code.equals("MO")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDF4" + " Macau";
        }
        if (country_code.equals("MF")) {
            countryFlagAndName = "\uD83C\uDDEB\uD83C\uDDF7" + " Collectivity of Saint Martin";
        }
        if (country_code.equals("MA")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDE6" + " Morocco";
        }
        if (country_code.equals("MC")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDE8" + " Monaco";
        }
        if (country_code.equals("MG")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDEC" + " Madagascar";
        }
        if (country_code.equals("MV")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDFB" + " Maldives";
        }
        if (country_code.equals("MX")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDFD" + " Mexico";
        }
        if (country_code.equals("MH")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDED" + " Marshall Islands";
        }
        if (country_code.equals("MK")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDF0" + " North Macedonia";
        }
        if (country_code.equals("ML")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDF1" + " Mali";
        }
        if (country_code.equals("MT")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDF9" + " Malta";
        }
        if (country_code.equals("MM")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDF2" + " Myanmar";
        }
        if (country_code.equals("ME")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDEA" + " Montenegro";
        }
        if (country_code.equals("MN")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDF3" + " Mongolia";
        }
        if (country_code.equals("MP")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDF5" + " Northern Mariana Islands";
        }
        if (country_code.equals("MD")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDE9" + " Moldova";
        }
        if (country_code.equals("MZ")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDFF" + " Mozambique";
        }
        if (country_code.equals("MR")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDF7" + " Mauritania";
        }
        if (country_code.equals("MS")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDF8" + " Montserrat";
        }
        if (country_code.equals("MU")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDFA" + " Mauritius";
        }
        if (country_code.equals("MW")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDFC" + " Malawi";
        }
        if (country_code.equals("MY")) {
            countryFlagAndName = "\uD83C\uDDF2\uD83C\uDDFE" + " Malaysia";
        }
        if (country_code.equals("NA")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDE6" + " Republic of Namibia";
        }
        if (country_code.equals("NC")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDE8" + " New Caledonia";
        }
        if (country_code.equals("NL")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDF1" + " Netherlands";
        }
        if (country_code.equals("NE")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDEA" + " Republic of the Niger";
        }
        if (country_code.equals("NF")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDEB" + " Norfolk Island";
        }
        if (country_code.equals("NG")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDEC" + " Federal Republic of Nigeria";
        }
        if (country_code.equals("NI")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDEE" + " Nicaragua";
        }
        if (country_code.equals("NU")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDFA" + " Niue";
        }
        if (country_code.equals("NO")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDF4" + " Norway";
        }
        if (country_code.equals("NP")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDF5" + " Nepal";
        }
        if (country_code.equals("NR")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDF7" + " Nauru";
        }
        if (country_code.equals("NZ")) {
            countryFlagAndName = "\uD83C\uDDF3\uD83C\uDDFF" + " New Zealand";
        }
        if (country_code.equals("OM")) {
            countryFlagAndName = "\uD83C\uDDF4\uD83C\uDDF2" + " Oman";
        }
        if (country_code.equals("PK")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDF0" + " Pakistan";
        }
        if (country_code.equals("PA")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDE6" + " Panama";
        }
        if (country_code.equals("PN")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDF3" + " Pitcairn Islands";
        }
        if (country_code.equals("PE")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDEA" + " Peru";
        }
        if (country_code.equals("PH")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDED" + " Philippines";
        }
        if (country_code.equals("PW")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDFC" + " Palau";
        }
        if (country_code.equals("PG")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDEC" + " Papua New Guinea";
        }
        if (country_code.equals("PL")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDF1" + " Poland";
        }
        if (country_code.equals("PR")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDF7" + " Puerto Rico";
        }
        if (country_code.equals("KP")) {
            countryFlagAndName = "\uD83C\uDDF0\uD83C\uDDF5" + " North Korea";
        }
        if (country_code.equals("PT")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDF9" + " Portugal";
        }
        if (country_code.equals("PY")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDFE" + " Paraguay";
        }
        if (country_code.equals("PS")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDF8" + " State of Palestine";
        }
        if (country_code.equals("PF")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDEB" + " French Polynesia";
        }
        if (country_code.equals("QA")) {
            countryFlagAndName = " \uD83C\uDDF6\uD83C\uDDE6" + "Qatar";
        }
        if (country_code.equals("RO")) {
            countryFlagAndName = "\uD83C\uDDF7\uD83C\uDDF4" + " Romania";
        }
        if (country_code.equals("ZA")) {
            countryFlagAndName = "\uD83C\uDDFF\uD83C\uDDE6" + " South Africa";
        }
        if (country_code.equals("SS")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDF8" + " South Sudan";
        }
        if (country_code.equals("RW")) {
            countryFlagAndName = "\uD83C\uDDF7\uD83C\uDDFC" + " Rwanda";
        }
        if (country_code.equals("SA")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDE6" + " Saudi Arabia";
        }
        if (country_code.equals("SD")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDE9" + " Sudan";
        }
        if (country_code.equals("SN")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDF3" + " Senegal";
        }
        if (country_code.equals("SG")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDEC" + " Singapore";
        }
        if (country_code.equals("GS")) {
            countryFlagAndName = "\uD83C\uDDEC\uD83C\uDDF8" + " South Georgia and the South Sandwich Islands";
        }
        if (country_code.equals("SB")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDE7" + " Solomon Islands";
        }
        if (country_code.equals("SL")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDF1" + " Sierra Leone";
        }
        if (country_code.equals("SI")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDEE" + " Slovenia";
        }
        if (country_code.equals("SV")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDFB" + " El Salvador";
        }
        if (country_code.equals("SM")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDF2" + " San Marino";
        }
        if (country_code.equals("SO")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDF4" + " Somalia";
        }
        if (country_code.equals("PM")) {
            countryFlagAndName = "\uD83C\uDDF5\uD83C\uDDF2" + " Saint Pierre and Miquelon";
        }
        if (country_code.equals("RS")) {
            countryFlagAndName = "\uD83C\uDDF7\uD83C\uDDF8" + " Serbia";
        }
        if (country_code.equals("ST")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDF9" + " São Tomé and Príncipe";
        }
        if (country_code.equals("SR")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDF7" + " Suriname";
        }
        if (country_code.equals("SK")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDF0" + " Slovakia";
        }
        if (country_code.equals("SE")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDEA" + " Sweden";
        }
        if (country_code.equals("SZ")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDFF" + " Eswatini";
        }
        if (country_code.equals("SX")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDFD" + " Sint Maarten";
        }
        if (country_code.equals("SC")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDE8" + "Seychelles";
        }
        if (country_code.equals("SY")) {
            countryFlagAndName = "\uD83C\uDDF8\uD83C\uDDFE" + " Syria";
        }
        if (country_code.equals("TC")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDE8" + " Turks and Caicos Islands";
        }
        if (country_code.equals("TD")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDE9" + " Chad";
        }
        if (country_code.equals("TG")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDEC" + " Togo";
        }
        if (country_code.equals("TH")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDED" + " Thailand";
        }
        if (country_code.equals("TJ")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDEF" + " Tajikistan";
        }
        if (country_code.equals("TK")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDF0" + " Tokelau";
        }
        if (country_code.equals("TM")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDF2" + " Turkmenistan";
        }
        if (country_code.equals("TL")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDF1" + " East Timor";
        }
        if (country_code.equals("TO")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDF4" + " Tonga";
        }
        if (country_code.equals("TT")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDF9" + " Trinidad and Tobago";
        }
        if (country_code.equals("TN")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDF3" + " Tunisia";
        }
        if (country_code.equals("TR")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDF7" + " Turkey";
        }
        if (country_code.equals("TV")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDFB" + " Tuvalu";
        }
        if (country_code.equals("TW")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDFC" + " Taiwan";
        }
        if (country_code.equals("TZ")) {
            countryFlagAndName = "\uD83C\uDDF9\uD83C\uDDFF" + " Tanzania";
        }
        if (country_code.equals("UG")) {
            countryFlagAndName = "\uD83C\uDDFA\uD83C\uDDEC" + " Uganda";
        }
        if (country_code.equals("UY")) {
            countryFlagAndName = "\uD83C\uDDFA\uD83C\uDDFE" + " Uruguay";
        }
        if (country_code.equals("US")) {
            countryFlagAndName = "\uD83C\uDDFA\uD83C\uDDF8" + " USA";
        }
        if (country_code.equals("UZ")) {
            countryFlagAndName = "\uD83C\uDDFA\uD83C\uDDFF" + " Uzbekistan";
        }
        if (country_code.equals("VA")) {
            countryFlagAndName = "\uD83C\uDDFB\uD83C\uDDE6" + " Vatican City";
        }
        if (country_code.equals("VC")) {
            countryFlagAndName = "\uD83C\uDDFB\uD83C\uDDE8" + " Saint Vincent and the Grenadines";
        }
        if (country_code.equals("VE")) {
            countryFlagAndName = "\uD83C\uDDFB\uD83C\uDDEA" + " Venezuela";
        }
        if (country_code.equals("VG")) {
            countryFlagAndName = "\uD83C\uDDFB\uD83C\uDDEC" + " British Virgin Islands";
        }
        if (country_code.equals("VI")) {
            countryFlagAndName = "\uD83C\uDDFB\uD83C\uDDEE" + " US Virgin Islands";
        }
        if (country_code.equals("VN")) {
            countryFlagAndName = "\uD83C\uDDFB\uD83C\uDDF3" + " Vietnam";
        }
        if (country_code.equals("VU")) {
            countryFlagAndName = "\uD83C\uDDFB\uD83C\uDDFA" + " Vanuatu";
        }
        if (country_code.equals("WF")) {
            countryFlagAndName = "\uD83C\uDDFC\uD83C\uDDEB" + " Wallis and Futuna";
        }
        if (country_code.equals("WS")) {
            countryFlagAndName = "\uD83C\uDDFC\uD83C\uDDF8" + " Samoa";
        }
        if (country_code.equals("YE")) {
            countryFlagAndName = "\uD83C\uDDFE\uD83C\uDDEA" + " Yemen";
        }
        if (country_code.equals("ZM")) {
            countryFlagAndName = "\uD83C\uDDFF\uD83C\uDDF2" + " Zambia";
        }
        if (country_code.equals("ZW")) {
            countryFlagAndName = "\uD83C\uDDFF\uD83C\uDDFC" + " Zimbabwe";
        }


        return countryFlagAndName;
    }
}
