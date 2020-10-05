import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;


class DatabaseManager {

    private static Connection database = null;


    public static void setup(){
        if (database != null){return;}

        System.out.println("started DataBase setup v15");

        // making connection with the database
        try{

            Class.forName("org.postgresql.Driver");
            database = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/officePlanagerData",
                            "BaseFramePC", "none");

            System.out.println("Database sucessfully connected");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.out.println("Couldn't open database connection, are the username and password correct?");
            System.exit(0);
        }


        // setting up tables
        setupLoginTable();

    }

    public static void setupLoginTable(){
        Statement st = null;
        try {
            st = database.createStatement();
            st.executeQuery("CREATE TABLE IF NOT EXISTS loginAttempts(              atTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, " +
                                                                                        "email VARCHAR(20)," +
                                                                                        "loginName VARCHAR(20))");

            System.out.println("successful query for setup of Login Table");
        } catch (SQLException e) {
            System.out.println("maybe failed to query the setup for Login Table check pgAdmin if table exists");
            //e.printStackTrace();
        }

    }

    public static void logLoginAttempt(String name, String email){
        Statement st = null;
        System.out.println("try to log attempt");
        try {
            st = database.createStatement();
            st.execute("INSERT INTO loginAttempts (email, loginName) VALUES ('" + email + "', '" + name + "')");
            System.out.println("successful query for inserting login record");
        } catch (SQLException e) {
            System.out.println("maybe failed to query the setup for Login Table check pgAdmin if record is added");
            e.printStackTrace();
        }
    }


}
