package co.vini.Spring.Tasks;

import org.springframework.web.bind.annotation.*;

@RequestMapping("tasks")
@RestController
public class TasksController {

    @PostMapping("/add")
    public String createTask(){
        return "task created successfully";
    }

    @PutMapping("/edit")
    public String editTask(){
        return "task edited successfully";
    }

    @DeleteMapping("/delete")
        public String deleteTask(){
            return "task deleted successfully";
    }

    @GetMapping("/list")
    public String listTasks(){
        return "all tasks listed";
    }

}
