package cs1.app;

import cs1.android.*;
import java.util.ArrayList;

public class Deck
{
    //data members 
    
    private ArrayList<Card> cards;
    
    //constructor (s)
    
    public Deck()
    {
        cards = new ArrayList<Card>();
        int cardRank = 1;
        
        for (int i = 0; i < 52; i = i + 4)
        {           
            Card card1 = new Card(cardRank * 10 + 1);
            cards.add(card1);
            
            Card card2 = new Card(cardRank * 10 + 2);
            cards.add(card2);
            
            Card card3 = new Card(cardRank * 10 + 3);
            cards.add(card3);
            
            Card card4 = new Card(cardRank * 10 + 4);
            cards.add(card4);          
                       
            cardRank++;
        }
    }
    
    //behaviors 
    
    public Card deal()
    {
        Card lastCard = cards.remove(cards.size() - 1);
        return lastCard;
    }
    
    
    public void shuffle()
    {
        for (int i = 0; i < cards.size() / 2; i++)
        {
            int j = canvas.getRandomInt(0, cards.size() - 1);
            int k = canvas.getRandomInt(0, cards.size() - 1);
            
            Card card1 = cards.get(j);
            cards.set (j, cards.get(k));
            cards.set (k, card1);
        }
    }
    
    public void draw (double y)
    {
        double x = 36; 
        
        for (Card c : cards)
        {  
            c.draw (x, y);
            x = x + 10;
        }
    }
    
    public static void main (String[] args)
    {
        //Deck deck = new Deck();
        
        //Card card = deck.deal();
        
        //System.out.println(card.getNumber());
        //System.out.println(card.getPoints());
        
        //Card card2 = deck.deal();
        //System.out.println(card2.getNumber());
        //System.out.println(card2.getPoints());
        
        //Card card3 = deck.deal();
        //System.out.println(card3.getNumber());
        //System.out.println(card3.getPoints());
        
        //Card card4 = deck.deal();
        //System.out.println(card4.getNumber());
        //System.out.println(card4.getPoints());
        
        //Card card5 = deck.deal();
        //System.out.println(card5.getNumber());
        //System.out.println(card5.getPoints());
    }
}
