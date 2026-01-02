package co.vini.Spring.Tasks;

import co.vini.Spring.Developer.DevModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskMapper {

    public TaskModel map(TaskDTO taskDTO){

        TaskModel taskModel = new TaskModel();

        taskModel.setId(taskDTO.getId());
        taskModel.setLevel(taskDTO.getLevel());
        taskModel.setName(taskDTO.getName());
        taskModel.setDeveloper(taskDTO.getDeveloper());

        return taskModel;

    }

    public TaskDTO map(TaskModel taskModel){

        TaskDTO taskDTO = new TaskDTO();

        taskDTO.setId(taskModel.getId());
        taskDTO.setLevel(taskModel.getLevel());
        taskDTO.setName(taskModel.getName());
        taskDTO.setDeveloper(taskModel.getDeveloper());

        return taskDTO;

    }

}
