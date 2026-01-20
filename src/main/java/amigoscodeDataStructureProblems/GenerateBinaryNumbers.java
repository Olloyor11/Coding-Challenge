package amigoscodeDataStructureProblems;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public void generateBinaryNumbers(int n){
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.poll();
            System.out.println(current);
            String first = current + "0";
            String second = current + "1";

            queue.add(first);
            queue.add(second);

        }
    }
}
