package co.develhope.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class House1 {

    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    public void setFloorsNumber(int floorsNumber){
        this.floorsNumber = floorsNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setResidentsNames(String... residentsNames){
        this.residentsNames = residentsNames;
    }
    public int getFloorsNumber(){
        return this.floorsNumber;
    }
    public String getAddress(){
        return this.address;
    }
    public String[] getResidentsNames(){
        return this.residentsNames;
    }
}

class House1Test{

    public static void main(String... args){
        var input = new Scanner(System.in);
        var house = new House1();

        System.out.println("enter the number of floors ");
        house.setFloorsNumber(input.nextInt());
        System.out.println("enter the address ");
        house.setAddress(input.next());
        System.out.println("enter the residents names sep by a comma ");
        var res = input.next();
        house.setResidentsNames(res);

        var details = String.format("floors number = %s, the address is %s, the residents are%s ",
                    house.getFloorsNumber(), house.getAddress(), Arrays.toString(house.getResidentsNames())
                );
        System.out.println(details);
    }
}
