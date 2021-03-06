package io.gls.jcartadministartionback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.gls.jcartadministartionback.dao")
public class JcartAdministartionBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcartAdministartionBackApplication.class, args);
    }

}
