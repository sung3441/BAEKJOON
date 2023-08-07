import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        String back = "";

        while (n-- > 0) {
            String[] commands = br.readLine().split(" ");
            if ("push".equals(commands[0])) {
                queue.add(commands[1]);
                back = commands[1];
            } else if ("pop".equals(commands[0])) {
                sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
            } else if ("size".equals(commands[0])) {
                sb.append(queue.size()).append("\n");
            } else if ("empty".equals(commands[0])) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            } else if ("front".equals(commands[0])) {
                sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
            } else if ("back".equals(commands[0])) {
                sb.append(queue.isEmpty() ? -1 : back).append("\n");
            }
        }

        System.out.println(sb);
    }
}