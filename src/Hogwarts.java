import javax.print.PrintService;

public class Hogwarts {

    String name;

    public Hogwarts (String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    Slytherin[] students = {
            new Slytherin("Драко Малфой", 8, 4, 5,9, 5),
            new Slytherin("Грэхэм Монтегю", 5, 7, 6, 1, 7),
            new Slytherin("Грегори Гойл", 4, 7, 4, 2, 3),
    };

    Griffindor[] students2 = {

            new Griffindor("Гарри Поттер", 7, 5, 9),
            new Griffindor("Гермиона грейнджер", 8, 6, 7),
            new Griffindor("Рон Уизли", 8, 9, 5), };


    Hufflpuff[] students3 = {

            new Hufflpuff("Захария Смит", 7, 4, 5),
            new Hufflpuff("Седрик Диггори", 8, 9, 6),
            new Hufflpuff("Джастин Финч-Флетчли", 7, 5, 3),
    };

    Ravenclaw[] students4 = {
            new Ravenclaw("Чжоу Чанг", 6, 3, 9),
            new Ravenclaw("Падма Патил", 7, 4, 6),
            new Ravenclaw("Маркус Белби", 5, 7, 3)
    };

    PrintService printService = new PrintService() {

        printService.print(students);
        printService.print(students2);
        printService.print(students3);
        printService.print(students4)

    }


    }






