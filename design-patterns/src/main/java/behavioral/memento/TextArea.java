package behavioral.memento;

public class TextArea {
    private String text;

    public void setText(String text) {
        this.text = text;
        System.out.println("Text set to: " + text);
    }

    public Memento takeSnapshot() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedText();
        System.out.println("Text set to: " + text);
    }

    // The purpose for Memento inner class is take snapshots with full access to the object state
    public static class Memento {
        private final String text;

        private Memento(String textToSave) {
            this.text = textToSave;
        }

        // It should be accessible only by the outer class
        private String getSavedText() {
            return text;
        }
    }
}
