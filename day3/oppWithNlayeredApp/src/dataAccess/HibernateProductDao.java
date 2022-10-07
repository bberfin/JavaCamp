package dataAccess;

import entities.Product;

//coding only database access 

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product){
        System.out.println("hibernate/added to database");
    }  
}
