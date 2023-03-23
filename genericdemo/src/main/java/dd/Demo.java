package dd;


import dd.service.v1.Apple;
import dd.service.v1.Fruit;
import dd.service.v1.Orange;
import dd.service.v1.Plate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Demo implements Runnable {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Demo.class);
        application.setBannerMode(Banner.Mode.LOG);
        application.setWebEnvironment(true);
        application.run(args);
        log.info("hello");
    }

    @Override
    public void run() {
        //Apple  extends  Fruit  Apple类 继承于Fruit类
        //Orange extends  Fruit  Orange类 继承于Fruit类
        Plate<Apple> pa = new Plate<Apple>(new Apple("苹果","红色"));
        Plate<Fruit> pf = new Plate<Fruit>(new Fruit("水果"));


        //这种写法报错
//        Plate<Fruit> p1 = new Plate<Apple>(new Apple("苹果","红色"));

        //上界通配符，限定了泛型T的上界，就是说参数的类型必须是其指定的类型（这里是Fruit）的子类。作用是：限定只能传递指定类（这里是Fruit）的子类
        //上界<? extends T>不能往里存，只能往外取
        //将?代表实际类型，T代表我们限定的父类。<? extends T>就可以理解为:可以使用任意的类型，只需要满足实际类型?是T的子类。
        Plate<? extends Fruit> p2 = new Plate<Apple>(new Apple("苹果","红色"));
        p2.get();
//        p2.set(new Apple("苹果","红色"));//使用set方法报错


        //这种写法报错
//        Plate<Apple> p3 = new Plate<Fruit>(new Orange("桔子","黄色"));

        //下界通配符。限定了泛型T的下界，就是说参数的类型必须是其指定的类型（这里是Apple）的父类。作用是：限定只能传递指定类（这里是Apple）的父类（可以用该父类的其他子类，但是需要用父类包装）
        //下界<? super T>不影响往里存，但往外取只能放在Object对象里然后进行强转
        //将?代表实际类型，T代表我们限定的子类。<? super T>就可以理解为:可以使用任意的类型，只需要满足实际类型?是T的父类。
        Plate<? super Apple> p4 = new Plate<Fruit>(new Orange("桔子","黄色"));
        p4.set(new Apple("苹果","青色"));
        Fruit fruit = (Fruit)p4.get();//get方法返回的是object，需要强制转型
        Orange orange = (Orange)p4.get();//get方法返回的是object，需要强制转型
        System.out.println(fruit.getName());
        System.out.println(orange.getName());
    }
}
