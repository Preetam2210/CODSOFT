package Task_1;

import java.util.Scanner;

class rangen{
    public int genrate(int max,int min){
    	return (int) (Math.random()*(max - min + 1) + min);
    }
    
    public void numberGame() {
    	Scanner sc = new Scanner(System.in);
    	int totalAttempts = 0;
        int win = 0;

        while (true) {
            System.out.println("Enter the maximum number");
            int max = sc.nextInt();
            System.out.println("Enter the minimum number");
            int min = sc.nextInt();
            if(min>max) {
            	while(true) {
            		System.out.println("Your entered number is greater then maximum number");
            		System.out.println("Please enter the minimum number");
            		min=sc.nextInt();
            		if(min<max) break;
            	}
            }
            sc.nextLine();

            int cnum = genrate(max, min);
            int attempts = 0;

            while (true) {
                System.out.println("Guess a number between "+max+" and "+min);
                int gnum = sc.nextInt();
                if(gnum>max || gnum<min) {
                	while(true) {
                		System.out.println("Sorry enterd number is out of range");
                		System.out.println("Enter the number between" +max+" and "+min);
                		gnum=sc.nextInt();
                		if(gnum<=max && gnum>=min) break;
                	}
                }
                attempts++;

                if (gnum > cnum) {
                    System.out.println("Its Greater");
                } else if (gnum < cnum){
                    System.out.println("Its Lower");
                }else{
                    System.out.println("Correct Guess");
                    win++;
                    break;
                }
            }
            
            totalAttempts += attempts;
            System.out.println("Attempts = " + attempts);
            System.out.println("Wins = " + win);

            double winrate = (double) win / totalAttempts*100;
            System.out.printf("Your winrate is %.2f%%\n",winrate);

            System.out.println("Do you want to play again (yes/no)");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("yes")){
            	System.out.println("Thank you for playing this game, I hope you enjoyed the game");
                sc.close();
                System.exit(0);
            }
            sc.nextLine();
        }
    }   
}

public class NumberGame {

	public static void main(String[] args) {
		  rangen rg = new rangen();
	        rg.numberGame(); 
	}
}
