package io.gls.jcartstoreback.controller;

import io.gls.jcartstoreback.dto.in.CustomerChangePwdInDTO;
import io.gls.jcartstoreback.dto.in.CustomerLoginInDTO;
import io.gls.jcartstoreback.dto.in.CustomerUpdateProfileInDTO;
import io.gls.jcartstoreback.dto.out.CusomerProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/register")
    public Integer register(@RequestBody CustomerLoginInDTO customerLoginInDTO){
        return null;
    }

    @GetMapping("/login")
    public String login(CustomerLoginInDTO customerLoginInDTO){
        return null;
    }

    @GetMapping("/getprofile")
    public CusomerProfileOutDTO getprofile(@RequestAttribute Integer customerId){
        return null;
    }
    @GetMapping("/updateProfile")
    public void updateProfile(@RequestBody CustomerUpdateProfileInDTO customerUpdateProfileInDTO,
                              @RequestAttribute Integer customerId){

    }
    @GetMapping("/changePwd")
    public void changePwd(CustomerChangePwdInDTO customerChangePwdInDTO,
                          @RequestAttribute Integer customerId){

    }
    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody CustomerChangePwdInDTO customerChangePwdInDTO){

    }



}
