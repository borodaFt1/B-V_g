package com.bvg;

public class Character {
//55555

        public static double calc_data(String ch_class, String need){

            double characters[] = new double[7];

            double hp_pers;
            double attack_force;

            double class_bonus[];
            double def_char[];
            double result = 0.0;

            if (need == "hp"){
                if (ch_class == "tank") {
                    class_bonus = tank_charact();
                    def_char = base_charact();
                    for (int i = 0; i < characters.length; i++) {
                        characters[i] = class_bonus[i] + def_char[i];
                    }
                    hp_pers = (characters[0] * 10) + (characters[3] * 20);
                } else {
                    class_bonus = agility_charact();
                    def_char = base_charact();
                    for (int i = 0; i < characters.length; i++) {
                        characters[i] = class_bonus[i] + def_char[i];
                    }
                    hp_pers = (characters[1] * 10) + (characters[3] * 20);
                }

                result = hp_pers;
            } else if(need == "attack") {
                if(ch_class == "tank"){
                    class_bonus = tank_charact();
                    def_char = base_charact();
                    for (int i = 0; i < characters.length; i++) {
                        characters[i] = class_bonus[i] + def_char[i];
                    }
                    attack_force = (characters[0]*3) + (characters[6]*2);
                }else {
                    class_bonus = agility_charact();
                    def_char = base_charact();
                    for (int i = 0; i < characters.length; i++) {
                        characters[i] = class_bonus[i] + def_char[i];
                    }
                    attack_force = (characters[1]*3) + (characters[6]*2);
                }
                result = attack_force;
            }

        return result;
        }

    private static double[] base_charact() {

        double strange = 5;
        double agility = 5;
        double intelligence = 5;
        double endurance = 5;
        double wisdom = 5;
        double charisma = 5;
        double will = 5;

        double[] result;
        result = new double[7];
        result[0] = strange;
        result[1] = agility;
        result[2] = intelligence;
        result[3] = endurance;
        result[4] = wisdom;
        result[5] = charisma;
        result[6] = will;
        return result;
    }

    private static double[] tank_charact() {

        double strange = 10;
        double agility = 2;
        double intelligence = 0;
        double endurance = 15;
        double wisdom = 1;
        double charisma = 1;
        double will = 5;

        double[] result;
        result = new double[7];
        result[0] = strange;
        result[1] = agility;
        result[2] = intelligence;
        result[3] = endurance;
        result[4] = wisdom;
        result[5] = charisma;
        result[6] = will;
        return result;
    }

    private static double[] agility_charact() {

        double strange = 2;
        double agility = 10;
        double intelligence = 0;
        double endurance = 5;
        double wisdom = 1;
        double charisma = 1;
        double will = 5;

        double[] result;
        result = new double[7];
        result[0] = strange;
        result[1] = agility;
        result[2] = intelligence;
        result[3] = endurance;
        result[4] = wisdom;
        result[5] = charisma;
        result[6] = will;
        return result;
    }


}



    //Базовые характеристики персонажа char_ch
    /*
    1.  Сила
    2.  Ловкость
    3.  Интелект
    4.  Выносливость
    5.  Мудрость
    6.  Харизма
    7.  Воля
    */

    //Умения персонажа
    /*
    1.  Ближний бой
    2.  Стрелковый бой
    3.  Тяжелое оружие
    4.  Энергетическое оружие
    5.  Метательное оружие
    6.  Взлом
    7.  Выживание
    9.
    */

    //Модификаторы персонажа mod_ch
    /*
    1.  Точность
    2.  Критический удар
    3.  Уворот
    4.  Стойкость
    5.  Два оружия
    6.  Владение щитом
    7.
    */

    //Типы урона dam_type
    /*
    1.  Рубящий
    2.  Колящий
    3.  Режущий
    4.  Кинетический
    5.  Огонь
    6.  Холод
    7.  Электричество
    8.  Яд
    9.  Радиация
    10. Пси
    */



