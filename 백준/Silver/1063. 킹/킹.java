import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Position king = new Position(st.nextToken());
        Position stone = new Position(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        while (n-- > 0) {
            king.reset();
            stone.reset();
            
            String command = br.readLine();
            king.commandToTempPosition(command);

            if (king.validPosition()) {
                if (king.samePosition(stone)) {
                    stone.commandToTempPosition(command);
                    if (stone.validPosition()) {
                        king.move();
                        stone.move();
                    }
                    continue;
                }
                king.move();
            }
        }
        king.print();
        stone.print();
    }

    static class Position {
        char row;
        char col;
        char tempRow;
        char tempCol;

        public Position(String str) {
            this.row = str.charAt(1);
            this.col = str.charAt(0);
        }

        void move() {
            this.row = this.tempRow;
            this.col = this.tempCol;
        }
        
        void reset() {
            this.tempRow = this.row;
            this.tempCol = this.col;
        }

        void commandToTempPosition(String command) {
            char[] chars = command.toCharArray();
            for (char c : chars) {
                switch (c) {
                    case 'R':
                        this.tempCol = (char) (this.col + 1);
                        break;
                    case 'L':
                        this.tempCol = (char) (this.col - 1);
                        break;
                    case 'B':
                        this.tempRow = (char) (this.row - 1);
                        break;
                    case 'T':
                        this.tempRow = (char) (this.row + 1);
                        break;
                }
            }
        }

        boolean validPosition() {
            boolean validRow = this.tempRow >= '1' && this.tempRow <= '8';
            boolean validCol = this.tempCol >= 'A' && this.tempCol <= 'H';
            return validRow && validCol;
        }
        
        boolean samePosition(Position p) {
            return this.tempRow == p.row && this.tempCol == p.col;

        }

        void print() {
            System.out.println(this.col + "" + this.row);
        }
    }
}