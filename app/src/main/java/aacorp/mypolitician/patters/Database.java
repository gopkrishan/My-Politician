package aacorp.mypolitician.patters;

class Database {

    private static final Database instance = new Database();

    private Database(){}

    public static Database getInstance(){
        return instance;
    }




}
