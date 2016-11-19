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
public class RandomAppointment {
     private Random random = new Random();
     public String getRandomAppointment(){
      String [] appointment={"специалист", "старший специалист", "программист", "бухгалтер", "тестировщик", "начальник отдела","уборщица",
        "менеджер", "продавец", "юрист", "инженер","повар", "секретарь",
        "директор","руководитель","стажер", "учитель", "преподаватель", "адвокат"};
      return appointment[random.nextInt(appointment.length)];
     }
}
