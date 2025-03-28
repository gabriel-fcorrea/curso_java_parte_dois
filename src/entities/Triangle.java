package entities; //pacote da classe

public class Triangle { // nome da classe

	public double a; // atributo da classe
	public double b; // atributo da classe
	public double c; // atributo da classe

	// nome do metodo (area) /////// "()" é a lista de parâmetros do método
	public double area() { // tipo do dado que o método retorna (double), se não retorna é void.
		/*
		 * a lista de parametros está vazia pois todos os parametros que são necessários
		 * para rodar o código estão especificados na classe (a, b e c)
		 */

		// abaixo é o corpo do método "area"
		double p = (a + b + c) / 2;
		double q = p * (p - a) * (p - b) * (p - c);
		return Math.sqrt(q);
	}

}
