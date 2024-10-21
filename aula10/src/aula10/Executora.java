package aula10;

public class Executora {
	public static void main(String[] args) {
		Estudante e = new Estudante(2, "Severino", "Joinville");
		EstudanteCRUD estCRUD = new EstudanteCRUD();
		estCRUD.ConnectionDB();
		
		estCRUD.createEstudante(e);
		estCRUD.readEstudante(e);
	}
}
