package rk.Exploring.model;
import javax.persistence.*;

@Entity
@Table(name = "Room_Configuration")
public class RoomConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
}
