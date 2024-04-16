import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class BlogTest {

    @Test
    public void testAddPost() {
        // Create a new Blog object
        Blog blog = new Blog();

        // Create a new Post object
        String title = "Test Title";
        String content = "Test Content";
        Post post = new Post(title, content);

        // Add the post to the blog
        blog.addPost(post);

        // Check if the post was added successfully
        List<Post> posts = blog.getPosts();
        assertEquals(1, posts.size());
        assertEquals(post, posts.get(0));
    }
}

