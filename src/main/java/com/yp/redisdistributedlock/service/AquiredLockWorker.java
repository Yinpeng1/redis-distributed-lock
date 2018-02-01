package com.yp.redisdistributedlock.service;

public interface AquiredLockWorker<T> {

    T invokeAfterLockAquire() throws Exception;
}
