package com.appium.example.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {
    private static final String formattedTimestamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
    private ExtentReportService extentReportService;

    @Override
    public void onStart(ITestContext iTestContext) {
        extentReportService = new ExtentReportService();
        extentReportService.initializeExtentReporter(formattedTimestamp);
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        extentReportService.updateExtentReport(iTestResult, formattedTimestamp);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        extentReportService.updateExtentReport(iTestResult, formattedTimestamp);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        extentReportService.updateExtentReport(iTestResult, formattedTimestamp);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        extentReportService.flushExtentReport();
    }
}
