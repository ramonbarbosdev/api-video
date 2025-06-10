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
    private int nu_capacidade;
    private String tp_status;
    private int nu_ocupante;
    private String imageUrl;

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

    public int getNu_capacidade() {
        return nu_capacidade;
    }

    public void setNu_capacidade(int nu_capacidade) {
        this.nu_capacidade = nu_capacidade;
    }

    public String getTp_status() {
        return tp_status;
    }

    public void setTp_status(String tp_status) {
        this.tp_status = tp_status;
    }

    public int getNu_ocupante() {
        return nu_ocupante;
    }

    public void setNu_ocupante(int nu_ocupante) {
        this.nu_ocupante = nu_ocupante;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
}
