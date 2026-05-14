package day12;

import java.util.Scanner;

// Parent Class
class Products
{
    int productId;
    String productName;
    double productPrice;
}

// Child Class 1
class ElectronicItem extends Products
{
    String itemType;

    void showElectronicDetails()
    {
        System.out.println("Category : Electronic Items");
        System.out.println("Electronic Item : " + itemType);
    }
}

// Child Class 2
class Clothes extends Products
{
    String size;

    void showClothingDetails()
    {
        System.out.println("Category : Clothing");
        System.out.println("Size : " + size);
    }
}

// Child Class 3
class Foods extends Products
{
    String type;

    void showFoodDetails()
    {
        System.out.println("Category : Food");
        System.out.println("Food Type : " + type);
    }
}

// Main Class
public class onlineShoppingSystemUsingSwitchCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Display Products");
        System.out.println("1. Electronic Items");
        System.out.println("2. Clothing");
        System.out.println("3. Food");

        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:

                ElectronicItem e = new ElectronicItem();

                e.itemType = "Laptop, Mobile, TV";

                e.showElectronicDetails();

                break;

            case 2:

                Clothes c = new Clothes();

                c.size = "S,M,L,XL,XXL,XXXL AND JUMBO";

                c.showClothingDetails();

                break;

            case 3:

                Foods f = new Foods();

                f.type = "Veg and Non-Veg";

                f.showFoodDetails();

                break;

            default:

                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}