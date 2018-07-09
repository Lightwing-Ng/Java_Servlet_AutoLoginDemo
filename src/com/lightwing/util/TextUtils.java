package com.lightwing.util;

public class TextUtils {
    /**
     * judge if a string is empty
     *
     * @param s
     * @return
     */
    public static boolean isEmpty(CharSequence s) {
        return s == null || s.length() == 0;
    }
}
