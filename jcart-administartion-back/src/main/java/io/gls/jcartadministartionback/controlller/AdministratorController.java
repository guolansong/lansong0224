package io.gls.jcartadministartionback.controlller;

import io.gls.jcartadministartionback.dto.in.*;
import io.gls.jcartadministartionback.dto.out.AdministartorListOutDTO;
import io.gls.jcartadministartionback.dto.out.AdministartorShowOutDTO;
import io.gls.jcartadministartionback.dto.out.AdministratorGetProfileOutDTO;
import io.gls.jcartadministartionback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministartorLoginInDTO administratorLoginInDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){
        return null;
    }


    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody  AdministratorUpdateProfileDTO administratorUpdateProfileDTO){

    }


//    -------
    @PostMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestBody String email){
        return null;
    }

    @PostMapping("/ResetPwd")
    public void ResetPwd(@RequestBody AdministartorResetPwdInDTO administartorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministartorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public AdministartorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return  null;
    }



    @PostMapping("/update")
    public void  list(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer adminstratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorIds){

    }

}
