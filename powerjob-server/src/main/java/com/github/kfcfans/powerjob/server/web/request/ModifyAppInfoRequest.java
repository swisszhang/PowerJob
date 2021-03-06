package com.github.kfcfans.powerjob.server.web.request;

import com.github.kfcfans.powerjob.common.PowerJobException;
import com.github.kfcfans.powerjob.common.utils.CommonUtils;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * 修改应用信息请求
 *
 * @author tjq
 * @since 2020/4/1
 */
@Data
public class ModifyAppInfoRequest {

    private Long id;
    private String appName;
    private String password;

    public void valid() {
        CommonUtils.requireNonNull(appName, "appName can't be empty");
        if (StringUtils.containsWhitespace(appName)) {
            throw new PowerJobException("appName can't contains white space!");
        }
    }
}
