package org.springframework.samples.petclinic.care;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CareService {  
	
	
	@Autowired
	private CareProvisionRepository careProvisionRepository;

	
	@Transactional
    public List<Care> getAllCares(){
        return careProvisionRepository.findAllCares();
    }

	@Transactional
    public List<Care> getAllCompatibleCares(String petTypeName){
        return careProvisionRepository.findCompatibleCares(petTypeName);
    }
	@Transactional
    public Care getCare(String careName) {
        return careProvisionRepository.findCareByName(careName);
    }

    
    public CareProvision save(CareProvision p) throws NonCompatibleCaresException, UnfeasibleCareException {
        return null;   
    }

    public List<CareProvision> getAllCaresProvided(){
        return null;
    }

    public List<CareProvision> getCaresProvided(Integer visitId){
        return null;

    }
    
}
