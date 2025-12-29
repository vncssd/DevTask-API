package co.vini.Spring.Developer;

import co.vini.Spring.Tasks.TaskModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DevDTO {

    private Long id;
    private String name;
    private String email;
    private String role;
    private String pfpUrl;
    private TaskModel tasks;
    private String rank;
    
}
