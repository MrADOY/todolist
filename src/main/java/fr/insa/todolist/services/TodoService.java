package fr.insa.todolist.services;

import fr.insa.todolist.models.Todo;
import fr.insa.todolist.repositories.TodoRepository;
import fr.insa.todolist.ressources.TodoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Classe permettant de faire des traitements
 * supplémentaires
 */
@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getListTodoByEtatAvancement(String etatAvancement) {
        return this.todoRepository.findByEtatAvancement(etatAvancement);
    }

    public Todo saveTodo(TodoRequest todoRequest) {
        Todo toSave = new Todo();
        toSave.setNom(todoRequest.getNom());
        toSave.setEtatAvancement(todoRequest.getEtatAvancement());
        return this.todoRepository.save(toSave);
    }
}
