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
public class RandomLivingRight {
    private Random random = new Random();
     public String getRandomLivingRight(){
      String [] livingRight={"прописка", "регистрация", "временное", "постоянное"};
      return livingRight[random.nextInt(livingRight.length)];
     }
}
