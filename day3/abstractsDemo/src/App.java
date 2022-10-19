public class App {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new MySqlDatabaseManager();
        customerManager.getCustomer();
    }
}
