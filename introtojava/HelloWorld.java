package introtojava;
import java.util.Scanner; // import the Scanner class 

public class HelloWorld {
	 private static String favCity; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter name, favorite city, age,  and salary:");

	    // String input
	    String name = scanner.nextLine();

	    // string input initializing variable that previously declared
	    favCity = scanner.nextLine();

	    // Numerical input - integer
	    int age = scanner.nextInt();

	    // numeric input - double
	    double salary = scanner.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + name); 
	    System.out.println("Favorite city: " + getFavCity());
	    System.out.println("Age: " + age); 
	    System.out.println("Salary: " + salary);

	    scanner.close();
	  }
	 private static String getFavCity(){
	      return favCity;
	  }
	}


