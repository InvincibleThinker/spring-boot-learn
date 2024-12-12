package com.amar.dependency_injection.services.impl;

import com.amar.dependency_injection.services.BluePrint;
import com.amar.dependency_injection.services.ColorPrint;
import com.amar.dependency_injection.services.RedPrint;
import org.springframework.stereotype.Component;

@Component
public class ColorPrintImpl implements ColorPrint {

    private RedPrint redPrint;
    private BluePrint bluePrint;

    public ColorPrintImpl(RedPrint redPrint, BluePrint bluePrint){
        this.redPrint = redPrint;
        this.bluePrint = bluePrint;
    }
    @Override
    public String print() {
            return  String.join(", ", redPrint.print(), bluePrint.print()) ;
    }
}
