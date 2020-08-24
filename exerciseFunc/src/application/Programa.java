package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

// Programa sobre add salario, taxas etc....

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");		
		employee.Tax = sc.nextDouble();
		
		System.out.println("What a percentage to increase Salary?:  ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: "+ employee);
		
		sc.close();
		   

	}

}
