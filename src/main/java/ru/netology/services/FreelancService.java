package ru.netology.services;

import java.awt.image.renderable.ContextualRenderedImageFactory;

public class FreelancService {
    public int calculate(int income, int expense, int threshold) {
        int money = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдых
                money -= expense;
                money /= 3;
                counter++;
            } else {
                //работа
                money += income;
                money -= expense;
            }
        }
        return counter;
    }

}