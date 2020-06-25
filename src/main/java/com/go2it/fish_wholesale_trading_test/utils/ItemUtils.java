package com.go2it.fish_wholesale_trading_test.utils;

import com.go2it.fish_wholesale_trading_test.dto.ItemDto;

import java.util.ArrayList;
import java.util.List;

public class ItemUtils {
    public static List<ItemDto>getItemDtoList(){
        List<ItemDto>itemDtoList=new ArrayList<> ();
        for (int i = 1;i<5;i++){
            ItemDto itemDto = new ItemDto (("Smith "+i),(100.00 * i));
            itemDtoList.add (itemDto);
        }
        return itemDtoList;
    }
}
