public class Rabbit {
    public int rabbitLocation = 1;

    public void move() {
        int move = (int) (Math.random() * 10);

        switch (move) {
            case 0:
            case 1:
                break;
            case 2:
            case 3:
                rabbitLocation = rabbitLocation + 9;
                if (rabbitLocation > 20) {
                    rabbitLocation = 20;
                }
                break;
            case 4:
                if (rabbitLocation <= 12) {
                    rabbitLocation = 1;
                } else {
                    rabbitLocation = rabbitLocation - 12;
                }
                break;
            case 5:
            case 6:
            case 7:
                rabbitLocation = rabbitLocation + 1;
                break;
            case 8:
            case 9:
                if (rabbitLocation <= 2) {
                    rabbitLocation = 1;
                } else {
                    rabbitLocation = rabbitLocation - 2;
                }
                break;
        }
    }
}
