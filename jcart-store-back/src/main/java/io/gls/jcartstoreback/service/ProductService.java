package io.gls.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.gls.jcartstoreback.dto.out.ProductListOutDTO;
import io.gls.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService{
    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);
}
