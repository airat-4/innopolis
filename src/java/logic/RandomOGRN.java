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
public class RandomOGRN {

    ArrayList<String> arrRegion = new ArrayList<String>();
    private Random random = new Random();
    int[] masNumUr = new int[13];
    long lastNum = 0;
    int[] masNumIP = new int[15];

    public String getOGRNForUr() {

        StringBuilder strB = new StringBuilder();
        //1 symm
        int tmp = random.nextInt(9) + 1;
        masNumUr[0] = tmp;
        strB.append(tmp);
        //2-3 sym 2000-2016
        tmp = random.nextInt(17);
        if (tmp < 10) {
            masNumUr[1] = 0;
            masNumUr[2] = tmp;
        } else {
            masNumUr[1] = tmp / 10;
            masNumUr[2] = tmp % 10;
        }
        strB.append(masNumUr[1]);
        strB.append(masNumUr[2]);
        //4-5
        fillArrRegions();
        tmp = Integer.parseInt(arrRegion.get(random.nextInt(arrRegion.size())));
        if (tmp < 10) {
            masNumUr[3] = 0;
            masNumUr[4] = tmp;
        } else {
            masNumUr[3] = tmp / 10;
            masNumUr[4] = tmp % 10;
        }
        strB.append(masNumUr[3]);
        strB.append(masNumUr[4]);

        for (int i = 5; i < 12; i++) {
            masNumUr[i] = random.nextInt(10);

        }
        checkSumUr();

        for (int i = 5; i < 12; i++) {
            strB.append(masNumUr[i]);
        }
        strB.append(lastNum);

        return strB.toString();
    }

  public String getOGRNForIP() {

        StringBuilder strB = new StringBuilder();
        //1 symm
        int tmp = random.nextInt(9) + 1;
        masNumIP[0] = tmp;
        strB.append(tmp);
        //2-3 sym 2000-2016
        tmp = random.nextInt(17);
        if (tmp < 10) {
            masNumIP[1] = 0;
            masNumIP[2] = tmp;
        } else {
            masNumIP[1] = tmp / 10;
            masNumIP[2] = tmp % 10;
        }
        strB.append(masNumIP[1]);
        strB.append(masNumIP[2]);
        //4-5
        fillArrRegions();
        tmp = Integer.parseInt(arrRegion.get(random.nextInt(arrRegion.size())));
        if (tmp < 10) {
            masNumIP[3] = 0;
            masNumIP[4] = tmp;
        } else {
            masNumIP[3] = tmp / 10;
            masNumIP[4] = tmp % 10;
        }
        strB.append(masNumIP[3]);
        strB.append(masNumIP[4]);

        for (int i = 5; i < 14; i++) {
            masNumIP[i] = random.nextInt(10);

        }
        checkSumIP();

        for (int i = 5; i < 14; i++) {
            strB.append(masNumIP[i]);
        }
        strB.append(lastNum);

        return strB.toString();
    }
    
    
    
    
      private void checkSumIP() {
        long chislo = 0;
        for (int i = 0; i < masNumIP.length - 1; i++) {
            chislo += masNumIP[i] * Math.pow(10, masNumIP.length - 2 - i);
        }
        if (chislo % 13 == 10 && chislo % 13 == 0) {
            lastNum = 0;

        } else {
            lastNum = chislo % 13 - 1;

        }

    }

    private void checkSumUr() {
        long chislo = 0;
        for (int i = 0; i < masNumUr.length - 1; i++) {
            chislo += masNumUr[i] * Math.pow(10, masNumUr.length - 2 - i);
        }
        if (chislo % 11 == 10 && chislo % 11 == 0) {
            lastNum = 0;

        } else {
            lastNum = chislo % 11 - 1;

        }

    }

    private void fillArrRegions() {
        for (int i = 1; i < 100; i++) {
            arrRegion.add("" + i);
        }
        arrRegion.remove("2");
        arrRegion.remove("" + 6);
        arrRegion.remove("" + 9);
        arrRegion.remove("" + 13);
        arrRegion.remove("" + 16);
        arrRegion.remove("" + 18);
        arrRegion.remove("" + 21);
        arrRegion.remove("" + 22);
        arrRegion.remove("" + 23);
        arrRegion.remove("" + 28);
        arrRegion.remove("" + 30);
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
    }

}
