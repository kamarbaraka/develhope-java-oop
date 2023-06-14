package co.develhope.introduction;

public class Employee {

    private String name, surname, address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails(){
        return "%s[name= %s, surname= %s, address= %s]".formatted(
                this.getClass().getSimpleName(), this.name, this.surname, this.address);
    }
}
