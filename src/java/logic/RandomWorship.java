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
public class RandomWorship {
    private Random random = new Random();
     public String getRandomWorship(){
      String [] worship={"буддизм", "ислам", "христианство", "иудаизм", "караизм", "католицизм","православие",
        "протестанизм", "пастафарианство"};
      return worship[random.nextInt(worship.length)];
     }
}
