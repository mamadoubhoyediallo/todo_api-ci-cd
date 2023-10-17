package sn.finapps.restaurant.services;

import org.springframework.http.ResponseEntity;
import sn.finapps.restaurant.model.Costumer;
import sn.finapps.restaurant.object.Message;

import java.util.List;

public interface ICostumerService {
    ResponseEntity<Message> save(Costumer costumer);
    Costumer update(Costumer costumer);
    List<Costumer> findAll();
    Costumer findById(Long id);
    void deleteById(Long id);
}
