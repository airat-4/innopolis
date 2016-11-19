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
public class RandomMetal {
    private Random random = new Random();
     public String getRandomMetal(){
      String [] metal={"золото", "серебро", "алюминий", "барий", "берилий", "ванадий","висмут",
        "вольфрам", "галий", "гафний", "германий","калий", "кальций",
        "кобальт","литий","магний", "марганец", "ртуть", "хром", "цинк", "свинец", "платина", "медь"};
      return metal[random.nextInt(metal.length)];
     }
}
