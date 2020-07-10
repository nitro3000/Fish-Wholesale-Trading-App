package com.go2it.fish_wholesale_trading_test.controller;


import com.go2it.fish_wholesale_trading_test.dto.ItemDto;
import com.go2it.fish_wholesale_trading_test.entity.Item;
import com.go2it.fish_wholesale_trading_test.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
public class ItemController {
    @Autowired
    private IItemService itemService;

    @GetMapping("/")
    public String mainPage() {
        //return "mainPage.html";
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

    @PostMapping(value = "/items")
    public Item createItem(@RequestBody Item item) {
        itemService.save (item);
        return item;
    }


    @GetMapping(value = "items/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getItemById(@PathVariable long id) {


        Optional<Item> itemId = itemService.findById (id);
        return itemId.toString ();

//        //itemService.findByItemName (itemName);
//        String image = "<div style=\"text-align:center;\">" + "<h1>Fish Wholesale Store</h1>" + "<img src=https://www.pilotonline.com/resizer/7bQ5-hekLPP3OHZ1QECd3erH24A=/415x198/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com" +
//                "/public/YLEFAHRMEFCMFO34O7QIQJNCHY.jpg></img>";
//        String htmlText1 = "<div style=\"text-align:left;\"><p> Product Code: </p>" + id +" is - " + itemName ;


//        List<Item> itemList = itemService.findAll ( );
//        for (Item item : itemList) {
//             item.getItemName ( );
//        }

//        return image + "   " + htmlText1;


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