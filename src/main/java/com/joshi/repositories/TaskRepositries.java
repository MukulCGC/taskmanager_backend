package com.joshi.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joshi.dto.TaskDto;
import com.joshi.entities.Task;

@Repository
public interface TaskRepositries extends JpaRepository<Task, Long>{

	List<Task> findAllByTitleContaining(String title);

	List<Task>  findAllByUserId(Long id);

	//Map<String, Long> countTasksByPriority();

	//Map<String, Long> countTasksByStatus();

	//Map<String, Long> countTasksByPriorityForUser(Long id);

	//Map<String, Long> countTasksByStatusForUser(Long id);

}
