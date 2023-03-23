import java.util.ArrayList;


public class Q2__Q3  {
    public static Integer Max (ArrayList<Integer> List){
        if (List.isEmpty())
            return null;
        int Max = List.get(0);
        for (int x: List) {
            if (x > Max )
                Max = x;
        }
        return Max;
    }

    public static void sort(ArrayList<Integer> list){
        list.sort(null);
    }

}