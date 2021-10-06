public class sayHelloTime {
    public String say(String name) {
        //聚合后，Maven2成功依赖Maven1后，能成功导入Maven1的类
        sayHello sayhello = new sayHello();
        return sayhello.say(name) + " morning";
    }
}
