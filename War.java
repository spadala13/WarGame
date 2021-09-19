//War Game - Neha Padala 

import java.util.*;
import java.io.*;
import java.util.Scanner;
public class War
{
 public static void main(String [] args)
 {
   playWar();// runs the war game
 }
  public static void compareCards(Card x, Card y)// compares player1's cards and player2's cards, taken from A4Help to compare the cards during the game. 
 {
  int result = x.compareTo(y);
  if (result > 0)
   System.out.println(x + " beats " + y);
  else if (result < 0)
   System.out.println(x + " loses to " + y);
  else
   System.out.println(x + " ties " + y);
   
  if (x.equals(y))
   System.out.println(x + " and " + y + " are equal ");
  else
   System.out.println(x + " and " + y + " are not equal ");
  System.out.println();
 }

 
  public static void playWar()
  {
    
    MultiDS<Card> initialDeck = new MultiDS<Card>(52);//initial deck
    MultiDS<Card> p1Deck = new MultiDS<Card>(26);//player 1's deck
    MultiDS<Card> p2Deck = new MultiDS<Card>(26);//player 2's deck
    MultiDS<Card> p1Discard = new MultiDS<Card>(52);// player 1's discard pile
    MultiDS<Card> p2Discard = new MultiDS<Card>(52);//player 2's discard pile
    MultiDS<Card> p1WarPile = new MultiDS<Card>(52);// player 1's war pile
    MultiDS<Card> p2WarPile = new MultiDS<Card>(52);//player 2's war pile
    
    Card S2 = new Card(Card.Suits.Spades, Card.Ranks.Two);// creating all cards 
    initialDeck.addItem(S2);
    Card S3 = new Card(Card.Suits.Spades, Card.Ranks.Three);
    initialDeck.addItem(S3);
    Card S4 = new Card(Card.Suits.Spades, Card.Ranks.Four);
    initialDeck.addItem(S4);
    Card S5 = new Card(Card.Suits.Spades, Card.Ranks.Five);
    initialDeck.addItem(S5);
    Card S6 = new Card(Card.Suits.Spades, Card.Ranks.Six);
    initialDeck.addItem(S6);
    Card S7 = new Card(Card.Suits.Spades, Card.Ranks.Seven);
    initialDeck.addItem(S7);
    Card S8 = new Card(Card.Suits.Spades, Card.Ranks.Eight);
    initialDeck.addItem(S8);
    Card S9 = new Card(Card.Suits.Spades, Card.Ranks.Nine);
    initialDeck.addItem(S9);
    Card S10 = new Card(Card.Suits.Spades, Card.Ranks.Ten);
    initialDeck.addItem(S10);
    Card SJ = new Card(Card.Suits.Spades, Card.Ranks.Jack);
    initialDeck.addItem(SJ);
    Card SQ = new Card(Card.Suits.Spades, Card.Ranks.Queen);
    initialDeck.addItem(SQ);
    Card SK = new Card(Card.Suits.Spades, Card.Ranks.King);
    initialDeck.addItem(SK);
    Card SA = new Card(Card.Suits.Spades, Card.Ranks.Ace);
    initialDeck.addItem(SA);
 
    Card C2 = new Card(Card.Suits.Clubs, Card.Ranks.Two);
    initialDeck.addItem(C2);
    Card C3 = new Card(Card.Suits.Clubs, Card.Ranks.Three);
    initialDeck.addItem(C3);
    Card C4 = new Card(Card.Suits.Clubs, Card.Ranks.Four);
    initialDeck.addItem(C4);
    Card C5 = new Card(Card.Suits.Clubs, Card.Ranks.Five);
    initialDeck.addItem(C5);
    Card C6 = new Card(Card.Suits.Clubs, Card.Ranks.Six);
    initialDeck.addItem(C6);
    Card C7 = new Card(Card.Suits.Clubs, Card.Ranks.Seven);
    initialDeck.addItem(C7);
    Card C8 = new Card(Card.Suits.Clubs, Card.Ranks.Eight);
    initialDeck.addItem(C8);
    Card C9 = new Card(Card.Suits.Clubs, Card.Ranks.Nine);
    initialDeck.addItem(C9);
    Card C10 = new Card(Card.Suits.Clubs, Card.Ranks.Ten);
    initialDeck.addItem(C10);
    Card CJ = new Card(Card.Suits.Clubs, Card.Ranks.Jack);
    initialDeck.addItem(CJ);
    Card CQ = new Card(Card.Suits.Clubs, Card.Ranks.Queen);
    initialDeck.addItem(CQ);
    Card CK = new Card(Card.Suits.Clubs, Card.Ranks.King);
    initialDeck.addItem(CK);
    Card CA = new Card(Card.Suits.Clubs, Card.Ranks.Ace);
    initialDeck.addItem(CA);
 
    Card D2 = new Card(Card.Suits.Diamonds, Card.Ranks.Two);
     initialDeck.addItem(D2);
    Card D3 = new Card(Card.Suits.Diamonds, Card.Ranks.Three);
    initialDeck.addItem(D3);
    Card D4 = new Card(Card.Suits.Diamonds, Card.Ranks.Four);
    initialDeck.addItem(D4);
    Card D5 = new Card(Card.Suits.Diamonds, Card.Ranks.Five);
    initialDeck.addItem(D5);
    Card D6 = new Card(Card.Suits.Diamonds, Card.Ranks.Six);
    initialDeck.addItem(D6);
    Card D7 = new Card(Card.Suits.Diamonds, Card.Ranks.Seven);
    initialDeck.addItem(D7);
    Card D8 = new Card(Card.Suits.Diamonds, Card.Ranks.Eight);
    initialDeck.addItem(D8);
    Card D9 = new Card(Card.Suits.Diamonds, Card.Ranks.Nine);
    initialDeck.addItem(D9);
    Card D10 = new Card(Card.Suits.Diamonds, Card.Ranks.Ten);
    initialDeck.addItem(D10);
    Card DJ = new Card(Card.Suits.Diamonds, Card.Ranks.Jack);
    initialDeck.addItem(DJ);
    Card DQ = new Card(Card.Suits.Diamonds, Card.Ranks.Queen);
    initialDeck.addItem(DQ);
    Card DK = new Card(Card.Suits.Diamonds, Card.Ranks.King);
    initialDeck.addItem(DK);
    Card DA = new Card(Card.Suits.Diamonds, Card.Ranks.Ace);
    initialDeck.addItem(DA);
 
    Card H2 = new Card(Card.Suits.Hearts, Card.Ranks.Two);
    initialDeck.addItem(H2);
    Card H3 = new Card(Card.Suits.Hearts, Card.Ranks.Three);
    initialDeck.addItem(H3);
    Card H4 = new Card(Card.Suits.Hearts, Card.Ranks.Four);
    initialDeck.addItem(H4);
    Card H5 = new Card(Card.Suits.Hearts, Card.Ranks.Five);
    initialDeck.addItem(H5);
    Card H6 = new Card(Card.Suits.Hearts, Card.Ranks.Six);
    initialDeck.addItem(H6);
    Card H7 = new Card(Card.Suits.Hearts, Card.Ranks.Seven);
    initialDeck.addItem(H7);
    Card H8 = new Card(Card.Suits.Hearts, Card.Ranks.Eight);
    initialDeck.addItem(H8);
    Card H9 = new Card(Card.Suits.Hearts, Card.Ranks.Nine);
    initialDeck.addItem(H9);
    Card H10 = new Card(Card.Suits.Hearts, Card.Ranks.Ten);
    initialDeck.addItem(H10);
    Card HJ = new Card(Card.Suits.Hearts, Card.Ranks.Jack);
    initialDeck.addItem(HJ);
    Card HQ = new Card(Card.Suits.Hearts, Card.Ranks.Queen);
    initialDeck.addItem(HQ);
    Card HK = new Card(Card.Suits.Hearts, Card.Ranks.King);
    initialDeck.addItem(HK);
    Card HA = new Card(Card.Suits.Hearts, Card.Ranks.Ace);
    initialDeck.addItem(HA);
    
    
    
    System.out.println("Welcome to the Game of War!");
    System.out.println("How many rounds would you like to play?"); 
    Scanner sc = new Scanner(System.in);
    int numRounds = sc.nextInt();
    while (numRounds <= 0)
    {
      System.out.println("Please type a number greater than zero");
      numRounds = sc.nextInt();
    }
   
    
    System.out.println("\nNow dealing cards to the players...");
    
    //shuffles the initial deck and deals the cards to the players
    initialDeck.shuffle();
    while (!initialDeck.empty())
    {
      p1Deck.addItem(initialDeck.removeItem());
      p2Deck.addItem(initialDeck.removeItem());
      
    }
    
    
    System.out.println("\nHere is Player 1's Hand: ");
    
    System.out.println(p1Deck.toString());// prints the cards that are in the deck for player1
    
    System.out.println("\nHere is Player 2's Hand: ");
    
    System.out.println(p2Deck.toString());// prints the cards that are in the deck for player2
    
    System.out.println("\nStarting the War!\n");
    
  
  
  int roundsPlayed=0;
  int cards=0;

  
    while((roundsPlayed<numRounds)&&(!p1Deck.empty()&&!p2Deck.empty()))
    {
     cards=0;
     Card p1Card = p1Deck.removeItem();
     Card p2Card = p2Deck.removeItem();
        if (p1Deck.empty() && !p1Discard.empty())//player 1's deck is reloaded. 
        {
        System.out.println("Getting and shuffling the pile for Player 1");
        p1Discard.shuffle();
        while (!p1Discard.empty())
        {
          p1Deck.addItem(p1Discard.removeItem());
        }
        p1Discard.clear();
      }
        
        if (p2Deck.empty() && !p2Discard.empty())// player 2's deck is reloaded. 
        {
       System.out.println("Getting and shuffling the pile for Player 2");
        p2Discard.shuffle();
        while (!p2Discard.empty())
        {
          p2Deck.addItem(p1Discard.removeItem());
        }
        p2Discard.clear();
      }
     if (p1Card.compareTo(p2Card)>0)// this is when player 1 wins.
     {
       cards=2;
       System.out.println("Player 1 win Round " +roundsPlayed+": ");
       compareCards(p1Card, p2Card);
       System.out.println(": "+cards+ "cards\n");
       p1Discard.addItem(p1Card);
       p2Discard.addItem(p2Card);
       
     }
     else if(p1Card.compareTo(p2Card)<0)// this is when player 2 wins . 
     {
       cards=2;
       System.out.println("Player 2 win Round " +roundsPlayed+ ": ");
       compareCards(p1Card, p2Card);
       System.out.println(": " +cards+ " cards\n");
       p1Discard.addItem(p1Card);
       p2Discard.addItem(p2Card);
     }
     while(p1Card.compareTo(p2Card)==0)//this is when they are at a tie. 
     {
      cards+=2;
      p1WarPile.addItem(p1Card);
      p2WarPile.addItem(p2Card);
      
      System.out.println(" WAR:");
      compareCards(p1Card, p2Card);
      System.out.println();
      System.out.println("Player 1: "+ p1Card.toString()+" Player 2:" + p2Card.toString());
      p1WarPile.addItem(p1Card);
      p2WarPile.addItem(p2Card);
      cards+=2;
      
      
      p1Card = p1Deck.removeItem();// the cards are removed and moved. 
      p2Card = p2Deck.removeItem();
      cards+=2;
      if (p1Card.compareTo(p2Card)<0)// played again after the tie
      {
         System.out.println("Player 2 wins Round "+roundsPlayed+": ");
          compareCards(p1Card, p2Card);
          System.out.println(": " +cards+ " cards");
          p2Discard.addItem(p1Card);
          p2Discard.addItem(p1WarPile.removeItem());
          p2Discard.addItem(p2Card);
          p2Discard.addItem(p2WarPile.removeItem());

      }
      else if(p1Card.compareTo(p2Card)>0)// played again after the tie 
      {
           System.out.println("Player 1 wins Round "+roundsPlayed+":");
        compareCards(p1Card, p2Card);
         System.out.println(": " +cards+ " cards");
          p1Discard.addItem(p1Card);
          p1Discard.addItem(p1WarPile.removeItem());
          p1Discard.addItem(p2Card);
          p1Discard.addItem(p2WarPile.removeItem());
      }   
      
     }
     System.out.println();
     roundsPlayed++;
 
     

     if((p1Deck.size()+p1Discard.size()) == (p2Deck.size()+p2Discard.size()))// amount of cards are compared between 2 players and if they are equal, it is declared a stalemate. 
    {
  
      System.out.println("\n--------------------------------------------\n");
      System.out.println("*Drumroll*");
      System.out.println("After "+roundsPlayed+" rounds, here's how it went:");
      System.out.println("    Player 1 has 26 cards");
      System.out.println("    Player 2 has 26 cards");
      System.out.println("It is a STALEMATE!");
    }
    else if((p1Deck.size()+p1Discard.size()) > (p2Deck.size()+p2Discard.size()))// amount of cards are compared between 2 players and determined who's the winner. 
    {
      
 
      System.out.println("\n--------------------------------------------\n");
      System.out.println("*Drumroll*");
      System.out.println("After "+roundsPlayed+" rounds, here's how it went:");
      System.out.println("    Player 1 has "+(p1Deck.size()+p1Discard.size())+" cards");
      System.out.println("    Player 2 has "+(p2Deck.size()+p2Discard.size())+" cards");
      System.out.println("Player 1 is the WINNER!");
    }
    else if((p1Deck.size()+p1Discard.size()) < (p2Deck.size()+p2Discard.size()))// amount of cards are compared between 2 players and determined who's the winner.
    {

      System.out.println("\n--------------------------------------------\n");
      System.out.println("*Drumroll*");
      System.out.println("After "+roundsPlayed+" rounds, here's how it went:");
      System.out.println("    Player 1 has "+(p1Deck.size()+p1Discard.size())+" cards");
      System.out.println("    Player 2 has "+(p2Deck.size()+p2Discard.size())+" cards");
      System.out.println("Player 2 is the WINNER!");
    }
    }
  }
}

    

    
    
    
    
    
    
    
    
    
    
    
    
    
 

 

    
    
    
    
    
  


