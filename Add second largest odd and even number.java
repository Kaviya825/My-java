import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr=new int[a];
        int[] k=new int[a/2];
        int[] n=new int[a/2];
        int t=0;
        for(int i=0;i<a;i++){
           arr[i]=s.nextInt();
        }
        if(a<=3){
            System.out.println(0);
        }else{
            ArrayList<Integer> even=new ArrayList<Integer>();
            ArrayList<Integer> odd=new ArrayList<Integer>();
            for(int i=0;i<a;i++){
                if(i%2==0){
                    even.add(arr[i]);
                }else{
                    odd.add(arr[i]);
                }
            }
            Collections.sort(even);
            Collections.sort(odd);
            System.out.println(even.get(even.size()-2)+odd.get(odd.size()-2));
        }
    }
}
