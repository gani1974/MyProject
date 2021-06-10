package App;

import Singleton.Database;

public class Main {
    public static void main(String[] args) {
        Database database;

        //database - единственный инстанс класса Database
        database = Database.getInstance();

        database.getConnection();
    }
}
