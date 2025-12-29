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
    public DevDTO createDev(@RequestBody DevDTO dev) {
        return devService.createDev(dev);
    }

    //Read
    @GetMapping("/list")
    public List<DevDTO> readAll(){
        return devService.listDevs();
    }

    //List by ID
    @GetMapping ("/list/{id}")
    public DevDTO listDevsById(@PathVariable Long id){
        return devService.listDevsById(id);
    }

    //Update
    @PutMapping("/update/{id}")
    public DevDTO update(@PathVariable Long id, @RequestBody DevDTO devModelUpdated){
        return devService.updateDev(id,devModelUpdated);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public void deleteByID(@PathVariable Long id){
        devService.deleteDev(id);
    }

 }
