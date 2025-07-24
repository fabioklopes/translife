package com.translife.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertDateTime2Block {

    public static String gerarObjectCode(LocalDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss-SSS"));
    }

}
