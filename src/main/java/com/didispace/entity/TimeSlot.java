package com.didispace.entity;

import java.util.Date;

public class TimeSlot {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_slot.time_slot_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private Integer timeSlotId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_slot.day
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private String day;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_slot.start_time
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_slot.end_time
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_slot.time_slot_id
     *
     * @return the value of time_slot.time_slot_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public Integer getTimeSlotId() {
        return timeSlotId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_slot.time_slot_id
     *
     * @param timeSlotId the value for time_slot.time_slot_id
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void setTimeSlotId(Integer timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_slot.day
     *
     * @return the value of time_slot.day
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public String getDay() {
        return day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_slot.day
     *
     * @param day the value for time_slot.day
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_slot.start_time
     *
     * @return the value of time_slot.start_time
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_slot.start_time
     *
     * @param startTime the value for time_slot.start_time
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_slot.end_time
     *
     * @return the value of time_slot.end_time
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_slot.end_time
     *
     * @param endTime the value for time_slot.end_time
     *
     * @mbg.generated Tue Apr 23 16:09:01 CST 2019
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}