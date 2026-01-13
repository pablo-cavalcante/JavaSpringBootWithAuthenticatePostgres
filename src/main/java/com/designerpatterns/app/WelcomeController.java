package com.designerpatterns.app;

import com.google.gson.Gson;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    private Gson gson;

    @GetMapping("/")
    @Operation(
            summary = "Mensagem de boas-vindas",
            description = "Retorna uma mensagem simples da API"
    )
    @Parameter(description = "X1 é ok")
    public String Welcome(){

        return "WEB OK";
    }

    @GetMapping("/users")
    @Operation(
            summary = "Mensagem de users",
            description = "Retorna uma mensagem simples da API"
    )
    @Parameter(description = "Users é ok")
    public String Users(){

        return "USERS OK";
    }

    @GetMapping("/managers")
    @Operation(
            summary = "Mensagem de users",
            description = "Retorna uma mensagem simples da API"
    )
    @Parameter(description = "Users é ok")
    public String Managers(){

        return "MANAGER OK";
    }
}
