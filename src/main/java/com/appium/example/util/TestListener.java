package com.appium.example.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {
    private static final String FORMATTED_TIMESTAMP = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
    private ExtentReportService extentReportService;

    @Override
    public void onStart(ITestContext iTestContext) {
        extentReportService = new ExtentReportService();
        extentReportService.initializeExtentReporter(FORMATTED_TIMESTAMP);
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        // This callback is intentionally left empty.
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        extentReportService.updateExtentReport(iTestResult, FORMATTED_TIMESTAMP);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        extentReportService.updateExtentReport(iTestResult, FORMATTED_TIMESTAMP);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        extentReportService.updateExtentReport(iTestResult, FORMATTED_TIMESTAMP);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        // This callback is intentionally left empty.
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        extentReportService.flushExtentReport();
    }
}
