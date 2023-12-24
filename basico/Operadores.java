package cursoJava.basico;

public class Operadores {

	public static void main(String[] args) {
		int N1=10,N2=8;
		int soma= N1+N2;
		System.out.println("soma de N1 + N2: "+soma);
		// transformar int em double
		double divisao= (double) N1/N2;
		System.out.println("divisão de N1 / N2: "+ divisao);
		int resto= N1%N2;
		System.out.println("resto de N1 % N2: "+ resto);
		// pós incremento soma será 2
		System.out.println("soma de N1 + N2: "+ soma++);
		
		// incremento soma será 3
		System.out.println("soma de N1 + N2: "+ soma);
		
		// pré-incremento soma será 2
		System.out.println("soma de N1 + N2: "+ --soma);
		
		System.out.println("igual:"+ (N1==N2));
		System.out.println(N1!=N2);
		System.out.println(N1>N2);
		System.out.println(N1<N2);
		System.out.println(N1>=N2);
		System.out.println(N1<=N2);
		
		System.out.println(N1+=20);
		
		//operadores lógicos
		
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		
		
			
	

	}
}
