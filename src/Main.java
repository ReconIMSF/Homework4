//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Задача 1
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18){
            System.out.println("Ты совершеннолетний.");
        } else{
            System.out.println("Нужно немного подождать.");
        }

        //Задача 2
        double temp = -8.2;
        System.out.println("Задача 2");
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно одеть шапку.");
        }

        //Задача 3
        double speed = -5;
        System.out.println("Задача 3");
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф");
        } else if (speed <= 60 && speed > 0) {
            System.out.println("Если скорость " + speed + ", можно ехать спокойно");
        } else {
            System.out.println("Скорость отрицательной не бывает");
        }

        //Задача 4
        System.out.println("Задача 4");
        int ageOfPerson = 36;
        boolean ageToddler = ageOfPerson >= 2 && ageOfPerson < 7;
        boolean ageSchooler = ageOfPerson >= 7 && ageOfPerson < 18;
        boolean ageStudent = ageOfPerson >= 18 && ageOfPerson <= 24;
        boolean ageWorker = ageOfPerson > 24 && ageOfPerson <= 65;
        boolean agePensioner = ageOfPerson > 65;
        if (ageToddler) {
            System.out.println("Если возраст человека " + ageOfPerson + ", то ему нужно ходить в детский сад");
        } else if (ageSchooler) {
            System.out.println("Если возраст человека " + ageOfPerson + ", то ему нужно ходить в школу");
        } else if (ageStudent) {
            System.out.println("Если возраст человека " + ageOfPerson + ", то ему нужно ходить в университет");
        } else if (ageWorker) {
            System.out.println("Если возраст человека " + ageOfPerson + ", то ему нужно ходить на работу");
        } else if (agePensioner) {
            System.out.println("Если возраст человека " + ageOfPerson + ", то ему пора отдыхать на пенсии");
        }
        //Задача 5
        System.out.println("Задача 5");
        int childAge = 13;
        boolean grownup = false;
        boolean littleChild = childAge < 5;
        boolean smallAndTeen = childAge >= 5 && childAge < 14;
        boolean Teen = childAge >= 14 && childAge < 18;
        boolean grownUp = childAge > 18;
        if (littleChild) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else if (smallAndTeen && grownup) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (smallAndTeen && !grownup) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", но взрослого нет, ему нельзя кататься на аттракционе.");
        } else if (Teen) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else if (grownUp) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то он уже взрослый.");
        }

        //Задача 6
        System.out.println("Задача 6");
        int passangers = 120;
        boolean seaters = passangers <= 60;
        boolean seatersAndStanding = passangers > 60 && passangers < 120;
        boolean fullCar = passangers >= 120;
        if (seaters) {
            System.out.println("Если количество пассажиров " + passangers + ", то они на сидячих местах.");
        } else if (seatersAndStanding) {
            System.out.println("Если количество пассажиров " + passangers + ", то они на сидячих и стоячих местах.");
        } else if (fullCar) {
            System.out.println("Вагон полон");
        }

        //Задача 7
        System.out.println("Задача 7");
        int one = 2;
        int two = 5;
        int three = 8;
        if (one > two && one > three) {
            System.out.println("Наибольшее число - " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число - " + two);
        } else if (three > one && three > two) {
            System.out.println("Наибольшее число - " + three);

        //for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        //System.out.println("i = " + i);
        }
    }
}