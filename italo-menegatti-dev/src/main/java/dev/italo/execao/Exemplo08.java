package dev.italo.execao;

public class Exemplo08 {
	
	
	public static void main(String[] args) throws Exception {
		
			
		 try {
		   int resultado = 10 / 0;
		   
		 }catch (Exception e) {
			e.printStackTrace(); /*Erro cai aqui dentro*/
		}
		   
	}

}
