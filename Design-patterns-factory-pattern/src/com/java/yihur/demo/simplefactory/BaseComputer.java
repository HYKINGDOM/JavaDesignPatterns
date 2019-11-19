package com.java.yihur.demo.simplefactory;

/**
 * @author yihur
 */
public abstract class BaseComputer {

    /**
     * 内存
     * @return
     */
    public abstract String getRAM();

    /**
     * 显卡
     * @return
     */
    public abstract String getNvidia();

    /**
     * 硬盘
     * @return
     */
    public abstract String getHDD();

    /**
     * CPU
     * @return
     */
    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + "NVIDIA=" + this.getNvidia() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
