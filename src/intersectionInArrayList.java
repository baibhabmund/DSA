import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
public class intersectionInArrayList {
    public static void main(String args[]) {

  //      Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        list2.add(5);
        list2.add(15);
        list2.add(25);
        list2.add(35);
        int count=0;
        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i) == list2.get(j)){
                    //System.out.println(li);
                   // list1.get(i);
                    System.out.println(list1.get(i));
                    count++;
                }

            }

            //System.out.println("No Intersection");
        }
        if(count == 0){
            System.out.println("No Intersection");
        }
    }
}
