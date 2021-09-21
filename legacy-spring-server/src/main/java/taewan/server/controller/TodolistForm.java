package taewan.server.controller;

public class TodolistForm {
    private Long plan_id;
    private String todo;
    private String todo_data;

    public String getTodo_data() {
        return todo_data;
    }

    public String getTodo() {
        return todo;
    }

    public Long getPlan_id() {
        return plan_id;
    }

    public void setTodo_data(String todo_data) {
        this.todo_data = todo_data;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public void setPlan_id(Long plan_id) {
        this.plan_id = plan_id;
    }
}
