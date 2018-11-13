package com.bvg;

public class Action {

    public static void fight() {



        Randomizing Randomizing = new Randomizing();

        String ch_class1 = "tank";
        String ch_class2 = "agility";

        double[] chChars1 = Chars.get_class_chars(ch_class1);
        double[] chChars2 = Chars.get_class_chars(ch_class2);

        double speedAtt1 = Chars.get_speed_attack(ch_class1);
        double speedAtt2 = Chars.get_speed_attack(ch_class2);



        double sp1 = 0.0;
        double sp2 = 0.0;


        int critical;

        while (chChars1[0] > 0 && chChars2[0] > 0) {
            int dice1 = Randomizing.diceVal();
            int dice2 = Randomizing.diceVal();

            sp1 += speedAtt1;
            sp2 += speedAtt2;

            System.out.println("dice 1 thrown : " + dice1);
            System.out.println("dice 2 thrown : " + dice2);
            System.out.println();


            if (sp1 >= 1.0 && dice1 > chChars2[2]) {

                if (dice1 > 95) {
                    critical = 20;
                } else {
                    critical = 0;
                }

                chChars2[0] -= Randomizing.attackVal(ch_class1, chChars2[2], chChars1[3], chChars1[4], critical);

                sp1 -= 1.0;
                System.out.println(ch_class1 + " => " + ch_class2);
                System.out.println("СЧЕТЧИК ДЛЯ " + ch_class1 + " " + sp1 + "\n");
            } else if (sp1 < 1.0 && dice1 > chChars2[2]) {
                System.out.println("Игрок " + ch_class1 + " готовится ударить.\n");
            } else {
                sp1 -= speedAtt1;
                System.out.println("СЧЕТЧИК ЕСЛИ ПРОМАХ = " + sp1);
                System.out.println("ИГРОК " + ch_class1 + " ПРОМАХНУЛСЯ )))\n");
            }


            if (sp2 >= 1.0 && dice2 > chChars1[2]) {

                if (dice2 > 95) {
                    critical = 20;
                } else {
                    critical = 0;
                }

                chChars1[0] -= Randomizing.attackVal(ch_class2, chChars1[2], chChars2[3], chChars2[4], critical);
                sp2 -= 1.0;
                System.out.println(ch_class1 + " <= " + ch_class2);
                System.out.println("СЧЕТЧИК ДЛЯ " + ch_class2 + " " + sp2 + "\n");
            } else if (sp2 < 1.0 && dice2 > chChars1[2]) {
                System.out.println("Игрок " + ch_class2 + " готовится ударить.\n");
            } else {
                sp2 -= speedAtt2;
                System.out.println("СЧЕТЧИК ЕСЛИ ПРОМАХ = " + sp2);
                System.out.println("ИГРОК " + ch_class2 + " ПРОМАХНУЛСЯ )))\n");
            }

            System.out.println("\nHP 1 : " + Math.round(chChars1[0] * 100) / 100.00 + "  HP 2 : " + Math.round(chChars2[0] * 100) / 100.00);
            System.out.println("=======================");
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

        if (chChars1[0] <= 0 && chChars2[0] > 0) {
            System.out.println("ПОБЕДИЛ " + "ИГОРЬ");
        } else if (chChars2[0] <= 0 && chChars1[0] > 0) {
            System.out.println("ПОБЕДИЛ " + "СЕМЕН");
        } else if (chChars1[0] <= 0 && chChars2[0] <= 0) {
            System.out.println("Самоубилися ВАСЯ !!! )))");
        }


    }


}