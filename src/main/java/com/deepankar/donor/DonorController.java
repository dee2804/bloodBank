package com.deepankar.donor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/bloodBank")
public class DonorController {

    @Autowired
    private DonorRepo donorRepository;
    
    @RequestMapping(value = "/addDonor", method = RequestMethod.POST)
    public ResponseEntity addDonor(Donor newDonor) {
    	
    	/*if(donorRepository.findByDonor(newDonor))
    	{
    		return new ResponseEntity<String>("Donor "+newDonor.getName()+" already exists", HttpStatus.CONFLICT);
    	}
        return new ResponseEntity<Donor>(newDonor, HttpStatus.OK);*/
    	return new ResponseEntity<Donor>(newDonor, HttpStatus.OK);
    }
    
}
