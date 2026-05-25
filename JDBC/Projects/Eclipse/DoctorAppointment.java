package JDBC;

import java.sql.*;
import java.util.Scanner;

public class DoctorAppointment
{
    // ADD DOCTOR
    public static void addDoctor()
    {
        try
        {
            Connection con = DoctorDBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Doctor ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Doctor Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Specialty: ");
            String specialty = sc.nextLine();

            String query =
                    "INSERT INTO doctors VALUES (?, ?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, specialty);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Doctor Added Successfully");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // BOOK APPOINTMENT
    public static void bookAppointment()
    {
        try
        {
            Connection con = DoctorDBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Appointment ID: ");
            int apptId = sc.nextInt();

            System.out.print("Enter Doctor ID: ");
            int docId = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Patient Name: ");
            String patient = sc.nextLine();

            System.out.print("Enter Appointment Time (HH:MM:SS): ");
            String time = sc.nextLine();

            String query =
                    "INSERT INTO appointments VALUES (?, ?, ?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, apptId);
            ps.setInt(2, docId);
            ps.setString(3, patient);
            ps.setString(4, time);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Appointment Booked");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // VIEW SCHEDULE
    public static void viewSchedule()
    {
        try
        {
            Connection con = DoctorDBConnection.getConnection();

            String query =
                    "SELECT d.name, a.patient_name, a.appt_time " +
                    "FROM doctors d " +
                    "JOIN appointments a " +
                    "ON d.doc_id = a.doc_id";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            System.out.println("\nDoctor Schedule");

            while(rs.next())
            {
                System.out.println(
                        rs.getString("name") + " | " +
                        rs.getString("patient_name") + " | " +
                        rs.getString("appt_time")
                );
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // CANCEL APPOINTMENT
    public static void cancelAppointment()
    {
        try
        {
            Connection con = DoctorDBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Appointment ID: ");

            int apptId = sc.nextInt();

            String query =
                    "DELETE FROM appointments WHERE appt_id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, apptId);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Appointment Cancelled");
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
            System.out.println("\n===== DOCTOR MENU =====");

            System.out.println("1. Add Doctor");
            System.out.println("2. Book Appointment");
            System.out.println("3. View Schedule");
            System.out.println("4. Cancel Appointment");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    addDoctor();
                    break;

                case 2:
                    bookAppointment();
                    break;

                case 3:
                    viewSchedule();
                    break;

                case 4:
                    cancelAppointment();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
