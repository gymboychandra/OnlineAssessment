package com.wipro.onlineassesment;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
	public User findByEmailId(String emailId);
	public User findByPassword(String password);
	public List <User> findAllSorted();

}
