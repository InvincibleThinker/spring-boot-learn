package com.amar.dependency_injection.services.impl;

import com.amar.dependency_injection.services.RedPrint;
import org.springframework.stereotype.Service;

@Service
public class RedPrintImpl implements RedPrint {
    @Override
    public String print() {
        return "red";
    }
}
