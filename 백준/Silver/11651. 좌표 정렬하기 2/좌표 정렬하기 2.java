import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Point> points = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            points.add(new Point(split[0], split[1]));
        }

        Collections.sort(points, (p1, p2) -> {
            if (p1.y > p2.y || (p1.y == p2.y && p1.x > p2.x)) return 1;
            return -1;
        });

        for (Point point : points) {
            sb.append(point.x).append(" ").append(point.y).append("\n");
        }

        System.out.print(sb);
    }
}

class Point {
    int x;
    int y;

    public Point(String x, String y) {
        this.x = Integer.parseInt(x);
        this.y = Integer.parseInt(y);
    }
}