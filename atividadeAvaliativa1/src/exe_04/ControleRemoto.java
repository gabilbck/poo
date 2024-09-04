package exe_04;

import java.util.Scanner;

public class ControleRemoto extends Televisao {

	Scanner scanner = new Scanner(System.in);
	public ControleRemoto(int volumeTelevisao, int canalTelevisao) {
		super(volumeTelevisao, canalTelevisao);
	}
	
	public int aumentaVolume() {
		if (volumeTelevisao < 10) {
            volumeTelevisao++;
        }
        return volumeTelevisao;
	}
	
	public int diminuiVolume() {
		if (volumeTelevisao > 0) {
            volumeTelevisao--;
        }
        return volumeTelevisao;
	}
	
	public int proxCanal() {
		canalTelevisao++;
		if(canalTelevisao > 5) {
			canalTelevisao = 1;
		}
		return canalTelevisao;
	}
	
	public int anteCanal() {
		canalTelevisao--;
		if(canalTelevisao < 1) {
			canalTelevisao = 5;
		}
		return canalTelevisao;
	}

	public int retornaVolumeAtual() {
		return volumeTelevisao;
	}
	
	public int retornaCanalAtual() {
		return canalTelevisao;
	}
	
	public int mudaCanalTelevisao() {
		System.out.println("\nDigite o canal desejado: ");
		int numCanal = scanner.nextInt();
		if(numCanal > 5 || numCanal < 1) {
			System.out.println("Canal indisponivel");;
			numCanal = canalTelevisao;
		}
		canalTelevisao = numCanal;
		return canalTelevisao;
	}
}
