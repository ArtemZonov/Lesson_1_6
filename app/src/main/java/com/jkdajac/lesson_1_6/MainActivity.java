package com.jkdajac.lesson_1_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jkdajac.lesson_1_6.Unit1.Landable.General;
import com.jkdajac.lesson_1_6.Unit1.Landable.Hardswordsman;
import com.jkdajac.lesson_1_6.Unit1.Landable.Horser;
import com.jkdajac.lesson_1_6.Unit1.Landable.Lightswordsman;
import com.jkdajac.lesson_1_6.Unit1.Landable.Spearman;
import com.jkdajac.lesson_1_6.Unit1.Waterable.Boat;
import com.jkdajac.lesson_1_6.Unit1.Waterable.Corvet;
import com.jkdajac.lesson_1_6.Unit1.Waterable.Fregate;
import com.jkdajac.lesson_1_6.Unit1.Waterable.Lincor;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    int s;
    int s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Boat boat = new Boat();
        Corvet corvet = new Corvet();
        Fregate fregate = new Fregate();
        Lincor lincor = new Lincor();


        ArrayList<String> WaterArmyOne = new ArrayList<>();
         WaterArmyOne.add(String.valueOf(boat.attack));
         WaterArmyOne.add(String.valueOf(corvet.attack));
         WaterArmyOne.add(String.valueOf(fregate.attack));

        for (String s : WaterArmyOne) {
            int sum = 0;
            for (int i = 0; i < WaterArmyOne.size(); i++) {
                sum += Integer.parseInt(WaterArmyOne.get(i));
                this.s = sum;
            }
                Log.d("MyLOG", "Боевая мощность армии WaterArmyOne = " + sum);
        }


        ArrayList<String> WaterArmyTwo = new ArrayList<>();
         WaterArmyTwo.add(String.valueOf(boat.attack));
         WaterArmyTwo.add(String.valueOf(corvet.attack));
         WaterArmyTwo.add(String.valueOf(fregate.attack));
         WaterArmyTwo.add(String.valueOf(lincor.attack));

        for (String s1 : WaterArmyTwo) {
            int sum1 = 0;
            for (int i = 0; i < WaterArmyTwo.size(); i++) {
                sum1 += Integer.parseInt(WaterArmyTwo.get(i));
                this.s1 = sum1;
            }
                Log.d("MyLOG", "Боевая мощность армии WaterArmyTwo = " + sum1);
        }
        if (s > s1) {
            Log.d("MyLOG", "Победила армия WaterArmyOne");
        } else {
            Log.d("MyLOG", "Победила армия WaterArmyTwo");
        }


        Spearman spearman = new Spearman();
        Lightswordsman lightswordsman = new Lightswordsman();
        Hardswordsman hardswordsman = new Hardswordsman();
        Horser horser = new Horser();
        General general = new General();

        ArrayList<String> LandArmyOne = new ArrayList<>();
         LandArmyOne.add(String.valueOf(spearman.attack));
         LandArmyOne.add(String.valueOf(spearman.attack));
         LandArmyOne.add(String.valueOf(spearman.attack));
         LandArmyOne.add(String.valueOf(hardswordsman.attack));
         LandArmyOne.add(String.valueOf(horser.attack));
         LandArmyOne.add(String.valueOf(horser.attack));
         LandArmyOne.add(String.valueOf(general.attack));

        for (String s : LandArmyOne) {
            int sum = 0;
            for (int i = 0; i < LandArmyOne.size(); i++) {
                sum += Integer.parseInt(LandArmyOne.get(i));
                this.s = sum;
            }
            Log.d("MyLOG", "Боевая мощность армии LandArmyOne = " + sum);
        }

        ArrayList<String> LandArmyTwo = new ArrayList<>();
         LandArmyTwo.add(String.valueOf(general.attack));
         LandArmyTwo.add(String.valueOf(lightswordsman.attack));
         LandArmyTwo.add(String.valueOf(horser.attack));
         LandArmyTwo.add(String.valueOf(spearman.attack));
         LandArmyTwo.add(String.valueOf(spearman.attack));

        for (String s1 : LandArmyTwo) {
            int sum1 = 0;
            for (int i = 0; i < LandArmyTwo.size(); i++) {
                sum1 += Integer.parseInt(LandArmyTwo.get(i));
                this.s1 = sum1;
            }
            Log.d("MyLOG", "Боевая мощность армии LandArmyTwo = " + sum1);
        }
        if (s > s1) {
            Log.d("MyLOG", "Победила армия LandArmyOne");
        } else {
            Log.d("MyLOG", "Победила армия LandArmyTwo");
        }
    }

    }






