import java.util.*;

class Point  {
    int x,y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "( "+x+","+y+ " )";
    }
}
class MyCmp implements Comparator<Point>{
    public int compare(Point p1,Point p2){
        int xCom = Integer.compare(p1.x,p2.x);
        if(xCom!=0){
            return  xCom;
        }
        return   Integer.compare(p1.y,p2.y);
    }
}
 
public class comparator{
    public static void main(String[] args) {
        
        Point arr[] = {new Point(1,1),
                        new Point(5,5),
                        new Point(5,2)};
        Arrays.sort(arr,new MyCmp());
        System.out.println(Arrays.toString(arr));
    } 
}

