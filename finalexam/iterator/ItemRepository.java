package finalexam.iterator;

import java.util.Iterator;

public class ItemRepository {
    private String[][] items = {{"item1", "item2", "item3", "item4"},
            {"item5", "item6"},
            {"item7", "item8", "item9"}};

    public Iterator getIterator() {
        return new ItemIterator();
    }

    private class ItemIterator implements Iterator {

        private int current_row = 0;
        private int current_column = 0;

        @Override
        public boolean hasNext() {
            if (current_row + 1 == items.length) {
                return current_column < items[current_row].length;
            }
            return current_row < items.length;
        }

        @Override
        public Object next() {
            if (current_column == items[current_row].length) {
                current_column = 0;
                current_row++;
            }
            return items[current_row][current_column++];
        }
    }

    public static void main(String... args){
        ItemRepository rep = new ItemRepository();
        Iterator itr = rep.getIterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
