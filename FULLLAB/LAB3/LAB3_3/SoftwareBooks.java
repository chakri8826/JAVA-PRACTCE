public class SoftwareBooks extends Book {
    String software_version;
    String software_name;
    public SoftwareBooks(String name,String title,float price,int pages,String Sversion,String Sname)
    {
        super(name,title,price,pages);
        this.software_name=Sname;
        this.software_version=Sversion;
    }
    public String toString()
    {
        return "Name:"+author_name+" Title:"+title+" Price:"+price+" Pages:"+pages+" Software Version:"+software_version+" Software Name"+software_name;
    }
}
