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
public class RandomMaterialWall {
    private Random random = new Random();
     public String getMaterialWall(){
      String [] materialWall={"кирпич", "блоки с цементом", "блоки на основе извести и глины", "керамзитбетон", "полистиролбетон", 
        "шлакобетон", "арболитовые блоки", "керамические блоки"};
      return materialWall[random.nextInt(materialWall.length)];
     }
}
