package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.GerarParcela;
import entities.OnlinePaypal;
import entities.ParcelaContrato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double vlrContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, vlrContrato);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		GerarParcela gerar = new GerarParcela(new OnlinePaypal());
		gerar.processarParcela(contrato, n);
		System.out.println("Parcelas:");
		for(ParcelaContrato parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		
		
		
		sc.close();

	}

}
