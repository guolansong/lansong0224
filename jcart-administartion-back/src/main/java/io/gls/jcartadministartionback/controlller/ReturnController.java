package io.gls.jcartadministartionback.controlller;

import io.gls.jcartadministartionback.dto.in.ReturnSearchInDTO;
import io.gls.jcartadministartionback.dto.in.ReturnUpdateActionInDTO;
import io.gls.jcartadministartionback.dto.out.PageOutDTO;
import io.gls.jcartadministartionback.dto.out.RetunShowOutDTO;
import io.gls.jcartadministartionback.dto.out.ReturnListOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public RetunShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }
}
