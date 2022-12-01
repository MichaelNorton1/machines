package com.crud.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.crypto.Mac;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
   MachineRepo repo;

    @GetMapping("/machines")
    public @ResponseBody Iterable<Machine> getMachines(){
       return repo.findAll();


    }
    @PostMapping("/machines/add")
    public @ResponseBody String addNewUser( String sn,String clamp, String customer,
                                            Boolean avail,String notes){
        Machine n = new Machine(sn,clamp,customer,avail,notes);
        repo.save(n);
        return String.format("%s Saved", n.getSerialNumber());
    }


    @DeleteMapping("/machines/{sn}")
    public @ResponseBody String deleteMachine(@PathVariable("sn") String sn){
repo.deleteBySerialNumber(sn);
        return String.format("%s deleted", sn);
    };


    @PutMapping("/machines")
    public @ResponseBody Machine update( int id, Machine machine){
       Optional<Machine> m= repo.findById(id);
System.out.print(machine);
       return m.get();

    }





}
