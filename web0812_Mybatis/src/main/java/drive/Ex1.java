package drive;

import shop.Product;
import shop.ProductDAO;

public class Ex1 {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		Product product = new Product(1, "고양이1", "그냥 고양이", 1500, 1);
		dao.updateProduct(product);
		System.out.println("수정완료");
	}
}
