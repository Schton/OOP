public abstract class SocialMedia {
    private String name;
    private int yearCreated;

    public SocialMedia(String name, int yearCreated){
        if(name != null && name.length() > 0) this.name = name.substring(0,1).toUpperCase() + name.substring(1);
        else this.name = name;
        this.yearCreated = yearCreated;
    }

    public abstract Item[] getFeed(int itemsCount);
    public abstract Item[] getFeed();

    @Override
    public String toString() {
        return name + " created last " + yearCreated;
    }
}
