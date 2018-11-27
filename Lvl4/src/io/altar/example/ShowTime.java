package io.altar.example;

public class ShowTime {

	ScannerUtils scannerUtils = new ScannerUtils();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowTime testes = new ShowTime();
		testes.teste();
		
	}
	
	private void teste () {
		Product product = createProduct();
		System.out.println(product.toString());
		
	}
	
	private void editProduct (Product product){
		System.out.println("Edit a Product!");
		
		int[] ivas= new int[] {6,13,23};
		int inputIva = scannerUtils.getValidIntFromScanner("Old IVA: " + product.getIva(), ivas);
		product.setIva(inputIva);
		int inputPvp = scannerUtils.getIntFromScanner("Old PVP: " + product.getPvp(), true);
		if (inputPvp!= -1){ product.setPvp(inputPvp); }
		int inputDiscount = scannerUtils.getValidIntFromScanner("Old Discount: " + product.getDiscount(), 100);
		product.setDiscount(inputDiscount);

	}
	
	private Product createProduct () {
		System.out.println("Create a product!");
		
		int[] ivas= new int[] {6,13,23};
		int inputIva = scannerUtils.getValidIntFromScanner("IVA: ", ivas);
		int inputPvp = scannerUtils.getIntFromScanner("PVP: ");
		int inputDiscount = scannerUtils.getValidIntFromScanner("Discount: ", 100);
		Product product = new Product(inputIva, inputPvp, inputDiscount);
		
		return product;
	}

}
