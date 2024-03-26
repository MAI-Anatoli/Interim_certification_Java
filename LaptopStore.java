package Seminar.Seminar06.Homework;
//import java.util.*;
//
//public class LaptopStore {
//    private Set<Laptop> laptops;
//
//    public LaptopStore() {
//        laptops = new HashSet<>();
//    }
//
//    public void addLaptop(Laptop laptop) {
//        laptops.add(laptop);
//    }
//
//    public void selectLaptops(Map<String, Object> filters) {
//    List<Laptop> selectedLaptops = new ArrayList<>();
//
//    for (Laptop laptop : laptops) {
//        boolean isSelected = true;
//        for (Map.Entry<String, Object> entry : filters.entrySet()) {
//            String filterType = entry.getKey();
//            Object filterValue = entry.getValue();
//
//            switch (filterType) {
//                case "RAM":
//                    if (laptop.getRAM() < Integer.parseInt((String) filterValue)) {
//                        isSelected = false;
//                    }
//                    break;
//                case "storage":
//                    if (laptop.getStorage() < Integer.parseInt((String) filterValue)) {
//                        isSelected = false;
//                    }
//                    break;
//                case "OS":
//                    if (!laptop.getOS().equalsIgnoreCase((String) filterValue)) {
//                        isSelected = false;
//                    }
//                    break;
//                case "color":
//                    if (!laptop.getColor().equalsIgnoreCase((String) filterValue)) {
//                        isSelected = false;
//                    }
//                    break;
//                case "brand":
//                    if (!laptop.getBrand().equalsIgnoreCase((String) filterValue)) {
//                        isSelected = false;
//                    }
//                    break;
//                default:
//                    System.out.println("Unknown filter type");
//                    break;
//            }
//        }
//        if (isSelected) {
//            selectedLaptops.add(laptop);
//        }
//    }
//
//    for (Laptop laptop : selectedLaptops) {
//        System.out.println(laptop.getBrand() + " " + laptop.getRAM() + "GB RAM " +
//                laptop.getStorage() + "GB storage " + laptop.getOS() + " " + laptop.getColor());
//    }
//}
//
//
//    public void generateLaptops(int numLaptops) {
//        Random random = new Random();
//        String[] brands = {"HP", "Dell", "Asus", "Lenovo", "Acer", "Apple"};
//        String[] os = {"Windows", "Linux", "MacOS"};
//        String[] colors = {"Black", "Silver", "White", "Blue", "Red"};
//
//        for (int i = 0; i < numLaptops; i++) {
//            String brand = brands[random.nextInt(brands.length)];
//            int ram = random.nextInt(16) + 1; // RAM от 1 до 16 ГБ
//            int storage = random.nextInt(1024) + 128; // Хранение от 128 до 1152 ГБ
//            String operatingSystem = os[random.nextInt(os.length)];
//            String color = colors[random.nextInt(colors.length)];
//
//            Laptop laptop = new Laptop(brand, ram, storage, operatingSystem, color);
//            addLaptop(laptop);
//        }
//    }
//
//    public static void main(String[] args) {
//    LaptopStore store = new LaptopStore();
//
//    // Генерация 50 ноутбуков и добавление их в магазин
//    store.generateLaptops(50);
//
//    // Обработка выбора пользователя
//    Scanner scanner = new Scanner(System.in);
//    while (true) {
//        System.out.println("Выберите критерии фильтрации:");
//        System.out.println("1. RAM (GB)");
//        System.out.println("2. Storage (GB)");
//        System.out.println("3. OS");
//        System.out.println("4. Color");
//        System.out.println("5. Brand");
//        System.out.println("6. Поиск");
//
//        System.out.print("Введите номер критерия или '6' для поиска: ");
//        String choiceStr = scanner.nextLine();
//
//        // Проверка, что строка не пуста
//        if (choiceStr.isEmpty()) {
//            System.out.println("Некорректный ввод. Пожалуйста, введите номер критерия или '6' для поиска.");
//            continue;
//        }
//
//        int choice;
//        try {
//            choice = Integer.parseInt(choiceStr); // Преобразование ввода в число
//        } catch (NumberFormatException e) {
//            System.out.println("Некорректный ввод. Пожалуйста, введите номер критерия или '6' для поиска.");
//            continue;
//        }
//
//        // Создание фильтров по выбранным критериям
//        Map<String, Object> filters = new HashMap<>();
//        if (choice != 6) {
//            String filterType;
//            switch (choice) {
//                case 1:
//                    filterType = "RAM";
//                    break;
//                case 2:
//                    filterType = "storage";
//                    break;
//                case 3:
//                    filterType = "OS";
//                    break;
//                case 4:
//                    filterType = "color";
//                    break;
//                case 5:
//                    filterType = "brand";
//                    break;
//                default:
//                    System.out.println("Некорректный номер критерия");
//                    continue;
//            }
//
//            System.out.print("Введите значение для критерия " + filterType + ": ");
//            String filterValue = scanner.nextLine(); // Используем nextLine() для считывания строки
//
//            if (filterValue.isEmpty()) {
//                System.out.println("Некорректный ввод. Пожалуйста, введите значение для критерия " + filterType + ".");
//                continue;
//            }
//
//            filters.put(filterType, filterValue); // Сохраняем значение как строку
//        }
//
//        // Поиск или фильтрация ноутбуков
//        if (choice != 6) {
//            store.selectLaptops(filters);
//        } else {
//            break; // Выход из цикла
//        }
//    }
//}
//
//}

