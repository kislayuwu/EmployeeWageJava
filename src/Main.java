public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Kislay", 100, 20, 8);

        int check = ((int) (Math.random() * 10)) % 3;
        if (check == 0) {
            emp1.attendance = 1;
        } else if (check == 1) {
            emp1.attendance = 0;
        } else {
            emp1.attendance = -1;
            emp1.fullDayHour=4;
        }

        switch (emp1.attendance){
            case 0:
                System.out.println(emp1.name + " is absent");
                break;
            case 1:
                System.out.println(emp1.name + " is present");
                break;
            case -1:
                System.out.println(emp1.name + " is a part-time employee");
        }

        //daily wage of employee
        Main m1 = new Main();
        System.out.println("Daily wage of " + emp1.name + " is " + m1.dailyWageCalculator(emp1));

        //monthly salary of employee
        System.out.println("Monthly salary of "+emp1.name+" is "+m1.monthlyWage(emp1));


    }

    //Daily wage calculator function
    double dailyWageCalculator(Employee e) {
        return e.wagePerHour * e.fullDayHour;
    }
    //Monthly wage
    double monthlyWage(Employee e){
        return dailyWageCalculator(e)*20;
    }
}
