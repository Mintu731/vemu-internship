public class Hero{
    private String name;
    private String[] movies;
    public Hero(String name, String[] movies){
        this.name = name;
        this.movies = movies;
    }
    public String getName(){
        return name;
    }
    public String[] getMovies(){
        return movies;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMovies(String[] movies){
        this.movies = movies;
    }
    public void printMovies(){
        for(String movie: movies){
            System.out.println(movie);
        }
    }
}