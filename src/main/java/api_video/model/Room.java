package api_video.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "room")
public class Room {
    
    @Id
    private String id_room;
    private String nm_room;
    private String ds_room;
    private String nu_capacidade;
}
