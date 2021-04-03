public class Music {

    private String name;
    private String singer;
    private int year;

    public Music(String name, String singer, int year)
    {
        this.name = name;
        this.singer = singer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public int getYear() {
        return year;
    }
}