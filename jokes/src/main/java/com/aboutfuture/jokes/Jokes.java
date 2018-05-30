package com.aboutfuture.jokes;

import java.util.Random;

public class Jokes {
    public String getJoke() {
        String[] jokes = new String[5];
        jokes[0] = "Don't you hate it when you come to somebody's place and they just can't shut up " +
                "asking you stupid questions like:\n\n'What do you want?' and\n'Who are you?' and\n" +
                "'Omg, is that a real gun?'";
        jokes[1] = "Patient: Doctor help me please, every time I drink a cup of coffee I get this intense stinging in my eye.\n" +
                "Doctor: I suggest you remove the spoon before drinking.";

        jokes[2] = "Men 1845: I just killed a buffalo.\n" +
                "Men 1952: I just fixed the roof.\n" +
                "Men 2017: I just shaved my legs.";

        jokes[3] = "I can't believe I forgot to go to the gym today. That's 7 years in a row now.";

        jokes[4] = "A naked women robbed a bank. Nobody could remember her face.";

        return jokes[new Random().nextInt(jokes.length)];
    }
}
