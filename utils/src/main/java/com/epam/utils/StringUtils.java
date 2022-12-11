package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //here magic will happen
        int integer = Integer.parseInt(str);
        return integer > 0;
    }
}
