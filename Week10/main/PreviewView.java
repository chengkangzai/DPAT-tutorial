package main;

public class PreviewView extends EditorView {
    @Override
    void show() {
        System.out.println("Show Preview");
    }

    @Override
    void hide() {
        System.out.println("Hide Preview");
    }
}
