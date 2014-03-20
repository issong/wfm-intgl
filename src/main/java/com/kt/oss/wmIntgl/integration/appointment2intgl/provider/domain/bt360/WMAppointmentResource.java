package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.bt360;

import com._360scheduling.schema.dsscheduledata.DsScheduleData;

import java.io.Serializable;


@SuppressWarnings("serial")
public class WMAppointmentResource implements Serializable {

    private DsScheduleData.Activity activity;
    private DsScheduleData.ActivitySLA activity_SLA;
    private DsScheduleData.ActivitySLA activity_SLA1;
    private DsScheduleData.ActivityStatus activityStatus;
    private DsScheduleData.Location location;
    private DsScheduleData.LocationRegion locationRegion;
    private DsScheduleData.AdditionalAttribute additionalAttribute;

    public DsScheduleData.AdditionalAttribute getAdditionalAttribute() {
        return additionalAttribute;
    }

    public void setAdditionalAttribute(DsScheduleData.AdditionalAttribute additionalAttribute) {
        this.additionalAttribute = additionalAttribute;
    }

    public DsScheduleData.LocationRegion getLocationRegion() {
        return locationRegion;
    }

    public void setLocationRegion(DsScheduleData.LocationRegion locationRegion) {
        this.locationRegion = locationRegion;
    }

    public DsScheduleData.ActivityStatus getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(DsScheduleData.ActivityStatus activityStatus) {
        this.activityStatus = activityStatus;
    }

    public DsScheduleData.Location getLocation() {
        return location;
    }

    public void setLocation(DsScheduleData.Location location) {
        this.location = location;
    }

    public DsScheduleData.Activity getActivity() {
        return activity;
    }

    public void setActivity(DsScheduleData.Activity activity) {
        this.activity = activity;
    }

    public DsScheduleData.ActivitySLA getActivity_SLA() {
        return activity_SLA;
    }

    public void setActivity_SLA(DsScheduleData.ActivitySLA activity_SLA) {
        this.activity_SLA = activity_SLA;
    }

    public DsScheduleData.ActivitySLA getActivity_SLA1() {
        return activity_SLA1;
    }

    public void setActivity_SLA1(DsScheduleData.ActivitySLA activity_SLA1) {
        this.activity_SLA1 = activity_SLA1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\r\nWMAppointmentResource [activity=");
        builder.append(activity);
        builder.append("\r\n, activity_SLA=");
        builder.append(activity_SLA);
        builder.append("\r\n, activity_SLA1=");
        builder.append(activity_SLA1);
        builder.append("\r\n, activityStatus=");
        builder.append(activityStatus);
        builder.append("\r\n, location=");
        builder.append(location);
        builder.append("\r\n, locationRegion=");
        builder.append(locationRegion);
        builder.append("]");
        return builder.toString();
    }
}
