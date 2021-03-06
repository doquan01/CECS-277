import java.util.ArrayList;

public class Hand extends Deck {
    private ArrayList<Card> player;
    public Hand(Deck d){
        ArrayList<Card> p = new ArrayList<>();
        this.player = p;
        for(int i = 0; i < 26; i++){
            p.add(d.deal());
        }
    }
    public void display(){
        for(int i = 0; i < player.size(); i++){
            if (i != 0 && i%13==0){
                System.out.print("\n");
            }
            player.get(i).display();
            System.out.print(", ");
        }
        System.out.println();
    }
    public Card deal(){
        Card c = player.get(0);
        player.remove(0);
        return c;

    }
    public int cardsLeft(){
        return player.size();
    }
    public void add(Card c){
        player.add(c);
    }
}
