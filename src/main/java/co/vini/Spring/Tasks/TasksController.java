package co.vini.Spring.Tasks;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")

public class TasksController {

    private TasksService tasksService;

    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @PostMapping("/add")
    public TaskDTO createTask(@RequestBody TaskDTO task){
        return tasksService.createTask(task);
    }

    @PutMapping("/edit")
    public String editTask(){
        return "task edited successfully";
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Long id){
        tasksService.deleteTask(id);
    }

    @GetMapping("/list")
    public List <TaskDTO> listTasks(){
        return tasksService.listTask();
    }

    @GetMapping("/list/{id}")
    public TaskDTO listTaskById(@PathVariable Long id){
        return tasksService.listTaskById(id);
    }
}
