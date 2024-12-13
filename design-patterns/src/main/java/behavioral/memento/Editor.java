package behavioral.memento;

import lombok.Getter;

import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    @Getter
    private TextArea textArea;

    public Editor(TextArea textArea) {
        this.textArea = textArea;
        this.stateHistory = new ArrayDeque<>();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.add(textArea.takeSnapshot());
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
    }
}
