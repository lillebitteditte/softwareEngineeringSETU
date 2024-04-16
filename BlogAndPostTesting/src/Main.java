public class Main {
    public static void main(String[] args) {
        Blog myBlog = new Blog();

        // Creating a new post
        Post newPost = new Post("First Post", "This is my first post on the blog.");

        // Adding the post to the blog
        myBlog.addPost(newPost);

        // Displaying all posts
        myBlog.displayPosts();
    }
}
