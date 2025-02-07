import java.util.ArrayList;
public class FrequencyOfElement{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        //int count = 1;
        boolean[] visited = new boolean[list.size()];
        for(int i = 0; i < list.size(); i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    visited[j] = true;
                }
            }
                System.out.println("Number = " + list.get(i) + " Frequency = " + count);

        }

    }
}