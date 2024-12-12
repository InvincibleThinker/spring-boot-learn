package com.amar.dependency_injection.config;

import com.amar.dependency_injection.services.BluePrint;
import com.amar.dependency_injection.services.ColorPrint;
import com.amar.dependency_injection.services.RedPrint;
import com.amar.dependency_injection.services.impl.BluePrintImpl;
import com.amar.dependency_injection.services.impl.ColorPrintImpl;
import com.amar.dependency_injection.services.impl.RedPrintImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrint bluePrint(){
        return new BluePrintImpl();
    }

    @Bean
    public RedPrint redPrint(){
        return new RedPrintImpl();
    }

    @Bean
    public ColorPrint colorPrint(RedPrint redPrint, BluePrint bluePrint){
        return new ColorPrintImpl(redPrint, bluePrint);
    }
}
