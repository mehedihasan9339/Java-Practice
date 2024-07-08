import java.util.ArrayList;
import java.util.List;

public class TodoManager {
    private List<Todo> todos;
    private int nextId;

    public TodoManager() {
        todos = new ArrayList<>();
        nextId = 1;
    }

    public void addTodo(String description) {
        Todo todo = new Todo(nextId++, description);
        todos.add(todo);
    }

    public void markTodoAsCompleted(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setCompleted(true);
                return;
            }
        }
    }

    public void removeTodo(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public List<Todo> getTodos() {
        return todos;
    }
}
