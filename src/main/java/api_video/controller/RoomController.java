package api_video.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<Room> cadastrar(@RequestBody Room room)
    {

        Room objeto = repository.save(room);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }


     @DeleteMapping(value = "/{id}", produces = "application/json" )
	public ResponseEntity<?> delete (@PathVariable("id") String id) throws Exception
	{

        if (!repository.existsById(id))
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("error", "Registro não encontrado com o ID: " + id));
        }

        repository.deleteById( id);
			
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("message","Registro deletado!"));

	}

    
}
