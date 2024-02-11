public class WidgetTester {
    public static void main(String[] args) {
        Widget w = new Widget(15, 16) {
            @Override
            public void render() {
                System.out.println("Rendereed!!!");
            }
        };
        Button b = new Button(15, 16, "Button");
        b.render();
        TextField t = new TextField(15, 16, "Text");
        t.render();
        String[] names = {"Hello", "World"};
        Dropdown d = new Dropdown(15, 16, names);
        d.render();
    }
}