public class HeroMovieImp implements HeroMovie {
    private Hero[] heroes;

    public HeroMovieImp() {
        heroes = new Hero[] {
            new Hero("chiru", new String[] { "chiru 1", "chiru 2", "chiru 3" }),
            new Hero("movies", new String[] { "chiru", "bala 1" }),
            new Hero("balaya", new String[] { "bala 1", "bala 2", "bala 3" })
        };
    }

    @Override
    public String[] getMoviesForHero(String heroName) {
        for (Hero hero : heroes) {
            if (hero.getName().equals(heroName)) {
                return hero.getMovies();
            }
        }
        return new String[0];
    }
}