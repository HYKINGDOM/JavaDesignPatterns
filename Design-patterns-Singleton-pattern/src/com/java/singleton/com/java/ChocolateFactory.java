package com.java;

/**
 * 单例模式基于多线程的优化
 * @author Administrator
 */
public class ChocolateFactory {

    private boolean empty;

    private boolean boiled;

    private volatile static ChocolateFactory uniqueInstance = null;

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    public static ChocolateFactory getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateFactory.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateFactory();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     * 添加原料巧克力动作
     */
    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
            System.out.println("--添加原料巧克力动作--");
        }
    }

    /**
     * 煮沸
     */
    public void boil() {
        if ((!empty) && (!boiled)) {
            boiled = true;
            System.out.println("--煮沸--");
        }
    }


    /**
     * 产出巧克力动作
     */
    public void drain() {
        if ((!empty) && boiled) {
            empty = true;
            System.out.println("--产出巧克力动作--");
        }
    }


}
