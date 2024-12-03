package behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
    private Deque<TextArea.Memento> stateHistory;
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

    public static void main(String[] args) {
        Editor editor = new Editor(new TextArea());
        editor.write("Hello World");
        editor.write("Bye World");
        editor.undo();
    }
}
