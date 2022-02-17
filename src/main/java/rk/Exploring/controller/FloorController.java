package rk.Exploring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rk.Exploring.model.Floor;
import rk.Exploring.repo.FloorRepo;
import rk.Exploring.service.FloorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exploring")
public class FloorController {

    private final FloorService floorService;

    @Autowired
    private FloorRepo floorRepo;

    public FloorController(FloorService floorService) {
        this.floorService = floorService;
    }

    @GetMapping("/allfloor")
    public ResponseEntity<List<Floor>> getAllFloor(){
        List<Floor> floors= (List<Floor>) floorService.findAllFloor();
        return new ResponseEntity<>(floors, HttpStatus.OK);
    }

    @GetMapping("/floor/{id}")
    public ResponseEntity<Floor> getFloorById(@PathVariable("id") Long id){
        Floor floor = floorService.getFloorById(id);
        return new ResponseEntity<>(floor, HttpStatus.OK);
    }

    @PostMapping("/addfloor")
    public ResponseEntity<Floor> addFloor(@RequestBody Floor floor){
        Floor floors = floorService.addFloor(floor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/updatefloor")
    public ResponseEntity<Floor> updateFloor(@RequestBody Floor floor){
        Floor floors = floorService.updateFloor(floor);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFloor(@PathVariable("id") Long id) {
        floorService.deleteFloor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
