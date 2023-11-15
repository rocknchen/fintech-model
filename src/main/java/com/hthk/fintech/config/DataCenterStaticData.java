package com.hthk.fintech.config;

import com.hthk.fintech.model.data.datacenter.query.SnapshotImageEnum;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 18:14
 */
public class DataCenterStaticData {

    public static final List<SnapshotImageEnum> WHITE_LIST_FILE_SUPPORTED_IMAGE_TYPE
            = Arrays.asList(SnapshotImageEnum.LATEST);

    public static final String KW_FOLDER_NAME_TRADE = "TRADE/dc";

    public static final String KW_FILE_NAME_TRADE = "TRADE";

    public static final String KW_DATACENTER_FILE_NAME_PREFIX = "DATA_CENTER";

}
