package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        int k = 0;
        while (k <= args.size()) {
            if (!StringUtils.isPositiveNumber(args.get(k))) {
                return false;
            }
            k++;
        }
        return true;
    }
}