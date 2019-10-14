package restaurant;

class Restaurant {
    public static void main(String[] args) {
        Starter crocchette = new Starter(1, "Crocchette", "fry", "vegetarian", 4);
        Starter fioriDiZucca = new Starter(2, "Fiori di zucca", "fry", "vegetarian that eat fish", 8);
        Starter tagliereDiSalumi = new Starter(3, "Tagliere di salumi", "fresh", "non vegetarian", 10);
        Starter tagliereDiFormaggi = new Starter(4, "Tagliere di formaggi", "fresh", "vegetarian", 10);
        Starter oliveAscolane = new Starter(5, "Olive Ascolane", "fry", "non vegetarian", 6);
        Starter polpetteDiMelanzane = new Starter(6, "Polpette di melanzane", "fry", "vegetarian", 5);

        Starter[] starters = new Starter[]{crocchette, fioriDiZucca, tagliereDiSalumi, tagliereDiFormaggi, oliveAscolane, polpetteDiMelanzane};
        //for (restaurant.Starter r : starters)
          //  if ("vegetarian".equalsIgnoreCase(r.vegetarian)) {
            //    r.introduce();
        //for (restaurant.Starter starter : starters) {
          //  if ()
            //    starter.introduce();
          //  }
        MainCourse gnocchi = new MainCourse(1, "Gnocchi", "boiled", "vegetarian", 8);
        MainCourse pizzaFunghi = new MainCourse(2, "Pizza Funghi", "baked", "vegetarian", 8);
        MainCourse melanzaneAllaParmigiana = new MainCourse(3, "Melanzane alla parmigiana", "fried", "vegetarian", 10);

        MainCourse [] mainCourses = new MainCourse[]{gnocchi, pizzaFunghi, melanzaneAllaParmigiana};

        Dessert tiramisu = new MainCourse(1, "Gnocchi", "boiled", "vegetarian", 8);
        Dessert affogatoAlCaffe = new MainCourse(2, "Pizza Funghi", "baked", "vegetarian", 8);
        Dessert tortaDellaNonna = new MainCourse(3, "Melanzane alla parmigiana", "fried","vegetarian", 10);

        Dessert [] desserts = new Dessert[]{tiramisu, affogatoAlCaffe, tortaDellaNonna};
    }
}