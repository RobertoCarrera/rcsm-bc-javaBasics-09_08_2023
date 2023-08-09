
public class operadoresApp {

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 4;
		
		System.out.println("La suma de "+num1+" + "+num2+" = "+(num1+num2));
		System.out.println("La resta de "+num1+" - "+num2+" = "+(num1-num2));
		System.out.println("La multiplicacion de "+num1+" x "+num2+" = "+(num1*num2));
		System.out.println("La division de "+num1+" / "+num2+" = "+(num1/num2));
		System.out.println("El resto de "+num1+" / "+num2+" = "+(num1%num2));

		System.out.println("Otra forma de hacerlo seria la siguiente y aparecerian los mismos resultados:");
		
		int suma = num1+num2;
		int resta = num1-num2;
		int multiplicacion = num1*num2;
		int division = num1/num2;
		int resto = num1%num2;
		
		System.out.println("La suma de "+num1+" + "+num2+" = "+suma);
		System.out.println("La resta de "+num1+" - "+num2+" = "+resta);
		System.out.println("La multiplicacion de "+num1+" x "+num2+" = "+multiplicacion);
		System.out.println("La division de "+num1+" / "+num2+" = "+division);
		System.out.println("El resto de "+num1+" / "+num2+" = "+resto);
	}

}
