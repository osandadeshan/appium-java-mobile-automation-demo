package com.appium.example.constant;

import static com.appium.example.util.PropertyReader.getReporterConfig;

public class ReporterConstants {
    public static final String EXTENT_FULL_REPORT_DIRECTORY = getReporterConfig("extent_full_report_dir");
    public static final String REPORT_FILE_NAME_PREFIX = getReporterConfig("extent_report_file_name_prefix");
    public static final String REPORTER_THEME = getReporterConfig("extent_reporter_theme");
    public static final String DOCUMENT_TITLE = getReporterConfig("extent_document_title");
    public static final String REPORT_NAME = getReporterConfig("extent_reporter_name");
    public static final String APPLICATION_NAME = getReporterConfig("application_name");
    public static final String SCREENSHOTS_DIRECTORY = getReporterConfig("extent_screenshots_dir");
    public static final String TEST_DEVELOPER = getReporterConfig("test_developer");
}
