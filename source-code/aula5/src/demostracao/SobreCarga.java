package demostracao;

public class SobreCarga {
	
	public float calcular(float a, float b) {
		return a + b;
	}
	
	public int calcular(int a, int b) {
		return a * b;
	}
	
	public String calcular(String a, String b ) {
		return a + b;
	}

}
