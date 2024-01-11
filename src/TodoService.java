import hu.szit.Client;

public class TodoService {

    private Client client;
    private String url = "https://jsonplaceholder.typicode.com/todos";

    public TodoService() {
        client = new Client();
        getTodos();
    }

    public String getTodos(){
        String result = client.get(url);
        System.out.println(result);
        return result;
    }
}