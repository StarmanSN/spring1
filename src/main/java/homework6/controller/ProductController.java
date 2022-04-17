//package homework6.controller;
//
//import homework6.ProductDao;
//import homework6.entity.Product2;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//@RequestMapping("/product")
//@RequiredArgsConstructor
//public class ProductController {
//
//    @Autowired
//    private ProductDao productDao;
//
//    public void setProductDao(ProductDao productDao) {
//        this.productDao = productDao;
//    }
//
//    @RequestMapping(value = "/create", method = RequestMethod.GET)
//    public String showForm(Model model) {
//        model.addAttribute("product", new Product2());
//        return "create-product";
//    }
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public String processForm(Product2 product) {
//        if (product.getId() == null) {
//            productDao.saveOrUpdate(product);
//        } else {
//            productDao.edit(product);
//        }
//        return "redirect:/product/all";
//    }
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
//    public String getProductId(Model model, @PathVariable Long id) {
//        Product2 product;
//        product = productDao.findById(id);
//        model.addAttribute("product", product);
//        return "product";
//    }
//
//    @RequestMapping(path = "/all", method = RequestMethod.GET)
//    public String getAllProducts(Model model) {
//        model.addAttribute("products", productDao.findAll());
//        return "product-list";
//    }
//
//    @RequestMapping(path = "/delete", method = RequestMethod.GET)
//    public String deleteById(@RequestParam Long id) {
//        productDao.deleteById(id);
//        return "redirect:/product/all";
//    }
//
//    @RequestMapping(path = "/edit", method = RequestMethod.GET)
//    public String editById(Model model, @RequestParam Long id) {
//        model.addAttribute("product", productDao.findById(id));
//        return "create-product";
//    }
//}
