package com.tencent.wxcloudrun.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Code2Session {
    private String appid;
    private String sercret;
    private String js_code;
    private String grant_type;
}
