package exe_02;

import java.sql.Time;
import java.util.Date;

public class Ingresso extends Sessao {
	private String codigoAssento;
	private int tipoIngresso;
	
	public Ingresso(Date dataSessao, Time horaSessao, double valorInteira, double valorMeia, boolean sessaoEncerrada, String codigoAssento, int tipoIngresso) {
		super(dataSessao, horaSessao, valorInteira, valorInteira, sessaoEncerrada);
		this.codigoAssento = codigoAssento;
		this.tipoIngresso = tipoIngresso;
	}

	public String getCodigoAssento() {
		return codigoAssento;
	}

	public int getTipoIngresso() {
		return tipoIngresso;
	}
	
	public int gerarIngresso() {
		return //código para gerar numero aleatório
	}

	public String consultarAssentoIngresso(String codigoAssento) {
		return codigoAssento;
	}
	
	public int consultarTipoIngresso(int tipoIngresso)	{
		return tipoIngresso;
	}
}
