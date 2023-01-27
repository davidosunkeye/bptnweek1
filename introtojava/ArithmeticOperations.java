package introtojava;

public class ArithmeticOperations {

	public static void main(String[] args) {
		String h = "Oladapo";
	     String w = "Osunkeye";
	     System.out.println(h);  //3
	     System.out.println(w);  //5
	     h = w;
	     w = h;
	     System.out.println(h);  //expected 5
	     System.out.println(w);  //expected 3
	}

}
