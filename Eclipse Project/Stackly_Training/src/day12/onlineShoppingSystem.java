package day12;

// Parent Class
class Product
{
    int productId;
    String productName;
    double productPrice;

    void showProductDetails()
    {
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Product Price : " + productPrice);
    }
}

// Child Class 1
class ElectronicItems extends Products
{
    int warranty;

    void showElectronicDetails()
    {
        System.out.println("Category : Electronic Item");
        System.out.println("Warranty : " + warranty + " Years");
    }
}

// Child Class 2
class Clothing extends Products
{
    String size;

    void showClothingDetails()
    {
        System.out.println("Category : Clothing");
        System.out.println("Size : " + size);
    }
}

// Child Class 3
class Food extends Products
{
    String type;

    void showFoodDetails()
    {
        System.out.println("Category : Food");
        System.out.println("Type : " + type);
    }
}

// Main Class
public class onlineShoppingSystem
{
    public static void main(String[] args)
    {
        // Electronic Item Object
        ElectronicItem e = new ElectronicItem();

        e.productId = 101;
        e.productName = "Laptop";
        e.productPrice = 55000;
        e.warranty = 2;

        e.showProductDetails();
        e.showElectronicDetails();

        System.out.println();

        // Clothing Object
        Clothes c = new Clothes();

        c.productId = 102;
        c.productName = "T-Shirt";
        c.productPrice = 999;
        c.size = "XL";

        c.showProductDetails();
        c.showClothingDetails();

        System.out.println();

        // Food Object
        Foods f = new Foods();

        f.productId = 103;
        f.productName = "Burger";
        f.productPrice = 199;
        f.type = "Non-Veg";

        f.showProductDetails();
        f.showFoodDetails();
    }
}