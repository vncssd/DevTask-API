package co.vini.Spring.Tasks;
import com.sun.net.httpserver.HttpsServer;
import org.apache.coyote.Response;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> createTask(@RequestBody TaskDTO task){
        TaskDTO createdTask = taskService.createTask(task);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("TASK" + createdTask.getName() + " ADDED SUCCESFULLY ID: " +createdTask.getId());
    }

    @PutMapping("/edit")
    public ResponseEntity<String> update (@PathVariable Long id, @RequestBody TaskDTO taskUpdated){
        TaskDTO task = taskService.updateTask(id, taskUpdated);

        if (task != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body("TASK WITH ID " + task.getId() + " UPDATED");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("TASK WITH ID " + task.getId() + " NOT FOUND");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);

        if (taskService.listTaskById(id) != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body("TASK WITH ID " + id + " DELETED");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("TASK WITH ID " + id + " NOT FOUND");
        }
    }

    @GetMapping("/list")
    public List <TaskDTO> listTasks(){
        return taskService.listTask();
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<?> listTaskById(@PathVariable Long id){
        TaskDTO task = taskService.listTaskById(id);
        if (task != null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(task);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("TASK WITH ID " + id + " NOT FOUND");
        }
    }
}
