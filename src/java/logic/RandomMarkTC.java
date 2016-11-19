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
public class RandomMarkTC {

    private Random random = new Random();

    public String getRandomMarkTC() {
        String[] marks = {"ПАЗ", "УАЗ", "ЛиАЗ", "КАМАЗ", "УРАЛ", "ЗИЛ", "ГАЗ",
            "BMW", "Renault", "Opel", "Mazda", "KIA", "Ferrari",
            "Chevrolet", "Chrysler", "Citroen", "Nissan", "Volvo", "Volkswagen", "Toyota", "Nissan",
            "Subaru", "Suzuki", "Lexus"};
        return marks[random.nextInt(marks.length)];
    }
}
