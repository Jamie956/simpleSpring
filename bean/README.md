# Spring

## Bean

### annotation
1. 定义Bean，类注解@Component，如果变量注入另一个类，使用注解@Autowired
2. new AnnotationConfigApplicationContext()
3. scan()，扫描包下的注解
4. getBean(Book.class) 获取bean
5. close() 关闭了就不能再获取bean