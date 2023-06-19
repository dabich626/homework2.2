import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.event.PrintServiceAttributeListener;

public class hogwarts {

    slytherin[] students = {
            new slytherin("Драко Малфой", 8, 4, 5,9, 5),
            new slytherin("Грэхэм Монтегю", 5, 7, 6, 1, 7),
            new slytherin("Грегори Гойл", 4, 7, 4, 2, 3),
    };

    griffindor[] students2 = {

            new griffindor("Гарри Поттер", 7, 5, 9),
            new griffindor("Гермиона грейнджер", 8, 6, 7),
            new griffindor("Рон Уизли", 8, 9, 5), };


    hufflpuff[] students3 = {

            new hufflpuff("Захария Смит", 7, 4, 5),
            new hufflpuff("Седрик Диггори", 8, 9, 6),
            new hufflpuff("Джастин Финч-Флетчли", 7, 5, 3),
    };

    ravenclaw[] students4 = {
            new ravenclaw("Чжоу Чанг", 6, 3, 9),
            new ravenclaw("Падма Патил", 7, 4, 6),
            new ravenclaw("Маркус Белби", 5, 7, 3)
    };

    PrintService printService = new PrintService() {

        printService.print(students);
        printService.print(students2);
        printService.print(students3);
        printService.print(students4)

    }


    }






