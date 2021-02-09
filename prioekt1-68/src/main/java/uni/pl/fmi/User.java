package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class User {

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    public Set<Novel> novels = new HashSet<>();
    public Set<Comments> comments = new HashSet<>();
    
    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */

    /**
     * @return
     */
    public String getUsername() {
        // TODO implement here
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public String getFirstName() {
        // TODO implement here
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        // TODO implement here
        return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public Set<Novel> getNovels() {
        // TODO implement here
        return novels;
    }

    /**
     * @param novel 
     * @return
     */
    public void setNovels(Set<Novel> novel) {
        this.novels = novel;
    }

    /**
     * @return
     */
    public Set<Comments> getComments() {
        // TODO implement here
        return comments;
    }

    /**
     * @param comments 
     * @return
     */
    public void setComments(Set<Comments> comments) {
        this.comments = comments;
    }

    /**
     * @param novel 
     * @return
     */
    public void addNovel(Novel novel) {
        this.novels.add(novel);
    }

    /**
     * @param comments 
     * @return
     */
    public void addComments(Comments comments) {
        this.comments.add(comments);
    }

}