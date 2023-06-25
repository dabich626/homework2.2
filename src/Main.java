import javax.print.PrintService;

public class Main {
    public static void main(String[] args) {
        Slytherin[] students = {
                new Slytherin("Драко Малфой", 6,7,8,4,5,7,8 ),
                new Slytherin("Грэхэм Монтегю", 5,7,9,4,3,7,2,),
                new Slytherin("Грегори Гойл", 5,7,3,8,3,6,3),
        };

        Griffindor[] students2 = {

                new Griffindor("Гарри Поттер", 7,8,9,10,8),
                new Griffindor("Гермиона грейнджер",6,7,8,10,10),
                new Griffindor("Рон Уизли", 7,8,4,9,7), };


        Hufflpuff[] students3 = {

                new Hufflpuff("Захария Смит", 7, 4, 5,6,8),
                new Hufflpuff("Седрик Диггори", 8, 9, 6,6,5),
                new Hufflpuff("Джастин Финч-Флетчли", 7, 5, 3,7,5),
        };

        Ravenclaw[] students4 = {
                new Ravenclaw("Чжоу Чанг",  6, 3, 9,6,5),
                new Ravenclaw("Падма Патил", 7, 4, 6,6,8),
                new Ravenclaw("Маркус Белби", 5, 7, 3,8,4)
        };

        PrintService printService = new PrintService() {

        printService.print(students);
        printService.print(students2);
        printService.print(students3);
        printService.print(students4)

        };
    }
}