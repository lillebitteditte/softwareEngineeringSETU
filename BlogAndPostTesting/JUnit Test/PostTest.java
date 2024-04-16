import org.junit.Test;
import static org.junit.Assert.*;

public class PostTest {

    @Test
    public void testPostConstructorAndGetters() {
        // Create a Post object with some test values
        String title = "Test Title";
        String content = "Test Content";
        Post post = new Post(title, content);

        // Test if the constructor initializes the title and content correctly
        assertEquals(title, post.getTitle());
        assertEquals(content, post.getContent());
    }

    @Test
    public void testSetters() {
        // Create a Post object
        Post post = new Post("", "");

        // Set new values using setters
        String newTitle = "New Title";
        String newContent = "New Content";
        post.setTitle(newTitle);
        post.setContent(newContent);

        // Test if the setters correctly update the title and content
        assertEquals(newTitle, post.getTitle());
        assertEquals(newContent, post.getContent());
    }
}

