package annotationDefinition;

import annotationApplication.MethodAnnotation;

public class MethodAnnotationUsage {

    @MethodAnnotation(methodName = "testMethod", methodReturnType = "void")
    public void testMethod(){
    }
}
