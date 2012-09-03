package annotationDefinition;

import annotationApplication.MethodAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MethodAnnotationFinder {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazz = Class.forName("annotationDefinition.MethodAnnotationUsage");
        Method method = clazz.getDeclaredMethod("testMethod");
        Annotation annotation = method.getAnnotation(MethodAnnotation.class);
        MethodAnnotation annotation1 = (MethodAnnotation) annotation;
        System.out.println("annotationed method name -- > " + annotation1.methodName());
        System.out.println("annotationed method's return type -- > " + annotation1.methodReturnType());
    }
}
