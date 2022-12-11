package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //here magic will happen
        if (NumberUtils.isParsable(str)) {
            return Double.parseDouble(str) > 0 || Integer.parseInt(str) > 0;
        }
        return false;
    }


}
