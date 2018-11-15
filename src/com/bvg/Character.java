package com.bvg;

public class Character {


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
    1.  Сила                       strange
    2.  Ловкость                   agility
    3.  Интелект                   intelligence
    4.  Выносливость               endurance
    5.  Мудрость                   wisdom
    6.  Харизма                    charisma
    7.  Воля                       will
    */

    //Навыки персонажа
    /*
    1.   Легкое стрелковое оружие  light_arms
    2.   Стрелковое оружие         medium_small_arms
    3.   Тяжелое оружие            heavy_weapon
    4.   Оружие ближнего боя       melee_weapon
    5.   Взрывчатка                explosive
    6.   Энергетическое оружие     energy_weapon
    7.   Метательное оружие        throwing_weapons
    8.   Взлом                     breaking_locks
    9.   Выживание                 survival
    10.  Кибер технология          cyber_technology
    11.  Точность                  accuracy
    12.  Критический удар          critical
    13.  Скрытность                secrecy
    14.  Стойкость                 durability
    15.  Два оружия                aberyst
    16.  Владение щитом            shield
    17.  Ближний бой               melle_ft
    18.  Дальний бой               range_ft
    19,  Одноручное оружие         onehanded
    */

    //Типы урона dam_type
    /*
    1.  Рубящий
    2.  Колющий
    3.  Режущий
    4.  Кинетический
    5.  Огонь
    6.  Холод
    7.  Электричество
    8.  Яд
    9.  Радиация
    10. Пси
    */



