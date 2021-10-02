package cs1.app;

import cs1.android.*;

public class OOPBlackjackApp extends AndroidApp
{
    public void run()
    {
        //Card card1 = new Card (84);
        //card1.draw (80, 100);
        
        //Card card2= new Card (123);
        //card2.draw(150, 100);
        
        //Card card3 = new Card (0);
        //card3.draw (200, 200);
        
        //Player mickey = new Player("Mickey");
        //Player s = new Player ("S");
        //Player x = new Player ("x");
        
        //mickey.draw(80, 100);
        
        //Card card1 = new Card( 113 );
        //Card card2 = new Card (111);
        //Card card3 = new Card (71);
        //Card card4 = new Card (22);
        
        //mickey.collectCard( card1 );
       
        //mickey.collectCard( card2);
        
        //mickey.collectCard (card3);
               
        //mickey.draw (200, 100);    
        
       // mickey.collectCard (card4);
        
        //mickey.draw (200, 300);  
        
        //Deck deck = new Deck();
        
        //deck.shuffle();
        //deck.draw( 55 );
              
        //deck.deal();
        //deck.deal();
        //deck.deal();
        //deck.deal();
        //deck.deal();
        //deck.deal();
        
        //deck.draw( 250);
        
        //Player test = new Player ("test");
        //Casino casino = new Casino();
        //casino.add(test);
        
        //boolean active = casino.hasActive();
        //System.out.println ("are there active players: " + active);
        
        //casino.drawPlayers();
        //casino.playBlackJack();
        
        // MAIN GAME
        
        Player a = new Player ("a");
        Player b = new Player ("b");
        Player c = new Player ("c");
        Player d = new Player ("d");
        Player e = new Player ("e");
        
        Casino casino = new Casino();
        
        casino.add(a);
        casino.add(b);
        casino.add(c);
        casino.add(d);
        casino.add(e);
        
        boolean active = casino.hasActive();
        System.out.println ("are there active players: " + active);
        
        casino.drawPlayers();
        
        casino.playBlackJack();
    }
}

