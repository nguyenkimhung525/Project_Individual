package validator;

import java.util.ArrayList;
import java.util.List;

import form.ProudctForm;

public class ProductValidator {
	public List<String>validate(ProudctForm form){
		List<String>errors=new ArrayList<>();
		String name=form.getName();
		String price=form.getPrice();
		if(name==null | name.trim().isEmpty()) {
			errors.add("Product must have a name");
		}
		if(price==null |price.trim().isEmpty()) {
            errors.add("Product must have a price");
		}
		else {
			try {
				Float.parseFloat(price);
			} catch (NumberFormatException e) {
                errors.add("Invalid price value");
           }
		}
		return errors;
	}
}
