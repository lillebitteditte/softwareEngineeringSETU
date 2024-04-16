import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void displayPosts() {
        for (Post post : posts) {
            System.out.println("Title: " + post.getTitle());
            System.out.println("Content: " + post.getContent());
            System.out.println("---------------------------");
        }
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
