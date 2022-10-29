public class Main {
    public static void main(String[] args) {

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

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе боксеров " + differenceWeight + " кг");

        differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе боксеров " + differenceWeight + " кг");
        differenceWeight = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе боксеров " + differenceWeight + " кг");

        var totalHours = 640;
        var everyEmployeeHours = 8;
        var totalEmployees = totalHours / everyEmployeeHours;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        System.out.println("Теперь всего работников в компании " + totalEmployees + " человек");
        totalHours = totalEmployees * everyEmployeeHours;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHours + " часов может быть поделено между сотрудниками");

    }
}