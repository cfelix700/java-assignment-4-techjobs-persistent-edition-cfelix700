package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.controllers.EmployerController;
import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployerRepository extends CrudRepository<Employer, Integer> {

}
