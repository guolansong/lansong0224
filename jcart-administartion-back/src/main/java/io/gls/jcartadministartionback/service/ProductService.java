package io.gls.jcartadministartionback.service;

import io.gls.jcartadministartionback.dto.in.ProductCreateInDTO;
import io.gls.jcartadministartionback.dto.in.ProductUpdateInDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);
}
