package exe_04;

public abstract class Televisao {
	protected int volumeTelevisao;
	protected int[] canalTelevisao = {1, 2, 3, 4, 5};
	protected int canalAtual;
	
	public Televisao(int volumeTelevisao, int[] canalTelevisao, int canalAtual) {
		super();
		this.volumeTelevisao = volumeTelevisao;
		this.canalTelevisao = canalTelevisao;
		this.canalAtual = canalAtual;
	}

	public int getVolumeTelevisao() {
		return volumeTelevisao;
	}

	public int[] getCanalTelevisao() {
		return canalTelevisao;
	}
	
	public int getCanalAtual() {
		return canalAtual+1;
	}
}
