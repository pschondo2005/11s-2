import java.util.List;
import java.util.ArrayList;
/*** The Deck class represents a shuffled deck of cards.* It provides several operations including initialize,* shuffle, deal, and check if empty.*/
public class Deck {
  private List<Card> cards;
  private int size;
  public Deck(String[] ranks, String[] suits, int[] values) {
    cards = new ArrayList <Card>();
    for(int i = 0; i < ranks.length; i++){
      for (int j = 0; j < suits.length; j++)
      {
        Card card = new Card(ranks[i], suits[j], values[i]);
        cards.add(card);
        }
      }size = cards.size();
    shuffle();
  }
  public boolean isEmpty()
  {
    return size == 0;
    }
  public int size() 
  {
    return size();
    }
  public void shuffle() 
  {
    for (int k = cards.size() - 1; k > 0; k--)
      {
        int howMany = k + 1;int start = 0;
        int randPos = (int) (Math.random() * howMany) + start;
        }
    }
}
    