/*
* File: TodoService.java
* Author: Székely Balázs Csaba
* Copyright: 2024, Székely Balázs Csaba
* Group: Szoft II/I/E
* Date: 2024-01-11
* Github: https://github.com/BlaiseD91
* Licenc: GNU GPL
*/

import java.util.ArrayList;

import hu.szit.Client;
import hu.szit.Convert;

public class TodoService {

    private Client client;
    private String url = "https://jsonplaceholder.typicode.com/todos";
    private ArrayList<Todo> todos;

    public TodoService() {
        client = new Client();
        getTodos();
        showTodos();
    }

    public void getTodos(){
        String result = client.get(url);
        todos = Convert.toListObject(result, Todo.class);
    }

    public void showTodos(){
        for (Todo todo : todos) {
            System.out.println("UserID: " + todo.getUserId());
            System.out.println("ID: " + todo.getId());
            System.out.println("Title: " + todo.getTitle());
            System.out.println("Completed: " + todo.isCompleted() +"\n\n");
        }
    }
}