package demostracao;

public class ExecSobreCarga {

	public static void main(String[] args) {
		SobreCarga sbCarga = new SobreCarga();
		
		System.out.println(sbCarga.calcular(2.50f, 3.45f));
		System.out.println(sbCarga.calcular(2,3));
		System.out.println(sbCarga.calcular("Maria", " Rosa"));

	}

}
