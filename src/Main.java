import com.minipro.Entities.Cart;
import com.minipro.Entities.Item;
import com.minipro.Entities.Product;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static Cart cart=new Cart();
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the shopping site");
        boolean check=true;
        while(check==true) {
            System.out.println("Please enter you choice of action");
            System.out.println("(a)add item");
            System.out.println("(v)view all added items");
            System.out.println("(c)checkout");
            char ch=sc.nextLine().charAt(0);
            if(ch=='a')
            {
                addItem();
            }
            else if(ch=='v')
            {
                viewItems();
            }
            else if(ch=='c')
            {
                double total=cart.checkout();
                System.out.println("Total value to pay: "+total);
                check=false;
            }

        }

    }
    public static void addItem()
    {
        System.out.println("Available products are: ");
        System.out.println("(1)Apple : 100");
        System.out.println("(2)Orange : 50");
        System.out.println("(3)Mango : 40");
        System.out.println("(4)Grapes : 35");
        System.out.println("(5)WaterMelon: 25");
        System.out.println("(6)Guava : 30");
        System.out.print("\n");
        System.out.println("Enter the product id: ");
        int id=sc.nextInt();
        System.out.println("Enter the quantity");
        int q=sc.nextInt();
        Product p=new Product();
        if(id==1)
        {
            p.setId(1);
            p.setName("Apple");
            p.setPrice(100);
        }
        else if(id==2)
        {
            p.setId(2);
            p.setName("Orange");
            p.setPrice(50);
        }
        else if(id==3)
        {
            p.setId(3);
            p.setName("Mango");
            p.setPrice(40);
        }
        else if(id==4)
        {
            p.setId(4);
            p.setName("Grapes");
            p.setPrice(35);
        }
        else if(id==5)
        {
            p.setId(5);
            p.setName("WaterMelon");
            p.setPrice(25);
        }
        else if(id==6)
        {
            p.setId(6);
            p.setName("Guava");
            p.setPrice(30);
        }
        else{
            System.out.println("Enter a valid prod id");
            addItem();
        }
        Item it = new Item(p,q);
        cart.addItem(it);
    }
    public static void viewItems()
    {
        cart.viewProducts();
    }
}