public class ProxyPattern{
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded and displayed
        image.display();
        
        // Image will only be displayed (already loaded)
        image.display();
    }
}
