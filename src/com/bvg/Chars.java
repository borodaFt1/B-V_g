package com.bvg;

public class Chars {

        /*
         * 0 = HP
         * 1 = ARMOR
         * 2 = MISS_PERCENT
         * 3 = attack_min
         * 4 = attack_max
         * 5 =
         * 6
         * 7
         *
         * */

        public static double[] get_class_chars(String Ch_class){

        double [] class_chars = new double[5];
        Class_Chars(Ch_class, class_chars);
        return class_chars;
        }

    static void Class_Chars(String Ch_class, double[] class_chars) {


        if(Ch_class.equals("tank")){


            class_chars[0] = Character.calc_data("tank", "hp");


            double[] armor = Items.get_class_items("tank");
            double sum = 0;
            for(int i = 0; i < 6 ; i++){
                sum = sum + armor[i];
            }
            class_chars[1] = sum;
            class_chars[2] = 10.0;

            class_chars[3] = Character.calc_data("tank", "attack") * 0.9; // min_attack
            class_chars[4] = Character.calc_data("tank", "attack") * 1.5; // max_attack

        } else if (Ch_class.equals("agility")){

            class_chars[0] = Character.calc_data("agility", "hp");

            double[] armor = Items.get_class_items("agility");
            double sum = 0;
            for(int i = 0; i < 6 ; i++){
                sum = sum + armor[i];
            }
            class_chars[1] = sum;
            class_chars[2] = 20.0;

            class_chars[3] = Character.calc_data("tank", "attack") * 0.8; // min_attack
            class_chars[4] = Character.calc_data("tank", "attack") * 1.2; // max_attack

        }
    }

    public static double get_speed_attack(String Ch_class){

        double speed_attack = 0;
        if (Ch_class.equals("tank")){
            speed_attack = 0.7;
        } else if (Ch_class.equals("agility")){
            speed_attack = 1.0;
        }

        return speed_attack;

    }




}
