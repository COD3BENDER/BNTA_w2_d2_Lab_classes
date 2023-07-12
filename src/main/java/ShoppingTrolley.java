import java.util.ArrayList;

public class ShoppingTrolley {
    private ArrayList<String> items ;

    public ShoppingTrolley(){
        this.items = new ArrayList<>();
    }

    public void addItem(String item){
        items.add(item);
    }
    public int countItemsInTrolley(){
        return items.size();
    }
    public boolean checkIfIteminTrolley(String item){
        if(items.contains(item)){
            return true;
        }
        return false;
    }
}
