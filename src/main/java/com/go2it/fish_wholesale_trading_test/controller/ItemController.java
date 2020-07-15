package com.go2it.fish_wholesale_trading_test.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.go2it.fish_wholesale_trading_test.dto.ItemDto;
import com.go2it.fish_wholesale_trading_test.entity.Item;
import com.go2it.fish_wholesale_trading_test.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
@RestController
public class ItemController {
    @Autowired
    private IItemService itemService;
//############################################################-CREATE Item-#######################
    //
//        @PostMapping("/items")
//    public Item createItem(@RequestBody Item item) {
//        itemService.save (item);
//        return item;
//    }
    @PostMapping("/items")
    public ResponseEntity<String> createItem(@RequestBody String itemJson) throws IOException {
        if (itemJson == null || itemJson.isEmpty ( )) {
            return new ResponseEntity<> (HttpStatus.NOT_ACCEPTABLE);
        }
        ObjectMapper objectMapper = new ObjectMapper ( );
        Item item = objectMapper.readValue (itemJson, Item.class);
        itemService.save (item);
        return new ResponseEntity<> (HttpStatus.OK);
    }
//############################################################-READ Item-#######################

    @GetMapping("/")
    public String mainPage() {
        return "<div style=\"text-align:center;\">"
                + "<h1>Welcome to</h1>" +
                "<p> Fish Wholesale Store </p>" +
                "<img src=https://www.pilotonline.com/resizer/7bQ5-hekLPP3OHZ1QECd3erH24A=/415x198/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com/public/YLEFAHRMEFCMFO34O7QIQJNCHY.jpg>"
                + "</div>";
    }

    @GetMapping("/items")
    public String showItems() {
        List<Item> itemList = itemService.findAll ( );
        String htmlText = "<div style=\"text-align:center;\">"
                + "<p>Fish Wholesale Store</p>" +
                "<h1>Available Products </h1>" +
                "<img src=https://www.pilotonline.com/resizer/7bQ5-hekLPP3OHZ1QECd3erH24A=/415x198/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com/public/YLEFAHRMEFCMFO34O7QIQJNCHY.jpg></img>"
                + "</div>";

        for (Item item : itemList) {
            htmlText += "<li>" + item.getItemName ( ) + "</li>";

        }
        return htmlText;
    }
//############################################################-UPDATE Item-#######################



//############################################################-DELETE Item-#######################
    @Transactional
    @DeleteMapping("/items/{id}")
    @ResponseBody
    public ResponseEntity<String> removeByItemId(@PathVariable Long id) {
        if (itemService.findById (id).isEmpty ( )) {
            return ResponseEntity.status (HttpStatus.NOT_FOUND).body ("Item not found!");
        }
        itemService.removeByItemId (id);
        return ResponseEntity.status (HttpStatus.OK).body ("Item DELETED Successfully");
    }
    @GetMapping("/prices")
    public String showItemsAndPrices() {
        List<Item> itemList = itemService.findAll ( );
        String htmlText = "<div style=\"text-align:center;\">"
                + "<p>Fish Wholesale Store</p>" +
                "<h1> Prices List </h1>" +
                "<img src=https://www.pilotonline.com/resizer/7bQ5-hekLPP3OHZ1QECd3erH24A=/415x198/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com/public/YLEFAHRMEFCMFO34O7QIQJNCHY.jpg></img>"
                + "</div>" + "<ul>";

        for (Item item : itemList) {
            htmlText += "<li>" + item.getItemName ( ) + " at price per kg: " + "$" + item.getItemPrice ( ) + "</li>";

        }
        return htmlText;
    }


    @GetMapping(value = "prices/{itemName}")
    public String getItemPriceByItemName(@PathVariable String itemName) {
        ItemDto itemDto = new ItemDto ( );
        itemService.findByItemName (itemName).ifPresent (item -> {
            itemDto.setItemName (item.getItemName ( ));
            itemDto.setItemPrice (item.getItemPrice ( ));
            itemDto.setItemDescriptions (item.getItemDescriptions ( ));
        });
        String htmlText1 = "<div style=\"text-align:center;\">" + "<h1>Fish Wholesale Store</h1>" + "<div style=\"text-align:left;\">" + "<h2>Product name: " + itemName
                + "</h2>" + "<div style=\"text-align:left;\">" + "<h2>Product price: " + itemDto.getItemPrice ( ) + "</h2>";
        String image = "<h1>" + itemDto.getItemDescriptions ( ) + "</h1>" + "<img src=https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Bluefin-big.jpg/1024px-Bluefin-big.jpg></img>";

        return htmlText1 + image;
    }
//    @GetMapping(value = "items/{name}")
//    @ResponseStatus(HttpStatus.OK)
//    public String getItemByName(@PathVariable String name) {
//        String htmlText = "<div style=\"text-align:center;\">"
//                + "<p>Fish Wholesale Store</p>" +
//                "<h1>Available Products </h1>" +
//                "<img src=https://www.pilotonline.com/resizer/7bQ5-hekLPP3OHZ1QECd3erH24A=/415x198/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com/public/YLEFAHRMEFCMFO34O7QIQJNCHY.jpg></img>"
//                + "</div>";
//
//        return htmlText + itemService.findByItemName (name);
//    }
////
//    @GetMapping("/items/price")
//    @ResponseBody
//    public String showItemPriceByItemId(@RequestParam Long itemId) {
//        Item item =itemService.getItemPriceByItemId ();
//        itemService.getItemPriceByItemId (itemId);
//
//       return "The price for 1kg of "+ item.getItemName ()+" is : " +item.getItemPrice ();
//
//    }
}