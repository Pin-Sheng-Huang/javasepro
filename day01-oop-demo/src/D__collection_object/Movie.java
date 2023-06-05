package D__collection_object;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-03-19 19:33
 * @LastEditTime: 2023-03-19 19:33
 */

public class Movie {
    private String name;
    private String description;
    private double star;
    private String actors;

    public Movie() {
    }

    public Movie(String name, String description, double star, String actors) {
        this.name = name;
        this.description = description;
        this.star = star;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", star=" + star +
                ", actors='" + actors + '\'' +
                '}';
    }
}
