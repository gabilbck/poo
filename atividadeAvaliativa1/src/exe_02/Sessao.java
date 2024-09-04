package exe_02;

import java.sql.Time;
import java.util.Date;

public abstract class Sessao {
	protected Date dataSessao;
	protected Time horaSessao;
	protected double valorInteira;
	protected double valorMeia;
	protected boolean sessaoEncerrada;
	
	public Sessao(Date dataSessao, Time horaSessao, double valorInteira, double valorMeia, boolean sessaoEncerrada) {
		super();
		this.dataSessao = dataSessao;
		this.horaSessao = horaSessao;
		this.valorInteira = valorInteira;
		this.valorMeia = valorMeia;
		this.sessaoEncerrada = sessaoEncerrada;
	}

	public Date getDataSessao() {
		return dataSessao;
	}

	public Time getHoraSessao() {
		return horaSessao;
	}

	public double getValorInteira() {
		return valorInteira;
	}

	public double getValorMeia() {
		return valorMeia;
	}

	public boolean isSessaoEncerrada() {
		return sessaoEncerrada;
	}
	
	public String selecionarSessao(boolean sessaoEncerrada) {
		if(isSessaoEncerrada()==true) {
			return "Sessão encerrada";
		} else {
			return "Sessão selecionada";
		}
	}
}
