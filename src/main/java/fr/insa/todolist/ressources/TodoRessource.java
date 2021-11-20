package fr.insa.todolist.ressources;

import fr.insa.todolist.models.Todo;
import fr.insa.todolist.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos")
public class TodoRessource {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos(@RequestParam(
            name = "etatAvancement",
            required = false,
            defaultValue = "TODO") String etatAvancement) {
        return this.todoService.getListTodoByEtatAvancement(etatAvancement);
    }

    @PostMapping
    public Todo createTodo(@RequestBody TodoRequest todoRequest) {
        return this.todoService.saveTodo(todoRequest);
    }

}
