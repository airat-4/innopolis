/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Александр
 */
public class RandomAge {
    private Random random = new Random();
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    
    public String getRandomAdge(int begin, int end){
        Date date = new Date(begin + random.nextInt(end - begin + 1)-1900, random.nextInt(12),random.nextInt(31)+1) ;
        return simpleDateFormat.format(date);
    }
}
