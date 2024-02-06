public abstract class Widget {
    Widget (int height, int width){

    }
    void render(){
        System.out.println("Rendering!!!");
    }
}

class Button extends Widget {

    Button(int height, int width) {
        super(height, width);
    }
}

class TextField extends  Widget {

    TextField(int height, int width) {
        super(height, width);
    }
}