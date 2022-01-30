package com.example.injecaodependenciaspring.services;

import org.springframework.stereotype.Service;

@Service
public class SalaryService {
    //calcula os descontos do salario bruto

    TaxService taxService;
    PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(double grossSalary) {
        return grossSalary - taxService.tax(grossSalary) - pensionService.discount(grossSalary);
    }

}
