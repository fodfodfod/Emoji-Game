public class Person {
    private String name;
    private String gender;
    private String symbol;
    private String description;
    private int points;


    public Person(String n, String g, String sym, String d){
        name = n;
        gender = g;
        symbol = sym;
        description = d;
        points = 0;
        

    }
    public String getName(){
        return name;
    }

    public String getSymbol(){
        return symbol;
    }

    public void addPoint(){
        points++;
    }

    public int getPoints(){
        return points;
    }
}
