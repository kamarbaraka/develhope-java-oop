package co.develhope.introduction;

public class Programmer {

    private String name;
    private int age;
    private boolean wearsGlasses;

    public Programmer(String name, int age, boolean wearsGlasses){
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }

    public void drinkCoffee(){
        System.out.println("Espresso is the secret!");
    }

    public void printDetails(){
        System.out.printf("%s is a %s-yo programmer\n", this.name, this.age);
    }

    public void hasGlasses(){
        System.out.printf("is %s wearing glasses? %s\n", this.name, this.wearsGlasses);
    }
}

class TestProgrammers{

    public static void main(String... args){
        var programmer1 = new Programmer("kamar", 23, true);
        var programmer2 = new Programmer("baraka", 20, false);

        programmer1.drinkCoffee();
        programmer1.printDetails();

        programmer2.hasGlasses();
        programmer2.printDetails();
    }
}
