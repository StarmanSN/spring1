//package homework3.controller;
//
//import homework3.model.Product;
//import homework3.service.ProductService;
//import lombok.RequiredArgsConstructor;
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
//    private final ProductService productService;
//
//    @RequestMapping(value = "/create", method = RequestMethod.GET)
//    public String showForm(Model model) {
//        model.addAttribute("product", new Product());
//        return "create-product";
//    }
//
//    @RequestMapping(value = "create", method = RequestMethod.POST)
//    public String processForm(Product product) {
//        if (product.getId() == null) {
//            productService.save(product);
//        } else {
//            productService.edit(product);
//        }
//        return "redirect:/product/all";
//    }
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
//    public String getProductId(Model model, @PathVariable Integer id) {
//        Product product;
//        product = productService.findById(id);
//        model.addAttribute("product", product);
//        return "product";
//    }
//
//    @RequestMapping(path = "/all", method = RequestMethod.GET)
//    public String getAllProducts(Model model) {
//        model.addAttribute("products", productService.findAll());
//        return "product-list";
//    }
//
//    @RequestMapping(path = "/delete", method = RequestMethod.GET)
//    public String deleteById(@RequestParam Integer id) {
//        productService.deleteById(id);
//        return "redirect:/product/all";
//    }
//
//    @RequestMapping(path = "/edit", method = RequestMethod.GET)
//    public String editById(Model model, @RequestParam Integer id) {
//        model.addAttribute("product", productService.findById(id));
//        return "create-product";
//    }
//}