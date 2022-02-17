package main;
public class Editor {
    private EditorView mode;

    public void show() {
        mode.show();
    }

    public void hide() {
        mode.hide();
    }

    public EditorView getMode() {
        return mode;
    }

    public void setMode(EditorView mode) {
        this.mode = mode;
    }
}
