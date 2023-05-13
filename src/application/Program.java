package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastos = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastos));
			}else {
				System.out.print("Number of employees: ");
				Double funcionarios = sc.nextDouble();
				list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}
		double sum = 0.0;
		System.out.println("Taxes Paid:");
		for(Pessoa pessoa : list) {
			double tax = pessoa.imposto();
			System.out.println(pessoa.toString());
			sum += tax;
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
	}

}
