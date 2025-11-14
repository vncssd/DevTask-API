package co.vini.Spring.Developer;

import co.vini.Spring.Tasks.TaskModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_register")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DevModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String role;

    @Column(name="pfp_url")
    private String pfpUrl;

    @ManyToOne//many tasks to one developer
    @JoinColumn(name = "tasks_id") //Foreign key
    private TaskModel tasks;

}
