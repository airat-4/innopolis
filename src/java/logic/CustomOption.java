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
public class CustomOption {
    private Random random = new Random();
    
    public String getCustomOption(String pull) {
        String result = "";
        String[] variants = pull.split(",");
        result = variants[getRandomIndex(variants.length)];
        return result;
    }
    
    private int getRandomIndex(int len) {
        return random.nextInt(len);
    }
    
    public static void main(String[] args) {
        CustomOption a = new CustomOption();
        System.out.println(a.getCustomOption("a,b,c,d,e,f,g"));
    }
}
