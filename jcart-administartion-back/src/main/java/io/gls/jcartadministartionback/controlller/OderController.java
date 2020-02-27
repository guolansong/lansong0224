package io.gls.jcartadministartionback.controlller;

import io.gls.jcartadministartionback.dto.in.OrderSearchInDTO;
import io.gls.jcartadministartionback.dto.out.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OderController {

    @GetMapping("search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam Integer pageNum){
        return null;
    }

    @PostMapping("getshipInfo")
    public OrderShipShowOutDTO getshipInfo(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("getById")
    public OrderShowOutDTO getById(){
        return null;
    }

    @GetMapping("/getInvoice")
    public OrderInvoiceShowOutDTO getInvoice(@RequestParam Long orderId){
        return null;
    }



}
