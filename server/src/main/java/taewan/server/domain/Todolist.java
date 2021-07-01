package taewan.server.domain;

import javax.persistence.*;

@Entity
public class Todolist {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;
    private String todo;
    private String todo_data;

    public Long getId() {
        return id;
    }

    public Plan getPlan() {
        return plan;
    }

    public String getTodo() {
        return todo;
    }

    public String getTodo_data() {
        return todo_data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public void setTodo_data(String todo_data) {
        this.todo_data = todo_data;
    }
}
