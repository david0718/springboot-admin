package com.loop.demo.admin.dector;

/**
 * @Auther: 霍运浩
 * @Date: 2019/3/16 0016 21:30
 * @Description:
 */
public class Sandal extends Decorator {
    @Override
    public void show() {
        System.out.println("穿Sandal");
        super.show();
    }
}
