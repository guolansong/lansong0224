package io.gls.jcartadministartionback.controlller;

import io.gls.jcartadministartionback.dto.in.CustomerSearchInDTO;
import io.gls.jcartadministartionback.dto.out.CustomerListOutDTO;
import io.gls.jcartadministartionback.dto.out.CustomerShowOutDTO;
import io.gls.jcartadministartionback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestBody Integer customerId){
        return null;
    }

//    @RequestMapping("/create")
//    public Integer create(){
//
//    }

    @RequestMapping("/disable")
    public void disable(@RequestParam Integer customerID){

    }
}
