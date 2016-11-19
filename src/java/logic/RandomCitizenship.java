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
public class RandomCitizenship {
     private Random random = new Random();
     public String getRandomCitizenship(){
      String [] citizenships={"Российское", "американское", "белорусское", "гражданство Германии", "Греции", "израильское","бразильское",
        "литовское", "ирландское", "турецкое", "канадское","чилийское", "итальянское",
        "гражданство Ямайки","гражданство Дании","французское", "китайское", "индийское", "японское", "иранское"};
      return citizenships[random.nextInt(citizenships.length)];
     }
}
