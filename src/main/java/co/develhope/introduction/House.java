package co.develhope.introduction;

public class House {

    private String address;
    private int numberOfFloors;

    public House(String address, int numberOfFloors){
        System.out.println("house object created");

        this.address = address;
        this.numberOfFloors = numberOfFloors;
    }
}

class ProgrammerTest{

    public static void main(String... args){
        House house1; House house2;

        house1 = new House("Nairobi", 2);
        house2 = new House("Mombasa", 3);
    }
}
