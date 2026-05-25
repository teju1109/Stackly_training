package JDBC;

import java.sql.*;
import java.util.Scanner;

public class StudentLibrary
{
    // ADD STUDENT
    public static void addStudent()
    {
        try
        {
            Connection con = LibraryDBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            String query = "INSERT INTO students VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Student Added Successfully");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // ADD BOOK
    public static void addBook()
    {
        try
        {
            Connection con = LibraryDBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            String query =
                    "INSERT INTO books(book_id, title, author) VALUES (?, ?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, author);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Book Added Successfully");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // ISSUE BOOK
    public static void issueBook()
    {
        try
        {
            Connection con = LibraryDBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();

            System.out.print("Enter Student ID: ");
            int studentId = sc.nextInt();

            String query =
                    "UPDATE books SET student_id=?, issue_date=CURDATE() WHERE book_id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, studentId);
            ps.setInt(2, bookId);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Book Issued Successfully");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // VIEW ISSUED BOOKS
    public static void viewIssuedBooks()
    {
        try
        {
            Connection con = LibraryDBConnection.getConnection();

            String query =
                    "SELECT s.name, b.title, b.issue_date " +
                    "FROM students s " +
                    "JOIN books b " +
                    "ON s.student_id = b.student_id";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            System.out.println("\nIssued Books");

            while(rs.next())
            {
                System.out.println(
                        rs.getString("name") + " | " +
                        rs.getString("title") + " | " +
                        rs.getDate("issue_date")
                );
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // RETURN BOOK
    public static void returnBook()
    {
        try
        {
            Connection con = LibraryDBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Book ID: ");

            int bookId = sc.nextInt();

            String query =
                    "UPDATE books SET student_id=NULL, issue_date=NULL WHERE book_id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, bookId);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Book Returned Successfully");
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
            System.out.println("\n===== LIBRARY MENU =====");

            System.out.println("1. Add Student");
            System.out.println("2. Add Book");
            System.out.println("3. Issue Book");
            System.out.println("4. View Issued Books");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    addStudent();
                    break;

                case 2:
                    addBook();
                    break;

                case 3:
                    issueBook();
                    break;

                case 4:
                    viewIssuedBooks();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
