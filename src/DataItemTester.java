public class DataItemTester {
    public static void main(String[] args) {
        DataItem sample = new DataItem("Hello");
        sample.updateData("World");
        sample.updateData("!!!");
        System.out.println(sample.getDataByVersion(1));
        TextDataItem d = new TextDataItem("Hello", "Hi");
        System.out.println(d.getName());
        ImageDataItem i = new ImageDataItem("Hello", 15, 16);
        System.out.println(i.getHeight() + "  " + i.getWidth());
    }
}
