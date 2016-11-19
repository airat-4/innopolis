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
public class TypeLocality {
     private Random random = new Random();
     
     public String getlocality(){
      String [] locality={"район", "город", "поселок городского типа", "рабочий поселок", 
          "курортный поселок", "килшак","поселковый совет",
        "сельский совет", "сомон", "волость","дачный поселковый совет", "поселок сельского типа", "населенный пункт",
        "поселок при станции","железнодорожная станция", "село", "местечко","деревня", "слобода", "станция","станица", "хутор",
        "разъезд","колхоз", "совхоз"};
      return locality[random.nextInt(locality.length)];
     }
}
