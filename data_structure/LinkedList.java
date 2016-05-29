import java.util.*;


public class Linked<T> {

	private T data;
	private Linked<T> next;
	public Linked(T value){data=value;};
	public Linked(){}
	public T value(){return data;}
	
	public Linked<T> next(){return next;}
	
	public void setValue(T value){data=value;}
	
	public void setNext(Linked<T> elem){this.next=elem; }

	
	public Linked<T> insertFront(Linked<T> list,T data)
	{
		Linked<T> head=new Linked<T> (data);
		
		head.setNext(list);
		
		return head;
	}
	
	public Linked<T> removefront(Linked<T> list)
	{
		if(list.next()== null)
			throw new EmptyStackException();
		Linked<T> temp;
		temp=list.next();
		return temp;
	}
	
	
	public void triverse(Linked<T> head)
	{	

		Linked<T> elem=head;
		while(elem!=null)
		{
			System.out.println(elem.value());
			elem=elem.next();
		}
	}
