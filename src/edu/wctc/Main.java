package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playAgain;
        do {
            playGame();
            System.out.println("Do you want to play again? y/n");
            Scanner s = new Scanner(System.in);
            String option = s.nextLine();
            playAgain = option.equals("y");
        } while (playAgain);
    }
    public static void playGame(){
        System.out.println("What do you prefer?");
        System.out.println("If you choose the option on the left select 0 or the right select 1");
        questions();
    }

    public static void questions(){
        String[] questions = {"Mild or Spicy?", "Dogs or Cats?", "Play or Work?", "Passenger or Driver?",
                "Book or Tv?"};
        int[] choices = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.println(questions[i]);
            Scanner s = new Scanner(System.in);
            choices[i] = (s.nextInt());
        }
        int sum = 0;
        for (int i = 0; i < 5; i++)
            sum += choices[i];
        if (sum < 3){
            System.out.println("You are an amiable type. Relaxed and desire a peaceful environment.");
        }
        else if (sum == 3){
            System.out.println("You are relaxed and outgoing.  Not afraid to go get or relax as the situation demands.");
        }
        else
            System.out.println("You are outgoing, ambitious, and proactive. Not afraid to experiment or take charge.");

    }
}
