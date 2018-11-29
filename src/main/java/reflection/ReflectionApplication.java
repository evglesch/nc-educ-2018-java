package reflection;

import reflection.classes.SomeClass;
import reflection.classes.annotations.AnnotationProcessor;

public class ReflectionApplication {

    public static void main(String[] args) {
        // --- wait for smart NPE message
        SomeClass someClass = new SomeClass();
        someClass.test();

        // --- use annotation processor
        AnnotationProcessor annotationProcessor = new AnnotationProcessor("reflection/classes");
        annotationProcessor.injectDependencies(someClass);

        // --- test after magic is done
        someClass.test();
    }
}
