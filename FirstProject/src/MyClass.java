import java.util.Random;
import java.util.Scanner;

public class MyClass{
	
	
	
	public void printMsg(String msg) {
		System.out.println(msg);
		
	}
	
	public void guessMyNumber(int x){
		
	
		
		
		for(int i=0;i<3;i++) {
			System.out.println("please enter your choice \n");
			
		Scanner input = new Scanner(System.in);
	    
		int number = input.nextInt();
		
		int max = number;
		
		Random rand = new Random();
			
		if(rand.nextInt(x+1) == number) {
			
			System.out.println("Congratulation!! You win!!");
		
		}
		else {
			System.out.println("wrong input \n ");
		}
		
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
			MyClass c = new MyClass();
			
		
			c.guessMyNumber(5);
	}

	
	
}