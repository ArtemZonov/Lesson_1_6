package com.jkdajac.lesson_1_6.Unit1.Waterable;

import com.jkdajac.lesson_1_6.Unit;
import com.jkdajac.lesson_1_6.Waterable;

public class Boat implements Unit, Waterable {

    public int attack = 12;

    @Override
    public int damage() {

        return health;
    }

    @Override
    public void swim() {

    }
}
