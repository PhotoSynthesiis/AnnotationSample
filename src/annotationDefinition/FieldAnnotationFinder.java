package annotationDefinition;

import annotationApplication.FieldAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class FieldAnnotationFinder {
    public static void main(String args[]) {
        Class<?> clazz = FieldAnnotationUsage.class;
        Field[] fields = clazz.getDeclaredFields();
        Annotation[] annotation = null;

        for (int i = 0; i < fields.length; i++) {
            annotation = fields[i].getDeclaredAnnotations();
            for (int j = 0; j < annotation.length; j++) {
                FieldAnnotation fieldAnnotation = (FieldAnnotation) annotation[j];
                System.out.println(" field's annotation type value -- > " + fieldAnnotation.fieldType());
                System.out.println(" field's annotation modifier value -- > " + fieldAnnotation.fieldModifier());
            }
            System.out.println(" annotationed field's name -- > " + fields[i].getName());
        }
    }
}
