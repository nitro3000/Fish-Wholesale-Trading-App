package com.go2it.fish_wholesale_trading_test.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.openjson.JSONObject;
import com.go2it.fish_wholesale_trading_test.dto.ItemDto;
import com.go2it.fish_wholesale_trading_test.entity.Item;
import com.go2it.fish_wholesale_trading_test.service.IItemService;
import com.go2it.fish_wholesale_trading_test.utils.ItemUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private IItemService itemService;

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public String getItemsFromResource() {
        List<Item> itemList = itemService.findAll ( );
        String htmlText = "<div style=\"text-align:center;\">"
                + "<h1>Welcome</h1>" +
                "<h1> Fish Wholesale Store </h1>" +
                "<img src=https://www.pilotonline.com/resizer/7bQ5-hekLPP3OHZ1QECd3erH24A=/415x198/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com/public/YLEFAHRMEFCMFO34O7QIQJNCHY.jpg></img>"
                + "</div>" + "<ul>";


        for (Item item : itemList) {
            htmlText += "<li>" + item.getItemName ( ) + "</li>";

        }
        htmlText += "<ul>";
        return htmlText;
    }
    @RequestMapping(value = "/items", method = RequestMethod.POST)
    public ItemDto createItem(@RequestBody ItemDto itemDto){
        itemService.save (itemDto);
            return itemDto;

    }
}