public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Kislay", 100, 20, 8);

        int check = ((int) (Math.random() * 10)) % 3;
        if (check == 0) {
            emp1.attendance = 1;
            System.out.println(emp1.name + " is present");
        } else if (check == 1) {
            emp1.attendance = 0;
            System.out.println(emp1.name + " is absent");
        } else {
            emp1.attendance = -1;
            System.out.println(emp1.name + " is a part-time employee");
        }

        Main m1 = new Main();
        System.out.println("Daily wage of " + emp1.name + " is " + m1.dailyWageCalculator(emp1));


    }

    //Daily wage calculator function
    double dailyWageCalculator(Employee e) {
        return e.wagePerHour * e.fullDayHour;
    }
}
