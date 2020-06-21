package com.product.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.product.dao.ProductDAO;
import com.product.exception.BusinessException;
import com.product.model.Product;

public class ProductDaoImpl implements ProductDAO {
	
	
	
	
	
	private Map<Integer, Product> productmap = new LinkedHashMap<>();

	@Override
	public Product addProduct(Product product) throws BusinessException {
		
		if (productmap.size()==0) {
			productmap.put(10000, product);
			product.setId(10000);
		}else {
			List<Integer> idList = new ArrayList<>(productmap.keySet());
		    Collections.sort(idList,Collections.reverseOrder());
		    product.setId(idList.get(0)+1);

		     productmap.put(product.getId(), product);
		 }
		
		
		return product;
	}

	@Override
	public Product getProductById(int id) throws BusinessException {
	if (productmap.containsKey(id)) {
		return productmap.get(id);
	}else {
	  throw new BusinessException("Entered id "+id+" does not exit" );	
	  }
    }

	@Override
	public List<Product> getProductByManufacturerName(String manufacturerName) throws BusinessException {
	    List<Product> productList = new ArrayList<>();
	    for (Entry<Integer, Product> e:productmap.entrySet()) {
	    	if (e.getValue().getManufacturerName().equalsIgnoreCase(manufacturerName)) {
	    		productList.add(e.getValue());
	    	}
	    	
	    }
	    if(productList.size() == 0) {
	    	throw new BusinessException("No producs found by manufacturer Name"+manufacturerName);
	    }
		return productList;
	}

	@Override
	public Product updateProductsPrice(int id, double newCost) throws BusinessException {
		if (productmap.containsKey(id))
		{
			
		 Product product = productmap.get(id);
		 product.setCost(newCost);
		 productmap.put(id, product);
		 return product;
		}else {
			throw new BusinessException("No Product id fount"+id);
		}
	 //return null;
	}

	@Override
	public void deleteProduct(int id) throws BusinessException {
		// TODO Auto-generated method stub
		if (productmap.containsKey(id))
		{
			productmap.remove(id);
		
		}else {
			throw new BusinessException("No Product id fount"+id);
		}
	}

	@Override
	public List<Product> getAllProducts() throws BusinessException {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>(productmap.values());
		return productList;
	}

}
