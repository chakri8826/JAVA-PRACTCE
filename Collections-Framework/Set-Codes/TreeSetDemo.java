import java.util.*;
class Point implements Comparable{
    int x,y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Object o){
        Point p = (Point) o;
        System.out.println("this.x: "+this.x);
        System.out.println("p.x: "+p.x);
        if(this.x<p.x){
            return -1;
        }
        else if(this.x>p.x){
            return 1;
        }
        else{
            if(this.y<p.y){
                return -1;
            }
            else if(this.y>p.y){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    public String toString(){
        return "X="+x+" Y="+y;
    }
}
public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));
        // ts.add(25);
        // System.out.println(ts);
        // System.out.println(ts.ceiling(48)); //aa number ki nearest greater/equal number ni istundi.
        // System.out.println(ts.floor(12));  //aa number ki nearest  lesser/equal number ni istundi.
        // System.out.println(ts.first());   //first number ni istundi

        //TREESET IMPLEMENTING COMPARABLE INTERFACE
        TreeSet<Point> tc = new TreeSet<>();
        tc.add(new Point(1,1));
        tc.add(new Point(5,5));
        tc.add(new Point(5,2));
        // System.out.println(tc);
    } 
}
