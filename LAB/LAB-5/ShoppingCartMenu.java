import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class CartItem{
    String productId; 
    String name; 
    float price;
    int quantity = 0;
    CartItem next;
    CartItem(String productId, String productName, float price, int quantity){
        this.productId=productId;
        this.name=productName;
        this.price=price;
        this.quantity=quantity;
        this.next=null;
    }
    public String toString(){
        return name+" "+productId+" "+price+" "+quantity;
    }
}
interface ShoppingCart{
    public  void add(String productId, String productName, float price, int quantity);
    public void update(String pId,int quantity);
    public  void display();
    public void remove(String pId);
}

public class ShoppingCartMenu implements ShoppingCart{
    CartItem start,end;
    public void add(String productId, String productName, float price, int quantity){
        CartItem node = new CartItem(productId,productName,price,quantity);
        if(start==null){
            start=node;
            end=node;
        }
        else{
            end.next=node;
            end=node;
        }
    }
    public void update(String pId,int quantity){
        CartItem temp=start;
        while(!temp.productId.equals(pId)){
            temp=temp.next;
        }
        temp.quantity=quantity;
    }
    public void display(){
        CartItem current=start;
        while(current!=null){
            System.out.println(current);
            current=current.next;
        }
    }
    public void remove(String pId){
        CartItem pre=null;
        CartItem curr=start;
        while(curr!=null){
            if(curr.productId.equals(pId)){
                if(pre==null){
                    start=start.next;
                }
                else{
                    if(curr.next!=null){
                        pre.next=curr.next;
                    }
                    else{
                        pre.next=null;
                    }
                }
                break;
            }
            else{
                pre=curr;
                curr=curr.next;
            }
            if(curr==null){
                System.out.println(pId+" not found");
            }
        }
    }

 
    public static void main(String[] args)throws Exception{
        FileReader fr = new FileReader("ShoppingCart.txt");
        BufferedReader br = new BufferedReader(fr);
        ShoppingCartMenu o = new ShoppingCartMenu();
        String line="";
        while((line=br.readLine())!=null){
            StringTokenizer st = new StringTokenizer(line);
            String pid = st.nextToken();
            String name=st.nextToken();
            float price = Float.parseFloat(st.nextToken());
            int quan = Integer.parseInt(st.nextToken());
            o.add(pid,name,price,quan);
        }
        br.close();
        fr.close();
       
        o.display();
        System.out.println("\n");
        o.update("S107",99);
        o.remove("E105");
        o.display();
    }
}
