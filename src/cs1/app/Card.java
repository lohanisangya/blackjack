package cs1.app;

import cs1.android.*;

public class Card 
{ 
//data members
    
    private int number;
    private int points;
    
    //Constructors
    
    public Card (int n)
    {
        number = n;
    }
    
    //methods
    
    public int getNumber()
    {
        return number;
    }
    
    public int getPoints()
    {
        points = number / 10;
        
        if (points > 10)
        {
            points = 10;
        }
        
        return points;
    }
    
    public int getWidth()
    {
        return 71;
    }
    
    public int getHeight()
    {
        return 96;
    }
    
    public void draw (double x, double y)
    {
        String cardImage = "card" + number + ".png";
        canvas.drawImage (x, y, cardImage);        
    }
    
    public static void main (String[] args)
    {
        //Card card1 = new Card (84);
        //System.out.println("card rank : " + card1.getNumber());    
        //System.out.println("card value: " + card1.getPoints());    
        //System.out.println("card width : " + card1.getWidth());    
        //System.out.println("card height: " + card1.getHeight()); 
       
        //System.out.println();
        //Card card2 = new Card (123);
        //System.out.println("card rank : " + card2.getNumber());    
        //System.out.println("card value: " + card2.getPoints());    
        //System.out.println("card width : " + card2.getWidth());    
        //System.out.println("card height: " + card2.getHeight()); 
        
        //System.out.println();
        //Card card3 = new Card (11);
        //System.out.println("card rank : " + card3.getNumber());    
        //System.out.println("card value: " + card3.getPoints());    
        //System.out.println("card width : " + card3.getWidth());    
        //System.out.println("card height: " + card3.getHeight()); 
        
        //System.out.println();
        //Card card4 = new Card (22);
        //System.out.println("card rank : " + card4.getNumber());    
        //System.out.println("card value: " + card4.getPoints());    
        //System.out.println("card width : " + card4.getWidth());    
        //System.out.println("card height: " + card4.getHeight());        
    }
}
