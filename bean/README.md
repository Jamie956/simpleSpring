# Spring

## Bean

### Annotation
1. 定义Bean，类注解@Component，如果变量注入另一个类，使用注解@Autowired
2. new AnnotationConfigApplicationContext()
3. scan()，扫描包下的注解
4. getBean(Bean.class) 获取bean
5. close() 关闭了就不能再获取bean

### Config
1. 使用@Configuration定义配置类，使用@Bean定义方法
2. new AnnotationConfigApplicationContext()
3. getBean(String) 根据方法名获取bean
4. close()

### XML
1. XML
bean.id 
bean.class 
bean.property.name
bean.property.value

2. new ClassPathXmlApplicationContext()
3. getBean(String) 根据方法名获取bean

