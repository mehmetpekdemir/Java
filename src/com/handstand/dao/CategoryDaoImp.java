package com.handstand.dao;

import java.sql.SQLException;
import java.util.List;

import com.handstand.entity.Category;

/**
 * 
 * @author MEHMET PEKDEMIR
 *
 */
public interface CategoryDaoImp {

	public List<Category> listCategory() throws ClassNotFoundException, SQLException;

	public List<Category> listCategoryWithPlatformName() throws ClassNotFoundException, SQLException;

	public Category findCategory(int id, String platformName) throws ClassNotFoundException, SQLException;

	public int findCategoryWithCategoryName(String categoryName) throws ClassNotFoundException, SQLException;

	public void addCategory(Category category) throws ClassNotFoundException, SQLException;

	public void updateCategory(Category category) throws ClassNotFoundException, SQLException;

}
