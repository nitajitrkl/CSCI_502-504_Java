import java.util.ArrayList;

public class WidgetTester {
    public static void main(String[] args) {
        ArrayList<Widget> widgets = new ArrayList<>();

        widgets.add(new Button(15, 16, "Button"));
        widgets.add(new TextField(15, 16, "Text"));
        widgets.add(new Dropdown(15, 16, new String[]{"Hello", "World"}));

        Form sample = new Form();
        for (Widget widget : widgets){
            sample.addWidget(widget);
        }
        sample.renderForm();
    }
}