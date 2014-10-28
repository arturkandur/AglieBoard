package com.engagepoint.university.exam.entity;

/**
 * Created by arturkandur on 23.10.14.
 */
public enum TaskStatus {

    TODO("TODO"),
    IN_PROGRESS("IN PROGRESS"),
    ON_QA("ON QA"),
    DONE("DONE");

    private final String status;

    /**
     * @param status
     */
    private TaskStatus(final String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }

}
