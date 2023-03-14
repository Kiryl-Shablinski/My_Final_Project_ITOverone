package com.example.my_final_project.repos;

import com.example.my_final_project.models.RecieveModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReciveRepo extends CrudRepository<RecieveModel,Long> {

}
