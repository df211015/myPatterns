package com.example.compositepattern;

import com.example.compositepattern.service.customize.College;
import com.example.compositepattern.service.customize.Department;
import com.example.compositepattern.service.customize.OrganizationComponent;
import com.example.compositepattern.service.customize.University;
import com.example.compositepattern.service.simple.Component;
import com.example.compositepattern.service.simple.Composite;
import com.example.compositepattern.service.simple.Leaf;
import com.example.compositepattern.service.v3.BaseComponent;
import com.example.compositepattern.service.v3.Function;
import com.example.compositepattern.service.v3.Menu;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositepatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CompositepatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动成功!");

//		//首先产生总经理CEO
//		Branch root = new Branch("王大麻子","总经理",100000);
//		//把三个部门经理产生出来
//		Branch developDep = new Branch("刘大瘸子","研发部门经理",10000);
//		Branch salesDep = new Branch("马二拐子","销售部门经理",20000);
//		Branch financeDep = new Branch("赵三驼子","财务部经理",30000);
//
//		//再把三个小组长产生出来
//		Branch firstDevGroup = new Branch("杨三乜斜","开发一组组长",5000);
//		Branch secondDevGroup = new Branch("吴大棒槌","开发二组组长",6000);
//
//		//把所有的小兵都产生出来
//		Leaf a = new Leaf("a","开发人员",2000);
//		Leaf b = new Leaf("b","开发人员",2000);
//		Leaf c = new Leaf("c","开发人员",2000);
//		Leaf d = new Leaf("d","开发人员",2000);
//		Leaf e = new Leaf("e","开发人员",2000);
//		Leaf f = new Leaf("f","开发人员",2000);
//		Leaf g = new Leaf("g","开发人员",2000);
//		Leaf h = new Leaf("h","销售人员",5000);
//		Leaf i = new Leaf("i","销售人员",4000);
//		Leaf j = new Leaf("j","财务人员",5000);
//		Leaf k = new Leaf("k","CEO秘书",8000);
//		Leaf zhengLaoLiu = new Leaf("郑老六","研发部副经理",20000);
//
//		//开始组装
//		//CEO下有三个部门经理和一个秘书
//		root.addSubordinate(k);
//		root.addSubordinate(developDep);
//		root.addSubordinate(salesDep);
//		root.addSubordinate(financeDep);
//
//		//研发部经理
//		developDep.addSubordinate(zhengLaoLiu);
//		developDep.addSubordinate(firstDevGroup);
//		developDep.addSubordinate(secondDevGroup);
//
//		//看看开发两个开发小组下有什么
//		firstDevGroup.addSubordinate(a);
//		firstDevGroup.addSubordinate(b);
//		firstDevGroup.addSubordinate(c);
//		secondDevGroup.addSubordinate(d);
//		secondDevGroup.addSubordinate(e);
//		secondDevGroup.addSubordinate(f);
//
//		//再看销售部下的人员情况
//		salesDep.addSubordinate(h);
//		salesDep.addSubordinate(i);
//
//		//最后一个财务
//		financeDep.addSubordinate(j);
//
//		System.out.println(root.getInfo());
//
//		printInfo(root);

//        //创建根节点及其子节点
//        Composite root = new Composite("root");
//        root.add(new Leaf("Leaf A"));
//        root.add(new Leaf("Leaf B"));
//
//        //创建第二层节点及其子节点
//        Composite branch = new Composite("Composite X");
//        branch.add(new Leaf("Leaf XA"));
//        branch.add(new Leaf("Leaf XB"));
//        root.add(branch);
//
//        //创建第三层节点及其子节点
//        Composite branch2 = new Composite("Composite XY");
//        branch2.add(new Leaf("Leaf XYA"));
//        branch2.add(new Leaf("Leaf XYB"));
//        branch.add(branch2);
//
//        //创建第二层节点
//        root.add(new Leaf("Leaf C"));
//
//        //创建第二层节点并删除
//        Leaf leaf = new Leaf("Leaf D");
//        root.add(leaf);
//        root.remove(leaf);
//
//        //打印
//        root.display(1);

        /**
         * 实现组合模式示例
         */
//        Composite root = new Composite();
//        root.doSomething();
//
//        Composite branch = new Composite();
//        Leaf leaf = new Leaf();
//
//        root.add(branch);
//        branch.add(leaf);
//
//        display(root);

        /**
         * 组合模式demo
         */
        //创建大学
//        OrganizationComponent university = new University("清华大学", " 中国顶级大学 ");
//        //创建学院
//        OrganizationComponent computerCollege = new College("计算机学院", " 计算机学院 ");
//        OrganizationComponent infoEngineercollege = new College("信息工程学院", " 信息工程学院 ");
//
//        //创建计算机学院下面的专业
//        computerCollege.add(new Department("软件工程", " 软件工程不错 "));
//        computerCollege.add(new Department("网络工程", " 网络工程不错 "));
//        computerCollege.add(new Department("计算机科学与技术", " 计算机科学与技术是老牌的专业 "));
//        //创建信息工程学院下面的专业
//        infoEngineercollege.add(new Department("通信工程", " 通信工程不好学 "));
//        infoEngineercollege.add(new Department("信息工程", " 信息工程好学 "));
//
//        //将学院加入到大学
//        university.add(computerCollege);
//        university.add(infoEngineercollege);
//
//        university.print();

        BaseComponent root = new Menu(1, "门店业务", "mendian/index", "", "门店业务");
        root.add(new Function(10, "账号管理", "zh/index", "", "账号管理"));
        BaseComponent mendianGuanli = new Menu(20, "检测管理", "taochejian/index", "", "检测管理");
        mendianGuanli.add(new Function(21, "外观检测", "wg/index", "", "外观检测"));
        mendianGuanli.add(new Function(31, "内饰检测", "ns/index", "", "内饰检测"));
        root.add(mendianGuanli);
        root.add(new Function(40, "车源管理", "cy/index", "", "车源管理"));
        root.showData(0);
    }

    private static void display(Component component) {
        for (Component item : component.getChildren()) {
            if (item instanceof Leaf) {
                item.doSomething();
            } else {
                display(item);
            }
        }
    }

//	private void printInfo(Branch root){
//		for(Corp item:root.getSubordinate()) {
//			if(item instanceof Leaf){
//				System.out.println(item.getInfo());
//			}else{
//				System.out.println(item.getInfo());
//				printInfo((Branch) item);
//			}
//		}
//	}
}
