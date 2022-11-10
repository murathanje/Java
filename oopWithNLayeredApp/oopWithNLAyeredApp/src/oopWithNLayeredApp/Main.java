package oopWithNLayeredApp;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.Logging.DatabaseLogger;
import oopWithNLayeredApp.core.Logging.FileLogger;
import oopWithNLayeredApp.core.Logging.Logger;
import oopWithNLayeredApp.core.Logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        Product product1 = new Product(1,"IPhone XR", 1000);

        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);

        productManager.add(product1);
        


        

        
    } 
}
