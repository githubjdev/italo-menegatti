package dev.italo.thread.concorrencia;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Runnable garcon1 = () -> {
			
			/*Chamada para 5 relatorio financeiro ou processamento em massa de 1 milhão de compra.*/
			for (int i = 0; i <= 1500; i++) {
				System.out.println("Garcon 1 atendendo a mesa: " + i);
				dormir();
			}
			
		};
		
		
		Runnable garcon2 = () -> {
			
			/*Chamada para 5 relatorio financeiro ou processamento em massa de 1 milhão de compra.*/
			for (int i = 0; i <= 900; i++) {
				System.out.println("Garcon 2 atendendo a mesa: " + i);
				dormir();
			}
			
		};
		
		
		/*Rodar as Thread em processamento paralelo lado a lado no mesmo tempo*/
		Thread t1 = new Thread(garcon1);
		t1.start();
		//t1.join(); /*Espera a Thread 1 terminal para iniciar a Thread 2*/
		
		new Thread(garcon2).start();;

	}
	
	
	private static void dormir() {
		
	}

}
