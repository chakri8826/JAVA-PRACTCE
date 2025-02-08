import java.util.Scanner;

class EmployeDemo {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Employee code:");
                String code = sc.nextLine();
                System.out.print("Employee name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                System.out.print("phone number: ");
                int phno = sc.nextInt();
                System.out.print("salary:");
                double salary = sc.nextDouble();
                System.out.print("Enter whether it is a employee or manager or Team Lead:");
                String type = sc.next();
                if (type.equalsIgnoreCase("employee")) {
                        Employee e1 = new Employee(code, name, address, phno, salary, 0.1, 0.2);
                        e1.computeSalary();
                        System.out.println(e1);
                } else {
                        System.out.print("DA: ");
                        double da = sc.nextDouble();
                        System.out.print("Hra:");
                        double hra = sc.nextDouble();
                        if (type.equalsIgnoreCase("manager")) {
                                Manager m1 = new Manager(code, name, address, phno, salary, da, hra);
                                m1.computeSalary();
                                System.out.println(m1);
                        } else {
                                TeamLeader t1 = new TeamLeader(code, name, address, phno, salary, da, hra);
                                t1.computeSalary();
                                System.out.println(t1);
                        }
                }
                sc.close();
        }
}
