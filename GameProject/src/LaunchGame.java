
import java.util.Scanner;

class Guesser{
    int guessNum;

    int guessingNumber(){
        System.out.println("Enter the guessing number : ");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();

        return guessNum;

    }
}

class Player{
    int guessNum;
    public int guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player kindly guess the number : ");
        guessNum = sc.nextInt();

        return guessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    public void collectFromPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNumber();
        numFromPlayer2 = p2.guessNumber();
        numFromPlayer3 = p3.guessNumber();
    }

    void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("Game tied all three players guessed correctly");
            }else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player1 and Player2 won the game.");
            }else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player1 and Player3 won the game.");
            }else{
                System.out.println("Player1 won the game.");
            }
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player2 and Player3 won the game");
            }else{
                System.out.println("Player2 won the game.");
            }
        }
        else if (numFromGuesser==numFromPlayer3) {
            System.out.println("Player3 won the game.");
        }
        else{
            System.out.println("Game lost! try again");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        Umpire U = new Umpire();
        U.collectFromGuesser();;
        U.collectFromPlayer();
        U.compare();
    }
}
