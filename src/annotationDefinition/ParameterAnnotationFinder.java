package annotationDefinition;

import annotationApplication.ParameterAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParameterAnnotationFinder {

    public void parameterAnnotationFinder() throws NoSuchMethodException {
        Class<?> clazz = ParameterAnnotationUsage.class;
        Method method = clazz.getMethod("testMethod", int.class);
        Annotation[][] annotations = method.getParameterAnnotations();
        //Method.getParameterAnnotations() method returns a two-dimensional Annotation array,
        // containing an array of annotations for each method parameter.
        Class<?>[] parameterTyeps = method.getParameterTypes();

        int i = 0;
        for (Annotation[] annotation : annotations) {
            Class<?> parameterTyep = parameterTyeps[i++];
            for (Annotation annotation1 : annotation) {
                ParameterAnnotation parameterAnnotation1 = (ParameterAnnotation) annotation1;
                System.out.println("annotation paraName : " + parameterAnnotation1.parameterName());
                System.out.println("annotation paraType : " + parameterAnnotation1.parameterType());
                System.out.println("parameter Type : " + parameterTyep);
            }
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        new ParameterAnnotationFinder().parameterAnnotationFinder();
    }
}
