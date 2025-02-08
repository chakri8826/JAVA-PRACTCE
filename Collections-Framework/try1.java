import java.util.*;
import java.lang.*;
public class try1{
    public static void main(String[] args)throws Exception{
        // int dn,bn=0,np=1,rem ;
        // printf("Enter a decimal Number: ");
    // scanf("%d",&dn);
    // while(dn!=0){
    //     rem=dn%2;
    //     bn=bn+rem*np;
    //     dn=dn/2;
    //     np=np*10;
        
    // }
    // String s ="egg";
    // String t="add";
    // int[] indexS = new int[200]; // Stores index of characters in string s
    // int[] indexT = new int[200]; 
    // int i=0;
    // System.out.println(indexS[s.charAt(i)]);
    // indexS[s.charAt(i)] = i + 1;
    // System.out.println(indexS[s.charAt(i)]);
    // for(int i = 0; i <s.length(); i++) {
    //     // Check if the index of the current character in string s
    //     // is different from the index of the corresponding character in string t
    //     if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
    //         // If different, strings are not isomorphic
    //     }
        
    //     // Update the indices of characters in both strings
    //     indexS[s.charAt(i)] = i + 1; // updating index of current character
    //     indexT[t.charAt(i)] = i + 1; // updating index of current character
    // }
        
        String[] tokens = {"2","1","+","3","*"};
        
        Stack<String> s = new Stack<>();
        String oper="+-*/";
        for(int i=0;i<tokens.length;i++){
            if(!oper.contains(tokens[i])){
                s.push(tokens[i]);
            }
            else{
                String op = tokens[i];
                int a=Integer.parseInt(s.pop());
                int b=Integer.parseInt(s.pop());
                switch(op){
                    case "+":
                        s.push(String.valueOf(b+a));
                        break;
                    case "-":
                        s.push(String.valueOf(b-a));
                        break;
                    case "*":
                        s.push(String.valueOf(b*a));
                        break;
                    case "/":
                        s.push(String.valueOf(b/a));
                        break;
                }
            }
            
        }
         
       
            
    
        
    }
}
    
 

