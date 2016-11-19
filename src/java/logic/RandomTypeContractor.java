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
public class RandomTypeContractor {
     private Random random = new Random();
     public String getRandomContractor(){
      String [] contractor={"физическое лицо", "индивидуальный предприниматель", "юридическое лицо"};
      return contractor[random.nextInt(contractor.length)];
     }
}
