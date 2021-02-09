package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class Comments {

    private String content;
	private User owner;
    public User user;
    
    /**
     * Default constructor
     */
    public Comments() {
    }

    /**
     * 
     */

    /**
     * @return
     */
    public String getContent() {
        // TODO implement here
        return content;
    }

    /**
     * @param content 
     * @return
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return
     */
    public User getOwner() {
        // TODO implement here
        return owner;
    }

    /**
     * @param owner 
     * @return
     */
    public void setOwner(User owner) {
        this.owner = owner;
    }
    /**
   	 * @return the user
   	 */
   	public User getUser() {
   		return user;
   	}

   	/**
   	 * @param user the user to set
   	 */
   	public void setUser(User user) {
   		this.user = user;
   	}


}