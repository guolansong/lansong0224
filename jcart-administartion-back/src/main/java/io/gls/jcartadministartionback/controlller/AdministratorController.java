package io.gls.jcartadministartionback.controlller;

import io.gls.jcartadministartionback.dto.in.AdministratorLoginINDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginINDTO administratorLoginInDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorLoginINDTO getProfile(){
        return null;
    }


    @PostMapping("/updateProdfile")
    public void updateProdfile(){

    }


}
