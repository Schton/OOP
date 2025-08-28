import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Cards {

    private ArrayList<String> cards;

    public Cards() {
        cards = new ArrayList<>();
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(rank + " of " + suit);
            }
        }
    }

    public void menu(int choice) {
        if (choice == 1) {
            shuffleCards();
        } else if (choice == 2) {
            dealCards();
        } else if (choice == 3) {
            displayCards();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
        System.out.println("Cards have been shuffled.");
    }

    public void dealCards() {
        if (cards.isEmpty()) {
            System.out.println("No cards left to deal.");
            return;
        }
        String dealtCard = cards.remove(0);
        System.out.println("You have been dealt: " + dealtCard);
    }

    public void displayCards() {
        System.out.println("Deck of Cards:");
        for (String card : cards) {
            System.out.println(card);
        }
        System.out.println("Number of cards remaining in the deck: " + cards.size());
    }
}
