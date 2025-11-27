package co.vini.Spring.Developer;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()

public class DevController {

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
    public String readAll(){
        return "Listing all...";
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
