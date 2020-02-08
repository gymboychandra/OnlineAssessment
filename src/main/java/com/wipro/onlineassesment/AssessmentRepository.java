package com.wipro.onlineassesment;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepository extends CrudRepository<Assessment,Long>{
	public List<Assessment> findAllSorted();

}
