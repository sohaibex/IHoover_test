enum Orientations {
    N,
    E,
    W,
    S,
}
public class Hoover {
    private int x;
    private int y;
    private int gridX;
    private int gridY;
    private Orientations orientations;
    private String actions;

    public Hoover(int x, int y, int gridX, int gridY, Orientations orientations, String actions) {
        this.x = x;
        this.y = y;
        this.gridX = gridX;
        this.gridY = gridY;
        this.orientations = orientations;
        this.actions = actions;
    }

    public void turnRight() {
        System.out.printf("Orientation in array when going right");
        System.out.println(Orientations.values()[this.orientations.ordinal()]);
        this.orientations = Orientations.values()[(this.orientations.ordinal() + 1) % 4];
    }

    public void turnLeft() {
        this.orientations = Orientations.values()[(this.orientations.ordinal() - 1) % 4];
    }


    public void advance() {
        switch (this.orientations) {
            case N:
                if (this.y < gridY - 1) this.y++;
                break;
            case S:
                if (this.y > 0) this.y--;
                break;
            case E:
                if (this.x < gridX - 1) this.x++;
                break;
            case W:
                if (this.x > 0) this.x--;
                break;
        }
    }


    public void applyActions() {
        for (char action : this.actions.toCharArray()) {
            switch (action) {
                case 'D':
                    this.turnRight();
                    break;
                case 'G':
                    this.turnLeft();
                    break;
                case 'A':
                    this.advance();
                    break;
                default:
                    break;
            }
        }
    }
    public String getPosition() {
        return this.x + ", " + this.y + ", " + this.orientations;
    }
}
