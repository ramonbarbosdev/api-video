package api_video.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api_video.model.Room;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface RoomRepository   extends MongoRepository<Room, String> {

}