package com.baidu.monitor.utils.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonitorResponse<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public MonitorResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MonitorResponse<T> success() {
        this.code = 0;
        this.msg = "success";
        return this;
    }

    public MonitorResponse<T> success(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
        return this;
    }
}
