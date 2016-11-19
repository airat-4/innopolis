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
public class RandomSerialNumberOfPasport {

    private Random random = new Random();
    ArrayList<String> arrRegion = new ArrayList<String>();
    ArrayList<Integer> arrYear = new ArrayList<Integer>();

    public String getSerialNumberOfPasport() {
        fillSeria();
        StringBuilder strB = new StringBuilder();
        //region
        int tmp = Integer.parseInt(arrRegion.get(random.nextInt(arrRegion.size())));
        if (tmp < 10) {
            strB.append("0" + tmp);
        } else {
            strB.append(tmp);
        }
        //year
        tmp = arrYear.get(random.nextInt(arrYear.size()));
        if (tmp < 10) {
            strB.append("0" + tmp);
        } else {
            strB.append(tmp);
        }
        strB.append(" ");
        //number
        for (int i = 0; i < 6; i++) {
            strB.append(random.nextInt(10));
        }

        return strB.toString();
    }

    private void fillSeria() {

        for (int i = 1; i < 98; i++) {
            arrRegion.add("" + i);
        }

        arrRegion.remove("2");
        arrRegion.remove("" + 6);
        arrRegion.remove("" + 9);
        arrRegion.remove("" + 10);
        arrRegion.remove("" + 13);
        arrRegion.remove("" + 16);
        arrRegion.remove("" + 18);
        arrRegion.remove("" + 21);
        arrRegion.remove("" + 23);
        arrRegion.remove("" + 31);
        arrRegion.remove("" + 35);
        arrRegion.remove("" + 39);
        arrRegion.remove("" + 40);
        arrRegion.remove("" + 41);
        arrRegion.remove("" + 43);
        arrRegion.remove("" + 45);
        arrRegion.remove("" + 48);
        arrRegion.remove("" + 51);
        arrRegion.remove("" + 55);
        arrRegion.remove("" + 59);
        arrRegion.remove("" + 60);
        arrRegion.remove("" + 67);
        arrRegion.remove("" + 70);
        arrRegion.remove("" + 71);
        arrRegion.remove("" + 72);
        arrRegion.remove("" + 74);

        for (int i = 0; i < 17; i++) {
            arrYear.add(i);
        }
    }
}
