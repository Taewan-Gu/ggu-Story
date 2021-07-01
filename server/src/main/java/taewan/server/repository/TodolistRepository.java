package taewan.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taewan.server.domain.Todolist;

public interface TodolistRepository extends JpaRepository<Todolist, Long> {
}