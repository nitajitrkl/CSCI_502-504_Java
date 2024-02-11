import java.util.ArrayList;

public class DataItem {
    public DataItem(String initialData) {
        this.data = initialData;
        this.versions = new ArrayList<>();
        this.versions.add(data);
    }
    public void updateData(String newData) {
        this.data = newData;
        this.versions.add(data);
    }
    public String getDataByVersion(int versionNo) {
        if (versionNo >= 0 && versionNo < versions.size()) {
            return versions.get(versionNo);
        } else {
            return null;
        }
    }
    private String data;
    private ArrayList<String> versions;
}
class TextDataItem extends DataItem {
    public TextDataItem(String initialData, String name) {
        super(initialData);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    private final String name;
}
class ImageDataItem extends DataItem {
    public ImageDataItem(String initialData, int width, int height) {
        super(initialData);
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    private final int width;
    private final int height;
}