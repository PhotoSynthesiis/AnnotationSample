package annotationDefinition;

import annotationApplication.ParameterAnnotation;

public class ParameterAnnotationUsage {
    public void testMethod(@ParameterAnnotation(parameterName = "pname", parameterType = "int") int value) {
        value = 10;
    }
}
