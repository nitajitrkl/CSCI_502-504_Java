import java.util.ArrayList;

abstract class Widget {
    Widget (int height, int width){
        this.height = height;
        this.width = width;
    }
    private final int height;
    private final int width;
    public abstract void render();
}
class Button extends Widget {
    Button(int height, int width, String buttonName) {
        super(height, width);
        this.buttonName = buttonName;
    }
    public void render(){
        System.out.println(buttonName + " Rendering NOW!!!");
    }
    private final String buttonName;
}
class TextField extends  Widget {
    TextField(int height, int width, String text) {
        super(height, width);
        this.text = text;
    }
    public void render (){
        System.out.println(text + " Rendering NOW!!!");
    }
    private final String text;
}
class Dropdown extends Widget {
    Dropdown(int height, int width, String[] names) {
        super(height, width);
        this.names = names;
    }
    public void render(){
        System.out.println("Below DropDown Rendering!!!");
        for (String name : names){
            System.out.println("   " + name + " Rendering NOW!!!");
        }
    }
    private final String[] names;
}
class Form {
    public void addWidget(Widget w) {
        widgets.add(w);
    }
    public void renderForm() {
        for (Widget w : widgets) {
            w.render();
        }
    }
    private ArrayList<Widget> widgets = new ArrayList<>();
}