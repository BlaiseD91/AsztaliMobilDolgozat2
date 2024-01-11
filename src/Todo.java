/*
* File: Todo.java
* Author: Székely Balázs Csaba
* Copyright: 2024, Székely Balázs Csaba
* Group: Szoft II/I/E
* Date: 2024-01-11
* Github: https://github.com/BlaiseD91
* Licenc: GNU GPL
*/

public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;
    
    
    public Todo(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }


    public int getUserId() {
        return userId;
    }


    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }


    public boolean isCompleted() {
        return completed;
    }

    

}
