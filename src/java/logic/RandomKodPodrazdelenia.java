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
public class RandomKodPodrazdelenia {

    private Random random = new Random();
//    public boolean getKod;

    public String getKod() {
        StringBuilder strB = new StringBuilder();
        strB.append(random.nextInt(10));
        strB.append(random.nextInt(10));
        strB.append(random.nextInt(10));
        strB.append("-");
        strB.append(random.nextInt(10));
        strB.append(random.nextInt(10));
        strB.append(random.nextInt(10));

        return strB.toString();
    }
}
