import java.util.*;


public class Main {
    public static void main(String[] args) {
        //-----------------------Телефонная книга---------------------------------------------
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Иванов Иван", "+7952365412");
        phoneBook.put("Семен Семеныч", "+75236541235");
        phoneBook.put("Жуков Игорь", "89145265478");
        phoneBook.put("Шаймурзин Муса", "89526547892");
        phoneBook.put("Морозова Светлана", "89147562354");
        phoneBook.put("Коробов Константин", "+79065785142");
        phoneBook.put("Калашников Дмитрий", "+79632547852");
        phoneBook.put("Семенов Алексей", "+79162354165");
        phoneBook.put("Данилов Сергей", "+79652147563");
        phoneBook.put("Исмагилов Исмагил", "89147523654");
        phoneBook.put("Котриков Иван", "+79539874512");
        phoneBook.put("Колобков Сергей", "+79256352147");
        phoneBook.put("Васильева Светлана", "89375241236");
        phoneBook.put("Котрикова Анастасия", "+79529512364");
        phoneBook.put("Галиев Ильнар", "+79254692510");
        phoneBook.put("Ситдиков Артур", "+79532232247");
        phoneBook.put("Городецкий Игорь", "+79632475862");
        phoneBook.put("Трофимов Андрей", "+7952365412");
        phoneBook.put("Габрахманова Алия", "+79521472536");
        phoneBook.put("Ахмедов Радик", "+79182586935");

        System.out.println(phoneBook.entrySet());

        //-----------------------Продукты--------------------------------------------

        Product banan = new Product("Банан", 100.50, 0);
        Product orange = new Product("Апельсин", 120, 4);
        Product pineapple = new Product("Ананас", 200, 0);
        Product banan2 = new Product("Банан", 100.50, 1.4);

//        Set<Product> basket = new HashSet<>();

//        Basket.basket.put(banan);
//        Basket.basket.add(orange);
//        Basket.basket.add(pineapple);


//        System.out.println(Basket.basket.toString());
        Basket.addProduct(banan);
        Basket.addProduct(orange);
        Basket.addProduct(pineapple);

        System.out.println(Basket.basket.toString());
        Basket.basket.remove(pineapple);
        orange.setBuy(true);
//        System.out.println(Basket.basket.toString());
//_______________________Книга рецептов_____________________________________________________________


        Map<Product, Double> salat2 = new HashMap();
        salat2.put(orange, orange.getWeight());
        salat2.put(pineapple, pineapple.getWeight());
//        List<Product> salat3 = new ArrayList<>();
//        salat3.add(banan);
//        salat3.add(orange);

        Recipe salat = new Recipe("Салатище", salat2);
//        Recipe salat10 = new Recipe("Салатик", List.copyOf(salat2));
//        Recipe salat11 = new Recipe("Другой салат", List.copyOf(salat3));
//        Recipe salat12 = new Recipe("Другой салат2", List.copyOf(salat2));
//        System.out.println(salat);

        BookRecipe.getBookRecipe().add(salat);
//        BookRecipe.getBookRecipe().add(salat10);
//        BookRecipe.getBookRecipe().add(salat11);
//
        System.out.println(BookRecipe.getBookRecipe());
//        BookRecipe.addBookRecipe(salat11);
//        System.out.println(BookRecipe.getBookRecipe());

        //________________Задание 1.3__________________________________________________________________
        Task3 task3 = new Task3();
        task3.add("str1", 1);
        task3.add("str2", 2);
        task3.add("str3", 3);
//Task3.add("str1",1);
        //кидает исключение
        task3.add("str3", 4);
        System.out.println(task3);
        //________________Задание 2.1__________________________________________________________________
        Map<String, List<Integer>> sum = new HashMap<>();
        Random random = new Random();
        sum.put("string 1", new ArrayList<>(List.of(random.nextInt(1_000), random.nextInt(1_000), random.nextInt(1_000))));
        sum.put("string 2", new ArrayList<>(List.of(random.nextInt(1_000), random.nextInt(1_000), random.nextInt(1_000))));
        sum.put("string 3", new ArrayList<>(List.of(random.nextInt(1_000), random.nextInt(1_000), random.nextInt(1_000))));
        sum.put("string 4", new ArrayList<>(List.of(random.nextInt(1_000), random.nextInt(1_000), random.nextInt(1_000))));
        sum.put("string 5", new ArrayList<>(List.of(random.nextInt(1_000), random.nextInt(1_000), random.nextInt(1_000))));

        System.out.println(sum.entrySet());
        Map<String, Integer> sum2 = new HashMap<>();
        sum.forEach((key, value) -> {
                    //            System.out.println(value);
                    int sum1 = 0;
                    for (int i = 0; i < value.size(); i++) {
                        sum1 += value.get(i);
                    }
//            System.out.println(sum1);
                    sum2.put(key, sum1);
                }
        );


        System.out.println(sum2.entrySet());

        //________________Задание 2.2__________________________________________________________________

        Map<Integer, String> order = new LinkedHashMap<>();
        order.put(1, "один");
        order.put(2, "два");
        order.put(3, "три");
        order.put(4, "четыре");
        order.put(5, "пять");
        order.put(6, "шесть");
        order.put(7, "семь");
        order.put(8, "восемь");
        order.put(9, "девять");
        order.put(10, "десять");
        System.out.println(order.entrySet());

    }


}

