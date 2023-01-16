package ArrayProg;

public class Prog1 {

	public static void main(String[] args) {
         
		
		int num[] = {10,20,30,40,50,60,70,80,90};
		System.out.println(" Lenght of num array"+num.length);
		
		//But	there	is	a	length	field	available	in	the	array	
		//that	can	be	used	to	find	the	length	or	size	of	the	array.
		//array.length:	length	is	a	final	variable	applicable	for	arrays.	
		//With	the	help	of	the	length	variable,	
		//we	can	obtain	the	size	of	the	array
		
		System.out.println("First Element="+ num[0]);
		System.out.println(" Second element ="+num[1]);
		System.out.println("Last Element"+num[8]);
		
		System.out.println("All element of array are:");
		for(int i=0;i<9;i++)
			System.out.println(num [i]+" ");
		
		System.out.println("===================");
		
		// For each loop
//		for(int result: num)
//		
//	{
//			System.out.println(result);
//		}
		
	}

}
