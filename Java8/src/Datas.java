import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2024, Month.JUNE, 5);
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		
		LocalDate procixaOlimpiada = olimpiadasRio.plusYears(4);
		System.out.println(procixaOlimpiada);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		//String valorFormatado = procixaOlimpiada.format(formatador);
		//System.out.println(valorFormatado);
		
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatador));
		
		
	}

}
