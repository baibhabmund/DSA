import java.util.ArrayList;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> rev_list = new ArrayList<>();
        for(int i = list.size()-1; i >= 0; i--){
            rev_list.add(list.get(i));
        }
        for(int i = 0; i < rev_list.size(); i++) {
            System.out.println(rev_list.get(i));
        }
    }
}
