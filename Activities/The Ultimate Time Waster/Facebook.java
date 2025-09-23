public class Facebook extends SocialMedia{
    private static final String NAME = "FaCeBoOk";
    private static final int YEAR_CREATED = 2004;

    public Facebook(){
        super(NAME, YEAR_CREATED);
    }

    @Override
    public Item[] getFeed(){
        return getFeed(10); 
    }

    @Override
    public Item[] getFeed(int itemsCount){
        Item[] items = new Item[itemsCount];
        for(int i = 0; i < itemsCount; i++){
            String title = "Facebook Item Title " + i;
            String description = "Facebook Item Description " + i;
            items[i] = new Item(title, description);
        }
        return items;
    }
}
