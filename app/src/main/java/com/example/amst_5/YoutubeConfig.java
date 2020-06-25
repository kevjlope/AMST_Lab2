package com.example.amst_5;

public class YoutubeConfig {
    public YoutubeConfig(){

    }
    //API de youtube
    private static final String API_KEY="AIzaSyCEpfQeH_QPD9Gdi_80X1itgEwrbj4DR6g";

    //Metodo para obtener el Api de youtube desde otras clases
    public static String getApiKey() {
        return API_KEY;
    }
}
