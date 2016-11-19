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
public class RandomIndex {
    private Random random = new Random();
    
    public String getRandomIndex() {
        return "" + (random.nextInt(700000)+100000);
    }
    
    public static void main(String[] args) {
        RandomIndex index = new RandomIndex();
        System.out.println(index.getRandomIndex());
    }
}
