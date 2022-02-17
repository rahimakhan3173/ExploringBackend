package rk.Exploring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rk.Exploring.exception.UserNotFoundException;
import rk.Exploring.model.Floor;
import rk.Exploring.repo.FloorRepo;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class FloorService {

    private final FloorRepo floorRepo;

    @Autowired
    public FloorService(FloorRepo floorRepo) {
        this.floorRepo = floorRepo;
    }

    public Floor addFloor(Floor floor){
        return floorRepo.save(floor);
    }

    public Floor getFloorById(Long id){
        return floorRepo.findById(id).orElseThrow(() ->
                new UserNotFoundException("User by id " + id + " was not found"));
    }
    public void deleteFloor(Long id){
        floorRepo.deleteFloorById(id);
    }

    public Iterable<Floor> findAllFloor() {
        return floorRepo.findAll();
    }

    public Floor updateFloor(Floor floor){
        return floorRepo.save(floor);
    }
}
