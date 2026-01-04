package co.vini.Spring.Tasks;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final TaskMapper taskMapper;
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    //create
    public TaskDTO createTask(TaskDTO taskDTO){
        TaskModel task = taskMapper.map(taskDTO);
        return taskMapper.map(taskRepository.save(task));
    }

    //read
    public List<TaskDTO> listTask(){
        List<TaskModel> tasks = taskRepository.findAll();
        return tasks.stream()
                .map(taskMapper::map)
                .collect(Collectors.toList());
    }

    //read(by id)
    public TaskDTO listTaskById(Long id){
        Optional<TaskModel> taskModelOptional = taskRepository.findById(id);
        return taskModelOptional.map(taskMapper::map).orElse(null);
    }

    //update
    public TaskDTO updateTask(Long id, TaskDTO task){
        Optional<TaskModel> taskModelOptional = taskRepository.findById(id);
        if(taskModelOptional.isPresent()){
            TaskModel updatedTask = taskMapper.map(task);
            updatedTask.setId(id);
            TaskModel savedTask = taskRepository.save(updatedTask);
            return taskMapper.map(savedTask);
        }
        else{
            return null;
        }
    }

    //delete
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
