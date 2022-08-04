public class Main {
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        Turtle t = new Turtle();

        //The race will end when one of the contestants arrives at square 20.
        while (r.rabbitLocation < 20 && t.turtleLocation < 20) {

            r.move();
            t.move();

            for (int i = 1; i <= 20; i++) { //shows the status on the track
                if (r.rabbitLocation == i && t.turtleLocation == i) {
                    System.out.print("OUCH ");
                    i += 3;
                } else if (r.rabbitLocation == i) {
                    System.out.print("R ");
                } else if (t.turtleLocation == i) {
                    System.out.print("T ");
                } else {
                    System.out.print("_ ");
                }
            }

            System.out.print("\n");
            System.out.print("Rabbit: " + r.rabbitLocation);
            System.out.println("    Turtle: " + t.turtleLocation + "\n");
        }

        //Who won?
        if (r.rabbitLocation == 20 && t.turtleLocation == 20) {
            System.out.println("DRAW");
        } else if (t.turtleLocation == 20) {
            System.out.println("TURTLE WON THE RACE , YUPPIII !");
        } else {
            System.out.println("RABBIT WON THE RACE, HUH !");
        }
    }
}
