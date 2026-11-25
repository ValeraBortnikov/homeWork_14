package org.skypro.skyshop.search;

public class SearchEngine {
    private final Searchable[] searchables;
    private int count = 0;

    public SearchEngine(int size) {
        this.searchables = new Searchable[size];
    }

    public void add(Searchable addSearchItem) {

        if (count < searchables.length) {
            searchables[count++] = addSearchItem;
        }
    }

    public Searchable[] search(String query) {
        Searchable[] result = new Searchable[5];
        int foundItem = 0;

        for (Searchable item : searchables) {

            if (item == null) {
                continue;
            }

            if (item.searchTerm().contains(query)) {
                result[foundItem++] = item;
                if (foundItem == 5) {
                    break;
                }
            }
        }

        return result;
    }
}
