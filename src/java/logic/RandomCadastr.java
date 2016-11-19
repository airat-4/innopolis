/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Александр
 */
public class RandomCadastr {
private Random random = new Random();
 ArrayList<String> arrOkrug = new ArrayList<String>();
public String getCadastr() {
    StringBuilder strB= new StringBuilder();
    fillData();
    strB.append(arrOkrug.get(random.nextInt(arrOkrug.size())));
    strB.append(":");
    //raion
    strB.append(arrOkrug.get(random.nextInt(arrOkrug.size())));
    strB.append(":");
    for (int i = 0; i < 6; i++) {
       strB.append(random.nextInt(10));        
    }
     strB.append(":");
    strB.append(random.nextInt(10));
    strB.append(random.nextInt(10));
    return strB.toString();
}
private void fillData(){
    for (int i = 0; i < 89; i++) {
        if(i<10){
            arrOkrug.add("0"+i);
        }
        else{
        arrOkrug.add(""+i);
        }
    }
    
}
    
}
