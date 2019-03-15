package comsorrgrif.github.steakberriesclub;

/**
 * Created by griffinsorrentino on 2017-01-26.
 */

/**
 * this hosts the title and description for the bear info
 */
public class BearInfo {

    //for each bear info there is a title and description
    private String title;
    private String description;

    //basic constructor to add values to the title and description
    public BearInfo(String title, String description)
    {
        this.title = title;
        this.description = description;
    }
    //generic getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
