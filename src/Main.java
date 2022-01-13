import entity.Enemy;
import entity.Floor;
import entity.Room;
import entity.Tower;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество этажей.");
        int floorCount = Integer.parseInt(reader.readLine());

        Tower tower = new Tower(floorCount);

        System.out.println("Перед вами глубокое подземелье, и вы начинаете пробираться в его глубины...");

        for (Floor floor : tower.getFloors()) {
            for (Room room : floor.getRooms()) {
                System.out.println("Вы заплутали в развалинах...");
                Thread.sleep(500);
//                for (Enemy enemy : room.getEnemies()) {
//                    System.out.println("Вас встречают...");
//                    System.out.println(enemy.getName());
//                    System.out.println("Вы начинаете бой.");
//                }
                System.out.println("На пути сундук, а в нем...");
                System.out.println(room.getChest().getItem().getInfo());
            }
        }
    }
}
