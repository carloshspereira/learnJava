package exercicio3.entities;

public class Student {

	public String name;
	public double n1;
	public double n2;
	public double n3;
	@Override
	public String toString() {
		String resultado;
		if (n1+n2+n3>=60.0) {
			resultado = String.format("FINAL GRADE = %.2f%n" + 
					"PASS", n1+n2+n3);
			
		}else {
			resultado = String.format("FINAL GRADE = %.2f%n" + 
					"FAILED%n"
					+ "MISSING %.2f POINTS", n1+n2+n3, 60.0-(n1+n2+n3));
		}
		return resultado;
	}

}
