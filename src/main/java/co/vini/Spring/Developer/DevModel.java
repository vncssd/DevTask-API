package co.vini.Spring.Developer;

import co.vini.Spring.Tasks.TaskModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_register")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "tasks")
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

    @Column(name="rank")
    private String rank;

    @ManyToOne//many tasks to one developer
    @JoinColumn(name = "tasks_id") //Foreign key
    private TaskModel tasks;

}
