import java.util.HashMap;

public class Phonebook {
    public static void main(String[] args) {


        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("Петров Илья", "88002000600");
        phonebook.put("Иванов Сергей", "88002000600");
        phonebook.put("Соболев Андрей", "88002000600");
        phonebook.put("Соколов Дмитрий", "88002000600");
        phonebook.put("Кувырзин Игнат", "88002000600");
        phonebook.put("Мамонова Екатерина", "88002000600");
        phonebook.put("Зинченко Ярослав", "88002000600");
        phonebook.put("Давыдов Максим", "88002000600");
        phonebook.put("Терентьев Влад", "88002000600");
        phonebook.put("Сорокин Алексей", "88002000600");
        phonebook.put("Петров Андрей", "88002000600");
        phonebook.put("Ионова Александра", "88002000600");
        phonebook.put("Иванов Илья", "88002000600");
        phonebook.put("Деревянко Илья", "88002000600");
        phonebook.put("Кузнецов Данил", "88002000600");
        phonebook.put("Снегов Керилл", "88002000600");
        phonebook.put("Самсонов Никита", "88002000600");
        phonebook.put("Ершов Константин", "88002000600");
        phonebook.put("Кудрявцева Анна", "88002000600");
        phonebook.put("Петрова Ольга", "88002000600");

        System.out.println(phonebook.keySet());
    }

}
