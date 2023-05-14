//Oasis Infobyte internship on Java Programming
//Number guessing game (Task 2)
//Desingned by Jayanta Mohapatra
import java.io.IOException;
import java.util.*;
public class Guessing_game{
	public static void main(String[] args)throws IOException {
		Guess ob=new Guess();
		ob.game();
	}
}

class Guess {
	public void game() {int count=1,f=0,num=0,score=0;
		double rate=0.0;
		Scanner in=new Scanner(System.in);
		System.out.println("*******************************Welcome to Number Guessing game******************************\n\n");
		System.out.println("Enter the number of rounds you want to play (Limit : 20)..................");
		int rounds=in.nextInt();
		if(rounds<1||rounds>20) {
			System.out.println("Error!!\tNumber of rounds exceeded the limit");
		}
		else {
			while(count<=rounds) {
				if(count==1||f==1) {
					num=(int)(Math.random()*(99)+1);
					f=0;
				}
				System.out.println("\nRound no. "+count+"-------------------------------------------------------\nEnter the number of your choice ranging from 1 to 100");
				int ch=in.nextInt();
				if(ch==num) {
					System.out.println("Congratulations!!\t Correct guess.\n");
					f=1;
					count++;
					score++;
				}
				else if(ch<num) {
					System.out.println("Nice try!\tBut the number is greater than "+ch+".\n");
					count++;
				}
				else if(ch>num) {
					System.out.println("Nice try!\tBut the number is lesser than "+ch+".\n");
					count++;
				}
				else {
					System.out.println("Please enter a valid number (1-100).\n");
					count++;
				}
			}
			rate=(double)score/rounds;
			System.out.println("-----------------------------------------------------\nActual numner was "+num+"\n");
			System.out.printf("-----------------------------------------------------\nYou guessed "+score+" number/s correctly out of "+rounds+" round/s\n");
			System.out.printf("-----------------------------------------------------\nYour total score is "+(rate*100));
			System.out.println("\n");
		}
		System.out.println("Thank you!--------------------------------------------\nHave a good day");
	}
}