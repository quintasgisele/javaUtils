package br.com.quintas.gisele;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDateString {
	
	public static void main(String[] args) throws ParseException {
		String conversorDataTexto = convertDataTexto (new Date());
		System.out.println(conversorDataTexto);
	}
	private static String convertDataTexto(Date dataTexto) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dtFormat = formato.format(dataTexto);
		
		return dtFormat;
	}
	
}
