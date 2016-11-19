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
public class RandomFormTC {
    private Random random = new Random();

    public String getRandomFormTC() {
        String[] form = {"водный", "воздушный", "авиация", "воздухоплавание", "космический транспорт", "назменый транспорт", "железнодорожный",
            "автомобильный", "велосипедный", "вьюжный", "гужевой", "верховой", "лифтовой",
            "эскалатор", "элеватор", "общественный", "личный", "легковой", "пасссажирский", "грузовой",
            };
        return form[random.nextInt(form.length)];
    }
}
