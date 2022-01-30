package com.example.injecaodependenciaspring.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {
    //previdência = 10%

    public double discount(double amount) {
        return amount * 0.1;
    }

}
