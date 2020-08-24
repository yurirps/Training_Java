 package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Name: ");
		Student student = new Student();
		student.name = sc.nextLine();

		System.out.println("Primeiro Trimestre: ");
		student.trim1 = sc.nextDouble();
		System.out.println("Segundo Trimestre: ");
		student.trim2 = sc.nextDouble();
		System.out.println("Terceiro Trimestre: ");
		student.trim3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.media());
		
		if (student.media() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltou %.2f pontos",student.faltapontos());
		}else {
			System.out.println("Aprovado");
		}
		
		sc.close();
	}

}
