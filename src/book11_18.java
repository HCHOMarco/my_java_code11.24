import java.util.ArrayList;
import java.util.Scanner;

public class book11_18 {

    public static ArrayList<Character>toCharacterArray(String s){
        ArrayList<Character> res = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            res.add(s.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Character> res = new ArrayList<Character>();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        res=toCharacterArray(s);
        System.out.println(res);
    }
}
