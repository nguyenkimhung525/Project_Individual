package service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;


import domain.Product;

@Service
public class ProductServiceImpl implements ProductService{
	private AtomicLong generator =new AtomicLong();
	private Map<Long, Product>products=new HashMap<>(); 
	public ProductServiceImpl() {
        Product product = new Product();
        product.setName("JX1 Power Drill");
        product.setDescription(
                "Powerful hand drill, made to perfection");
        product.setPrice(129.99F);
        add(product);
    }
	@Override
	public Product add(Product product) {
		// TODO Auto-generated method stub
		long newid=generator.incrementAndGet();
		product.setId(newid);
		products.put(newid, product);
		return product;
	}

	@Override
	public Product get(long id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}
	
}
