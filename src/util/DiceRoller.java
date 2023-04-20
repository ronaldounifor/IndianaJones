package util;

import java.util.Random;

public class DiceRoller {
    private static DiceRoller instance;

    private DiceRoller(){}

    public static synchronized DiceRoller getInstance() {
        if(instance == null)
            instance = new DiceRoller();

        return instance;
    }

    public int roll(int type, int quantity) {
        int result = 0;

        for (int i = 0; i < quantity; i++)
            result += 1 + new Random().nextInt(type);

        return result;
    }
}