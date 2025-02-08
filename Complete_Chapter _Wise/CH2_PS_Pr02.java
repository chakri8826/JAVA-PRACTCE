package src;

public class CH2_PS_Pr02 {
    public static void main(String[] args){
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //Decrypt
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
