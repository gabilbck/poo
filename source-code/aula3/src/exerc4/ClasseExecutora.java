package exerc4;

public class ClasseExecutora {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.numCarro = 10;
		carro.nomePiloto = 'L';
		
		carro.setVelocidadeMaxima(200);
		carro.setVelocidadeMinima(0);
		carro.setCarroLigado(false);
		
		System.out.println("Parâmetros Alimentado: " + carro);
		
		//movimentar o carro
		
		carro.ligar();
		carro.acelerar(40);
		carro.setVelocidadeMinima(40);
				
		System.out.println("Parâmetros Alimentado: " + carro);
		
	// Frear o carro
		
		carro.frear(carro.getVelocidadeMinima());
		
		System.out.println("Parâmetros Alimentado: " + carro);
		
		// tentar ligar o carro
		carro.ligar();
		
		// acabou o rolê
		carro.desligar();
		
		carro.parar(0);
		System.out.println("Parâmetros Alimentado: " + carro);
	}

}
