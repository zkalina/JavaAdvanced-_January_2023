package javaAdvanced.regularExam;

import java.util.*;
import java.util.stream.Collectors;

public class _1_ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> textiles = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer :: parseInt)
                .collect(Collectors.toCollection(ArrayDeque:: new));

        List<Integer> medicaments = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer :: parseInt)
                .collect((Collectors.toList()));

        Map<String, Integer> healingItems = new TreeMap<>();

        while(!textiles.isEmpty() && !medicaments.isEmpty()){
            int currentTextiles = textiles.peek();
            int currentMedicaments = medicaments.get(medicaments.size() - 1);

           int healingItem = currentTextiles + currentMedicaments;

           if(healingItem == 30){
               if(!healingItems.containsKey("Patch")){
                   healingItems.put("Patch", 0);
               }
               healingItems.put("Patch", healingItems.get("Patch") + 1);
                textiles.pop();
                medicaments.remove((medicaments.size() - 1));

           }else if(healingItem == 40){
               if(!healingItems.containsKey("Bandage")){
                   healingItems.put("Bandage", 0);
               }
               healingItems.put("Bandage", healingItems.get("Bandage") + 1);
               textiles.pop();
               medicaments.remove((medicaments.size() - 1));

           }else if(healingItem == 100) {
               if(!healingItems.containsKey("MedKit")){
                   healingItems.put("MedKit", 0);
               }
               healingItems.put("MedKit", healingItems.get("MedKit") + 1);
               textiles.pop();
               medicaments.remove((medicaments.size() - 1));

           }else if(healingItem > 100){
                   healingItems.put("MedKit", healingItems.get("MedKit") + 1);
                   int remainingResource = healingItem - 100;
               medicaments.remove((medicaments.size() - 1));
                   medicaments.set(medicaments.size() - 1, medicaments.get(medicaments.size() - 1) + remainingResource);
               textiles.pop();

               } else {

               medicaments.set(medicaments.size() - 1, medicaments.get(medicaments.size() - 1) + 10);

               textiles.pop();
           }

        }

        if(textiles.isEmpty() && medicaments.isEmpty()){
            System.out.println("Textiles and medicaments are both empty.");
        }else if(textiles.isEmpty()){
                System.out.println("Textiles are empty.");
            }else {
                System.out.println("Medicaments are empty.");
            }

//                healingItems.entrySet().removeIf(entry -> entry.getValue().equals(0));


                healingItems.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                                    forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));



            if(!textiles.isEmpty()){
                String remainingTextiles = textiles.stream().map(String :: valueOf).collect(Collectors.joining(", "));
                System.out.printf("Textiles left: %s%n", remainingTextiles);
            }else if(!medicaments.isEmpty()){
            String remainingMedicaments = medicaments.stream().map(String :: valueOf).collect(Collectors.joining(", "));
            System.out.printf("Medicaments left: %s%n", remainingMedicaments);
        }


    }
}
