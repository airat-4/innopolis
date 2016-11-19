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
public class RandomStateApartments {
    private Random random = new Random();
     public String getStateApartments(){
      String [] stateApartments={"новая", "отремонтированная", "кап. ремонт", "отличное", "хорошее", "требует косметического ремонта",
        "евроремонт", "чистовая отделка", "черновая отделка", "удоволетворительное","не требует вложений", "с мебелью",
        };
      return stateApartments[random.nextInt(stateApartments.length)];
     }
}
