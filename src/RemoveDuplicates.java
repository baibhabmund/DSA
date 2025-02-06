import java.util.ArrayList;
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(30);
        list.add(40);

        int c = 0;
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    list.remove(i);
                    c++;
                }
            }

        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        if(c == 0){
            System.out.println("No Duplicates");
        }
        //System.out.println(list.get(2));
    }

}
