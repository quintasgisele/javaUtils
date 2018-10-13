package br.com.quintas.gisele;

public class FormatacaoCPF {

	public static void main(String[] args) {
		String novoCPF = formatoCPF("04576854609");
		//Impressão do cpf formatado
		System.out.println(novoCPF);
	}

	public static String formatoCPF(String cpf) {
				
		//divisão cpf
		String b1 = cpf.substring(0,3);
		String b2 = cpf.substring(3,6);
		String b3 = cpf.substring(6,9);
		String b4 = cpf.substring(9,11);
		
		// junção das divisões
		cpf = b1 + "." + b2 + "." + b3 + "-" + b4;
		
		return cpf;
	}
}
