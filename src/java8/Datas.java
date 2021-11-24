package java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		int anos = hoje.getYear() - olimpiadasRio.getYear();		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, dataFutura);
		formatador.format(hoje);
		System.out.println(periodo);

	}

}
