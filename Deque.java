import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Deque<Integer> st=new ArrayDeque<>();
	    st.add(5);
	    st.add(4);
	    st.add(3);
	    st.add(2);
	    st.add(1);
	    st.addFirst(7);
	    st.addLast(9);
	    st.removeLast();
	    st.removeFirst();
	    st.remove();
		System.out.println("Print in teretor method");
		Iterator i=st.iterator();
		while(i.hasNext()){
		    System.out.println(i.next());
		}
		System.out.println("frst elements:"+st.peekFirst());
		System.out.println("last elements:"+st.peekLast());
		System.out.println("frst elements:"+st.peek());
	}
}
