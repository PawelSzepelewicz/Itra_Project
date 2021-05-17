package com.moshecorp.universityunion.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CloudinaryCredentials {

    public Map<String, String> getCloudinaryCredentials() {
        Map<String, String> credentials = new HashMap<>();

        try (InputStream input = new FileInputStream("src/main/resources/cloudinary.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            credentials.put("cloud_name", prop.getProperty("cloud_name"));
            credentials.put("api_key", prop.getProperty("api_key"));
            credentials.put("api_secret", prop.getProperty("api_secret"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return credentials;
    }
}
