public class Turtle {
    public int turtleLocation = 1;

    public void move() {
        int move = (int) (Math.random() * 10);

        switch (move) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                turtleLocation = turtleLocation + 3;
                if (turtleLocation > 20) {
                    turtleLocation = 20;
                }
                break;
            case 5:
            case 6:
                if (turtleLocation > 6) {
                    turtleLocation = turtleLocation - 6;
                } else {
                    turtleLocation = 1;
                }
                break;
            case 7:
            case 8:
            case 9:
                turtleLocation = turtleLocation + 1;
                break;
        }
    }
}
