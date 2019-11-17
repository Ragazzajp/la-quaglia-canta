package restaurant;

class Restaurant {
    public static void main(String[] args) {
        Starter crocchette = new Starter(1, " Crocchette, ", "fry, ", "vegetarian: ", 4);
        Starter fioriDiZucca = new Starter(2, " Fiori di zucca, ", "fry, ", "vegetarian that eat fish: ", 8);
        Starter tagliereDiSalumi = new Starter(3, " Tagliere di salumi, ", "fresh, ", "non vegetarian: ", 10);
        Starter tagliereDiFormaggi = new Starter(4, " Tagliere di formaggi, ", "fresh, ", "vegetarian: ", 10);
        Starter oliveAscolane = new Starter(5, " Olive Ascolane, ", "fry, ", "non vegetarian: ", 6);
        Starter polpetteDiMelanzane = new Starter(6, " Polpette di melanzane, ", "fry, ", "vegetarian: ", 5);

        Starter[] starters = new Starter[]{crocchette, fioriDiZucca, tagliereDiSalumi, tagliereDiFormaggi, oliveAscolane, polpetteDiMelanzane};

        MainCourse gnocchi = new MainCourse(7 , " Gnocchi, ", "boiled, ", "vegetarian: ", 8);
        MainCourse pizzaFunghi = new MainCourse(8 , " Pizza Funghi, ", "baked, ", "vegetarian: ", 8);
        MainCourse melanzaneAllaParmigiana = new MainCourse(9 , " Melanzane alla parmigiana, ", "fried: ", "vegetarian: ", 10);

        MainCourse[] mainCourses = new MainCourse[]{gnocchi, pizzaFunghi, melanzaneAllaParmigiana};

        Dessert tiramisu = new Dessert(10 , " Tiramisu, ", "row, ", "vegetarian: ", 6);
        Dessert affogatoAlCaffe = new Dessert(11 , " Affogato al caffe, ", "row, ", "vegetarian: ", 6);
        Dessert tortaDellaNonna = new Dessert(12 , " Torta della nonna, ", "baked, ", "vegetarian: ", 5);

        Dessert[] desserts = new Dessert[]{tiramisu, affogatoAlCaffe, tortaDellaNonna};

        System.out.println();
        System.out.println("Starters");
        System.out.println();
        for (Starter x: starters) {
            x.introduce();
        }

        System.out.println();
        System.out.println("Main Courses");
        System.out.println();
        for (MainCourse s: mainCourses) {
            s.introduce();
        }

        System.out.println();
        System.out.println("Desserts");
        System.out.println();
        for (Dessert r: desserts) {
            r.introduce();
        }
    }
}