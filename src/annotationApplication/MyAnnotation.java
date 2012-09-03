package annotationApplication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//Indicates how long annotations with the annotated type are to be retained
@Target(ElementType.TYPE)
/*********************【@Retention用来告知编译程序如何处理注解】********************************************************/
//java.lang.annotation.Retention型态可以在定义Annotation型态时，指示编译程序如何对待自定义的Annotation型态
//预设上编译程序会将Annotation信息留在.class档案中，但不被虚拟机读取，仅用于编译程序或工具程序运行时提供信息
//在使用Retention型态时，需要提供java.lang.annotation.RetentionPolicy的枚举型态
//java.lang.annotation.RetentionPolicy.CLASS----默认值。编译程序将Annotation储存于class档中
//java.lang.annotation.RetentionPolicy.SOURCE---编译程序处理完Annotation信息后就完成任务
//                                              该注释将不被记录在类文件中，而只是存在于.java文件中
//java.lang.annotation.RetentionPolicy.RUNTIME--编译程序将Annotation储存于class档中，可由JVM读入
//                                              即编译器将把注释记录在类文件中，在运行时JVM将保留注释
//                                              故可搭配反射(Reflection)机制让JVM读取Annotation信息
public @interface MyAnnotation {
    public String name();

    public int age();
}
