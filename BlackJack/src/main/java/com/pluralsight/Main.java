package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {


        System.out.println("Welcome to Blackjack!");
        String player1Name = Console.PromptForString("Player 1, enter your name: ");

        System.out.println("Dealing cards... 2 cards to each player!");

        Deck deck = new Deck();
        deck.shuffle();


        Hand dealerHand = new Hand();
        dealerHand.Deal(deck.deal());
        dealerHand.Deal(deck.deal());


        Hand player1Hand = new Hand();
        player1Hand.Deal(deck.deal());
        player1Hand.Deal(deck.deal());


//show the cards!
        System.out.println("The dealer hand is:");
        dealerHand.DisplayHand();

        System.out.println(player1Name + "'s hand is:");
        player1Hand.DisplayHand();

        if(dealerHand.getValue() == player1Hand.getValue()){
            System.out.println("It's a TIE!");
        }
        else if(dealerHand.getValue() > player1Hand.getValue()){
            System.out.println("Dealer wins!");
        }
        else{
            System.out.println(player1Name + " wins!");
        }

    }
}