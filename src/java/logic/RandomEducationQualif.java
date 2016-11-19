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
public class RandomEducationQualif {
    private Random random = new Random();
     
     public String getRandomEducationQualif(){
      String [] education={"бакалавр", "специалиcn", "магистр"};
      return education[random.nextInt(education.length)];
     }
}
