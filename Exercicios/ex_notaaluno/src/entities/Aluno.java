package entities;

public class Aluno {
	public String nome;
	public double tri_1;
	public double tri_2;
	public double tri_3;
	
	public double notaFinal() {
		return (tri_1 + tri_2 + tri_3) / 3;
	}
	
	public double notaRestante() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		}
		else {
			return 0.0;
		}
	}
}
