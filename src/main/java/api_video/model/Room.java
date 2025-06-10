package api_video.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Document(collection = "room")
public class Room {
    
    @Id
    private long id_room;
    private String nm_room;
    private String ds_room;
    private String nu_capacidade;

    public long getId_room() {
        return id_room;
    }
    
    public void setId_room(long id_room) {
        this.id_room = id_room;
    }

    public String getNm_room() {
        return nm_room;
    }

    public void setNm_room(String nm_room) {
        this.nm_room = nm_room;
    }

    public String getDs_room() {
        return ds_room;
    }

    public void setDs_room(String ds_room) {
        this.ds_room = ds_room;
    }

    public String getNu_capacidade() {
        return nu_capacidade;
    }

    public void setNu_capacidade(String nu_capacidade) {
        this.nu_capacidade = nu_capacidade;
    }
    
}
