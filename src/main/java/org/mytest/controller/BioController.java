package org.mytest.controller;

import org.mytest.Exception.LoginFailExeption;
import org.mytest.Exception.ResourceNotFoundExeption;

import org.mytest.Repo.BioRepo;
import org.mytest.model.Bio;
import org.mytest.model.DTO.BiodataRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1.0/User")
public class BioController {
    @Autowired
    private BioRepo bioRepo;

    @GetMapping("/userdetail/{userid}")
    public ResponseEntity<Bio> getUserById(@PathVariable(value = "userid")Long userid) throws ResourceNotFoundExeption{
        Bio biodata = bioRepo.getbyUserid(userid).orElseThrow(()-> new ResourceNotFoundExeption("data tidak ditemukan"));
        return ResponseEntity.ok().body(biodata);
    }
    @PostMapping("/createuserdetail")
    public Bio createUser(@Valid @RequestBody Bio bio){
        return bioRepo.save(bio);
    }

    @PutMapping("/userdetail/{id}")
    public ResponseEntity<Bio> updateBio(@RequestBody BiodataRequest biorequest, @PathVariable(value = "userid")Long userid) throws ResourceNotFoundExeption,LoginFailExeption {
        Bio biodata = bioRepo.getbyUserid(userid).orElseThrow(()-> new ResourceNotFoundExeption("data tidak ditemukan"));
        biodata.setAddress(biorequest.getAddress());
        biodata.setFirstName(biorequest.getFirstName());
        biodata.setMiddleName(biorequest.getMiddleName());
        biodata.setLastName(biorequest.getLastName());
        biodata.setDOB(biorequest.getDOB());
        biodata.setPOB(biorequest.getPOB());
        biodata.setDateUpdated(biorequest.getDateUpdated());
        final Bio updatedbio=bioRepo.save(biodata);
        return ResponseEntity.ok().body(updatedbio);


    }

}
