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
    public DevModel createDev(@RequestBody DevModel devModel) {
        return devService.createDev(devModel);
    }

    //Read
    @GetMapping("/list")
    public List<DevModel> readAll(){
        return devService.listDevs();
    }

    //List by ID
    @GetMapping ("/list/{id}")
    public DevModel listDevsById(@PathVariable Long id){
        return devService.listDevsById(id);
    }

    //Update
    @PutMapping("/edit")
    public String editByID(){
        return "Editing by ID...";
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public void deleteByID(@PathVariable Long id){
        devService.deleteDev(id);
    }

 }
