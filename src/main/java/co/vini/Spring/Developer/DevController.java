package co.vini.Spring.Developer;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dev")

public class DevController {

    private DevService devService;

    public DevController(DevService devService) {
        this.devService = devService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Olá Mundo! Meu Primeiro EndPoint";
    }

    //Create
    @PostMapping("/add")
    public String createDev() {
        return "Dev Registred";
    }

    //Read
    @GetMapping("/list")
    public List<DevModel> readAll(){
        return devService.listDevs();
    }

    //Update
    @PutMapping("/edit")
    public String editByID(){
        return "Editing by ID...";
    }

    //Sort by ID
    @GetMapping ("/sort")
    public String sortById(){
        return "Sorting by ID...";
    }

    //Delete
    @DeleteMapping("/delete")
    public String deleteByID(){
        return "Deleting by ID...";
    }

 }
