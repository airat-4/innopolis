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
public class RandomZagranPasport {

    int[] ser = new int[15];
    private Random random = new Random();

    public String getRandomNumberAndSeria() {
        fillSeria();
        StringBuilder strB = new StringBuilder();
        strB.append(ser[random.nextInt(ser.length)]);
        strB.append(" ");
        for (int i = 0; i < 7; i++) {
            strB.append(random.nextInt(10));
        }
        return strB.toString();
    }

    private void fillSeria() {
        ser[0] = 10;
        ser[1] = 20;
        ser[2] = 43;
        ser[3] = 44;
        ser[4] = 99;
        ser[5] = 50;
        ser[6] = 51;
        ser[7] = 53;
        ser[8] = 60;
        ser[9] = 61;
        ser[10] = 64;
        ser[11] = 70;
        ser[12] = 71;
        ser[13] = 72;
        ser[14] = 64;

    }
}
