package homework7.controller;

import homework7.entity.Product;
import homework7.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/create")
    public String showForm(Model model) {
        model.addAttribute("product", new Product());
        return "create-product";
    }

    @PostMapping(value = "/create")
    public String processForm(Product product) {
        if (product.getId() == null) {
            productService.save(product);
        }
        return "redirect:/product/all";
    }

    @GetMapping("/{id}")
    public String getProductId(@PathVariable Long id) {
        productService.findById(id);
        return "product";
    }

    @GetMapping(path = "/all")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product-list";
    }

    @GetMapping(path = "/delete")
    public Optional<Product> deleteById(@RequestParam Long id) {
        productService.deleteById(id);
        return (productService.findById(id));
    }

    @RequestMapping(path = "/edit", method = RequestMethod.GET)
    public String editById(Model model, @RequestParam Long id) {
        model.addAttribute("product", productService.findById(id));
        return "create-product";
    }
}
