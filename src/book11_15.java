import java.util.ArrayList;
import java.util.Scanner;
public class book11_15 {
    static class Node {
        double x,y;
        Node(double x,double y) {
            this.x = x;
            this.y = y;
        }
    }
    public static double getArea(Node a,Node b,Node c){
        return 0.5*((a.x*b.y-b.x*a.y)+(b.x*c.y-c.x*b.y)+(c.x*a.y-a.x*c.y));
    }

    public static void main(String[] args) {
        ArrayList<Node> a = new ArrayList<Node>();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i=0;i<n;i++){
            double x=kb.nextDouble();
            double y=kb.nextDouble();
            a.add(new Node(x,y));
        }
        double res=0;
        for(int i=1;i<n-1;i++){
            res+=getArea(a.get(0),a.get(i+1),a.get(i));
        }
        System.out.print(res);
    }
}
