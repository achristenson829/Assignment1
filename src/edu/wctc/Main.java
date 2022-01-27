package edu.wctc;

import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playAgain = false;
        do {
            playGame();
            System.out.println("Do you want to play again? y/n");
            Scanner s = new Scanner(System.in);
            String option = s.nextLine();
            if (option.equals("y")){
                 playAgain = true;
            }else
                playAgain = false;
        } while (playAgain);
    }
    public static void playGame(){
        System.out.println("What do you prefer?");
        System.out.println("If you choose the option on the left select 0 or the right select 1");
        questions();
    }


    public static void questions(){
        String[] questions = {"Mild or Spicy?", "Dogs or Cats?", "Play or Work", "Passenger or Driver?",
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
   /* Create a one file program that prompts the user a minimum of five times to indicate their preference between
   two unique choices.  Possible choices include but are not limited to:

   mild or spicy
   tea or coffee
   breakfast or brunch
   summer or winter
   paper or plastic

   Prompt the user to enter 0 or 1: where 0 is for the choice on the left and 1 is for the choice on the right.
   Given this structure, the user will end with a score of 0 through 5.  If the score is less than 3, exactly 3,
   or greater than 3, print messages to the user indicating something about their personality based on the choices
   they've made.  For example:

   Score less than 3: "You prefer life to be calm and organized"
   Score greater than 3: "You prefer life to be spontaneous and active"
   Score exactly 3: "You prefer a good balance in life."
   Try to organize your choices on the left and right for the user so that the resulting message seems plausible.

   After the score and message are printed, ask the user if they want to run the program again.*/