package controller;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TIPOS PARA N�MEROS INTEIROS
		
		byte n1;
		short n2;
		int n3;
		long n4;
		
		n1 = 127;
		n2 = 32500;
		n3 = 987654321;
		n4 = 9876543210000001L;
		
		//TIPOS PARA N�MEROS DECIMAIS
		float n5;
		double n6;
		
		n5 = 678.09F;
		n6 = 2345678.890;
		 
		//TIPO PARA UM CARACTER !
		char n7; 
		
		// OBS STRING N�O � UM TIPO PRIMITIVO 
		String n8;
		n8 = ("�ltima aula - Revis�o antes da prova");
	
		// TIPO PARA VERDADEIRO OU FALSO (TIPO L�GICO)
		boolean n9;
		n9 = true; // true or false
		System.out.println("n9: " + n9);
		n9 = n1 > 30;
		System.out.println("n9: " + n9);
		
		

	}

}
