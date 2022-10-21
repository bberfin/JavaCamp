package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
        System.out.println("[Hibernate] Kategori eklendi: "+category.getCategoryName());
        
    }
    
}
