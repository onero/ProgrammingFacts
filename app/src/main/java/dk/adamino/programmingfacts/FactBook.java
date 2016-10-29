package dk.adamino.programmingfacts;

import java.util.Random;

public class FactBook {

    private final String[] mFacts = {
            "The first digital computer game never made any money",
            "The first computer “bug” was named after a real bug",
            "The computer virus was initially designed without any harmful intentions",
            "There is a higher chance of you getting killed by wolves than having an SHA-1 collision in Git",
            "A picture from Playboy magazine is the most widely used for all sorts of image processing algorithms",
            "The first high-level (very close to real English that we use to communicate) programming language was FORTRAN. invented in 1954 by IBM’s John Backus.",
            "Computer programming is one of the fastest growing occupations currently",
            "Most people are intimidated by the thought of learning how to program, however as with anything, the more you practice and repeatedly do that task, the easier it gets.",
            "The first computer programmer was a woman named Ada Lovelace",
            "The first computer game was Spacewar! Invented in 1961"
    };

    public String getFact() {
        String fact;
        Random rand = new Random();
        int randomNumber = rand.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
