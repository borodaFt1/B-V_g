package com.bvg;

public class Items {

    /*
     * 0 = Hed
     * 1 = Hand
     * 2 = Ass
     * 3 = Leg
     * 4 = Body
     * 5 = Shield
     * 6 = Weapon
     * 6 = Ring1
     * 7 = Ring2
     * 8 = Necklace
     * 9 =
     * */

    public static double[] get_class_items(String ch_class) {

        double[] class_chars = new double[7];
        class_Items(ch_class, class_chars);
        return class_chars;

    }

    static void class_Items(String ch_class, double[] class_chars) {
        if(ch_class.equals("tank")){
            class_chars[0] = 3;
            class_chars[1] = 2;
            class_chars[2] = 4;
            class_chars[3] = 2;
            class_chars[4] = 5;
            class_chars[5] = 8;
            class_chars[6] = 50;

        } else if (ch_class.equals("agility")){
            class_chars[0] = 1;
            class_chars[1] = 1;
            class_chars[2] = 2;
            class_chars[3] = 1;
            class_chars[4] = 3;
            class_chars[5] = 0;
            class_chars[6] = 30;

        }
    }
}