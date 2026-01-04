package co.vini.Spring.Tasks;


import co.vini.Spring.Developer.DevModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table (name = "tb_tasks")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "developer")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String level;

    @OneToMany(mappedBy = "tasks") //one task to many devs
    @JsonIgnore
    private List<DevModel> developer;
}
