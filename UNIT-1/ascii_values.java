package Conversions;

public class ascii_values {
    public static void main(String[] args) {
                   //characetor ASCII values
       for(char ch='A';ch<='Z';ch++){
           System.out.println("Char value of "+ch+" is " +(int)ch);
       }
       for(char ch='a';ch<='z';ch++){
           System.out.println("Char value of "+ch+" is "+(int)ch);
       }
       for(char n='0';n<='9';n++){
           System.out.println("Char value of "+n+" is "+(int)n);
       }
    }
    
}


