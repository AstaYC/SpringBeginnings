package com.SpringStart.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.standard.DateTimeFormatterFactoryBean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Configuration
public class DateConfig {

    @Bean
    public DateTimeFormatterFactoryBean dateFormatter() {
        DateTimeFormatterFactoryBean dateFormatter = new DateTimeFormatterFactoryBean();
        dateFormatter.setPattern("yyyy-MM-dd");
        return dateFormatter;
    }

    // String to LocalDate converter
    @Bean
    public Converter<String, LocalDate> stringToLocalDateConverter() {
        return new Converter<String, LocalDate>() {
            @Override
            public LocalDate convert(String source) {
                return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            }
        };
    }
}
