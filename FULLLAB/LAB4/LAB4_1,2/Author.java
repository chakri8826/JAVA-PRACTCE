public class Author{
    private String name;
    private int age;
    private String email;
    private String gender;
    public Author(String name,int age,String email,String gender){
        this.name=name;
        this.age=age;
        this.email=email;
        this.gender=gender;
    }
    public String toString()
    {
        return " Author Name:"+name+" Age:"+age+" Email:"+email+" Gender:"+gender;

    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getEmail()
    {
        return email;
    }
    public String getGender()
    {
        return gender;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
    
}