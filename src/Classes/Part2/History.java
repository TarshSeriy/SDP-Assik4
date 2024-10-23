package Classes.Part2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class History {
    private List<Memento> savedStates = new ArrayList<>();

    public void saveState(Memento memento){
        savedStates.add(memento);
    }

    public Memento getState(int index){
        return savedStates.get(index);
    }
}
