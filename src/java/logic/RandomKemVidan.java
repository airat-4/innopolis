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
public class RandomKemVidan {

    private Random random = new Random();
    ArrayList<String> arrOtdelenie = new ArrayList<String>();
    ArrayList<String> arrRaion = new ArrayList<String>();

    public String getVidan() {
        StringBuilder strB = new StringBuilder();
        fillData();
        strB.append("Отделением ");
        strB.append(arrOtdelenie.get(random.nextInt(arrOtdelenie.size())));
        strB.append(" России по ");
        strB.append(arrRaion.get(random.nextInt(arrRaion.size())));

        return strB.toString();

    }

    private void fillData() {
        arrOtdelenie.add("УФМС");
        arrOtdelenie.add("ОУФМС");
        arrOtdelenie.add("ОВД");
        arrOtdelenie.add("ГОВД");
        arrOtdelenie.add("РОВД");
        arrOtdelenie.add("ГУВД");
        arrOtdelenie.add("УВД");
        arrOtdelenie.add("МВД");
        arrRaion.add("Самарской области");
        arrRaion.add("Московской области");
        arrRaion.add("Амурской области");
        arrRaion.add("Камчатской области");
        arrRaion.add("Кировской области");
        arrRaion.add("Саратовской области");
        arrRaion.add("Красноярскому краю");
        arrRaion.add("Краснодарскому краю");
        arrRaion.add("Приморскому краю");
    }

}
