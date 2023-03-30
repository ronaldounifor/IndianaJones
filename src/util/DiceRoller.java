package util;

import java.util.Random;

public class DiceRoller {
    public static int roll(int type, int quantity) {
        int result = 0;

        for (int i = 0; i < quantity; i++)
            result += 1 + new Random().nextInt(type);

        return result;
    }
}