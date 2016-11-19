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
public class RandomEducation {
     private Random random = new Random();
     
     public String getRandomEducation(){
      String [] education={"высшее", "среднее", "дошкольное", "начальное общее", "основное общее", "среднее общее","среднее профессиональное",
        "бакалавриат", "специалитет", "магистратура"};
      return education[random.nextInt(education.length)];
     }
}
