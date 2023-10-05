package Exam_Advance;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class RallyRacing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int fields = Integer.parseInt(scanner.nextLine().trim());

        Car car = new Car(scanner.nextLine().trim());
        Track track = new Track();

        for (int i = 0; i < fields; i++) {
            track.addRoad(scanner.nextLine().trim());
        }

        while (true) {
            String direction = scanner.nextLine().trim();
            car.move(direction);
            Point exitTunnel = track.passTunnel(car.getPositionY(), car.getPositionX());
            if (exitTunnel != null) {
                track.fields.get(car.getPositionY())[car.getPositionX()] = ".";
                track.fields.get(exitTunnel.getY())[exitTunnel.getX()] = ".";
                car.changePosition(exitTunnel);
                car.updateDistance(30);
            } else if (direction.equals("End")) {
                track.fields.get(car.getPositionY())[car.getPositionX()] = "C";
                System.out.println("Racing car " + car.raceNumber + " DNF.");
                break;
            } else if (track.isFinal(car.getPositionY(), car.getPositionX())) {
                car.updateDistance(10);
                track.fields.get(car.getPositionY())[car.getPositionX()] = "C";
                System.out.println("Racing car " + car.raceNumber + " finished the stage!");
                break;
            } else {
                car.updateDistance(10);
            }
        }
        System.out.println("Distance covered " + car.getDistance() + " km.");
        for (int i = 0; i < track.fields.size(); i++) {
            Arrays.asList(track.fields.get(i)).forEach(System.out::print);
            System.out.println();
        }
    }

    public static class Car {

        public String raceNumber;
        private int positionX = 0;
        private int positionY = 0;
        private int distance;

        public Car(String raceNumber) {
            this.raceNumber = raceNumber;
        }

        public int getPositionX() {
            return positionX;
        }

        public int getPositionY() {
            return positionY;
        }

        public void move(String direction) {
            switch (direction) {
                case "up":
                    positionY--;
                    break;
                case "down":
                    positionY++;
                    break;
                case "left":
                    positionX--;
                    break;
                case "right":
                    positionX++;
                    break;
            }
        }

        public int getDistance() {
            return distance;
        }

        public void updateDistance(int distance) {
            this.distance += distance;
        }

        public void changePosition(Point exitTunnel) {
            positionY = exitTunnel.y;
            positionX = exitTunnel.x;
        }
    }

    public static class Point {
        public int x = -1;
        public int y = -1;

        public Point() {
        }
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static class Track {

        Stack<String[]> fields = new Stack<>();
        private Tunnel tunnel = new Tunnel();
        private Point end = new Point();

        public Track() {
        }

        public void addRoad(String road) {
            String[] r = road.split(" ");
            for (int i = 0; i < r.length; i++) {
                if ("T".equals(r[i])) {
                    tunnel.addEntry(fields.size(), i);
                } else if("F".equals(r[i])){
                    end.setY(fields.size());
                    end.setX(i);
                }
            }
            fields.add(r);
        }

        Point passTunnel(int y, int x) {
            return tunnel.goIn(y, x);
        }

        public boolean isFinal(int positionY, int positionX) {
            return end.equals(new Point(positionX, positionY));
        }
    }

    public static class Tunnel {
        private Point entryOne = new Point();
        private Point entryTwo = new Point();


        public void addEntry(int y, int x) {
            if (this.entryOne.getX() == -1) {
                this.entryOne.setX(x);
                this.entryOne.setY(y);
            } else {
                this.entryTwo.setX(x);
                this.entryTwo.setY(y);
            }
        }

        public Point goIn(int y, int x) {
            if (entryOne.equals(new Point(x, y))) {
                return entryTwo;
            }
            if (entryTwo.equals(new Point(x, y))) {
                return entryOne;
            }
            return null;
        }

    }
}
