import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DispositionLevel {
    /*
    Persistence. 1-10
    Agility and flexibility. 1-10
    Motivation and drive to learn. 1-10
    Metacognition 1-10
    Problem-solving and questioning. 1-10
    */
    private Map<String, Integer> dispositionLevel = new HashMap<>();
    /* keys are the characteristics (e.g., "Persistence") and the values are the corresponding grades.*/
    public DispositionLevel(){
        dispositionLevel.put("Persistence", 0);
        dispositionLevel.put("Agility and flexibility", 0);
        dispositionLevel.put("Motivation and drive to learn", 0);
        dispositionLevel.put("Metacognition", 0);
        dispositionLevel.put("Problem-solving and questioning", 0);
    }
    public void viewDispositionLevel(){
        Scanner in = new Scanner(System.in);
       for (String ans: dispositionLevel.keySet()){
           System.out.print("Please enter grade for " + ans + ":  ");
           int value = in.nextInt();
           if(value >= 1 && value <= 10 ){
               dispositionLevel.put(ans, value);
           }
           else{
               System.out.println("Invalid grade, please enter value between 1 and 10");
           }
       }
        System.out.println("----------------------------");
        System.out.println("System entered this values: ");
        for(Map.Entry<String, Integer> entry : dispositionLevel.entrySet()){
            System.out.println(entry.getKey()+": " +entry.getValue());
        }

    }

}
