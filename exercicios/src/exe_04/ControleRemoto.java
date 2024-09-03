package exe_04;

import java.util.Arrays;

public class ControleRemoto extends Televisao {

	public ControleRemoto(int volumeTelevisao, int[] canalTelevisao, int canalAtual) {
		super(volumeTelevisao, canalTelevisao, canalAtual);
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
		canalAtual++;
		if(canalAtual >= canalTelevisao.length) {
			canalAtual = 0;
		}
		return canalTelevisao[canalAtual];
	}
	
	public int anteCanal() {
		canalAtual--;
		if(canalAtual < 0) {
			canalAtual = 4;
		}
		return canalTelevisao[canalAtual];
	}

	@Override
	public String toString() {
		return "ControleRemoto [volumeTelevisao=" + volumeTelevisao + ", canalTelevisao="
				+ Arrays.toString(canalTelevisao) + ", canalAtual=" + canalAtual + ", aumentaVolume()="
				+ aumentaVolume() + ", diminuiVolume()=" + diminuiVolume() + ", proxCanal()=" + proxCanal()
				+ ", anteCanal()=" + anteCanal() + "]";
	}
}
