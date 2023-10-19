package sn.finapps.restaurant.services.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import sn.finapps.restaurant.constant.Constants;
import sn.finapps.restaurant.model.Costumer;
import sn.finapps.restaurant.object.Message;
import sn.finapps.restaurant.repositories.CostumerRepo;
import sn.finapps.restaurant.services.ICostumerService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class CostumerServiceImpl implements ICostumerService {

    private CostumerRepo costumerRepo;

    @Override
    public ResponseEntity<Message> save(Costumer costumer) {
        Message message = new Message();
        Optional<Costumer> getEmail = costumerRepo.findByEmail(costumer.getEmail());

        // Test if email exist using Optional
        if (getEmail.isPresent()){
            message.setMsg(Constants.MSG_EMAIL_EXIST);
            message.setStatus(HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }

        try{
            costumer = costumerRepo.save(costumer);

            if (costumer.getId() != null){
                message.setMsg(Constants.MSG_SUCCESS);
                message.setStatus(HttpStatus.OK.value());
            }else{
                message.setMsg(Constants.MSG_FAILED);
                message.setStatus(HttpStatus.BAD_REQUEST.value());
            }
            return new ResponseEntity<>(message, HttpStatus.OK);

        }catch (Exception exception){
            log.error(exception.getMessage());
            message.setMsg(Constants.MSG_SERVER_ERROR);
            message.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public Costumer update(Costumer costumer) {
        return null;
    }

    @Override
    public List<Costumer> findAll() {
        return costumerRepo.findAll();
    }

    @Override
    public Costumer findById(Long id) {
        return costumerRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        costumerRepo.deleteById(id);
    }

    @Override
    public Costumer findByEmail(String email) {
        return costumerRepo.findByEmail(email).get();
    }
}
