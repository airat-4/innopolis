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
public class RandomRegisterNumberTC {

    int[] region = new int[131];
    //возможные буквы госномера
    char[] masLatin = {'A', 'B', 'C', 'E', 'K', 'M', 'H', 'O', 'P', 'T', 'Y', 'X'};
    private Random random = new Random();

    public String getNumberForCar() {
        StringBuilder number = new StringBuilder();
        fillRegion();

        //первая буква из массива латинских
        number.append(masLatin[random.nextInt(12)]);
        number.append(" ");
        //три цифры от 0 до 9
        number.append(random.nextInt(10));
        number.append(random.nextInt(10));
        number.append(random.nextInt(10));
        number.append(" ");
        //2 латинские буквы
        number.append(masLatin[random.nextInt(12)]);
        number.append(masLatin[random.nextInt(12)]);
        number.append(" ");
        //регион
        number.append(region[random.nextInt(131)]);      

        return number.toString();
    }

    private void fillRegion() {
        //перечислены все возможные регионы
        for (int i = 0; i < 100; i++) {
            region[i] = i + 1;
        }
        
        region[101] = 102;
        region[102] = 103;
        region[103] = 113;
        region[104] = 116;
        region[105] = 121;
        region[106] = 123;
        region[107] = 124;
        region[108] = 125;
        region[109] = 126;
        region[110] = 134;
        region[111] = 136;
        region[112] = 138;
        region[113] = 150;
        region[114] = 190;
        region[115] = 750;
        region[116] = 152;
        region[117] = 154;
        region[118] = 159;
        region[119] = 161;
        region[120] = 163;
        region[121] = 164;
        region[122] = 166;
        region[123] = 196;
        region[124] = 173;
        region[125] = 174;
        region[126] = 177;
        region[127] = 199;
        region[128] = 777;
        region[129] = 178;
        region[130] = 186;
    }

    public String getNumberForMoped() {
        StringBuilder number = new StringBuilder();
        fillRegion();
        for (int i = 0; i < 4; i++) {
            number.append(random.nextInt(10));            
        }
        number.append(" ");
        //2 латинские буквы
        number.append(masLatin[random.nextInt(12)]);
        number.append(masLatin[random.nextInt(12)]);
        number.append(" ");
        //регион
        number.append(region[random.nextInt(100)]);    
        return number.toString();
    }
    
     public String getNumberForPublicTC() {
           StringBuilder number = new StringBuilder();
        fillRegion();
        
        //2 латинские буквы
        number.append(masLatin[random.nextInt(12)]);
        number.append(masLatin[random.nextInt(12)]);
        number.append(" ");
        for (int i = 0; i < 3; i++) {
            number.append(random.nextInt(10));            
        }
        number.append(" ");
        //регион
        number.append(region[random.nextInt(100)]);    
        return number.toString();
     }

}
