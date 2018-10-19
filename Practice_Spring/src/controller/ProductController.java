package controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import domain.Product;
import form.ProudctForm;
import service.ProductService;

@Controller
public class ProductController {
	private final static Log logger = LogFactory.getLog(ProductController.class);
	@RequestMapping(value = "/product_input")
	public String inputProduct() {
		logger.info("inputProduct called");
		return "ProductForm";
	}
	@Autowired
	private ProductService productservice;
	
    @RequestMapping(value = "/product_save", method = RequestMethod.POST)
	public String saveProduct(ProudctForm productForm, RedirectAttributes redirectAttributes) {
    	logger.info("saveProduct called");
        // no need to create and instantiate a ProductForm
        // create Product
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(
                    productForm.getPrice()));
        } catch (NumberFormatException e) {
        }

        // add product
        Product savedProduct = productservice.add(product);
        
        redirectAttributes.addFlashAttribute("message", 
                "The product was successfully added.");
        return "redirect:" + savedProduct.getId();
    }

    @RequestMapping(value = "{id}")
    public String viewProduct(@PathVariable long id, Model model) {
        Product product = productservice.get(id);
        model.addAttribute("product", product);
        return "ProductDetails";
    }
}
