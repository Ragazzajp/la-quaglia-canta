package moma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoMa {
    public static void main(String[] args) {
        Masterpiece guernica = new Masterpiece("Guernica", "painting", 1937, "Pablo Picasso", "a nice painting");
        Masterpiece theStarryNight = new Masterpiece("The Starry Night", "painting", 1889, "Vincent Van Gogh", "a nicer painting");
        Masterpiece untitled = new Masterpiece("Untitled", "painting", 1999, "Ellen Gallagher", "a black painting");
        Masterpiece fierySunset = new Masterpiece("Fiery Sunset", "painting", 1973, "Frank Caruso", "an acrylic painting");
        Masterpiece theKiss = new Masterpiece("The Kiss", "painting", 1907, "Gustav Klimt", "a yellow painting");

        List<Masterpiece> paintings = new ArrayList<>();
        paintings.add(guernica);
        paintings.add(theStarryNight);
        paintings.add(untitled);
        paintings.add(fierySunset);
        paintings.add(theKiss);

        System.out.println("Please give the number of the painting:");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt() - 1;
        System.out.println(paintings.get(input));
    }
}