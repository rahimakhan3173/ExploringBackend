package rk.Exploring.repo;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import rk.Exploring.model.Floor;

import java.util.Optional;

public interface FloorRepo extends JpaRepository<Floor, Long> , DataTablesRepository<Floor, Long> {
     void deleteFloorById(Long id);

}
