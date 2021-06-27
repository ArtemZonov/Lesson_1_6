package com.jkdajac.lesson_1_6.Unit1.Landable;

import com.jkdajac.lesson_1_6.Landable;
import com.jkdajac.lesson_1_6.Unit;

public class General implements Unit, Landable {

    public int attack = 55;

    @Override
    public int damage() {

        return health;
    }

    @Override
    public void move() {

    }
}
