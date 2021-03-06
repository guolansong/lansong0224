package io.gls.jcartadministartionback.controlller;

import com.github.pagehelper.Page;
import io.gls.jcartadministartionback.dto.in.ProductCreateInDTO;
import io.gls.jcartadministartionback.dto.in.ProductSearchInDTO;
import io.gls.jcartadministartionback.dto.in.ProductUpdateInDTO;
import io.gls.jcartadministartionback.dto.out.PageOutDTO;
import io.gls.jcartadministartionback.dto.out.ProductListOUTDTO;
import io.gls.jcartadministartionback.dto.out.ProductShowOutDTO;
import io.gls.jcartadministartionback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOUTDTO> search(ProductSearchInDTO productSearchInDTO,
                             @RequestParam(required = false,defaultValue = "1") Integer pageNum){
        Page<ProductListOUTDTO> page = productService.search(pageNum);

        PageOutDTO<ProductListOUTDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }
    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId = productService.create(productCreateInDTO);
        return  productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        productService.delete(productId);
    }

    @PostMapping("deletes")
    public void deletes(@RequestBody List<Integer> productIds){

        productService.batchDelete(productIds);

    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }
}
