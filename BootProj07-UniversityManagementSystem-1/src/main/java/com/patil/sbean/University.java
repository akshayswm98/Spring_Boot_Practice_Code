package com.patil.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class University {

    @Value("${university.name}")
    private String name;

    @Value("${university.location}")
    private String location;

    @Value("${university.ranking}")
    private int ranking;

    @Override
    public String toString() {
        return "University [name=" + name
                + ", location=" + location
                + ", ranking=" + ranking + "]";
    }
}