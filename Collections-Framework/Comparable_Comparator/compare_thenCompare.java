import java.util.*;

class Student {
    private String name;
    private int rollno;

    // Constructor
    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for roll number
    public int getRoll() {
        return rollno;
    }
     public String toString() {
        return  "{name='" + name + "', rollno=" + rollno + "}";
    }
}
 class compare_thenCompare {
        public static void main(String[] args) {
            Student arr[] = {new Student("abc",120 ),
                            new Student("xyz",110 ), 
                            new Student("abc",101 ) };
            Arrays.sort(arr,
                            Comparator.comparing(Student::getName)
                                      .thenComparing(Student::getRoll));
            System.out.println(Arrays.toString(arr));
                                            
        }
}
