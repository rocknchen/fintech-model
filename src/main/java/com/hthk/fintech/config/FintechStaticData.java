package com.hthk.fintech.config;

import com.hthk.fintech.enumration.EventProcessStatusEnum;

import java.time.format.DateTimeFormatter;
import java.util.*;

public class FintechStaticData {

    public static final String DOMAIN_CALYPSO = "CALYPSO";

    public static final String DEFAULT_CLASS_PATH = "fintech";

    public static String CHARSET_GBK = "GBK";

    public static String CHARSET_GB2312 = "GB2312";

    public static String DEFAULT_FILE_CHARSET_NAME = "utf-8";

    public static final String DEFAULT_PACKAGE = "com.hthk";

    public static final String DEFAULT_APP_CONTEXT_FILE = "fintech/context-local.xml";

    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    public static final String BASIC_DATE_FORMAT = "yyyyMMdd";

    public static final String BASIC_FILE_NAME_DATE_TIME_FORMAT = "yyyyMMdd_HHmmss";

    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final DateTimeFormatter DEFAULT_DATE_TIME_FORMAT_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT);

    public static final String SIMPLE_DATE_TIME_FORMAT = "yyyyMMdd_HHmmss";

    public static final String KW_SAVE_EVENT = "SAVE EVENT";

    public static final String KW_EVENT_TIME = "EVENT TIME";

    public static final String KW_DATE_MONTH = "DATE MONTH";

    public static final String LOG_FORMAT_ONE_MODEL = "{}: {}";

    public static final String KW_EVENT_FILE_NAME = "event_#yyyyMMdd#.csv";

    public static final String KW_ENGINE_FILE_NAME = "engine_#yyyyMMdd#.csv";

    public static final String KW_GET = "get";

    public static final String KW_EVENT_GROUP_GET_FUNCTION_NAME = "getGroup";

    public static final String KW_NEW_INSTANCE_METHOD_NAME = "newInstance";

    public static final String DEFAULT_NA_STRING = "NA";

    public static final String KW_REQUEST_FILE = "req_file";

    public static final String QUARTZ_DEFAULT_GROUP = "ROCK_LOCAL";

    public static final List<EventProcessStatusEnum> EVENT_PROCESS_DONE_STATUS_LIST
            = Arrays.asList(EventProcessStatusEnum.DONE, EventProcessStatusEnum.SKIPPED, EventProcessStatusEnum.FAILED);

    public static final String ROCK_HTSC_EMAIL = "rockchen@htsc.com";

    public static final String ROCK_PERSONAL_EMAIL = "fatlon@sina.cn";

    public static final String ROCK_SIGN_EMAIL = "Rock CHEN";

    public static final List<String> EMAIL_RECEIVER_TEST_LIST = Arrays.asList(ROCK_HTSC_EMAIL);

    public static final List<String> EMAIL_CC_TEST_LIST = Arrays.asList(ROCK_PERSONAL_EMAIL);

    public static final String KW_APP_VERSION = "appVersion";

    public static final String KW_HTTP_REQUEST = "httpRequest";

    public static final String LOG_WRAP = "{}:\r\n{}";

    public static final String LOG_DEFAULT = "{}: {}";

}
