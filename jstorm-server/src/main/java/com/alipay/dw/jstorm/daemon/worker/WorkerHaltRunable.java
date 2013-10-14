package com.alipay.dw.jstorm.daemon.worker;

import com.alibaba.jstorm.common.JStormUtils;
import com.alipay.dw.jstorm.callback.RunnableCallback;

public class WorkerHaltRunable extends RunnableCallback {
    
    @Override
    public void run() {
        JStormUtils.halt_process(1, "Task died");
    }
    
}
