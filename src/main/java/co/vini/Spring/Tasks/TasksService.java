package co.vini.Spring.Tasks;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasksService {

    private TaskRepository taskRepository;

    public TasksService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    //create
    public TaskModel createTask(TaskModel taskModel){
        return taskRepository.save(taskModel);
    }

    //read
    public List<TaskModel> listTask(){
        return taskRepository.findAll();
    }

    //read(by id)
    public TaskModel listTaskById(Long id){
        Optional<TaskModel> taskModelOptional = taskRepository.findById(id);
        return taskModelOptional.orElse(null);
    }

    //update

    //delete
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
