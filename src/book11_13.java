import java.util.Scanner;
import java.util.ArrayList;
public class book11_13 {
    public static void removeDuplicate(ArrayList<Integer> list){
        int cnt=0;
        int[] cmp =new int[10];
        for (int i=0;i<list.size();i++) {
            int x=list.get(i);
            int f=0;
            for(int j=0;j<cnt;j++){
                if(x==cmp[j]){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.printf("%d ",x);
                //System.out.print(x+" ");
                cmp[cnt]=x;
                cnt++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> a =new ArrayList<Integer>();
        System.out.print("Enter 10 integers: ");
        for(int i=0;i<10;i++)
            a.add(kb.nextInt());
        System.out.print("The distinct integers are ");
        removeDuplicate(a);
    }
}
//34 5 3 5 6 4 33 2 2 4