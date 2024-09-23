public class Main {
    public static void main(String[] args) {
        //write your code here
        var dog = 8.0;
        System.out.println(dog + " - Задча1");
        dog = dog + 4;
        System.out.println(dog + " - Задча2");
        dog = dog - 3.5;
        System.out.println(dog + " - Задча3");
        var cat = 3.6;
        System.out.println(cat + " - Задча1");
        cat = cat + 4;
        System.out.println(cat + " - Задча2");
        cat = cat - 1.6;
        System.out.println(cat + " - Задча3");
        var paper = 763789;
        System.out.println(paper + " - Задча1");
        paper = paper + 4;
        System.out.println(paper + " - Задча2");
        paper = paper - 7639;
        System.out.println(paper + " - Задча3");
        var friend = 19;
        System.out.println(friend + " - Задча4_1");
        friend = friend + 2;
        System.out.println(friend + " - Задча4_2");
        friend = friend / 7;
        System.out.println(friend + " - Задча4_3");
        var frog = 3.5;
        System.out.println(frog + " - Задча5_1");
        frog = frog * 10;
        System.out.println(frog + " - Задча5_2");
        frog = frog / 3.5;
        System.out.println(frog + " - Задча5_3");
        frog = frog + 4;
        System.out.println(frog + " - Задча5_4");
        var weightBoxerFirst = 78.2;
        var weightBoxerSecond = 82.7;
        var totalWeight = weightBoxerFirst + weightBoxerSecond;
        System.out.println("Общая масса двух боксеров " + totalWeight + " кг.- Задча6_1");
        var delta = weightBoxerFirst - weightBoxerSecond;
        System.out.println("Разница между массами бойцов состаляет " + delta + " кг.- Задча6_2");
        var overload = 82.7 % 78.2;
        System.out.println("Остаток от деления между двумя весами состаляет " + overload + " кг.- Задча7");
        var workingHours = 640;
        var dailyRate = 8;
        var numberUnits = workingHours / dailyRate;
        System.out.println("Всего работников в компании — " + numberUnits + " человек.- Задча8_1");
        numberUnits = numberUnits + 94;
        var workingTime = numberUnits * dailyRate;
        System.out.println("Если в компании работает " + numberUnits + " человек, то всего " + workingTime + " часов работы может быть поделено между сотрудниками - Задча8_2");
    }
}