package annotationDefinition;

import annotationApplication.FieldAnnotation;

public class FieldAnnotationUsage {
    @FieldAnnotation(fieldType = "int", fieldModifier = "public")
    public double i = 0.01;

    @FieldAnnotation(fieldType = "String", fieldModifier = "private")
    private String testString;
}
