import java.util.ArrayList;
import java.util.Scanner;


public class Q6_GroceryList  {
    public static void main(String[] args) {
        GroceryList x= new GroceryList();
        for(int i = 0;i<10;i++){
            Scanner Name = new Scanner(System.in);
            Scanner Quantity = new Scanner(System.in);
            Scanner Price = new Scanner(System.in);
            int Q = Quantity.nextInt();
            double PriceItem;
            GroceryItemOrder item = new GroceryItemOrder(Name.next(),Price.nextDouble());
            item.setQuantity(Q);
            x.addI(item);
            PriceItem = item.getCost();
            System.out.println(PriceItem);

        }
        double A = 0;
        for ( int i=0;i<x.list.size();i++) {
            A = x.GetTotalCost();
        }
        System.out.println(A);
    }
}

class GroceryList {
    ArrayList<GroceryItemOrder> list = new ArrayList<GroceryItemOrder>(10);
    double TotalCost = 0;
    public GroceryList(){}
    public void addI(GroceryItemOrder item){
        if (list.size() <= 10){
            list.add(item);
        }else{
            System.out.println("Can't add more items");
        }
    }
    public double GetTotalCost(){
        double a = 0;
        for (GroceryItemOrder x: list) {
            a += x.getCost();
        }
        return a;
    }
}
class GroceryItemOrder{
    String Name;
    int Quantity;
    double PricePerUnit;
    public GroceryItemOrder() {
    }
    public GroceryItemOrder(String name, double pricePerUnit) {
        Name = name;
        PricePerUnit = pricePerUnit;
    }

    public double getCost() {
        double Cost = Quantity * PricePerUnit;
        return Cost;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}



