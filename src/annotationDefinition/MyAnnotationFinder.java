package annotationDefinition;

import annotationApplication.MyAnnotation;

import java.lang.annotation.Annotation;

public class MyAnnotationFinder {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> myAnnotationUsage = Class.forName("annotationDefinition.MyAnnotationUsage");
        Annotation[] annotations = myAnnotationUsage.getAnnotations();
        for(Annotation annotation : annotations) {
            MyAnnotation annotation1 = (MyAnnotation)annotation;
            System.out.println("annotation's name value -- > " + annotation1.name());
            System.out.println("annotation's age value -- > " + annotation1.age());
        }
    }
}
