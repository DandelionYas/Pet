package behavioral.memento;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class EditorTest {

    @Test
    public void testEditor() {
        Editor editor = new Editor(new TextArea());
        editor.write("Hello World");
        editor.write("Bye World");
        editor.undo();
        Assertions.assertThat(editor.getTextArea().getText()).isEqualTo("Hello World");
    }
}
