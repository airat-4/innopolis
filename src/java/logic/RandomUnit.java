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
public class RandomUnit {
    private Random random = new Random();
     public String getRandomUnit(){
      String [] national={"метры", "сантиметры", "дециметры", "километры", "килограммы", "граммы","км/ч",
        "м/с", "м2", "м3"};
      return national[random.nextInt(national.length)];
     }
}
