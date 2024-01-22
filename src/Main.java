public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Kislay", 100, 20, 8);

    //Calculate Wages till a condition of total working hours or days is reached for a month
    int days=0;
    emp1.totalWorkingHours=0;
    while(days<20 || emp1.totalWorkingHours<100) {

        int check = ((int) (Math.random() * 10)) % 3;
        if (check == 0) {
            emp1.attendance = 1;
        } else if (check == 1) {
            emp1.attendance = 0;
        } else {
            emp1.attendance = -1;
        }

        switch (emp1.attendance) {
            case 0:
                System.out.println(emp1.name + " is absent");
                days++;
                break;
            case 1:
                System.out.println(emp1.name + " is present");
                emp1.totalWorkingHours += 8;
                days++;
                break;
            case -1:
                System.out.println(emp1.name + " is a part-time employee");
                emp1.totalWorkingHours += 4;
                days++;
        }
    }

        //daily wage of employee
        Main m1 = new Main();
        System.out.println("Daily wage of " + emp1.name + " is " + m1.dailyWageCalculator(emp1));

        //monthly salary of employee
        System.out.println("Monthly salary of "+emp1.name+" is "+m1.monthlyWage(emp1));

        //print wages till a certain condition is met
        System.out.println("Total salary for this month is "+emp1.totalWorkingHours*emp1.wagePerHour);

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
