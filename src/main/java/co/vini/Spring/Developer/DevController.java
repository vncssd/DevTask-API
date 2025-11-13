package co.vini.Spring.Developer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class DevController {

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Olá Mundo! Meu Primeiro EndPoint";
    }
}
