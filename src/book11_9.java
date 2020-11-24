import java.util.Scanner;
import java.util.ArrayList;
public class book11_9 {
    public static void main(String[] args) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the array size n :");
        int n = kb.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=(int)(Math.random()*2);
            }
        }
        int maxRow=-1,maxCol=-1;
        for(int i=0;i<n;i++){
            int cntRow=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1)cntRow++;
                System.out.printf("%d",mat[i][j]);
            }
            if(cntRow>maxRow){
                maxRow=cntRow;
                row.clear();
                row.add(i);
            }else if(cntRow==maxRow)row.add(i);
            System.out.println();
        }
        for(int j=0;j<n;j++){
            int cntCol=0;
            for(int i=0;i<n;i++){
                if(mat[i][j]==1)cntCol++;
            }
            if(cntCol>maxCol){
                maxCol=cntCol;
                col.clear();
                col.add(j);
            }else if(cntCol==maxCol)col.add(j);
        }
        System.out.print("The largest row index: ");
        for(int i=0;i<row.size()-1;i++)
            System.out.print(row.get(i)+", ");
        System.out.println(row.get(row.size()-1));

        System.out.print("The largest column index: ");
        for(int i=0;i<col.size()-1;i++)
            System.out.print(col.get(i)+", ");
        System.out.println(col.get(col.size()-1));
    }
}
