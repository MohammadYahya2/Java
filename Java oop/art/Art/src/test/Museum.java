package test;

import java.util.ArrayList;

public class Museum {
    public static void main(String[] args) {
        ArrayList<Art> museum = new ArrayList<Art>();

        Painting painting = new Painting("On the Road", "Jack Kerouac", 
            "This original painting by the author of On the Road depicts his brother Gerard"
            + ". The canvas is signed in pen on the back", "Oil");
        
        Sculpture sculpture = new Sculpture("TERRACOTTA WARRIORS", "Shi Huang", 
            "The terracotta warriors are a collection of statues in Xi'an, China, depicting the army of Qin Shi Huang, the first Emperor of China.", "Bronze");

        museum.add(sculpture);
        museum.add(painting);
        for (Art art : museum) {
            art.ViewArt();
        }
    }
}
