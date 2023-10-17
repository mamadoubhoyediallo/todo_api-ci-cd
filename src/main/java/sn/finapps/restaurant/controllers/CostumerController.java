package sn.finapps.restaurant.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.finapps.restaurant.model.Costumer;
import sn.finapps.restaurant.object.Message;
import sn.finapps.restaurant.services.ICostumerService;

import java.util.List;

@RestController
@RequestMapping("costumer")
@CrossOrigin("*")
public class CostumerController {
    private final ICostumerService costumerService;

    public CostumerController(ICostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @PostMapping("/save")
    public ResponseEntity<Message> save(@RequestBody Costumer costumer){

        return new ResponseEntity<>(costumerService.save(costumer).getBody(), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<Costumer> costumers = costumerService.findAll();
        return new ResponseEntity<>(costumers, HttpStatus.OK);
    }

    @GetMapping("findById/{id}")
    public Costumer findById(@PathVariable Long id){
        return costumerService.findById(id);
    }

    @DeleteMapping("findById/{id}")
    public void deleteById(@PathVariable Long id){
         costumerService.deleteById(id);
    }
}
