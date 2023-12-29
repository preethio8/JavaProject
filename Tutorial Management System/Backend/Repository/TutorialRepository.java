package com.example.Tutorial_ManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Tutorial_ManagementSystem.Model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer>{

	List<Tutorial> findByemail(String input);
}
