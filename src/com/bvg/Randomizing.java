package com.bvg;

//import java.text.DecimalFormat;
import java.util.Random;

public class Randomizing {

    private static final Random random = new Random();


    public int diceVal(){

        int r_from = 0;
        int r_to   = 100;
        return random.nextInt(r_to - r_from) + r_from;

    }

    public double attackVal(String ch_class, double armor, double atStr_min, double atStr_max, double critical){

        //DecimalFormat doubleFormat = new DecimalFormat("##.00");

        //double attack_clean = random.nextInt(atStr_max - atStr_min) + atStr_min;
        double attack_clean = (Math.random()*((atStr_max - atStr_min) + 1)) + atStr_min;
        System.out.println("ЧИСТАЯ АТАКА ОТ " + ch_class +" (random) = " + Math.round(attack_clean * 100) / 100.00);
        if(critical > 0){
            double attack_critical = atStr_max + atStr_max * critical / 100;
            System.out.println("КРИТ АТАКА ОТ " + ch_class + " = " + Math.round(attack_critical * 100) / 100.00);
            return Math.round((attack_critical - armor) * 100) / 100.00;
        } else {
            return Math.round((attack_clean - armor) * 100) / 100.00;
        }


    }


}
