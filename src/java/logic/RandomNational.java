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
public class RandomNational {
     private Random random = new Random();
     public String getRandomNational(){
      String [] national={"русские", "мордва", "татары", "украинцы", "башкиры", "чуваши","чеченцы",
        "армяне", "казахи", "азербайджанцы", "даргинцы","удмурты", "марийцы",
        "осетины","белорусы","кабардинцы", "кумыки", "якуты", "лезгины", "узбеки"};
      return national[random.nextInt(national.length)];
     }
   
}  
