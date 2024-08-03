package org.lld.vendingmachine;
import java.util.ArrayList;
import java.util.List;
public class Inventory {

    List<ItemShelf> itemShelfList;

    public Inventory(){
        itemShelfList = new ArrayList<>();
    }

    public void add(ItemShelf itemShelf){
        itemShelfList.add(itemShelf);
    }

    public ItemShelf getItemFromShelf(int code){
        for(ItemShelf itemShelf : itemShelfList){
            if(itemShelf.getCode() == code){
                return itemShelf;
            }
        }
        throw new RuntimeException("Item code not present");

    }

}