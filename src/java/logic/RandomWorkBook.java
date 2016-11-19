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
public class RandomWorkBook {
     private Random random = new Random();
     public String getRandomWorkBook(){
          StringBuilder strB = new StringBuilder();
         String [] serial={"ТК", "I", "II", "III", "IV", "V"};
         strB.append(serial[random.nextInt(serial.length)]);
         strB.append(" ");
         for (int i = 0; i < 7; i++) {
             strB.append(random.nextInt(10));             
         }
         return strB.toString();
         
     }
}
