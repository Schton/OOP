public class Reddit extends SocialMedia{
    private static final int YEAR_CREATED = 2005;
    private static final String NAME = "Reddit";
    private static final int DEFAULT_ITEMS_COUNT = 10;

    public Reddit() {
        super(NAME, YEAR_CREATED);
    }

    @Override
    public Item[] getFeed() {
        return getFeed(DEFAULT_ITEMS_COUNT);
    }

    @Override
    public Item[] getFeed(int itemsCount){
        Item[] items = new Item[itemsCount];
        for(int i = 0; i < itemsCount; i++){
            String title = "Reddit Item Title " + i;
            String description = "Reddit Item Description " + i;
            items[i] = new Item(title, description);
        }
        return items;
    }

    public static int getDefaultItemsCount() {
        return DEFAULT_ITEMS_COUNT;
    }

    public static String getConstantName() {
        return NAME;
    }

    public static int getConstantYearCreated() {
        return YEAR_CREATED;
    }
}
