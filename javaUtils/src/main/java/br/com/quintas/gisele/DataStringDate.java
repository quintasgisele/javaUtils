package br.com.quintas.gisele;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataStringDate {

	public static void main(String[] args) throws ParseException {
		Date conversorTextoData = convertTextoData("24/10/2018");
		System.out.println(conversorTextoData);
	}

	private static Date convertTextoData(String dataTexto) throws ParseException {
		String formato = "dd/MM/yyyy";
		Date data = new SimpleDateFormat(formato).parse(dataTexto);
		
		return data;
		
		
	}
	
}
