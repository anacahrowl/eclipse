package controller;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TIPOS PARA NÚMEROS INTEIROS
		
		byte n1;
		short n2;
		int n3;
		long n4;
		
		n1 = 127;
		n2 = 32500;
		n3 = 987654321;
		n4 = 9876543210000001L;
		
		//TIPOS PARA NÚMEROS DECIMAIS
		float n5;
		double n6;
		
		n5 = 678.09F;
		n6 = 2345678.890;
		 
		//TIPO PARA UM CARACTER !
		char n7; 
		
		// OBS STRING NÃO É UM TIPO PRIMITIVO 
		String n8;
		n8 = ("Última aula - Revisão antes da prova");
	
		// TIPO PARA VERDADEIRO OU FALSO (TIPO LÓGICO)
		boolean n9;
		n9 = true; // true or false
		System.out.println("n9: " + n9);
		n9 = n1 > 30;
		System.out.println("n9: " + n9);
		
		

	}

}
