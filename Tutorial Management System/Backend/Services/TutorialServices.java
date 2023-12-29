package com.example.Tutorial_ManagementSystem.Services;

import java.util.List;
import java.util.Optional;

import com.example.Tutorial_ManagementSystem.Model.Tutorial;

public interface TutorialServices {  //
	
	public Tutorial addTutorial(Tutorial tutorial);
	
	public String updateTutorial(int id,Tutorial updatedValue);
	
	public Optional<Tutorial> getTutorialById(int id);
	
	public List<Tutorial> getAllTutorials();	

    public String removeTutorialById(int id);
	
	public Tutorial removeAll();
	
}
