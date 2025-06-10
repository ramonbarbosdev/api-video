package api_video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api_video.model.Room;
import api_video.repository.RoomRepository;

@RestController
@RequestMapping(value = "/rooms")
public class RoomController {

    @Autowired
    private RoomRepository repository;

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<List<?>> getObjeto ()
    {
         List<Room> rooms = repository.findAll();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    
}
