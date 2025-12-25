package com.dhanraj.humanerror.util;

import java.time.LocalDateTime;

public class TimeUtil {

    public static String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
