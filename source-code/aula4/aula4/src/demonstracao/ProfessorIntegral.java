package demonstracao;

public class ProfessorIntegral extends Professor {
	protected float valorSalario;

	public ProfessorIntegral(int matrProfessor, String nmProfessor, float vlrSalario) {
		super(matrProfessor, nmProfessor);
		//valorSalario = vlrSalario;
		
		if( vlrSalario > 0) valorSalario = vlrSalario; 
	}

	public float getValorSalario() {   //método declarado via IDE Eclipse
		return valorSalario;
	}

	@Override
	public String toString() {
		return "ProfessorIntegral ---- matriculaProfessor: " + matriculaProfessor + " nomeProfessor " + nomeProfessor 
				+ "  valorSalario: " + valorSalario; 
		    
	}
	
	

}
