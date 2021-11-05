package com.exception.project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class UnknownHost {
    
    public static void main(String[] args) throws IOException {
        String hostname = "http://locaihost";
        URL url = new URL(hostname);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.getResponseCode();
    }
    
}
