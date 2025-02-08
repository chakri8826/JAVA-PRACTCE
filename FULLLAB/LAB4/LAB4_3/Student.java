abstract class Student{
    String name;
    String id;
    double grade;
    int age;
    String address;
    abstract boolean isPassed(double grade);
    public Student(String name,String id,double grade,int age,String address)
    {
        this.name=name;
        this.id=id;
        this.grade=grade;
        this.age=age;
        this.address=address;
    }
}