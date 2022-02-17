package main;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setMode(new DesignView());
        editor.show();
        editor.hide();

        editor.setMode(new HtmlView());
        editor.show();
        editor.hide();

        editor.setMode(new PreviewView());
        editor.show();
        editor.hide();
    }
}
