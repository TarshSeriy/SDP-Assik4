package Classes.Part2;

public class Memento {
    private final String text;

    public Memento(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}