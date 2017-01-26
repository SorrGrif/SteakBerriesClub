package comsorrgrif.github.steakberriesclub;

/**
 * Created by griffinsorrentino on 2017-01-26.
 */

public class BearInfo {

    private String title;
    private String description;


    public BearInfo(String title, String description)
    {
        this.title = title;
        this.description = description;
    }
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
