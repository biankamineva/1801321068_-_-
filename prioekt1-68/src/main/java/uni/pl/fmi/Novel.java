package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class Novel {
    
    private String name;
    private String text;
    private String autor;
    public Fandom fandom;
    
    /**
     * Default constructor
     */
    public Novel() {
    }

    /**
     * 
     */

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getText() {
        // TODO implement here
        return text;
    }

    /**
     * @param text 
     * @return
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return
     */
    public String getAutor() {
        // TODO implement here
        return autor;
    }

    /**
     * @param autor 
     * @return
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

}