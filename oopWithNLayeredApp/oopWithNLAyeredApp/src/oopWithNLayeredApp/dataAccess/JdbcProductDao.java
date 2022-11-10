package oopWithNLayeredApp.dataAccess;
import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao {
    
    public void add(Product product) {
        System.out.println("JDBC ile veritabanına eklendi");
        product.getId();
    }
}
