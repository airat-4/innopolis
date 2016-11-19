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
public class RandomCvv {

    Random rand = new Random();

    public String getRandomCVV() {
        String str = "";
        str += rand.nextInt(10);
        str += rand.nextInt(10);
        str += rand.nextInt(10);
        return str;
    }
}
