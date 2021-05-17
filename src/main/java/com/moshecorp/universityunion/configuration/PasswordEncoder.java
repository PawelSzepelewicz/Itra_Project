package com.moshecorp.universityunion.configuration;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PasswordEncoder {

    public static String encode(String value) {
        return new DigestUtils("SHA3-256").digestAsHex(value);
    }

}
