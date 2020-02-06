package com.deepankar.bloodBank.donor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepankar.bloodBank.donor.Donor;

@Repository
	public interface DonorRepo extends JpaRepository<Donor, Long>{

	//  boolean findByDonor(Donor donor);

//	  Customer findById(long id);
	}