package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {

    Category[] categories = {new Category(1, "Java"), new Category(2, "Python"), new Category(3, "C")};
    
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception{

        
       
        for (Category ctgry : categories) {
            if (ctgry.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Bu kategori zaten mevcut.");
            }
        }
        
        categoryDao.add(category);

        for (Logger logger: loggers){
            logger.log(category.getCategoryName()+" -> kategori eklendi");
        }

    }
    
    
}
