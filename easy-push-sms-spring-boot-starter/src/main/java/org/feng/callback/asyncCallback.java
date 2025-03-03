package org.feng.callback;

/**
 * @author feng
 *  2022/6/27 17:03
 *  async回调
 */
public interface asyncCallback {
    /**
     * async 回调 需要实现这个接口 进行实现
     *
     * @param body 返回实体
     */
    public void callback(Object body);
}
