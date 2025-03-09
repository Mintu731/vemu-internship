import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HeroMovie heroMovieService = new HeroMovieImp();

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Welcome To MovieBuzz");
            System.out.print("Please Enter your hero: ");
            String hero = scanner.nextLine();
            String[] movies = heroMovieService.getMoviesForHero(hero);
            
            if (movies != null) {
                System.out.println("Movies for hero " + hero + ":");
                for (String movie : movies) {
                    System.out.println(movie);
                }
            } else {
                System.out.println("Hero not found!");
            }
            System.out.print("\nDo you want to enter another hero? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
