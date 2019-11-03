package moma;

public class Masterpiece {
        private String name;
        private String type;
        private int year;
        private String authorName;
        private String description;

    public Masterpiece(String name, String type, int year, String authorName, String description) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.authorName = authorName;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return name + ", "
                + type + ", "
                + year + ", "
                + authorName + ", "
                + description + ".";
    }
}
