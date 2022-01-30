package com.example.injecaodependenciaspring;

import com.example.injecaodependenciaspring.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class InjecaoDependenciaSpringApplication implements CommandLineRunner {

	private SalaryService salaryService;

	public InjecaoDependenciaSpringApplication(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDependenciaSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o salário bruto: ");
		double glossSalary = sc.nextDouble();

		System.out.println("Salário Liquido: " + salaryService.netSalary(glossSalary));

		sc.close();
	}
}
