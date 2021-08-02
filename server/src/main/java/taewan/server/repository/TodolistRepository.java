package taewan.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taewan.server.domain.Plan;
import taewan.server.domain.Todolist;

import java.util.List;

public interface TodolistRepository extends JpaRepository<Todolist, Long> {

    List<Todolist> findByPlan(Plan plan);
}