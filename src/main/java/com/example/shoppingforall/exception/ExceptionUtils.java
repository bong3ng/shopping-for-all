package com.example.shoppingforall.exception;

import java.util.HashMap;
import java.util.Map;

public class ExceptionUtils {
    public static final String C_NOT_FOUND_CUSTOMER = "C_NOT_FOUND_CUSTOMER";

    public static final Map<String, String> messages;
    static {
        messages = new HashMap<>();
        messages.put(ExceptionUtils.C_NOT_FOUND_CUSTOMER, "Không tìm thấy khách hàng");
    }
}
