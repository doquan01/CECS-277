import java.util.Scanner;

/*Quan Do
  CECS 277-01
  War
  10/6/2020

  I certify that this program is my is my own work. I did not copy any part of this program from
  any other source. I further certify that I typed each and every line of code in this program.
*/
public class War {
    public static void main(String[] args) {

        int input;
        Deck d = new Deck();
        Hand player1 = new Hand(d);
        Hand player2 = new Hand(d);
        do{
            input = menu();
            if (input == 1){
                d = new Deck();
                player1 = new Hand(d);
                player2 = new Hand(d);
                System.out.println("New deck created");
            }
            else if (input == 2){
                d = new Deck();
                d.shuffle();
                player1 = new Hand(d);
                player2 = new Hand(d);
                System.out.println("Deck shuffled");
            }
            else if (input == 3){
                System.out.println("Player 1 cards: ");
                player1.display();
                System.out.println("Player 2 cards: ");
                player2.display();

            }
            else if (input == 4){
                playWar(player1, player2);
            }
            else if (input == 5){
                System.out.println("Exiting the game, bye.");
            }
            else{
                System.out.println("Please input a number option from the menu.\n");
            }
        }
        while(input != 5); //exit the program
    }
    public static int menu(){
        Scanner scan = new Scanner(System.in);

        System.out.print("War!\n1) New Deck\n" +
                "2) Shuffle Deck\n3) Show Deck\n4) Play War\n5) Exit\n" + "Please enter a number option\n");
        int x = scan.nextInt();
        return x;
    }
    public static void playWar(Hand p1, Hand p2){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the max battle number");
        int counter = scan.nextInt();
        Deck s = new Deck();
        s.shuffle();
        p1 = new Hand(s);
        p2 = new Hand(s);
        System.out.println("Player 1 cards: ");
        p1.display();
        System.out.println("Player 2 cards: ");
        p2.display();
        System.out.println("Press any key to continue");
        if(scan.hasNext()) {
            while (counter != 0 || p1.cardsLeft() != 0 || p2.cardsLeft() != 0) {
                
            }
        }
    }
}
