import hu.szit.Client;

public class TodoService {

    private Client client;
    private String url = "https://jsonplaceholder.typicode.com/todos";

    public TodoService() {
        client = new Client();
        getTodosFromRestAPI();
    }

    public String getTodosFromRestAPI(){
        String result = client.get(url);
        System.out.println(result);
        return result;
    }
}