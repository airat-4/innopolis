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
public class RandomOKPO {
     ArrayList<String> arrRegion = new ArrayList<String>();
    private Random random = new Random();
    int[] mas = new int[10];
    int sum=0;
    
    public String getOKPO() {
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            mas[i]=random.nextInt(10);  
            sum+=mas[i]*(i+1);
        }        
        mas[9]=sum%11;
        for (int i = 0; i < 10; i++) {
            strB.append(mas[i]);            
        }
        
        return strB.toString();
    }
}
