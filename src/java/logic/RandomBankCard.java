/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Random;

/**
 *
 * @author Александр
 */
public class RandomBankCard {

    private Random random = new Random();
    int lastNum = 0;

    public String getRandomBankCard() {
        StringBuilder strB = new StringBuilder();
        int[] binBanks = {522223, 521178, 403898, 470674, 510082, 424436, 521178, 548673,
            548601, 415428, 676371, 477964, 419152, 525477, 443888, 446958,
            446955, 427229, 527883, 447520, 548999, 526483, 469395, 525477,
            533157, 533736, 540616, 434146, 427683, 427901,
            427644, 427601, 427901, 427631, 518901};
        int binBank = binBanks[random.nextInt(binBanks.length)];
        int[] numberCardInt = new int[16];
        int x = 100000;
        boolean correct = false;
        for (int i = 0; i < 6; i++) {
            numberCardInt[i] = binBank / x;
            binBank -= numberCardInt[i] * x;
            x /= 10;
        }
        for (int i = 6; i < numberCardInt.length; i++) {
            numberCardInt[i] = random.nextInt(10);
        }
        while (!correct) {
            numberCardInt[15] = random.nextInt(10);
            correct = controlSumCorrect(numberCardInt);
        }
//        numberCardInt[15]=lastNum;

        //разделить на блоки через пробел
        strB.append(getSpace(numberCardInt, 0));
        strB.append(getSpace(numberCardInt, 4));
        strB.append(getSpace(numberCardInt, 8));
        strB.append(getSpace(numberCardInt, 12));

        return strB.toString();
    }

    private String getSpace(int[] numberCardInt, int ind) {
        StringBuilder strB = new StringBuilder();
        for (int i = ind; i < 4 + ind; i++) {
            strB.append(numberCardInt[i]);
        }
//        strB.append(" ");
        return strB.toString();
    }

    private boolean controlSumCorrect(int[] numberCardInt) {
        int[] numberCardInt1 = new int[numberCardInt.length];
        for (int i = 0; i < numberCardInt.length; i++) {
            numberCardInt1[i] = numberCardInt[i];
        }
        int contrlSum = 0;
        for (int i = 0; i < numberCardInt1.length; i += 2) {
            if (numberCardInt1[i] * 2 > 9) {
                numberCardInt1[i] = numberCardInt1[i] * 2 - 9;
            }
        }
        for (int i = 0; i < numberCardInt1.length; i++) {
            contrlSum += numberCardInt1[i];
        }

        if (contrlSum % 10 == 0) {
            return true;
        } else {
//            numberCardInt[15] = contrlSum % 10;
            return false;
        }

    }
//    
}
