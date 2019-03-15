package comsorrgrif.github.steakberriesclub;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by griffinsorrentino on 2017-01-23.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm, String pager){
        super(fm);
        setPager(pager);
    }

    String pager = "";

    public Fragment getItem(int position)
    {
        switch(pager) {
            case "venison":
                //name weight value description regen val
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Venison", 2, 5, "raw piece of venison", 5, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Steak", 2, 10, "Venison steak, cooked to perfection", 10, "cooked");
                }

            case "berries":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Berries", 2, 5, "Looks like it might be blueberries", 5, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Jelly", 3, 10, "Blue Jelly, hope its not poisonous", 10, "cooked");
                }

            case "garbage":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Garbage", 2, -4, "A pile of trash, looks yummy!", -1, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Flaming Garbage", 1, -6, "That yummy trash from before, now with extra flames!", -5, "cooked");
                }

            case "noodle":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Noodles", 2, 3, "Raw ramen, you feel like a college student", 2, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Cooked Noodles", 1, -2, "Cooked ramen but now with a side of $40,000 in debt!", 5, "cooked");
                }

            case "apple":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Apple", 2, 3, "An apple a day...", 5, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Apple Crisp", 5, 10, "Delicious apple crisp!", 15, "cooked");
                }

            case "beef":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Beef", 2, 5, "Looks like it might be some beef", 5, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Beef", 4, 15, "mmm...Looks Delicious", 10, "cooked");
                }

            case "egg":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Egg", 2, 3, "Raw egg, doesn't look rotten.", 3, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Boiled Egg", 2, 5, "A boiled egg.", 5, "cooked");
                }

            case "momsSpaghetti":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Mom's Spaghetti", 40, 1, "It's Mom's Spaghetti! Knees weak arms are heavy! Never forgetti!", 10, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Mom's Refried Spaghetti", 5, 10, "It's still Mom's Spaghetti, but refried! Never forgetti!", 11, "cooked");
                }

            case "rawBacon":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Raw Bacon", 10, 10, "a bunch of Raw Bacon", 8, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Cooked Bacon", 10, 15, "a bunch of Cooked Bacon", 20, "cooked");
                }

            case "frozenTVDinner":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Frozen Meal", 3, 4, "A TV dinner. Somehow still frozen.", 5, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("TV Dinner - Cooked", 3, 5, "A TV dinner that you have cooked.", 10, "cooked");
                }

            case "roadkill":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Roadkill", 2, 5, "A piece of roadkill. It is covered in a gross slime.", 5, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Extra dead roadkill", 2, 10, "A less slimy, more dead version of the roadkill you had before.", 10, "cooked");
                }

            case "chicken":
                switch (position)
                {
                    case 1:
                        return ViewPagerContentFragment.newInstance("Raw Chicken", 2, 5, "Uncooked slimey Chicken!", 10, "raw");
                    case 0:
                        return ViewPagerContentFragment.newInstance("Oily Fried Chicken With Kentucky Based Spices", 2, 10, "Fried Chicken with Kentucky based spices, deep fried to perfection!", 10, "cooked");
                }

            default: return ViewPagerContentFragment.newInstance("Berries", 2, 5, "Looks like it might be blueberries", 5, "raw");
        }
    }

    public void setPager(String pager)
    {
        this.pager = pager;
    }
    public int getCount(){
        return 2;
    }
}