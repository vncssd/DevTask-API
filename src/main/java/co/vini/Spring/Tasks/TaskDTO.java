package co.vini.Spring.Tasks;

import co.vini.Spring.Developer.DevModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TaskDTO {

    private Long id;
    private String name;
    private String level;
    private List<DevModel> developer;

}
