import Classes.Part1.Interpreter;
import Classes.Part2.History;
import Classes.Part2.Memento;
import Classes.Part2.TextEditor;
import Classes.Part3.NewsAgency;
import Classes.Part3.NewsChannel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Interpreter Result: " + Interpreter.evaluate("5 + 2 - 3"));

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello ");
        history.saveState(editor.save());

        editor.type("World!");
        System.out.println("Current Text: " + editor.getText());

        editor.restore(history.getState(0));
        System.out.println("Restored Text: " + editor.getText());

        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setHeadline("Breaking News: Design Patterns in Action!");
    }
}
