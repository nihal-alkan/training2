package training2;

public class main {

	public static void main(String[] args) {
		String mesaj = "vade oranı";

		Product product1 = new Product();
		product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "bilmemne1.jpg";

		Product product2 = new Product();
		product2.name = "Smeg Kahve Makinesi";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "bilmemne2.jpg";

		Product product3 = new Product();
		product3.name = "Kitchen Kahve Makinesi";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "bilmemne3.jpg";

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.name + "</li>");
		}
		System.out.println("</ul>");
		
		ındividualCustomer individualCustomer = new ındividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("052222222");
		individualCustomer.setCostomernumber("1554264");
		individualCustomer.setFirstName("engin");
		individualCustomer.setLastName("demiroğ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama i.o");
		corporateCustomer.setPhone("052465225");
		corporateCustomer.setTaxNumber("215454654635435");
		corporateCustomer.setCostomernumber("4512");
		
		Customer [] customers = {individualCustomer,corporateCustomer};
		
		
	}

}
