import java.util.Random;

public class DiceDoubles {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("HERE COMES THE DICE!");
		System.out.println();
		int a = 0;
		int b = 1;

		while(a != b){
			a = rd.nextInt(6)+1;
			b = rd.nextInt(6)+1;
			System.out.println("Roll #1: "+a);
			System.out.println("Roll #1: "+b);
			System.out.println("The total is "+(a+b));
		}
		

	}
}