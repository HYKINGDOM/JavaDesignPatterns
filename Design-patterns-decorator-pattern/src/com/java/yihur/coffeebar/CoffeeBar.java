package com.java.yihur.coffeebar;

import com.java.yihur.coffeebar.coffee.Cappuccino;
import com.java.yihur.coffeebar.coffee.Decaf;
import com.java.yihur.coffeebar.decorator.Chocolate;
import com.java.yihur.coffeebar.decorator.Milk;
import com.java.yihur.coffeebar.juice.OrangeJuiceBase;

/**
 * 装饰器模式实践
 *
 * @author yihur
 */
public class CoffeeBar {

    public static void main(String[] args) {
        BaseDrink order;
        System.out.println("****************");
        //一杯低咖
        order = new Decaf(2);
        //加一份牛奶
        order = new Milk(order);
        //加一份巧克力
        order = new Chocolate(order);
        //再加一份巧克力
        order = new Chocolate(order);
        //再来份橙汁
        order = new OrangeJuiceBase(order);
        System.out.println("order1 desc:" + "\n" + order.getDescription());
        System.out.println("order1 price:" + order.cost());
        System.out.println("****************");
    }
}
