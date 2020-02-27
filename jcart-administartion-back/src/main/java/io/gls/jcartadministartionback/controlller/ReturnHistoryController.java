package io.gls.jcartadministartionback.controlller;

import io.gls.jcartadministartionback.dto.in.ReturnHistoryCreteInDTO;
import io.gls.jcartadministartionback.dto.out.ReturnHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnhistory")
public class ReturnHistoryController {

    @GetMapping("getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreteInDTO returnHistoryCreteInDTO){
        return null;
    }


}
