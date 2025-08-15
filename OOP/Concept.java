 // Interface
interface Publishable {
    void publish(); // Must be implemented by any non-abstract class
}

// Abstract class
abstract class Content {
    String title;

    Content(String title) {
        this.title = title;
    }

    void showTitle() {
        System.out.println("Title: " + title);
    }

    // Abstract method: specific content type decides how to create it
    abstract void create();
}

// Concrete class 1
class BlogPost extends Content implements Publishable {
    BlogPost(String title){
        super(title);
    }

    @Override
    void create(){
        System.out.println("Writing blog post content...");
    }

    @Override
    public void publish() {
        System.out.println("Publishing blog post online.");
    }
}

// Concrete class 2
class YouTubeVideo extends Content implements Publishable {
    YouTubeVideo(String title) {
        super(title);
    }

    @Override
    void create() {
        System.out.println("Recording and editing video content...");
    }

    @Override
    public void publish() {
        System.out.println("Uploading video to YouTube.");
    }
}

// Main class
public class Concept {
    public static void main(String[] args) {
        Publishable blog = new BlogPost("10 Java Tips");
        Publishable video = new YouTubeVideo("Learn Java in 10 Minutes");

        ((Content) blog).showTitle();
        ((Content) blog).create();
        blog.publish();

        System.out.println();

        ((Content) video).showTitle();
        ((Content) video).create();
        video.publish();
    }
}

