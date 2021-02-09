package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class Fandom {
   
    public String name;
    public Set<Novel> novels = new HashSet<>();
    
    /**
     * Default constructor
     */
    public Fandom() {
    }

    /**
     * 
     */

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

	/**
	 * @return the novels
	 */
	public Set<Novel> getNovels() {
		return novels;
	}

	/**
	 * @param novels the novels to set
	 */
	public void setNovels(Set<Novel> novels) {
		this.novels = novels;
	}

}