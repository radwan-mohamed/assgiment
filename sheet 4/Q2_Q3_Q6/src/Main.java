import java.util.ArrayList;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Scanner X = new Scanner(System.in);
        int num = X.nextInt();
        for (int i=0; i<num;i++){
            list.add(X.nextInt());
        }
        Q2__Q3.sort(list);
        Integer a =0;
        a = Q2__Q3.Max(list);
        if ( a!=null || a != 0 ){
            System.out.println(a);
        }
        for (int i=0; i<num;i++){
            System.out.print(" " + list.get(i));
        }
    }

}


