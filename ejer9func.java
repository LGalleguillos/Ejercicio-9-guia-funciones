package funciones;

import java.util.Scanner;

public class ejer9func {

	public static void main(String[] args) {
		// determina la cantidad de cifras de un numero ingresado por teclado
		int cont=0;
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese un numero");
		N=sc.nextInt();
		cont=cifras(N);             //invoco funcion
		System.out.println("El numero de cifras de "+N+" es "+cont);  //muestro por pantalla
		
		
		

	}
	static int cifras (int x){  //funcion 
		int count = 0;
		while(x>=1){      //divide el numero en 10 para reducirlo a un numero menor a 1
			x=x/10;
			count=count+1;        //el count es el numero de cifras registradas
		}
		return count;
	}

}
