import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;


class DatabaseManager {

    private static Connection c = null;




    public static void setup(){
        if (c != null){return;}

        System.out.println("started DataBase setup");


        try{

            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/officePlanagerData",
                            "BaseFramePC", "none");

            System.out.println("Database sucessfully connected");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.out.println("Couldn't open database connection, are the username and password correct?");
            System.exit(0);
        }
    }

}
