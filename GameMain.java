package oop_practice.game;

public class GameMain {
    public static void main(String[] args) {

        RobotMap map = new RobotMap(5, 5);

        RobotMap.Robot robot = map.createRobot(new Point(2, 3));

        System.out.println(robot);
        robot.move();
        robot.move();
        System.out.println(robot);
        robot.changeDirection(Direction.BOTTOM);
        robot.move();
        robot.move();
        robot.changeDirection(Direction.LEFT);
        robot.move();
        System.out.print(robot);
    }
}
