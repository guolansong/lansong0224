package io.gls.jcartadministartionback.controlller;

import io.gls.jcartadministartionback.dto.in.OrderHistoryCreateInDTO;
import io.gls.jcartadministartionback.dto.out.OrderListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {

    @GetMapping("/getListByOrderId")
    public List<OrderListOutDTO> getListByOrderId(){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        return null;
    }

}
