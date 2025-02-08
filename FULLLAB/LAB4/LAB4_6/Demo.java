import java.io.*;
public class Demo {
    public static void main(String[] args) throws IOException{
        course c[]=new course[5];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter couse Name:");
            String courseName=br.readLine();
            System.out.print("Enter couse Id:");
            String courseId=br.readLine();
            System.out.print("Enter corse Duration:");
            int courseDuration=Integer.parseInt(br.readLine());
            c[i]=new course(courseName,courseId,courseDuration);
        } 
        for(int i=0;i<5;i++)
        {
            System.out.println(c[i]);
        }
    }
}
