package io.gls.jcartadministartionback.controlller;

import io.gls.jcartadministartionback.dto.in.ProductCreateInDTO;
import io.gls.jcartadministartionback.dto.in.ProductSearchInDTO;
import io.gls.jcartadministartionback.dto.in.ProductUpdateInDTO;
import io.gls.jcartadministartionback.dto.out.PageOutDTO;
import io.gls.jcartadministartionback.dto.out.ProductListOUTDTO;
import io.gls.jcartadministartionback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/search")
    public PageOutDTO<ProductListOUTDTO> search(ProductSearchInDTO productSearchInDTO,
                             @RequestBody Integer pageNum){
        return null;
    }
    @RequestMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return  null;
    }

    @RequestMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestBody Integer productId){
        return null;
    }
}