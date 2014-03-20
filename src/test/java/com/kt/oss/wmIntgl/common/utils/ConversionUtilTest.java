package com.kt.oss.wmIntgl.common.utils;

import java.util.Date;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com._360scheduling.schema.dsscheduledata.DsScheduleData.ActivityStatus;
import com._360scheduling.schema.dsscheduledata.ObjectFactory;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrderStatus;

public class ConversionUtilTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetXMLGregorianCalendarDate()
			throws ConversionException {
		XMLGregorianCalendar c = ConversionUtil
				.getXMLGregorianCalendar(new Date());

		System.err.println(c.toString());
	}

	@Test
	public final void testGetXMLGregorianCalendar() {
	}

	@Test
	public final void testGetStringToDate() {
	}

	@Test
	public final void testGetStringToXMLGregorianCalendar() {
	}

	@Test
	public final void testGetXMLGregorianCalendarToString() {
	}

	@Test
	public final void testGetStringToBoolean() {
	}

	@Test
	public final void testGetStringToFloat() {
	}

	@Test
	public final void testGetStringToInt() {
	}

	@Test
	public final void testGetIntToDurationLong() throws ConversionException {
		System.err.println(ConversionUtil.getIntToDuration(60 * 60 * 24 * 30
				* 1000));
	}

	@Test
	public final void testGetIntToDurationBooleanIntIntIntInt()
			throws ConversionException {
		System.err.println(ConversionUtil.getIntToDuration(true, 30, 0, 0, 0));
		System.err.println(ConversionUtil.getIntToDuration(true, 0, 0, 0, 60));

		Duration d = ConversionUtil.getIntToDuration(true, 0, 1, 30, 5);
		System.err.println(d.toString());

		System.err.println(String.valueOf(d.getHours()));
		System.err.println(String.valueOf(d.getMinutes()));
		System.err.println(String.valueOf(d.getSeconds()));

		ActivityStatus order = new ObjectFactory()
				.createDsScheduleDataActivityStatus();
		order.setDuration(d);

		int mins = (order.getDuration().getHours() * 60)
				+ order.getDuration().getMinutes();

		System.err.println(mins);
	}

	@Test
	public final void testGetIntToDurationBooleanIntIntIntInt1()
			throws ConversionException {
		WMWorkOrderStatus order = new WMWorkOrderStatus();
		order.setDuration("25");

		int hours = (Integer.parseInt(order.getDuration()) / 60);
		int mins = (Integer.parseInt(order.getDuration()) % 60);

		System.err.println(hours);
		System.err.println(mins);
	}
}
