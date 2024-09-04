package garagem;

public class Principal {

	public static void main(String[] args) {
        Carro carro = new Carro("Vermelho", 9, "Ferrari", 5);
        carro.carro();
        carro.acelerar();
        System.out.println("Velocidade do carro após acelerar: " + carro.velocidadeVeiculo + " km/h");
        carro.frear();
        carro.frear();
        carro.frear();
        System.out.println("Velocidade do carro após frear 3x: " + carro.velocidadeVeiculo + " km/h");

        Caminhao caminhao = new Caminhao("Azul", 0, "Volvo", 10.0f);
        caminhao.caminhao();
        caminhao.acelerar();
        caminhao.acelerar();
        caminhao.acelerar();
        caminhao.frear();
        System.out.println("Velocidade do caminhão após acelerar 3x e frear 1x: " + caminhao.velocidadeVeiculo + " km/h");
        
        Moto moto = new Moto("Preta", 100, "Honda");
        moto.moto();
        moto.acelerar();
        System.out.println("Velocidade da moto após acelerar: " + moto.velocidadeVeiculo + " km/h");
	}
}
