package cs1.app;

import cs1.android.*;
import java.util.ArrayList;

public class Casino 
{
    //data members 
    
    private ArrayList<Player> players;
    
    //constructor(s)
    
    public Casino()
    {
        players = new ArrayList<Player>();
    }
    
    public void add (Player player)
    {
        players.add (player);
    }
    
    public boolean hasActive()
    {
        for (Player p : players)
        {
            if (p.isActive() == true)
            {
                return true;
            }
        }
        
        return false;
    }
    
    public void drawPlayers()
    {
        double playerDis = canvas.getWidth() / (players.size() + 1);
        double curX = playerDis;
        double curY = 48;
            
        for (Player p : players)
        {
            p.draw (curX, curY);
            curX = curX + playerDis;
        }
    }
    
    public void playBlackJack()
    {
        canvas.setBackground("black");
        Deck deck = new Deck();
        deck.shuffle();
   
        int curIndex = 0;
        
        while (hasActive() == true)
        {
            canvas.clear();
            deck.draw(canvas.getHeight() / 2);
            drawPlayers();
            Player curPlayer = players.get(curIndex);
                        
            if (curPlayer.isActive() == true)
            {   
                Touch touch = canvas.waitForTouch();
                
                int numTaps = touch.getTaps();
                
                if (numTaps == 1)
                {
                    Card curCard = deck.deal();
                    curPlayer.collectCard(curCard);
                }
                else if (numTaps == 2)
                {
                    curPlayer.stopPlaying();
                }
            }
            
            curIndex = (curIndex + 1) % players.size();
        }
        
        canvas.clear();
        deck.draw(canvas.getHeight() / 2);
        drawPlayers();
        
        canvas.drawText(canvas.getWidth() / 2 , canvas.getHeight() * 3 / 4  , "THANK YOU FOR PLAYING", "white");
    }
}
