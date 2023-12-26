package ua.ucu.edu.apps.task3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import lombok.SneakyThrows;

import java.util.Map;

public class OpenAIEnricher {
    @SneakyThrows
    public static Map<String, String> extract(String domain){
        URL url = new URL(domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        // JSONObject jsonObject = new JSONObject(text);
        // System.out.println(jsonObject);
        System.out.println(text);
        return null;
    }
}
