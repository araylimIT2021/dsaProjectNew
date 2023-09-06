import java.util.ArrayList;
import java.util.List;

public class BloomLevel {
    private List<String> bloomLevel = new ArrayList<>();


    public BloomLevel(){
        bloomLevel.add("Remember");
        bloomLevel.add("Understand");

    }
    public void viewBloomLevels(){

        if(getLevels().isEmpty()){
            System.out.println("We couldn't find any  bloom levels.");
        }
        else{
            System.out.println("Bloom levels: ");
            for(String ans: getLevels()){
                System.out.println(ans);
            }
        }

    }
    public List<String> getLevels(){
        return bloomLevel;
    }
    public void addBloomLevel(String levelName){
        if (bloomLevel.contains(levelName)){
            System.out.println("Given bloom level already exist");;
            //if given bloom level exist return -1
        }
        else{
            bloomLevel.add(levelName);
            System.out.println("Bloom level: " + levelName + " added. ");
        }
    }
    public void removeBloomLevel(String levelName){
        if (bloomLevel.contains(levelName)){
            bloomLevel.remove(levelName);
            System.out.println("Bloom level: " + levelName + " removed.  ");
        }
        else{
            System.out.println("Given bloom level doesn't  exist");
        }

    }
}
