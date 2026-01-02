package co.vini.Spring.Tasks;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")

public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/add")
    public TaskDTO createTask(@RequestBody TaskDTO task){
        return taskService.createTask(task);
    }

    @PutMapping("/edit")
    public String editTask(){
        return "task edited successfully";
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }

    @GetMapping("/list")
    public List <TaskDTO> listTasks(){
        return taskService.listTask();
    }

    @GetMapping("/list/{id}")
    public TaskDTO listTaskById(@PathVariable Long id){
        return taskService.listTaskById(id);
    }
}
