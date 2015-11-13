package com.tibamobile.tightfacts;

import java.util.Random;

/**
 * Created by muchiridm on 27/10/2015.
 */
public class FactBook {
    // Member variables (properties about the object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Dr. Guy is not gay!",
            "Taking pictures is ill advised in the Congo. Locals get very upset, for they believe that “capturing a person’s image” removes his spirit.",
            "Because of two devastating civil wars in DR Congo and decades of economic stagnation, ATMs began appearing in the DRC only in 2010.",
            "Kenya is roughly the same size of Texas at 362,040 square miles.",
            "Kenyans usually drink their beverages hot or at room temperature. Hot beer, anyone?",
            "Coffee is the number 1 income generator for Kenya, however, coffee is considered an export product, not something for local consumption. The local favorites are tea and beer.",
    };

    // Method (abilities: things the object can do)
    public String getFact(){


        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
