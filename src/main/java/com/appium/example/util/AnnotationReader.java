package com.appium.example.util;

import com.appium.example.annotation.Feature;
import org.testng.ITestResult;

import java.lang.reflect.Method;

public class AnnotationReader {
    public static String getFeatureInTestMethod(ITestResult iTestResult) {
        String featureName = null;
        Method method = iTestResult.getMethod().getConstructorOrMethod().getMethod();
        Feature feature = method.getAnnotation(Feature.class);

        if (feature != null) {
            featureName = feature.value();
        }

        return featureName;
    }
}
