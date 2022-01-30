package com.example.injecaodependenciaspring.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
     public double tax(double amount) {
          //descontos 20%
          return amount * 0.2;
     }
}
