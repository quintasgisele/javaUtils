package br.com.quintas.gisele;

public class FormatacaoCNPJ {
	
	public static void main(String[] args) {
		String novoCNPJ = formatoCNPJ("654987098000154");
		//Impressão do cpf formatado
		System.out.println(novoCNPJ);
	}

	private static String formatoCNPJ(String cnpj) {
	
		//divisões do cnpj
		String b1 = cnpj.substring(0,3);
		String b2 = cnpj.substring(3,6);
		String b3 = cnpj.substring(6,9);
		String b4 = cnpj.substring(9,13);
		String b5 = cnpj.substring(13,15);
		
		//junção do cnpj
		cnpj = b1 + "." + b2 + "." + b3 + "/" + b4 + "-" + b5;
		
		return cnpj;		
	}

}
