import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
    
	//function to checkPalindrome
	public void checkPalindrome() {
		System.out.println("Enter your number:");
		int pal = sc.nextInt();
		int rev = 0, num = pal;
		while(pal!=0) {
			int rem = pal % 10;
			rev = rev * 10 + rem;
			pal /= 10;
		}
		if (rev == num) 
			System.out.println(num + " is a palindrome.");
		else
			System.out.println(num + " is NOT a palindrome.");
	}
	
    //function to printPattern
    public void printPattern() {
    	System.out.println("Enter your number:");
		int pat = sc.nextInt();
	     for(int i=0; i<pat; i++){
	    	 for(int j=i; j<pat; j++)
	    		 System.out.print("* ");
	    	 System.out.print("\n");
	      }
	}

    //function to check no is prime or not
    public void checkPrimeNumber() {
    	System.out.println("Enter your number:");
		int pn = sc.nextInt();
		int flag = 0;
	    if(pn <= 1) {
	    	flag = 1;
	    	System.out.println(pn + " is NOT a prime number.");
	    } else {
	    	for(int i = 2; i < pn; i++) {
	    		if(pn % i == 0) 
	    			flag = 1;
	    			System.out.println(pn + " is NOT a prime number.");
	    		}
	    }
	    if (flag == 0) 
	    	System.out.println(pn + " is a prime number.");
    }

    // function to print Fibonacci Series
    public void printFibonacciSeries() {
    	//initialize the first and second value as 0,1 respectively.
    	int first = 0, second = 1;
    	System.out.println("Enter your number:");
		int fs = sc.nextInt();
		System.out.print("First " + fs + " digits of Fibonacci series are: ");
		System.out.print(first+" "+second);
		for(int i = 2 ; i <= fs ; i++) {
            int sum = first + second;
            System.out.print(" " + sum);
            first = second;
            second = sum;
		}
		System.out.print("\n");
    }

    //main method which contains switch and do while loop
    public static void main(String[] args) {
    	Main obj = new Main();
    	int choice;
    	Scanner sc = new Scanner(System.in);
    	do {
    		System.out.println("Enter your choice from the list below:\n" + "1. Find palindrome of number.\n" 
    		+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a prime number.\n"
    		+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
    		System.out.println();
    		choice = sc.nextInt();
    		switch (choice) {
    			case 0:
    				choice = 0;
    				break;
    			case 1:
    				obj.checkPalindrome();
    				break;
    			case 2: 
    				obj.printPattern();
    				break;
    			case 3:
    				obj.checkPrimeNumber();
    				break;
    			case 4:
    				obj.printFibonacciSeries();
    				break;
    			default:
    				System.out.println("Invalid choice. Enter a valid no.");
    		}
    	} while (choice != 0);
    	System.out.println("Exited Successfully!!!");
    	sc.close();
    }
}

