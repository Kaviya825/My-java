
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    Deque<Integer> st=new ArrayDeque<>();
	    int num=s.nextInt();
	    st.addLast(1);
	    st.addLast(2);
	    st.addLast(3);
	    rotateright(st,num);
		System.out.println("Print in teretor method"+st);
		
	}
	public static <T> void rotateright(Deque<T> st,int n){
        for(int i=0;i<n;i++){
          T l=st.removeLast();
          st.addFirst(l);
        }
    }
}
