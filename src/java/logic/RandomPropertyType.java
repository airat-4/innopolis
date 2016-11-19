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
public class RandomPropertyType {

    private Random random = new Random();

    public String getPropertyType() {
        String[] PropertyType = {"земля", "жилье", "нежилые помещения", "элитная", "типовая", "городская", "загородная",
            "Для ведения бизнеса", "Для проживания владельца", "В качестве инвестиций", "Введенные в эксплуатацию",
            "Требующие реконструкции или капитального ремонта", "Незавершенное строительство", "сооружения"};
        return PropertyType[random.nextInt(PropertyType.length)];
    }
}
