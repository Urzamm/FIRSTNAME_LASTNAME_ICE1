* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 /
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import javax.smartcardio.Card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author urzamm - 2021/05/30
 * @author urzamm - 2021/05/31
 */
public class CardTrick {
 
private static Random random = new Random();
    
    public static void main(String[] args {
     
     Card luckyCard[7] = new Card();
     
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++);
        {
            Card c = new Card();
            
         
            //c.setValue(insert call to random number generator here)
           c.setValue(7);
            setValue  = Random;
           
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card c);
              
            
            // add c to your magicHand
c.setadd(magicHand);
ArrayList = new ArrayList:
String.add[] = ("Hearts");
String.add[] = ("Clubs");
String.add[] = ("Spade");
String.add[] = ("Diamonds");
String.add[] = ("Queen");
String.add[] = ("King");
String.add[] = ("Jack");
           
            }
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
 System.out.prinln(Congratulations);
System.out.println(Better luck next time)
    }


    
    
