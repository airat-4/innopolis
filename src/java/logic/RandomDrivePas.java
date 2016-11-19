/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Александр
 */
public class RandomDrivePas {

    private Random random = new Random();
    ArrayList<String> arrRegion = new ArrayList<String>();

    public String getRandomDrivePas() {
        StringBuilder strB = new StringBuilder();
        fillData();
        strB.append(arrRegion.get(random.nextInt(arrRegion.size())));
        strB.append(" ");
        int tmp = random.nextInt(10)+7;
        if (tmp < 10) {
            strB.append("0");
            strB.append(tmp);
            
        } else {
            strB.append(tmp);
        }
        strB.append(" ");
        for (int i = 0; i < 6; i++) {
           strB.append(random.nextInt(10));
            
        }

        return strB.toString();
    }

    private void fillData() {
        for (int i = 0; i < 89; i++) {
            if (i < 10) {
                arrRegion.add("0" + i);
            } else {
                arrRegion.add("" + i);
            }
        }

    }

}
