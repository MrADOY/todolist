package fr.insa.todolist.repositories;

import fr.insa.todolist.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, String> {
    public List<Todo> findByEtatAvancement(String etatAvancement);
}
