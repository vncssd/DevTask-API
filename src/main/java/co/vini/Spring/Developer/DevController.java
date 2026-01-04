package co.vini.Spring.Developer;


import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dev")

public class DevController {

    private final DevService devService;

    public DevController(DevService devService) {
        this.devService = devService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> createDev(@RequestBody DevDTO dev) {
        DevDTO newDev = devService.createDev(dev);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("DEV ADDED SUCCESFULL: " + newDev.getName() + " ID: " + newDev.getId());
    }

    @GetMapping("/list")
    public ResponseEntity<List<DevDTO>> readAll(){
        List<DevDTO> listedDevs = devService.listDevs();
        return ResponseEntity.status(HttpStatus.OK)
                .body(listedDevs);
    }

    @GetMapping ("/list/{id}")
    public ResponseEntity<?> listDevsById(@PathVariable Long id){
        DevDTO dev = devService.listDevsById(id);
        if (dev != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(dev);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("DEV WITH ID " + id + " NOT FOUND");
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody DevDTO devModelUpdated){
        DevDTO dev = devService.updateDev(id,devModelUpdated);

        if (dev != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body("DEV WITH ID " + id + " UPDATED");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("DEV WITH ID " + id + " NOT FOUND");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteByID(@PathVariable Long id){
        devService.deleteDev(id);

        if (devService.listDevsById(id) != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body("DEV DELETED SUCCESFULLY ID: " + id);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("DEV WITH ID " + id + " NOT FOUND");
        }
    }

 }
