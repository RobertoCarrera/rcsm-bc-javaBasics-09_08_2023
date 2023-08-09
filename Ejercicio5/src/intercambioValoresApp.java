
public class intercambioValoresApp {

	public static void main(String[] args) {

		int a = 5;
		int b = 2;
		int c = 12;
		int d = 3;
		
		System.out.println("Valor de a = "+a);
		System.out.println("Valor de b = "+b);
		System.out.println("Valor de c = "+c);
		System.out.println("Valor de d = "+d);
		
		b = c;
		c = a;
		a = d;
		d = b;

		System.out.println("El nuevo valor de a = "+a);
		System.out.println("El nuevo valor de b = "+b);
		System.out.println("El nuevo valor de c = "+c);
		System.out.println("El nuevo valor de d = "+d);
	}

}
