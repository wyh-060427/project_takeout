package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCardService {

    /**
     * 添加商品（菜品或套餐）进入购物车
     * @param shoppingCartDTO
     */
    void addShoppingCard(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车
     */
    void cleanShoppingCard();

    /**
     * 减少购物车商品（菜品或套餐）
     * @param shoppingCartDTO
     */
    void subShoppingCard(ShoppingCartDTO shoppingCartDTO);
}
