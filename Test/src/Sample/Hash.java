package Sample;
//this is the second commoit

import java.io.Serializable;
import java.util.*;

public class Hash extends AbstractSet implements Set,Cloneable,Serializable{
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String args[])
	{
		TreeSet<String> h=new TreeSet<String>();
		h.add("white");
		h.add("green");
        h.add("orange");
		h.add("white");
		h.add("yellow");
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	

}
