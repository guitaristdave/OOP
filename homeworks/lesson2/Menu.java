import java.util.Scanner;

public class Menu {
    public static void menu(Zoo storage) {
        while (true) {
            System.out.println(
                    "МЕНЮ\n1. Добавить новое животное\n2. Убрать животное\n3. Напечатать информацию о животном\n4. Напечатать инофрмацию о всех животных\n5. Заставить животное издать звук\n6. Заставить всех животных издать звук\n7. Выход");
            System.out.println("Введите нужный пункт меню:");
            try (Scanner in = new Scanner(System.in)) {
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(
                                "Выберите нужный пункт:\n1. Кошка\n2. Собака\n3. Волк\n4. Тигр\n5. Курица\n6. Аист\n7. Назад");
                        int x = in.nextInt();
                        switch (x) {
                            case 1:
                                storage.add(new Cat());
                                break;
                            case 2:
                                storage.add(new Dog());
                                break;
                            case 3:
                                storage.add(new Wolf());
                                break;
                            case 4:
                                storage.add(new Tiger());
                                break;
                            case 5:
                                storage.add(new Chicken());
                                break;
                            case 6:
                                storage.add(new Stork());
                                break;
                            case 7:
                                menu(storage);
                            default:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Введите индекс нужного животного:\n");
                        int idx = in.nextInt();
                        storage.delete(idx);
                        break;
                    case 3:
                        System.out.println("Введите индекс нужного животного:\n");
                        int indx = in.nextInt();
                        storage.showAnimal(indx);
                        break;
                    case 4:
                        storage.showAll();
                    case 5:
                        System.out.println("Введите индекс нужного животного:\n");
                        int index = in.nextInt();
                        storage.getRoar(index);
                    case 6:
                        storage.allRoar();
                    case 7:
                        break;
                    default:
                        menu(storage);
                        break;
                }
                if (choice == 7) {
                    in.close();
                    break;
                }
            }
 
        }

    }
}
