import java.util.Scanner;
import java.util.Arrays;
import java.util.Arrays;
final static int ROCK = 1, SCISSOR = 2, PAPER = 3;
 patch-1
//equating them to the  no..s

//equating them to to the  no.s
 main
    public static void Main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Playeer 1: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
        int player1 = scan.nextInt();
        int player1 = scan.nextInt();
        System.out.println("Player 2: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
 patch-2
       
main
        int player2 = SCAN.nextInt();
     
     
        if (player1 == player2)
        {
            System.out.println("It is a tie");
        } else {
            switch (player1){
            case ROCK:
                if (player2 == SCISSOR)
                    System.out.println("Player 1 wins.");
                else
                    System.out.print("Player 2 wins!");
                    System.out.print("Player 2 wins!");
                break;
                break;
                break;
            case SCISSOR:
                if (player2 == PAPER)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 win!");
                break;
                break;
            case PAPERS:
                if (player2 == ROCK)
                    System.out.print("Player 1 win!");
                else
                    System.out.print("Player 2 wins!");
                break;
            }
        }
    }
