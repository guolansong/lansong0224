package io.gls.jcartadministartionback.service;

import io.gls.jcartadministartionback.dto.in.ProductCreateInDTO;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);
}
