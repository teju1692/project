package sample;
import java.util.ArrayList;
import java.util.Iterator;
public class Testcol {
	public static void main(String args[])
	{
		Studentc s1=new Studentc(101,"sono","tejaswi");
		Studentc s2=new Studentc(102,"base","tejaswi1");
		
	
	ArrayList<Studentc> al=new ArrayList<Studentc>();
	al.add(s1);
	al.add(s2);
	Iterator<Studentc> itr=al.iterator();
	//traversing elements of arraylist
	while(itr.hasNext())
	{
		Studentc st=(Studentc)itr.next();
		System.out.println(st.rollno+""+st.name+""+st.emailid+"");
		
		
	}

}
}
