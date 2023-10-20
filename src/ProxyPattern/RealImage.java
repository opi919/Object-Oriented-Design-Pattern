package ProxyPattern;

public class RealImage implements Image{
    String fileName;

    public RealImage(String fileName){
        this.fileName =   fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
