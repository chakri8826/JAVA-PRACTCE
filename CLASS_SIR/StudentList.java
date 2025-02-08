import java.util.*;
import java.lang.*;
class StudentList
{
	Student start,end;
	int len=0;
	void insert(String name,int age,double cgpa)
	{
		Student node = new Student(name,age,cgpa);
		if(start==null)
		{
			start=node;
			end=node;
			len++;
		}
		else
		{
			end.next=node;
			end=node;
			len++;
		}		
	}
	void traversal()
	{
		Student current=start;
		while(current!=null)
		{
			System.out.println(current);
			current=current.next;
		
		}
	}
	void search(String key)
	{
		Student current=start;
		int flag=0;
		while(current!=null)
		{
			if(current.name.equals(key))
			{
				flag++;
				break;
			}
			current=current.next;
		}
		if(flag>0)
		{
			System.out.println("Name found "+current);
		}
		else
		{
			System.out.println("Name not found" );
		}
	}
	void delete(String key)
	{
		Student pre=null;
		Student current = start;
		while(current!=null)
		{
			if(current.name.equals(key))
			{
				if(pre==null)
				{
					start=start.next;
					len--;
				}
				else
				{
					pre.next=current.next;
				}
				break;
			}
			else
			{
				pre=current;
				current=current.next;
				len--;
			}
		}
		if(current==null)
		{
			System.out.println("Name not found");
		}
	}
	void delete1(String key)
	{
		Student current=start;
		if(current.name.equals(key))
		{
			start=start.next;
			current.next = null;
		}
		else
		{
			while(current.next.next!=null)
			{
				if(current.next.name.equals(key))
				{
					current.next=current.next.next;
				}
				else
				{
					current=current.next;
				}
			}			
			if(current.next.name.equals(key))
			{
				end=current;
				current.next=null;
			}
		}
	}
	public int getSize()
	{
		return len;
	}
	
	/*void sortByName(){
		Student pre = null;
		Student current = start;
		Student post = current.next;
		int i=0;
		while(i<len){
			int j=0;
			while(j<len-1){
				
			
			}
		}
	
	}*/
	public void sortByName()
	{
		System.out.println(len);
		int i=len-1;
	 	Student pre,current,post;
		int j=0;
		//Student temp=start;
		while(i>=0)
		{
	 		current=start;
	 		post=current.next;
	 		pre=null;
	 		j=0;
	 		while(j<i)
	 		{
	 			if(current.name.compareTo(post.name)>0)
	 			{
	 				current.next=post.next;
	 				post.next=current;
	 				if(pre==null)
	 				{
	 					pre=post;
	 					start=pre;
	 				}
	 				else
	 				{
	 					pre.next=post;
	 				}		
	 				pre=post;
	 				current=post.next;
	 				if(current.next!=null)
	 				{
	 					post=current.next;
	 				}
	 			}
	 			else
	 			{
	 				pre=current;
	 				current=current.next;
	 				if(post.next!=null)
	 				{
	 					post=post.next;
	 				}
	 			}
	 			j++;
	 		}
	 		i--;
	 	}
	}
}
