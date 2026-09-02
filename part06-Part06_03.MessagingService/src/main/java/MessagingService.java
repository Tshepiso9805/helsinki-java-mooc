import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message>lst;

    public MessagingService(){
        this.lst = new ArrayList<>();
    }
    public void add(Message message){
        if (message.getContent().length() <= 280){
            this.lst.add(message);
        }

    }
    public ArrayList<Message> getMessages(){
        return this.lst;
    }
}