//#########################################################################################

//import java.util.*;
//
//public class LaptopStore {
//    private Set<Laptop> laptops;
//
//    public LaptopStore() {
//        laptops = new HashSet<>();
//    }
//
//    public void addLaptop(Laptop laptop) {
//        laptops.add(laptop);
//    }
//
//    public void selectLaptops(Map<String, Object> filters) {
//        List<Laptop> selectedLaptops = new ArrayList<>();
//
//        for (Laptop laptop : laptops) {
//            boolean isSelected = true;
//            for (Map.Entry<String, Object> entry : filters.entrySet()) {
//                String filterType = entry.getKey();
//                Object filterValue = entry.getValue();
//
//                switch (filterType) {
//                    case "RAM":
//                        if (laptop.getRAM() < (int) filterValue) {
//                            isSelected = false;
//                        }
//                        break;
//                    case "storage":
//                        if (laptop.getStorage() < (int) filterValue) {
//                            isSelected = false;
//                        }
//                        break;
//                    case "OS":
//                        if (!laptop.getOS().equalsIgnoreCase((String) filterValue)) {
//                            isSelected = false;
//                        }
//                        break;
//                    case "color":
//                        if (!laptop.getColor().equalsIgnoreCase((String) filterValue)) {
//                            isSelected = false;
//                        }
//                        break;
//                    case "brand":
//                        if (!laptop.getBrand().equalsIgnoreCase((String) filterValue)) {
//                            isSelected = false;
//                        }
//                        break;
//                    default:
//                        System.out.println("Unknown filter type");
//                        break;
//                }
//            }
//            if (isSelected) {
//                selectedLaptops.add(laptop);
//            }
//        }
//
//        // Предложить несколько ноутбуков, удовлетворяющих заданным критериям
//        int maxLaptopsToShow = Math.min(5, selectedLaptops.size());
//        for (int i = 0; i < maxLaptopsToShow; i++) {
//            Laptop laptop = selectedLaptops.get(i);
//            System.out.println(laptop.getBrand() + " " + laptop.getRAM() + "GB RAM " +
//                    laptop.getStorage() + "GB storage " + laptop.getOS() + " " + laptop.getColor());
//        }
//    }
//
//    public void generateLaptops(int numLaptops) {
//        Random random = new Random();
//        String[] brands = {"HP", "Dell", "Asus", "Lenovo", "Acer", "Apple"};
//        String[] os = {"Windows", "Linux", "MacOS"};
//        String[] colors = {"Black", "Silver", "White", "Blue", "Red"};
//
//        for (int i = 0; i < numLaptops; i++) {
//            String brand = brands[random.nextInt(brands.length)];
//            int ram = random.nextInt(16) + 1; // RAM от 1 до 16 ГБ
//            int storage = random.nextInt(1024) + 128; // Хранение от 128 до 1152 ГБ
//            String operatingSystem = os[random.nextInt(os.length)];
//            String color = colors[random.nextInt(colors.length)];
//
//            Laptop laptop = new Laptop(brand, ram, storage, operatingSystem, color);
//            addLaptop(laptop);
//        }
//    }
//
//    public static void main(String[] args) {
//        LaptopStore store = new LaptopStore();
//
//        // Генерация 50 ноутбуков и добавление их в магазин
//        store.generateLaptops(50);
//
//        // Запрос критериев фильтрации
//        Map<String, Object> filters = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // Меню с критериями выбора ноутбуков
//        System.out.println("Выберите критерии фильтрации:");
//        System.out.println("1. RAM (GB)");
//        System.out.println("2. Storage (GB)");
//        System.out.println("3. OS");
//        System.out.println("4. Color");
//        System.out.println("5. Brand");
//        System.out.println("6. Поиск");
//
//        // Обработка выбора пользователя
//        while (true) {
//            System.out.print("Введите номер критерия или '6' для поиска: ");
//            int choice = scanner.nextInt();
//            if (choice == 6) {
//                break;
//            }
//
//            String filterType;
//            switch (choice) {
//                case 1:
//                    filterType = "RAM";
//                    break;
//                case 2:
//                    filterType = "storage";
//                    break;
//                case 3:
//                    filterType = "OS";
//                    break;
//                case 4:
//                    filterType = "color";
//                    break;
//                case 5:
//                    filterType = "brand";
//                    break;
//                default:
//                    System.out.println("Некорректный выбор.");
//                    continue; // Продолжаем цикл, чтобы запросить снова
//            }
//
//            System.out.print("Введите значение для критерия " + filterType + ": ");
//            String filterValue = scanner.next();
//            filters.put(filterType, filterValue);
//        }
//
//        // Выборка ноутбуков согласно критериям
//        store.selectLaptops(filters);
//    }
//}


