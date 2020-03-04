package io.gls.jcartadministartionback.service;

import io.gls.jcartadministartionback.dto.in.ProductCreateInDTO;
import io.gls.jcartadministartionback.dto.in.ProductUpdateInDTO;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);
}
