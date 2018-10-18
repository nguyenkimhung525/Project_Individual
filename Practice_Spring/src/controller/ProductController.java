package controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Product;
import form.ProudctForm;

@Controller
public class ProductController {
	private final static Log logger = LogFactory.getLog(ProductController.class);
	@RequestMapping(value = "/product_input")
	public String inputProduct() {
		logger.info("inputProduct called");
		return "ProductForm";
	}
	@RequestMapping(value = "/product_save")
	public String saveProduct(ProudctForm productForm, Model movie) {
		logger.info("saveProduct called");
		// populate action properties]
		System.out.println(productForm.getName());
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		try {
			product.setPrice(Float.parseFloat(productForm.getPrice()));
		} catch (NumberFormatException e) {
		}
		movie.addAttribute("product", product);
		return "ProductDetails";
	}
}
