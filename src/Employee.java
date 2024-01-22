public class Employee {
    String name;
    Integer id;
    Integer wagePerHour;
    Integer attendance;
    Integer fullDayHour;
    Integer totalWorkingHours;

    Employee(String n,Integer id,Integer w,Integer f){
        this.name=n;
        this.id=id;
        this.wagePerHour=w;
        this.fullDayHour=f;
    }
}
