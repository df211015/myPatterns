package com.example.compositepattern.service.v2;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    public Composite(String name) {
        super(name);
    }

    //构建节点容器
    private List<Component> componentArrayList = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    @Override
    public void display(int depth) {
        //输出树形结构
        for (int i = 0; i < depth; i++) {
            System.out.print('-');
        }
        System.out.println(this.getName());

        //下级遍历
        for (Component component : this.componentArrayList) {
            //这里会根据不同实例的类型调用各自的display方法
            component.display(depth + 1);
        }
    }
}
