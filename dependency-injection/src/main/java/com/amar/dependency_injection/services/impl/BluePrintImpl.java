package com.amar.dependency_injection.services.impl;

import com.amar.dependency_injection.services.BluePrint;
import org.springframework.stereotype.Service;

@Service
public class BluePrintImpl implements BluePrint {

    @Override
    public String print(){
        return "Blue";
    }
}
