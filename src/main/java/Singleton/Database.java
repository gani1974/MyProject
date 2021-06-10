package Singleton;

public class Database {
    private static Database database;
    private Database (){};
    public static Database getInstance(){
        if (database == null){
            database = new Database();
        }
        return database;
    }
    public void getConnection(){
        System.out.println("You are now connected to the database!");
    }
}
