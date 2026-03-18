package com.example.springbootassignment1.repositories;
import com.example.springbootassignment1.entities.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITraineeRepository extends JpaRepository<Trainee, Integer> {

    List<Trainee> findByTraineeName(String traineeName);
}