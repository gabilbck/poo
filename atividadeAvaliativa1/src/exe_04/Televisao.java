package exe_04;

public abstract class Televisao {
	protected int volumeTelevisao;
	protected int canalTelevisao;
	
	public Televisao(int volumeTelevisao, int canalTelevisao) {
		super();
		this.volumeTelevisao = volumeTelevisao;
		this.canalTelevisao = canalTelevisao;
	}

	public int getVolumeTelevisao() {
		return volumeTelevisao;
	}

	public int getCanalTelevisao() {
		return canalTelevisao;
	}
}
