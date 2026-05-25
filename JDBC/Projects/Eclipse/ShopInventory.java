package JDBC;

import java.sql.*;
import java.util.Scanner;

public class ShopInventory
{
    // ADD PRODUCT
    public static void addProduct()
    {
        try
        {
            Connection con = ShopDBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Stock: ");
            int stock = sc.nextInt();

            String query =
                    "INSERT INTO products VALUES (?, ?, ?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, price);
            ps.setInt(4, stock);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Product Added");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // CREATE ORDER
    public static void createOrder()
    {
        try
        {
            Connection con = ShopDBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Order ID: ");
            int orderId = sc.nextInt();

            System.out.print("Enter Product ID: ");
            int prodId = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            String query =
                    "INSERT INTO orders VALUES (?, ?, ?, CURDATE())";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, orderId);
            ps.setInt(2, prodId);
            ps.setInt(3, qty);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Order Created");
            }

            // UPDATE STOCK
            String updateQuery =
                    "UPDATE products SET stock = stock - ? WHERE prod_id=?";

            PreparedStatement ps2 =
                    con.prepareStatement(updateQuery);

            ps2.setInt(1, qty);
            ps2.setInt(2, prodId);

            ps2.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // VIEW LOW STOCK PRODUCTS
    public static void lowStock()
    {
        try
        {
            Connection con = ShopDBConnection.getConnection();

            String query =
                    "SELECT * FROM products WHERE stock < 5";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            System.out.println("\nLow Stock Products");

            while(rs.next())
            {
                System.out.println(
                        rs.getInt("prod_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("stock")
                );
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // MAIN METHOD
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n===== SHOP MENU =====");

            System.out.println("1. Add Product");
            System.out.println("2. Create Order");
            System.out.println("3. View Low Stock");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    addProduct();
                    break;

                case 2:
                    createOrder();
                    break;

                case 3:
                    lowStock();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