//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

import java.util.*;

public class LaptopStore {
    private Set<Laptop> laptops;

    public LaptopStore() {
        laptops = new HashSet<>();
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void selectLaptops(Map<String, Object> filters) {
        List<Laptop> selectedLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean isSelected = true;
            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String filterType = entry.getKey();
                Object filterValue = entry.getValue();

                switch (filterType) {
                    case "RAM":
                        if (laptop.getRAM() < (int) filterValue) {
                            isSelected = false;
                        }
                        break;
                    case "storage":
                        if (laptop.getStorage() < (int) filterValue) {
                            isSelected = false;
                        }
                        break;
                    case "OS":
                        if (!laptop.getOS().equalsIgnoreCase((String) filterValue)) {
                            isSelected = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equalsIgnoreCase((String) filterValue)) {
                            isSelected = false;
                        }
                        break;
                    case "brand":
                        if (!laptop.getBrand().equalsIgnoreCase((String) filterValue)) {
                            isSelected = false;
                        }
                        break;
                    default:
                        System.out.println("Unknown filter type");
                        break;
                }
            }
            if (isSelected) {
                selectedLaptops.add(laptop);
            }
        }

        // Предложить несколько ноутбуков, удовлетворяющих заданным критериям
        int maxLaptopsToShow = Math.min(5, selectedLaptops.size());
        for (int i = 0; i < maxLaptopsToShow; i++) {
            Laptop laptop = selectedLaptops.get(i);
            System.out.println(laptop.getBrand() + " " + laptop.getRAM() + "GB RAM " +
                    laptop.getStorage() + "GB storage " + laptop.getOS() + " " + laptop.getColor());
        }
    }

    public void generateLaptops(int numLaptops) {
        Random random = new Random();
        String[] brands = {"HP", "Dell", "Asus", "Lenovo", "Acer", "Apple"};
        String[] os = {"Windows", "Linux", "MacOS"};
        String[] colors = {"Black", "Silver", "White", "Blue", "Red"};

        for (int i = 0; i < numLaptops; i++) {
            String brand = brands[random.nextInt(brands.length)];
            int ram = random.nextInt(16) + 1; // RAM от 1 до 16 ГБ
            int storage = random.nextInt(1024) + 128; // Хранение от 128 до 1152 ГБ
            String operatingSystem = os[random.nextInt(os.length)];
            String color = colors[random.nextInt(colors.length)];

            Laptop laptop = new Laptop(brand, ram, storage, operatingSystem, color);
            addLaptop(laptop);
        }
    }

    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();

        // Генерация 50 ноутбуков и добавление их в магазин
        store.generateLaptops(50);

        // Запрос критериев фильтрации
        Map<String, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Меню с критериями выбора ноутбуков
        System.out.println("Выберите критерии фильтрации:");
        System.out.println("1. RAM (GB)");
        System.out.println("2. Storage (GB)");
        System.out.println("3. OS");
        System.out.println("4. Color");
        System.out.println("5. Brand");
        System.out.println("6. Поиск");

        // Обработка выбора пользователя
        while (true) {
            System.out.print("Введите номер критерия или '6' для поиска: ");
            String choiceStr = scanner.nextLine();
            if (choiceStr.equals("6")) {
                break;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный выбор.");
                continue; // Продолжаем цикл, чтобы запросить снова
            }

            String filterType;
            switch (choice) {
                case 1:
                    filterType = "RAM";
                    break;
                case 2:
                    filterType = "storage";
                    break;
                case 3:
                    filterType = "OS";
                    break;
                case 4:
                    filterType = "color";
                    break;
                case 5:
                    filterType = "brand";
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    continue; // Продолжаем цикл, чтобы запросить снова
            }

            System.out.print("Введите значение для критерия " + filterType + ": ");
            String filterValue = scanner.nextLine();

            // Для критериев RAM и Storage преобразовываем строку в целое число
            if (choice == 1 || choice == 2) {
                try {
                    int intValue = Integer.parseInt(filterValue);
                    filters.put(filterType, intValue);
                } catch (NumberFormatException e) {
                    System.out.println("Некорректное значение. Введите целое число.");
                    continue;
                }
            } else {
                filters.put(filterType, filterValue);
            }
        }

        // Выборка ноутбуков согласно критериям
        store.selectLaptops(filters);
    }
}
