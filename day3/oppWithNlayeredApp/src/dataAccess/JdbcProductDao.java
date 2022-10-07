package dataAccess;

import entities.Product;

//coding only database access 

public class JdbcProductDao implements ProductDao{

    @Override
    public void add(Product product){
        System.out.println("jdbc/added to database");
    }


}
