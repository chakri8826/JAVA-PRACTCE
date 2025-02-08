package src;

public class CH6_PS {
    public static void main(String[] args){
        //Practise Problem 1
//        float[] floats = {1,2,3,4,5};
//        float sum=0;
//        for(float element:floats){
//            sum+=element;
//        }
//        System.out.println("The value of sum is "+sum);




        //Practise Problem 2
//        boolean isAnArray=false;
//        float [] floats={1,2,3,4,5};
//        float num=7;
//        for(float element:floats){
//            if(num==element){
//                isAnArray=true;
//            }
//        }
//        if(isAnArray){
//            System.out.println("Yes the given value is present in the array");
//        }
//        else{
//            System.out.println("Yes the given value is not present in the array");
//        }




        //Pracitse Problem 3

//        int marks_of_students[]={90,99,80,91,97};
//        float sum=0;
//        for(int i=0;i<marks_of_students.length;i++){
//            sum+=marks_of_students[i];
//        }
//        float average = sum/marks_of_students.length;
//        System.out.println(average);




//        Practise Problem 4
//        int [][] mat1={{1,2,3},
//                       {4,5,6}};
//        int [][] mat2={{2,4,15},
//                        {3,7,1}};
//        int [][] result={{0,0,0},
//                         {0,0,0}};
//        for(int i=0;i<mat1.length;i++){  //row number of times
//            for(int j=0;j<mat1[i].length;j++){  //column number of times
//                System.out.format("Setting a value for i=%d and j=%d\n",i,j);
//                result [i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
        //Printing the elements of a 2-D Array
//        for(int i=0;i<mat1.length;i++){  //row number of times
//            for(int j=0;j<mat1[i].length;j++){  //column number of times
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println("");// prints a new line
//        }




        //Practise problem 5
//        int [] arr={1,2,3,4,5};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//        int temp;
//        for(int i=0;i<n;i++){
//            //Swap a[i] and a[l-1-i]
////             a   b    temp
//            //||  |4|  |3|
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for(int element: arr){
//            System.out.print(element+" ");
//        }




//        Practise Problem 6
//          int [] array={1,2,333,444,56,6545643};
//          int max=0;
//          for(int element:array){
//              if(element>max){
//                  max=element;
//              }
//          }
//        System.out.println("The value of maximum element in this array is "+max);




        //practise problem 7
//        int [] array={2,3,4,5,6,7,8};
//        int min=Integer.MAX_VALUE;
//        for(int element:array){
//            if (element<min){
//                min=element;
//            }
//        }
//        System.out.println(min);

//        System.out.println(Integer.MIN_VALUE);   --> gives maximum value
//        System.out.println(Integer.MAX_VALUE);   --> gives minimum value




        //practise problem 8
        boolean isSorted = true;
        int [] array={1,2,333,444,6545643};
        for(int i=0;i<array.length-1;i++) {
            if(array[i]>array[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }



        }
    }




