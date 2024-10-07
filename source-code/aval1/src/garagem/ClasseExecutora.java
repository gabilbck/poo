package garagem;

public class ClasseExecutora {

	public static void main(String[] args) {
		//=======Carro==================
		Carro carro = new Carro();
		carro.setCorVeiculo("Azul");
		carro.setCapacidadePass(4);
		carro.setMarcaVeiculo("WolksWagem");
		carro.setVelocidadeVeiculo(1);
		
		carro.acelerar(6);
		carro.frear(3);
		
		System.out.println("===========CARRO======== \n" );
		
		System.out.println("Cor: " + carro.getCorVeiculo() + " velocidade:  " + carro.getVelocidadeVeiculo());
		System.out.println(carro.verficarCapacidade());
		System.out.println("Marca: " + carro.obterMarca());
	
		//=========Caminhão===================
				
		Caminhao caminhao = new Caminhao();
		caminhao.setCorVeiculo("Amarelo");
		caminhao.setCapacidadeCarga(40);
		caminhao.setMarcaVeiculo("Volvo");
		caminhao.setVelocidadeVeiculo(5);
		
		caminhao.acelerar(10);
		caminhao.frear(4);
		
		System.out.println("===========CAMINHAO======== \n" );
		System.out.println("Cor: " + caminhao.getCorVeiculo() + " velocidade:  " + caminhao.getVelocidadeVeiculo());
		System.out.println(caminhao.verificarCapacidadeCarga());
		System.out.println("Marca: " + caminhao.obterMarca());
	
    //====Motocicleta================

		Motocicleta moto = new Motocicleta();
		moto.setCorVeiculo("Rosa");
		moto.setCapacidadePass(3);
		moto.setMarcaVeiculo("Honda");
		moto.setVelocidadeVeiculo(1);
		
		moto.acelerar(26);
		moto.frear(13);
		
		System.out.println("===========MOTOCICLETA======== \n" );
		
		System.out.println("Cor: " + moto.getCorVeiculo() + " velocidade:  " + moto.getVelocidadeVeiculo());
		System.out.println("Marca: " + moto.obterMarca());

	
	}

}
