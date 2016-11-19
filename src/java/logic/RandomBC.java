/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Random;

/**
 *
 * @author Imadori
 */
public class RandomBC {
    private Random random = new Random();

    public String getRandomBC() {

        String bc = "";
        String[] romanNum = new String[15];
        
        romanNum[0] = "I";
        romanNum[1] = "II";
        romanNum[2] = "III";
        romanNum[3] = "IV";
        romanNum[4] = "V";
        romanNum[5] = "VI";
        romanNum[6] = "VII";
        romanNum[7] = "VIII";
        romanNum[8] = "IX";
        romanNum[9] = "X";
        romanNum[10] = "XI";
        romanNum[11] = "XII";
        romanNum[12] = "XIII";
        romanNum[13] = "XIV";
        romanNum[14] = "XV";

        bc += romanNum[random.nextInt(15)];
        bc += "-";
        bc += (char)('А'+random.nextInt('Я'-'А'+1));
        bc += (char)('А'+random.nextInt('Я'-'А'+1));
        bc += " №";
        for (int i = 0; i < 6; i++) {
            bc += getRandomNumber();
        }
        bc += getRandomNumber();
        
        return bc;
    }

    private String getRandomNumber() {
        return "" + random.nextInt(10);
    }

    public static void main(String[] args) {
        RandomBC bc = new RandomBC();
        System.out.println(bc.getRandomBC());
    }
}
