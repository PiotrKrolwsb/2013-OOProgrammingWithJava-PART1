
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() 
    {
        this.meals = new ArrayList<String>();
    }
    public void addMeal(String meal)
    {
      
        if(meals.contains(meal))
        {}    
            else
                meals.add(meal);
        
    }
    public void printMeals()
    {
        for(String posilek : meals)
            System.out.println(posilek);
    }
    public void clearMenu()
    {
        meals.removeAll(meals);
    }

    // add the methods here
}
