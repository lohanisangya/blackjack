package cs1.app;

import cs1.android.*;

public class Player 
{
    // data members
    private String name;
    private int points;
    private boolean active;
    private Card lastCard;
    
    //Constructor (s)
    
    public Player (String n)
    {
        name = n;
        active = true;
        points = 0;
        lastCard = new Card (0);
    }
    
    //methods
    
    public String getName()
    {
        return name;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public boolean isActive()
    {
        return active;
    }
    
    public void stopPlaying()
    {
        active = false;
    }
    
    public void collectCard (Card card)
    {
        if (active == true)
        {
            lastCard = card;
            points = points + card.getPoints();
            
            if (points >= 21)
            {
                active = false;
            }
        }
    }
    
    public void draw (double curX, double curY)
    {        
        String color;
        
        if (active == true)
        {
            color = "blue";
        }
        else
        {
            color = "red";
        }
        
        lastCard.draw (curX, curY);
        canvas.drawSquare (curX, curY, 22, "black");
        canvas.drawSquare (curX, curY, 20, "white");
        canvas.drawText (curX, curY, points, color);
    }
    
    public static void main (String[] args)
    {
        //Player mickey = new Player( "Mickey" );
        
        //System.out.println("player name: " + mickey.getName());      
        //System.out.println("player points: " + mickey.getPoints());  
        //System.out.println("player active: " + mickey.isActive());   
        
        //Card card1 = new Card( 64 );
        
        //mickey.collectCard(card1);
        //System.out.println("player name: " + mickey.getName());      
        //System.out.println("player points: " + mickey.getPoints());  
        //System.out.println("player active: " + mickey.isActive());   
        
        //mickey.stopPlaying();
        //System.out.println("player active: " + mickey.isActive());  
        
        //Player s = new Player( "s" );
        
        //System.out.println("player name: " + s.getName());      
        //System.out.println("player points: " + s.getPoints());  
        //System.out.println("player active: " + s.isActive());   
        
        //Card card2 = new Card(1);
        
        //s.collectCard(card2);
        
        //System.out.println("player name: " + s.getName());      
        //System.out.println("player points: " + s.getPoints());  
        //System.out.println("player active: " + s.isActive());   
        
        //s.stopPlaying();
        
        //System.out.println("player active: " + s.isActive());     
    }
}
