
public class declararVariablesApp {

	public static void main(String[] args) {

		/*En el enunciado pone que creemos variables N, A y C pero en la primera página del PDF
		explicativo, nos dices que no pongamos la primera letra en mayúscula. Así que las creo en minúscula*/
		int n;
		double a;
		char c;
		
		n = 12;
		a = 5.5;
		c = 'j';

		System.out.println("La variable n es = "+n);
		System.out.println("La variable a es = "+a);
		System.out.println("La variable c es = "+c);
		System.out.println("La suma de n + a = "+(n+a));
		System.out.println("La resta de n - a = "+(n-a));
		System.out.println("El valor numerico de c = "+(int)c);
		
		System.out.println("Las operaciones también se puede hacer de la siguiente manera:");
		
		double suma = n+a;
		double resta = n-a;
		int valor = c;
		
		System.out.println("La suma de n + a = "+suma);
		System.out.println("La resta de n - a = "+resta);
		System.out.println("El valor numerico de c = "+valor);
	}

}
