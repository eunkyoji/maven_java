package co.yedam.Hello;

import java.util.ArrayList;
import java.util.List;

import co.yedam.Hello.product.menu.ProductManager;
import co.yedam.Hello.product.service.ProductService;
import co.yedam.Hello.product.service.ProductVO;
import co.yedam.Hello.product.servicImpl.ProductServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ProductService dao = new ProductServiceImpl();
//        List<ProductVO> products = new ArrayList<ProductVO>();
//        
//        products = dao.productSelectList();
//        
//        for(ProductVO v : products) {
//        	v.toString();
//        }
    	ProductManager menu = new ProductManager();
    	menu.run();
    }
}
