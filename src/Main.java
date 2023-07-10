// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


    }

    public static void task2() {
        System.out.println("Задача 2");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


    }

    public static void task3() {
        System.out.println("Задача 3");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");
        var weightDifference2 = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");
        var weightDifference3 = (boxer2 + boxer1) % totalWeight;
        System.out.println("Разница между весами бойцов " + weightDifference2 + " кг");


        var totalWorkingTime = 640;
                var workingHours = 8;
                var worker = totalWorkingTime / workingHours;
        System.out.println("Всего работников в компании - " + worker + " человек");
        var newWorker = worker + 94;

        var officeHours = newWorker * workingHours;
        System.out.println("Если в компании работает " + newWorker + " человек, то всего " + officeHours + " часов работы может быть поделено между сотрудниками ");






    }
}