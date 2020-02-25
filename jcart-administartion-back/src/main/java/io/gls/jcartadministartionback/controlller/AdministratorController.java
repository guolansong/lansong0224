package io.gls.jcartadministartionback.controlller;

import io.gls.jcartadministartionback.dto.in.AdministartorLoginInDTO;
import io.gls.jcartadministartionback.dto.in.AdministartorResetPwdInDTO;
import io.gls.jcartadministartionback.dto.in.AdministratorUpdateProfileDTO;
import io.gls.jcartadministartionback.dto.out.AdministartorListOutDTO;
import io.gls.jcartadministartionback.dto.out.AdministartorShowOutDTO;
import io.gls.jcartadministartionback.dto.out.AdministratorGetProfileOutDTO;
import io.gls.jcartadministartionback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/getList")
    public PageOutDTO<AdministartorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @PostMapping("/getById")
    public AdministartorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody  AdministratorUpdateProfileDTO administratorUpdateProfileDTO){

    }

    @PostMapping("/create")
    public void create(@RequestBody  AdministratorUpdateProfileDTO administratorUpdateProfileDTO){

    }



    @PostMapping("/list")
    public void  list(@RequestBody  AdministratorUpdateProfileDTO administratorUpdateProfileDTO){

    }


}
