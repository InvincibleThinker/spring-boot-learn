package com.amar.dependency_injection.services.impl;

import com.amar.dependency_injection.services.RedPrint;

public class RedPrintImpl implements RedPrint {
    @Override
    public String print() {
        return "red";
    }
}
