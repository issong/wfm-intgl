package com._360scheduling.schema.dsscheduledata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Shift_Pattern">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="period_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="period_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="day_pattern">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="7"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="start_time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="shift_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="split_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="time_zone" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="travel_with_resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_class_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="end_location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="split_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="min_split" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="do_on_site" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="date_time_created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="external_ref" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="date_time_open" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="base_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="interrupt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="cost_of_split" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="do_on_location_incentive" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="modelling_pattern_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="service_level" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="reactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity_SLA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sla_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="datetime_start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="datetime_end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="start_based" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SLA_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="penalty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="early_sla_benefit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="mechanism_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="base_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="end_proportion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="curve_shape" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="activity_ageing_factor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="curve_scaling_option" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="start_proportion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="generate_jeopardy_exceptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity_Group">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activity_id1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pre_co_req">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="min_delay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="max_delay" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="same_resource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="split_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="all_or_nothing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="keep_splits_together" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="overlap_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="base_value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="ignore_days_old" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="service_level" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="reactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity_Type_Skill">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skill_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="share_with_corequisites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity_Skill">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skill_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="share_with_corequisites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Skill">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Plan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="output_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="travel_type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="schedule_from" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="schedule_to" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="input_reference_date_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="input_reference_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="quality" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="last_plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="plan_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="diagnostics" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="time_taken" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="average_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="average_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="total_allocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="total_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="total_on_site_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_break_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_private_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="plan_margin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="input_reference_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="broadcast_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="licence_information" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="software_version" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="allocation_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="profile_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="load_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="appointment_window_end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Allocation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="activity_start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="activity_end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="visit_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="visit_type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="date_time_fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="fixed_resource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shift_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="shift_pattern_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="reason_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="same_location" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="allocation_source" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="commit_sort_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resource_Preference">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="preference" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="name" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="post_code_zip" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="address_line1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="128"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="address_line2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="128"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="city" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="region" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_geocode_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="state" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="addtime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="lack_of_coverage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="locality" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resources">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_start" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_end" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="max_travel" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="travel_to" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="travel_from" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="cost_ph" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="cost_phot" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="cost_km" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="first_name" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="surname" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="memo" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="max_call_activities_committed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="out_of_region_multiplier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="speedfactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="travel_location_geocode_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="profile_id_travel" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="travel_with_resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="contact_details" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resource_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="max_travel" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="travel_to" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="travel_from" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="cost_ph" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="cost_phot" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="cost_km" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="max_call_activities_committed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="location_id_start" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_end" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="speedfactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="hire_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="release_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="relocation_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="out_of_region_multiplier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="profile_id_travel" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resource_Skill">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skill_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="proficiency" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resource_Type_Skill">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resource_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="skill_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="proficiency" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity_Part">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="part_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="part_usage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Part">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="profile_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Availability">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="datetime_start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="datetime_end" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="appointment_request_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="start_based" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location_Region">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="region_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resource_Region">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="region_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="within_region_multiplier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Region">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="region_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resource_Part">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="part_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Shift">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_start" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_end" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="overtime_period" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="resource_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="snap_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="shift_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="split_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="max_no_activities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="profile_id_travel" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="travel_with_resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="max_travel" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="travel_from" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="travel_to" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="cost_ph" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="cost_phot" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="cost_km" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="early_end_leeway" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="late_end_leeway" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="addtime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="lack_of_coverage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Additional_Attributes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="label">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="label_value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="location_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="data_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="domain_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="display_style" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="external_ref" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Object_Deletion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="object_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk4">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name4">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Object_Group">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="group_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity_Class">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity_Status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="status_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="date_time_status" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="date_time_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="date_time_fixed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="highlight" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="memo" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="commit_sort_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="reason" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="duration_remaining" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="reason_value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="date_time_earliest" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Exception_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="message_text_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="activation_option" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Object_Exception">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="object_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="exception_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk4">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name4">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Object_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Shift_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="snap_time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="overtime_period" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="early_end_leeway" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="late_end_leeway" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Travel_Calculation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="from_location_geocode_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="to_location_geocode_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="time_taken" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="symmetric" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="from_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="to_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Schedule_Event">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="event_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="date_time_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="event_date_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Event_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="description">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="display_type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="message_text_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Schedule_Exception">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="schedule_exception_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="datetime_generated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Input_Reference">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="data_path" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="input_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="user_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="input_reference_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="input_reference_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="application_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="application_instance_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="schedule_data">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="load_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="appointment_utilisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="appointment_window_duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="licence_key" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="process_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="schedule_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="profile_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="input_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="internal_id_parent_dataset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Schedule_Exception_Data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="schedule_exception_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="label">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="label_message_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="reason_type_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Custom_URL">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="custom_action" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="URL_String">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="custom_url_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="string_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="URL_Parameter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="custom_url_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="parameter_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="parameter_value_table" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Broadcast_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Broadcast">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="broadcast_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cron_string" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="plan_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="minimum_plan_quality" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="minimum_step_interval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="once_only" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="maximum_wait" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="input_reference_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="maximum_frequency" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="allocation_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="expiry_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Broadcast_Parameter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="broadcast_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="parameter_name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="parameter_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comparison_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comparison_Exclusion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="comparison_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_column">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="default_value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Plan_Resource">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_margin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="average_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="average_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="total_allocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="total_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_on_site_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_break_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_private_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Plan_Route">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="route_margin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="average_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="average_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="total_allocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="shift_pattern_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="shift_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="shift_overtime_end" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="shift_actual_start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="shift_actual_end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="total_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_on_site_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_break_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_private_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Plan_Travel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="end_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="start_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="start_location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="end_location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="previous_activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="previous_visit_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="shift_pattern_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="schedule_event_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resource_Movement">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="movement_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Dataset">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="profile_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dataset_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="alias_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dataset_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="running_state">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="last_update_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="external_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="footprint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Availability_Pattern">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="period_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="period_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="day_pattern">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="7"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="open_time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="close_time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="location_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="appointment_request_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="time_zone" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="start_based" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Plan_Deletion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="object_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk4">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="object_pk_name4">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Appointment_Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="offer_expiry_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="appointment_window_length" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Appointment_Offer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appointment_request_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="offer_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="offer_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="offer_value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="reason_type_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Appointment_Offer_Response">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appointment_request_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="appointment_offer_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Broadcast_Result">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="broadcast_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="input_reference_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="broadcast_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Calendar">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="calendar_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="day_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ignore_shifts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Dataset_Segment_Mapping">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="datetime_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Modelling_Pattern">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="leeway" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="value_multiplier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="same_resource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="step" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="min_delay" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Custom_Exception">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="schedule_exception_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Custom_Exception_Data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="label">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="custom_exception_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Additional_Attribute">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="domain_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="label">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="label_value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="data_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Source_Data_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Source_Data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="source_data_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="source_dataset_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="source_db" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rule">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="data_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="default_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rule_Dataset">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="default_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rule_Dataset_Override">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_override_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="override_threshold" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="override_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rule_Location_Override">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_override_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="override_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rule_Override">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_override_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="override_threshold" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="override_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rule_Override_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="data_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rule_Resource">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rule_Resource_Override">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_override_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rule_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="override_threshold" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="override_value">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Load_Info">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="last_load_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="last_change_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="max_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="last_update_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Plan_Info">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="last_complete_plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="last_plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="last_update_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="last_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="max_plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Input_Load_Status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="input_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="load_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Version_History">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="version_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="version_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="version_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="version_user">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="128"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resource_Skill_Availability">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="skill_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="availability_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="availability_pattern_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Plan_Direction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="location_id_from">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_to">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="total_distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="elapsed_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="total_elapsed_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="direction_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="direction_text">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="512"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Issue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="issue_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="raised_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="issue_value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="issue_description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="message_text_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="dataset_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Issue_Response">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="issue_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="user_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="issue_response_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="response_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="response_description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="remind_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="dataset_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Issue_Response_Type">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="message_text_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Issue_Threshold">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="issue_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="threshold_value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Schedule_Exception_Response">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="schedule_exception_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="acknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="acknowledgement_comment" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="acknowledgement_user_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="acknowledgement_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Issue_Dataset_Threshold">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="issue_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="threshold_value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Suggested_Dispatch">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="status_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="date_time_status" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="fixed_resource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="date_time_fixed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="commit_sort_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Travel_Detail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="travel_detail_request_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Isochrone_Point">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="isochrone_request_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Direction_Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_from" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_to" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shift_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="all_travels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Travel_Detail_Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_from" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id_to" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="profile_id_travel" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="speed_factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="latitude_from" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="longitude_from" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="latitude_to" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="longitude_to" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Isochrone_Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="location_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="profile_id_travel" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="speed_factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="calculate_envelope" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="grid_metres" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Plan_Load_Status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="plan_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="load_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Secured_Data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="input_reference_internal_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="System_Counter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Dataset_Status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="datetime_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="application_instance_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="quality" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="total_allocations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="input_reference_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="input_reference_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="input_reference_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Application_Dataset">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dataset_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="disallowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Part_Stock">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="part_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="available_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="override_existing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Capacity">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="maximum_volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="maximum_part_quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Capacity_Part">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="capacity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="part_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="maximum_quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="exclusivity_required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Skill_Hierarchy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skill_id_parent">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="skill_id_child">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Source_Data_Parameter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="source_data_type_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="parameter_name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="parameter_value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Visit_Part">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="part_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="part_usage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Allocation_Part">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="part_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="part_usage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Resource_Capacity">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resource_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="capacity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Allocation_Data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activity_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="commit_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="sent_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="downloaded_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="accepted_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="waiting_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="travel_start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="pending_complete_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="expected_duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                   &lt;element name="expected_start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="sla_start_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="sla_jeopardy_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Target">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="description">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="statistic_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="range_start" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="range_end" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="benefit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="benefit_type">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Target_Item">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="target_id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="activity_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="resource_type_id" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "shiftPatternOrActivityOrActivitySLA" })
@XmlRootElement(name = "dsScheduleData")
public class DsScheduleData implements Serializable {

	@XmlElements({
			@XmlElement(name = "Shift_Pattern", type = DsScheduleData.ShiftPattern.class),
			@XmlElement(name = "Activity", type = DsScheduleData.Activity.class),
			@XmlElement(name = "Activity_SLA", type = DsScheduleData.ActivitySLA.class),
			@XmlElement(name = "SLA_Type", type = DsScheduleData.SLAType.class),
			@XmlElement(name = "Activity_Group", type = DsScheduleData.ActivityGroup.class),
			@XmlElement(name = "Activity_Type", type = DsScheduleData.ActivityType.class),
			@XmlElement(name = "Activity_Type_Skill", type = DsScheduleData.ActivityTypeSkill.class),
			@XmlElement(name = "Activity_Skill", type = DsScheduleData.ActivitySkill.class),
			@XmlElement(name = "Skill", type = DsScheduleData.Skill.class),
			@XmlElement(name = "Plan", type = DsScheduleData.Plan.class),
			@XmlElement(name = "Allocation", type = DsScheduleData.Allocation.class),
			@XmlElement(name = "Resource_Preference", type = DsScheduleData.ResourcePreference.class),
			@XmlElement(name = "Location", type = DsScheduleData.Location.class),
			@XmlElement(name = "Resources", type = DsScheduleData.Resources.class),
			@XmlElement(name = "Resource_Type", type = DsScheduleData.ResourceType.class),
			@XmlElement(name = "Resource_Skill", type = DsScheduleData.ResourceSkill.class),
			@XmlElement(name = "Resource_Type_Skill", type = DsScheduleData.ResourceTypeSkill.class),
			@XmlElement(name = "Activity_Part", type = DsScheduleData.ActivityPart.class),
			@XmlElement(name = "Part", type = DsScheduleData.Part.class),
			@XmlElement(name = "Availability", type = DsScheduleData.Availability.class),
			@XmlElement(name = "Location_Region", type = DsScheduleData.LocationRegion.class),
			@XmlElement(name = "Resource_Region", type = DsScheduleData.ResourceRegion.class),
			@XmlElement(name = "Region", type = DsScheduleData.Region.class),
			@XmlElement(name = "Resource_Part", type = DsScheduleData.ResourcePart.class),
			@XmlElement(name = "Shift", type = DsScheduleData.Shift.class),
			@XmlElement(name = "Location_Type", type = DsScheduleData.LocationType.class),
			@XmlElement(name = "Additional_Attributes", type = DsScheduleData.AdditionalAttributes.class),
			@XmlElement(name = "Object_Deletion", type = DsScheduleData.ObjectDeletion.class),
			@XmlElement(name = "Object_Group", type = DsScheduleData.ObjectGroup.class),
			@XmlElement(name = "Activity_Class", type = DsScheduleData.ActivityClass.class),
			@XmlElement(name = "Activity_Status", type = DsScheduleData.ActivityStatus.class),
			@XmlElement(name = "Exception_Type", type = DsScheduleData.ExceptionType.class),
			@XmlElement(name = "Object_Exception", type = DsScheduleData.ObjectException.class),
			@XmlElement(name = "Object_Type", type = DsScheduleData.ObjectType.class),
			@XmlElement(name = "Shift_Type", type = DsScheduleData.ShiftType.class),
			@XmlElement(name = "Travel_Calculation", type = DsScheduleData.TravelCalculation.class),
			@XmlElement(name = "Schedule_Event", type = DsScheduleData.ScheduleEvent.class),
			@XmlElement(name = "Event_Type", type = DsScheduleData.EventType.class),
			@XmlElement(name = "Status_Type", type = DsScheduleData.StatusType.class),
			@XmlElement(name = "Schedule_Exception", type = DsScheduleData.ScheduleException.class),
			@XmlElement(name = "Input_Reference", type = DsScheduleData.InputReference.class),
			@XmlElement(name = "Schedule_Exception_Data", type = DsScheduleData.ScheduleExceptionData.class),
			@XmlElement(name = "Custom_URL", type = DsScheduleData.CustomURL.class),
			@XmlElement(name = "URL_String", type = DsScheduleData.URLString.class),
			@XmlElement(name = "URL_Parameter", type = DsScheduleData.URLParameter.class),
			@XmlElement(name = "Broadcast_Type", type = DsScheduleData.BroadcastType.class),
			@XmlElement(name = "Broadcast", type = DsScheduleData.Broadcast.class),
			@XmlElement(name = "Broadcast_Parameter", type = DsScheduleData.BroadcastParameter.class),
			@XmlElement(name = "Comparison_Type", type = DsScheduleData.ComparisonType.class),
			@XmlElement(name = "Comparison_Exclusion", type = DsScheduleData.ComparisonExclusion.class),
			@XmlElement(name = "Plan_Resource", type = DsScheduleData.PlanResource.class),
			@XmlElement(name = "Plan_Route", type = DsScheduleData.PlanRoute.class),
			@XmlElement(name = "Plan_Travel", type = DsScheduleData.PlanTravel.class),
			@XmlElement(name = "Resource_Movement", type = DsScheduleData.ResourceMovement.class),
			@XmlElement(name = "Dataset", type = DsScheduleData.Dataset.class),
			@XmlElement(name = "Availability_Pattern", type = DsScheduleData.AvailabilityPattern.class),
			@XmlElement(name = "Plan_Deletion", type = DsScheduleData.PlanDeletion.class),
			@XmlElement(name = "Appointment_Request", type = DsScheduleData.AppointmentRequest.class),
			@XmlElement(name = "Appointment_Offer", type = DsScheduleData.AppointmentOffer.class),
			@XmlElement(name = "Appointment_Offer_Response", type = DsScheduleData.AppointmentOfferResponse.class),
			@XmlElement(name = "Broadcast_Result", type = DsScheduleData.BroadcastResult.class),
			@XmlElement(name = "Calendar", type = DsScheduleData.Calendar.class),
			@XmlElement(name = "Dataset_Segment_Mapping", type = DsScheduleData.DatasetSegmentMapping.class),
			@XmlElement(name = "Modelling_Pattern", type = DsScheduleData.ModellingPattern.class),
			@XmlElement(name = "Custom_Exception", type = DsScheduleData.CustomException.class),
			@XmlElement(name = "Custom_Exception_Data", type = DsScheduleData.CustomExceptionData.class),
			@XmlElement(name = "Additional_Attribute", type = DsScheduleData.AdditionalAttribute.class),
			@XmlElement(name = "Source_Data_Type", type = DsScheduleData.SourceDataType.class),
			@XmlElement(name = "Source_Data", type = DsScheduleData.SourceData.class),
			@XmlElement(name = "Rule", type = DsScheduleData.Rule.class),
			@XmlElement(name = "Rule_Dataset", type = DsScheduleData.RuleDataset.class),
			@XmlElement(name = "Rule_Dataset_Override", type = DsScheduleData.RuleDatasetOverride.class),
			@XmlElement(name = "Rule_Location_Override", type = DsScheduleData.RuleLocationOverride.class),
			@XmlElement(name = "Rule_Override", type = DsScheduleData.RuleOverride.class),
			@XmlElement(name = "Rule_Override_Type", type = DsScheduleData.RuleOverrideType.class),
			@XmlElement(name = "Rule_Resource", type = DsScheduleData.RuleResource.class),
			@XmlElement(name = "Rule_Resource_Override", type = DsScheduleData.RuleResourceOverride.class),
			@XmlElement(name = "Load_Info", type = DsScheduleData.LoadInfo.class),
			@XmlElement(name = "Plan_Info", type = DsScheduleData.PlanInfo.class),
			@XmlElement(name = "Input_Load_Status", type = DsScheduleData.InputLoadStatus.class),
			@XmlElement(name = "Version_History", type = DsScheduleData.VersionHistory.class),
			@XmlElement(name = "Resource_Skill_Availability", type = DsScheduleData.ResourceSkillAvailability.class),
			@XmlElement(name = "Plan_Direction", type = DsScheduleData.PlanDirection.class),
			@XmlElement(name = "Issue", type = DsScheduleData.Issue.class),
			@XmlElement(name = "Issue_Response", type = DsScheduleData.IssueResponse.class),
			@XmlElement(name = "Issue_Response_Type", type = DsScheduleData.IssueResponseType.class),
			@XmlElement(name = "Issue_Threshold", type = DsScheduleData.IssueThreshold.class),
			@XmlElement(name = "Schedule_Exception_Response", type = DsScheduleData.ScheduleExceptionResponse.class),
			@XmlElement(name = "Issue_Dataset_Threshold", type = DsScheduleData.IssueDatasetThreshold.class),
			@XmlElement(name = "Suggested_Dispatch", type = DsScheduleData.SuggestedDispatch.class),
			@XmlElement(name = "Travel_Detail", type = DsScheduleData.TravelDetail.class),
			@XmlElement(name = "Isochrone_Point", type = DsScheduleData.IsochronePoint.class),
			@XmlElement(name = "Direction_Request", type = DsScheduleData.DirectionRequest.class),
			@XmlElement(name = "Travel_Detail_Request", type = DsScheduleData.TravelDetailRequest.class),
			@XmlElement(name = "Isochrone_Request", type = DsScheduleData.IsochroneRequest.class),
			@XmlElement(name = "Plan_Load_Status", type = DsScheduleData.PlanLoadStatus.class),
			@XmlElement(name = "Secured_Data", type = DsScheduleData.SecuredData.class),
			@XmlElement(name = "System_Counter", type = DsScheduleData.SystemCounter.class),
			@XmlElement(name = "Dataset_Status", type = DsScheduleData.DatasetStatus.class),
			@XmlElement(name = "Application_Dataset", type = DsScheduleData.ApplicationDataset.class),
			@XmlElement(name = "Part_Stock", type = DsScheduleData.PartStock.class),
			@XmlElement(name = "Capacity", type = DsScheduleData.Capacity.class),
			@XmlElement(name = "Capacity_Part", type = DsScheduleData.CapacityPart.class),
			@XmlElement(name = "Skill_Hierarchy", type = DsScheduleData.SkillHierarchy.class),
			@XmlElement(name = "Source_Data_Parameter", type = DsScheduleData.SourceDataParameter.class),
			@XmlElement(name = "Visit_Part", type = DsScheduleData.VisitPart.class),
			@XmlElement(name = "Allocation_Part", type = DsScheduleData.AllocationPart.class),
			@XmlElement(name = "Resource_Capacity", type = DsScheduleData.ResourceCapacity.class),
			@XmlElement(name = "Allocation_Data", type = DsScheduleData.AllocationData.class),
			@XmlElement(name = "Target", type = DsScheduleData.Target.class),
			@XmlElement(name = "Target_Item", type = DsScheduleData.TargetItem.class) })
	protected List<Object> shiftPatternOrActivityOrActivitySLA;

	/**
	 * Gets the value of the shiftPatternOrActivityOrActivitySLA property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the shiftPatternOrActivityOrActivitySLA
	 * property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getShiftPatternOrActivityOrActivitySLA().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DsScheduleData.ShiftPattern } {@link DsScheduleData.Activity }
	 * {@link DsScheduleData.ActivitySLA } {@link DsScheduleData.SLAType }
	 * {@link DsScheduleData.ActivityGroup } {@link DsScheduleData.ActivityType }
	 * {@link DsScheduleData.ActivityTypeSkill }
	 * {@link DsScheduleData.ActivitySkill } {@link DsScheduleData.Skill }
	 * {@link DsScheduleData.Plan } {@link DsScheduleData.Allocation }
	 * {@link DsScheduleData.ResourcePreference } {@link DsScheduleData.Location }
	 * {@link DsScheduleData.Resources } {@link DsScheduleData.ResourceType }
	 * {@link DsScheduleData.ResourceSkill }
	 * {@link DsScheduleData.ResourceTypeSkill }
	 * {@link DsScheduleData.ActivityPart } {@link DsScheduleData.Part }
	 * {@link DsScheduleData.Availability } {@link DsScheduleData.LocationRegion }
	 * {@link DsScheduleData.ResourceRegion } {@link DsScheduleData.Region }
	 * {@link DsScheduleData.ResourcePart } {@link DsScheduleData.Shift }
	 * {@link DsScheduleData.LocationType }
	 * {@link DsScheduleData.AdditionalAttributes }
	 * {@link DsScheduleData.ObjectDeletion } {@link DsScheduleData.ObjectGroup }
	 * {@link DsScheduleData.ActivityClass }
	 * {@link DsScheduleData.ActivityStatus }
	 * {@link DsScheduleData.ExceptionType }
	 * {@link DsScheduleData.ObjectException } {@link DsScheduleData.ObjectType }
	 * {@link DsScheduleData.ShiftType } {@link DsScheduleData.TravelCalculation }
	 * {@link DsScheduleData.ScheduleEvent } {@link DsScheduleData.EventType }
	 * {@link DsScheduleData.StatusType }
	 * {@link DsScheduleData.ScheduleException }
	 * {@link DsScheduleData.InputReference }
	 * {@link DsScheduleData.ScheduleExceptionData }
	 * {@link DsScheduleData.CustomURL } {@link DsScheduleData.URLString }
	 * {@link DsScheduleData.URLParameter } {@link DsScheduleData.BroadcastType }
	 * {@link DsScheduleData.Broadcast }
	 * {@link DsScheduleData.BroadcastParameter }
	 * {@link DsScheduleData.ComparisonType }
	 * {@link DsScheduleData.ComparisonExclusion }
	 * {@link DsScheduleData.PlanResource } {@link DsScheduleData.PlanRoute }
	 * {@link DsScheduleData.PlanTravel } {@link DsScheduleData.ResourceMovement }
	 * {@link DsScheduleData.Dataset } {@link DsScheduleData.AvailabilityPattern }
	 * {@link DsScheduleData.PlanDeletion }
	 * {@link DsScheduleData.AppointmentRequest }
	 * {@link DsScheduleData.AppointmentOffer }
	 * {@link DsScheduleData.AppointmentOfferResponse }
	 * {@link DsScheduleData.BroadcastResult } {@link DsScheduleData.Calendar }
	 * {@link DsScheduleData.DatasetSegmentMapping }
	 * {@link DsScheduleData.ModellingPattern }
	 * {@link DsScheduleData.CustomException }
	 * {@link DsScheduleData.CustomExceptionData }
	 * {@link DsScheduleData.AdditionalAttribute }
	 * {@link DsScheduleData.SourceDataType } {@link DsScheduleData.SourceData }
	 * {@link DsScheduleData.Rule } {@link DsScheduleData.RuleDataset }
	 * {@link DsScheduleData.RuleDatasetOverride }
	 * {@link DsScheduleData.RuleLocationOverride }
	 * {@link DsScheduleData.RuleOverride }
	 * {@link DsScheduleData.RuleOverrideType }
	 * {@link DsScheduleData.RuleResource }
	 * {@link DsScheduleData.RuleResourceOverride }
	 * {@link DsScheduleData.LoadInfo } {@link DsScheduleData.PlanInfo }
	 * {@link DsScheduleData.InputLoadStatus }
	 * {@link DsScheduleData.VersionHistory }
	 * {@link DsScheduleData.ResourceSkillAvailability }
	 * {@link DsScheduleData.PlanDirection } {@link DsScheduleData.Issue }
	 * {@link DsScheduleData.IssueResponse }
	 * {@link DsScheduleData.IssueResponseType }
	 * {@link DsScheduleData.IssueThreshold }
	 * {@link DsScheduleData.ScheduleExceptionResponse }
	 * {@link DsScheduleData.IssueDatasetThreshold }
	 * {@link DsScheduleData.SuggestedDispatch }
	 * {@link DsScheduleData.TravelDetail } {@link DsScheduleData.IsochronePoint }
	 * {@link DsScheduleData.DirectionRequest }
	 * {@link DsScheduleData.TravelDetailRequest }
	 * {@link DsScheduleData.IsochroneRequest }
	 * {@link DsScheduleData.PlanLoadStatus } {@link DsScheduleData.SecuredData }
	 * {@link DsScheduleData.SystemCounter } {@link DsScheduleData.DatasetStatus }
	 * {@link DsScheduleData.ApplicationDataset }
	 * {@link DsScheduleData.PartStock } {@link DsScheduleData.Capacity }
	 * {@link DsScheduleData.CapacityPart } {@link DsScheduleData.SkillHierarchy }
	 * {@link DsScheduleData.SourceDataParameter }
	 * {@link DsScheduleData.VisitPart } {@link DsScheduleData.AllocationPart }
	 * {@link DsScheduleData.ResourceCapacity }
	 * {@link DsScheduleData.AllocationData } {@link DsScheduleData.Target }
	 * {@link DsScheduleData.TargetItem }
	 * 
	 * 
	 */
	public List<Object> getShiftPatternOrActivityOrActivitySLA() {
		if (shiftPatternOrActivityOrActivitySLA == null) {
			shiftPatternOrActivityOrActivitySLA = new ArrayList<Object>();
		}
		return this.shiftPatternOrActivityOrActivitySLA;
	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_class_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="10"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="end_location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="split_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="min_split" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="2000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="do_on_site" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="date_time_created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="external_ref" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="date_time_open" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="base_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="interrupt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="cost_of_split" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="do_on_location_incentive" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="modelling_pattern_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="service_level" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="reactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "activityClassId",
			"activityTypeId", "locationId", "endLocationId", "priority",
			"splitAllowed", "minSplit", "description", "doOnSite",
			"dateTimeCreated", "externalRef", "dateTimeOpen", "baseValue",
			"duration", "interrupt", "costOfSplit", "doOnLocationIncentive",
			"modellingPatternId", "serviceLevel", "reactive" })
	public static class Activity implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "activity_class_id", required = true, defaultValue = "CALL")
		protected String activityClassId;
		@XmlElement(name = "activity_type_id", required = true, defaultValue = "Default")
		protected String activityTypeId;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "end_location_id")
		protected String endLocationId;
		@XmlElement(defaultValue = "1")
		protected int priority;
		@XmlElement(name = "split_allowed", defaultValue = "false")
		protected boolean splitAllowed;
		@XmlElement(name = "min_split", required = true, defaultValue = "PT1H")
		protected Duration minSplit;
		protected String description;
		@XmlElement(name = "do_on_site", defaultValue = "false")
		protected boolean doOnSite;
		@XmlElement(name = "date_time_created")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar dateTimeCreated;
		@XmlElement(name = "external_ref")
		protected String externalRef;
		@XmlElement(name = "date_time_open")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar dateTimeOpen;
		@XmlElement(name = "base_value")
		protected Double baseValue;
		protected Duration duration;
		@XmlElement(defaultValue = "false")
		protected boolean interrupt;
		@XmlElement(name = "cost_of_split", defaultValue = "0")
		protected double costOfSplit;
		@XmlElement(name = "do_on_location_incentive")
		protected Double doOnLocationIncentive;
		@XmlElement(name = "modelling_pattern_id")
		protected String modellingPatternId;
		@XmlElement(name = "service_level")
		protected String serviceLevel;
		protected Boolean reactive;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * activityClassId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityClassId() {
			return activityClassId;
		}

		/**
		 * activityClassId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityClassId(String value) {
			this.activityClassId = value;
		}

		/**
		 * activityTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityTypeId() {
			return activityTypeId;
		}

		/**
		 * activityTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityTypeId(String value) {
			this.activityTypeId = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * endLocationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEndLocationId() {
			return endLocationId;
		}

		/**
		 * endLocationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEndLocationId(String value) {
			this.endLocationId = value;
		}

		/**
		 * priority 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPriority() {
			return priority;
		}

		/**
		 * priority 속성의 값을 설정합니다.
		 * 
		 */
		public void setPriority(int value) {
			this.priority = value;
		}

		/**
		 * splitAllowed 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isSplitAllowed() {
			return splitAllowed;
		}

		/**
		 * splitAllowed 속성의 값을 설정합니다.
		 * 
		 */
		public void setSplitAllowed(boolean value) {
			this.splitAllowed = value;
		}

		/**
		 * minSplit 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getMinSplit() {
			return minSplit;
		}

		/**
		 * minSplit 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setMinSplit(Duration value) {
			this.minSplit = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * doOnSite 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isDoOnSite() {
			return doOnSite;
		}

		/**
		 * doOnSite 속성의 값을 설정합니다.
		 * 
		 */
		public void setDoOnSite(boolean value) {
			this.doOnSite = value;
		}

		/**
		 * dateTimeCreated 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDateTimeCreated() {
			return dateTimeCreated;
		}

		/**
		 * dateTimeCreated 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDateTimeCreated(XMLGregorianCalendar value) {
			this.dateTimeCreated = value;
		}

		/**
		 * externalRef 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getExternalRef() {
			return externalRef;
		}

		/**
		 * externalRef 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setExternalRef(String value) {
			this.externalRef = value;
		}

		/**
		 * dateTimeOpen 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDateTimeOpen() {
			return dateTimeOpen;
		}

		/**
		 * dateTimeOpen 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDateTimeOpen(XMLGregorianCalendar value) {
			this.dateTimeOpen = value;
		}

		/**
		 * baseValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getBaseValue() {
			return baseValue;
		}

		/**
		 * baseValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setBaseValue(Double value) {
			this.baseValue = value;
		}

		/**
		 * duration 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getDuration() {
			return duration;
		}

		/**
		 * duration 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setDuration(Duration value) {
			this.duration = value;
		}

		/**
		 * interrupt 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isInterrupt() {
			return interrupt;
		}

		/**
		 * interrupt 속성의 값을 설정합니다.
		 * 
		 */
		public void setInterrupt(boolean value) {
			this.interrupt = value;
		}

		/**
		 * costOfSplit 속성의 값을 가져옵니다.
		 * 
		 */
		public double getCostOfSplit() {
			return costOfSplit;
		}

		/**
		 * costOfSplit 속성의 값을 설정합니다.
		 * 
		 */
		public void setCostOfSplit(double value) {
			this.costOfSplit = value;
		}

		/**
		 * doOnLocationIncentive 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getDoOnLocationIncentive() {
			return doOnLocationIncentive;
		}

		/**
		 * doOnLocationIncentive 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setDoOnLocationIncentive(Double value) {
			this.doOnLocationIncentive = value;
		}

		/**
		 * modellingPatternId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getModellingPatternId() {
			return modellingPatternId;
		}

		/**
		 * modellingPatternId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setModellingPatternId(String value) {
			this.modellingPatternId = value;
		}

		/**
		 * serviceLevel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getServiceLevel() {
			return serviceLevel;
		}

		/**
		 * serviceLevel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setServiceLevel(String value) {
			this.serviceLevel = value;
		}

		/**
		 * reactive 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isReactive() {
			return reactive;
		}

		/**
		 * reactive 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setReactive(Boolean value) {
			this.reactive = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="10"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description" })
	public static class ActivityClass implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="activity_id1">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id2">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="pre_co_req">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="20"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="min_delay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="max_delay" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="same_resource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="split_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="all_or_nothing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="keep_splits_together" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *         &lt;element name="overlap_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "activityId1", "activityId2", "preCoReq",
			"minDelay", "maxDelay", "sameResource", "splitAllowed",
			"allOrNothing", "keepSplitsTogether", "overlapAllowed" })
	public static class ActivityGroup implements Serializable {

		@XmlElement(name = "activity_id1", required = true)
		protected String activityId1;
		@XmlElement(name = "activity_id2", required = true)
		protected String activityId2;
		@XmlElement(name = "pre_co_req", required = true)
		protected String preCoReq;
		@XmlElement(name = "min_delay", required = true, defaultValue = "PT0S")
		protected Duration minDelay;
		@XmlElement(name = "max_delay")
		protected Duration maxDelay;
		@XmlElement(name = "same_resource", defaultValue = "false")
		protected boolean sameResource;
		@XmlElement(name = "split_allowed", defaultValue = "false")
		protected boolean splitAllowed;
		@XmlElement(name = "all_or_nothing", defaultValue = "false")
		protected boolean allOrNothing;
		@XmlElement(name = "keep_splits_together", defaultValue = "false")
		protected Boolean keepSplitsTogether;
		@XmlElement(name = "overlap_allowed")
		protected Boolean overlapAllowed;

		/**
		 * activityId1 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId1() {
			return activityId1;
		}

		/**
		 * activityId1 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId1(String value) {
			this.activityId1 = value;
		}

		/**
		 * activityId2 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId2() {
			return activityId2;
		}

		/**
		 * activityId2 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId2(String value) {
			this.activityId2 = value;
		}

		/**
		 * preCoReq 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPreCoReq() {
			return preCoReq;
		}

		/**
		 * preCoReq 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPreCoReq(String value) {
			this.preCoReq = value;
		}

		/**
		 * minDelay 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getMinDelay() {
			return minDelay;
		}

		/**
		 * minDelay 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setMinDelay(Duration value) {
			this.minDelay = value;
		}

		/**
		 * maxDelay 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getMaxDelay() {
			return maxDelay;
		}

		/**
		 * maxDelay 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setMaxDelay(Duration value) {
			this.maxDelay = value;
		}

		/**
		 * sameResource 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isSameResource() {
			return sameResource;
		}

		/**
		 * sameResource 속성의 값을 설정합니다.
		 * 
		 */
		public void setSameResource(boolean value) {
			this.sameResource = value;
		}

		/**
		 * splitAllowed 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isSplitAllowed() {
			return splitAllowed;
		}

		/**
		 * splitAllowed 속성의 값을 설정합니다.
		 * 
		 */
		public void setSplitAllowed(boolean value) {
			this.splitAllowed = value;
		}

		/**
		 * allOrNothing 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isAllOrNothing() {
			return allOrNothing;
		}

		/**
		 * allOrNothing 속성의 값을 설정합니다.
		 * 
		 */
		public void setAllOrNothing(boolean value) {
			this.allOrNothing = value;
		}

		/**
		 * keepSplitsTogether 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isKeepSplitsTogether() {
			return keepSplitsTogether;
		}

		/**
		 * keepSplitsTogether 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setKeepSplitsTogether(Boolean value) {
			this.keepSplitsTogether = value;
		}

		/**
		 * overlapAllowed 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isOverlapAllowed() {
			return overlapAllowed;
		}

		/**
		 * overlapAllowed 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setOverlapAllowed(Boolean value) {
			this.overlapAllowed = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="part_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="part_usage" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "activityId", "partId", "partUsage" })
	public static class ActivityPart implements Serializable {

		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "part_id", required = true)
		protected String partId;
		@XmlElement(name = "part_usage", defaultValue = "1")
		protected int partUsage;

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * partId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPartId() {
			return partId;
		}

		/**
		 * partId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPartId(String value) {
			this.partId = value;
		}

		/**
		 * partUsage 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPartUsage() {
			return partUsage;
		}

		/**
		 * partUsage 속성의 값을 설정합니다.
		 * 
		 */
		public void setPartUsage(int value) {
			this.partUsage = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="sla_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="datetime_start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="datetime_end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="start_based" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "slaTypeId", "activityId",
			"datetimeStart", "datetimeEnd", "priority", "startBased" })
	public static class ActivitySLA implements Serializable {

		@XmlElement(name = "sla_type_id", required = true)
		protected String slaTypeId;
		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "datetime_start", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar datetimeStart;
		@XmlElement(name = "datetime_end")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar datetimeEnd;
		@XmlElement(defaultValue = "1")
		protected int priority;
		@XmlElement(name = "start_based", defaultValue = "true")
		protected boolean startBased;

		/**
		 * slaTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSlaTypeId() {
			return slaTypeId;
		}

		/**
		 * slaTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSlaTypeId(String value) {
			this.slaTypeId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * datetimeStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDatetimeStart() {
			return datetimeStart;
		}

		/**
		 * datetimeStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDatetimeStart(XMLGregorianCalendar value) {
			this.datetimeStart = value;
		}

		/**
		 * datetimeEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDatetimeEnd() {
			return datetimeEnd;
		}

		/**
		 * datetimeEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDatetimeEnd(XMLGregorianCalendar value) {
			this.datetimeEnd = value;
		}

		/**
		 * priority 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPriority() {
			return priority;
		}

		/**
		 * priority 속성의 값을 설정합니다.
		 * 
		 */
		public void setPriority(int value) {
			this.priority = value;
		}

		/**
		 * startBased 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isStartBased() {
			return startBased;
		}

		/**
		 * startBased 속성의 값을 설정합니다.
		 * 
		 */
		public void setStartBased(boolean value) {
			this.startBased = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="skill_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="share_with_corequisites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "skillId", "activityId",
			"shareWithCorequisites" })
	public static class ActivitySkill {

		@XmlElement(name = "skill_id", required = true)
		protected String skillId;
		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "share_with_corequisites")
		protected Boolean shareWithCorequisites;

		/**
		 * skillId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSkillId() {
			return skillId;
		}

		/**
		 * skillId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSkillId(String value) {
			this.skillId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * shareWithCorequisites 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isShareWithCorequisites() {
			return shareWithCorequisites;
		}

		/**
		 * shareWithCorequisites 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setShareWithCorequisites(Boolean value) {
			this.shareWithCorequisites = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="status_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="date_time_status" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="date_time_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="date_time_fixed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="highlight" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="memo" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="2000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="commit_sort_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="reason" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="200"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="duration_remaining" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="reason_value" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="date_time_earliest" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "activityId", "statusId",
			"dateTimeStatus", "visitId", "fixed", "resourceId",
			"dateTimeStamp", "duration", "dateTimeFixed", "highlight", "memo",
			"commitSortValue", "reason", "durationRemaining", "reasonValue",
			"source", "dateTimeEarliest" })
	public static class ActivityStatus implements Serializable {

		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "status_id", defaultValue = "0")
		protected int statusId;
		@XmlElement(name = "date_time_status", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar dateTimeStatus;
		@XmlElement(name = "visit_id", defaultValue = "1")
		protected int visitId;
		@XmlElement(defaultValue = "false")
		protected boolean fixed;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "date_time_stamp", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar dateTimeStamp;
		protected Duration duration;
		@XmlElement(name = "date_time_fixed")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar dateTimeFixed;
		protected String highlight;
		protected String memo;
		@XmlElement(name = "commit_sort_value")
		protected Double commitSortValue;
		protected String reason;
		@XmlElement(name = "duration_remaining")
		protected Duration durationRemaining;
		@XmlElement(name = "reason_value")
		protected String reasonValue;
		protected Integer source;
		@XmlElement(name = "date_time_earliest")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar dateTimeEarliest;

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * statusId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getStatusId() {
			return statusId;
		}

		/**
		 * statusId 속성의 값을 설정합니다.
		 * 
		 */
		public void setStatusId(int value) {
			this.statusId = value;
		}

		/**
		 * dateTimeStatus 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDateTimeStatus() {
			return dateTimeStatus;
		}

		/**
		 * dateTimeStatus 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDateTimeStatus(XMLGregorianCalendar value) {
			this.dateTimeStatus = value;
		}

		/**
		 * visitId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getVisitId() {
			return visitId;
		}

		/**
		 * visitId 속성의 값을 설정합니다.
		 * 
		 */
		public void setVisitId(int value) {
			this.visitId = value;
		}

		/**
		 * fixed 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isFixed() {
			return fixed;
		}

		/**
		 * fixed 속성의 값을 설정합니다.
		 * 
		 */
		public void setFixed(boolean value) {
			this.fixed = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * dateTimeStamp 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDateTimeStamp() {
			return dateTimeStamp;
		}

		/**
		 * dateTimeStamp 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDateTimeStamp(XMLGregorianCalendar value) {
			this.dateTimeStamp = value;
		}

		/**
		 * duration 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getDuration() {
			return duration;
		}

		/**
		 * duration 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setDuration(Duration value) {
			this.duration = value;
		}

		/**
		 * dateTimeFixed 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDateTimeFixed() {
			return dateTimeFixed;
		}

		/**
		 * dateTimeFixed 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDateTimeFixed(XMLGregorianCalendar value) {
			this.dateTimeFixed = value;
		}

		/**
		 * highlight 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getHighlight() {
			return highlight;
		}

		/**
		 * highlight 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setHighlight(String value) {
			this.highlight = value;
		}

		/**
		 * memo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMemo() {
			return memo;
		}

		/**
		 * memo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMemo(String value) {
			this.memo = value;
		}

		/**
		 * commitSortValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getCommitSortValue() {
			return commitSortValue;
		}

		/**
		 * commitSortValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setCommitSortValue(Double value) {
			this.commitSortValue = value;
		}

		/**
		 * reason 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getReason() {
			return reason;
		}

		/**
		 * reason 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setReason(String value) {
			this.reason = value;
		}

		/**
		 * durationRemaining 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getDurationRemaining() {
			return durationRemaining;
		}

		/**
		 * durationRemaining 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setDurationRemaining(Duration value) {
			this.durationRemaining = value;
		}

		/**
		 * reasonValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getReasonValue() {
			return reasonValue;
		}

		/**
		 * reasonValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setReasonValue(String value) {
			this.reasonValue = value;
		}

		/**
		 * source 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getSource() {
			return source;
		}

		/**
		 * source 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setSource(Integer value) {
			this.source = value;
		}

		/**
		 * dateTimeEarliest 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDateTimeEarliest() {
			return dateTimeEarliest;
		}

		/**
		 * dateTimeEarliest 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDateTimeEarliest(XMLGregorianCalendar value) {
			this.dateTimeEarliest = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="base_value" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="ignore_days_old" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="service_level" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="reactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "duration",
			"baseValue", "ignoreDaysOld", "serviceLevel", "reactive" })
	public static class ActivityType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;
		protected Duration duration;
		@XmlElement(name = "base_value", defaultValue = "1000")
		protected double baseValue;
		@XmlElement(name = "ignore_days_old")
		protected Integer ignoreDaysOld;
		@XmlElement(name = "service_level")
		protected String serviceLevel;
		protected Boolean reactive;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * duration 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getDuration() {
			return duration;
		}

		/**
		 * duration 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setDuration(Duration value) {
			this.duration = value;
		}

		/**
		 * baseValue 속성의 값을 가져옵니다.
		 * 
		 */
		public double getBaseValue() {
			return baseValue;
		}

		/**
		 * baseValue 속성의 값을 설정합니다.
		 * 
		 */
		public void setBaseValue(double value) {
			this.baseValue = value;
		}

		/**
		 * ignoreDaysOld 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getIgnoreDaysOld() {
			return ignoreDaysOld;
		}

		/**
		 * ignoreDaysOld 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setIgnoreDaysOld(Integer value) {
			this.ignoreDaysOld = value;
		}

		/**
		 * serviceLevel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getServiceLevel() {
			return serviceLevel;
		}

		/**
		 * serviceLevel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setServiceLevel(String value) {
			this.serviceLevel = value;
		}

		/**
		 * reactive 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isReactive() {
			return reactive;
		}

		/**
		 * reactive 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setReactive(Boolean value) {
			this.reactive = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="skill_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="share_with_corequisites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "skillId", "activityTypeId",
			"shareWithCorequisites" })
	public static class ActivityTypeSkill implements Serializable {

		@XmlElement(name = "skill_id", required = true)
		protected String skillId;
		@XmlElement(name = "activity_type_id", required = true)
		protected String activityTypeId;
		@XmlElement(name = "share_with_corequisites")
		protected Boolean shareWithCorequisites;

		/**
		 * skillId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSkillId() {
			return skillId;
		}

		/**
		 * skillId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSkillId(String value) {
			this.skillId = value;
		}

		/**
		 * activityTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityTypeId() {
			return activityTypeId;
		}

		/**
		 * activityTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityTypeId(String value) {
			this.activityTypeId = value;
		}

		/**
		 * shareWithCorequisites 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isShareWithCorequisites() {
			return shareWithCorequisites;
		}

		/**
		 * shareWithCorequisites 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setShareWithCorequisites(Boolean value) {
			this.shareWithCorequisites = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="domain_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="label">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="30"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="label_value" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="2000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="data_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="10"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "activityId", "resourceId",
			"locationId", "domainTypeId", "label", "sequence", "labelValue",
			"dataType" })
	public static class AdditionalAttribute implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "activity_id")
		protected String activityId;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "domain_type_id")
		protected String domainTypeId;
		@XmlElement(required = true)
		protected String label;
		protected int sequence;
		@XmlElement(name = "label_value")
		protected String labelValue;
		@XmlElement(name = "data_type", required = true)
		protected String dataType;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * domainTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDomainTypeId() {
			return domainTypeId;
		}

		/**
		 * domainTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDomainTypeId(String value) {
			this.domainTypeId = value;
		}

		/**
		 * label 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLabel() {
			return label;
		}

		/**
		 * label 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLabel(String value) {
			this.label = value;
		}

		/**
		 * sequence 속성의 값을 가져옵니다.
		 * 
		 */
		public int getSequence() {
			return sequence;
		}

		/**
		 * sequence 속성의 값을 설정합니다.
		 * 
		 */
		public void setSequence(int value) {
			this.sequence = value;
		}

		/**
		 * labelValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLabelValue() {
			return labelValue;
		}

		/**
		 * labelValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLabelValue(String value) {
			this.labelValue = value;
		}

		/**
		 * dataType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDataType() {
			return dataType;
		}

		/**
		 * dataType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDataType(String value) {
			this.dataType = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="label">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="30"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="label_value" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="2000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="location_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="data_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="10"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="domain_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="display_style" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="external_ref" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "label", "labelValue", "activityId",
			"resourceId", "sequence", "locationId", "dataType", "domainTypeId",
			"displayStyle", "externalRef" })
	public static class AdditionalAttributes implements Serializable {

		@XmlElement(required = true)
		protected String label;
		@XmlElement(name = "label_value")
		protected String labelValue;
		@XmlElement(name = "activity_id", required = true, defaultValue = "")
		protected String activityId;
		@XmlElement(name = "resource_id", required = true, defaultValue = "")
		protected String resourceId;
		@XmlElement(defaultValue = "0")
		protected int sequence;
		@XmlElement(name = "location_id", required = true, defaultValue = "")
		protected String locationId;
		@XmlElement(name = "data_type", required = true, defaultValue = "string")
		protected String dataType;
		@XmlElement(name = "domain_type_id")
		protected String domainTypeId;
		@XmlElement(name = "display_style")
		protected String displayStyle;
		@XmlElement(name = "external_ref")
		protected String externalRef;

		/**
		 * label 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLabel() {
			return label;
		}

		/**
		 * label 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLabel(String value) {
			this.label = value;
		}

		/**
		 * labelValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLabelValue() {
			return labelValue;
		}

		/**
		 * labelValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLabelValue(String value) {
			this.labelValue = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * sequence 속성의 값을 가져옵니다.
		 * 
		 */
		public int getSequence() {
			return sequence;
		}

		/**
		 * sequence 속성의 값을 설정합니다.
		 * 
		 */
		public void setSequence(int value) {
			this.sequence = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * dataType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDataType() {
			return dataType;
		}

		/**
		 * dataType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDataType(String value) {
			this.dataType = value;
		}

		/**
		 * domainTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDomainTypeId() {
			return domainTypeId;
		}

		/**
		 * domainTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDomainTypeId(String value) {
			this.domainTypeId = value;
		}

		/**
		 * displayStyle 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDisplayStyle() {
			return displayStyle;
		}

		/**
		 * displayStyle 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDisplayStyle(String value) {
			this.displayStyle = value;
		}

		/**
		 * externalRef 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getExternalRef() {
			return externalRef;
		}

		/**
		 * externalRef 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setExternalRef(String value) {
			this.externalRef = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="activity_start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="activity_end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="visit_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="visit_type" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="10"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="date_time_fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="fixed_resource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *         &lt;element name="shift_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="shift_pattern_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="reason_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="same_location" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *         &lt;element name="allocation_source" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="commit_sort_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "activityId", "resourceId", "visitId",
			"activityStart", "activityEnd", "visitStatus", "planId",
			"visitType", "dateTimeFixed", "duration", "fixedResource",
			"shiftId", "rank", "shiftPatternId", "shiftStartDatetime",
			"reasonTypeId", "sameLocation", "allocationSource",
			"commitSortValue" })
	public static class Allocation implements Serializable {

		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "visit_id", defaultValue = "1")
		protected int visitId;
		@XmlElement(name = "activity_start")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar activityStart;
		@XmlElement(name = "activity_end")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar activityEnd;
		@XmlElement(name = "visit_status", defaultValue = "0")
		protected int visitStatus;
		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "visit_type")
		protected String visitType;
		@XmlElement(name = "date_time_fixed")
		protected Boolean dateTimeFixed;
		protected Duration duration;
		@XmlElement(name = "fixed_resource")
		protected Boolean fixedResource;
		@XmlElement(name = "shift_id")
		protected String shiftId;
		protected int rank;
		@XmlElement(name = "shift_pattern_id")
		protected String shiftPatternId;
		@XmlElement(name = "shift_start_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar shiftStartDatetime;
		@XmlElement(name = "reason_type_id")
		protected String reasonTypeId;
		@XmlElement(name = "same_location")
		protected Boolean sameLocation;
		@XmlElement(name = "allocation_source")
		protected Integer allocationSource;
		@XmlElement(name = "commit_sort_value")
		protected Double commitSortValue;

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * visitId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getVisitId() {
			return visitId;
		}

		/**
		 * visitId 속성의 값을 설정합니다.
		 * 
		 */
		public void setVisitId(int value) {
			this.visitId = value;
		}

		/**
		 * activityStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getActivityStart() {
			return activityStart;
		}

		/**
		 * activityStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setActivityStart(XMLGregorianCalendar value) {
			this.activityStart = value;
		}

		/**
		 * activityEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getActivityEnd() {
			return activityEnd;
		}

		/**
		 * activityEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setActivityEnd(XMLGregorianCalendar value) {
			this.activityEnd = value;
		}

		/**
		 * visitStatus 속성의 값을 가져옵니다.
		 * 
		 */
		public int getVisitStatus() {
			return visitStatus;
		}

		/**
		 * visitStatus 속성의 값을 설정합니다.
		 * 
		 */
		public void setVisitStatus(int value) {
			this.visitStatus = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * visitType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVisitType() {
			return visitType;
		}

		/**
		 * visitType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVisitType(String value) {
			this.visitType = value;
		}

		/**
		 * dateTimeFixed 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isDateTimeFixed() {
			return dateTimeFixed;
		}

		/**
		 * dateTimeFixed 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setDateTimeFixed(Boolean value) {
			this.dateTimeFixed = value;
		}

		/**
		 * duration 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getDuration() {
			return duration;
		}

		/**
		 * duration 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setDuration(Duration value) {
			this.duration = value;
		}

		/**
		 * fixedResource 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isFixedResource() {
			return fixedResource;
		}

		/**
		 * fixedResource 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setFixedResource(Boolean value) {
			this.fixedResource = value;
		}

		/**
		 * shiftId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getShiftId() {
			return shiftId;
		}

		/**
		 * shiftId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setShiftId(String value) {
			this.shiftId = value;
		}

		/**
		 * rank 속성의 값을 가져옵니다.
		 * 
		 */
		public int getRank() {
			return rank;
		}

		/**
		 * rank 속성의 값을 설정합니다.
		 * 
		 */
		public void setRank(int value) {
			this.rank = value;
		}

		/**
		 * shiftPatternId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getShiftPatternId() {
			return shiftPatternId;
		}

		/**
		 * shiftPatternId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setShiftPatternId(String value) {
			this.shiftPatternId = value;
		}

		/**
		 * shiftStartDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getShiftStartDatetime() {
			return shiftStartDatetime;
		}

		/**
		 * shiftStartDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setShiftStartDatetime(XMLGregorianCalendar value) {
			this.shiftStartDatetime = value;
		}

		/**
		 * reasonTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getReasonTypeId() {
			return reasonTypeId;
		}

		/**
		 * reasonTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setReasonTypeId(String value) {
			this.reasonTypeId = value;
		}

		/**
		 * sameLocation 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isSameLocation() {
			return sameLocation;
		}

		/**
		 * sameLocation 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setSameLocation(Boolean value) {
			this.sameLocation = value;
		}

		/**
		 * allocationSource 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getAllocationSource() {
			return allocationSource;
		}

		/**
		 * allocationSource 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setAllocationSource(Integer value) {
			this.allocationSource = value;
		}

		/**
		 * commitSortValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getCommitSortValue() {
			return commitSortValue;
		}

		/**
		 * commitSortValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setCommitSortValue(Double value) {
			this.commitSortValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="commit_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="sent_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="downloaded_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="accepted_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="waiting_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="travel_start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="pending_complete_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="expected_duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="expected_start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="sla_start_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="sla_jeopardy_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "activityId", "visitId", "planId",
			"commitDatetime", "sentDatetime", "downloadedDatetime",
			"acceptedDatetime", "waitingDatetime", "travelStart",
			"pendingCompleteDatetime", "expectedDuration", "expectedStart",
			"slaStartTime", "slaJeopardyTime" })
	public static class AllocationData implements Serializable {

		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "visit_id", defaultValue = "1")
		protected int visitId;
		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "commit_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar commitDatetime;
		@XmlElement(name = "sent_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar sentDatetime;
		@XmlElement(name = "downloaded_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar downloadedDatetime;
		@XmlElement(name = "accepted_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar acceptedDatetime;
		@XmlElement(name = "waiting_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar waitingDatetime;
		@XmlElement(name = "travel_start")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar travelStart;
		@XmlElement(name = "pending_complete_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar pendingCompleteDatetime;
		@XmlElement(name = "expected_duration")
		protected Duration expectedDuration;
		@XmlElement(name = "expected_start")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar expectedStart;
		@XmlElement(name = "sla_start_time")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar slaStartTime;
		@XmlElement(name = "sla_jeopardy_time")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar slaJeopardyTime;

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * visitId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getVisitId() {
			return visitId;
		}

		/**
		 * visitId 속성의 값을 설정합니다.
		 * 
		 */
		public void setVisitId(int value) {
			this.visitId = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * commitDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getCommitDatetime() {
			return commitDatetime;
		}

		/**
		 * commitDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setCommitDatetime(XMLGregorianCalendar value) {
			this.commitDatetime = value;
		}

		/**
		 * sentDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getSentDatetime() {
			return sentDatetime;
		}

		/**
		 * sentDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setSentDatetime(XMLGregorianCalendar value) {
			this.sentDatetime = value;
		}

		/**
		 * downloadedDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDownloadedDatetime() {
			return downloadedDatetime;
		}

		/**
		 * downloadedDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDownloadedDatetime(XMLGregorianCalendar value) {
			this.downloadedDatetime = value;
		}

		/**
		 * acceptedDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getAcceptedDatetime() {
			return acceptedDatetime;
		}

		/**
		 * acceptedDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setAcceptedDatetime(XMLGregorianCalendar value) {
			this.acceptedDatetime = value;
		}

		/**
		 * waitingDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getWaitingDatetime() {
			return waitingDatetime;
		}

		/**
		 * waitingDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setWaitingDatetime(XMLGregorianCalendar value) {
			this.waitingDatetime = value;
		}

		/**
		 * travelStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getTravelStart() {
			return travelStart;
		}

		/**
		 * travelStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setTravelStart(XMLGregorianCalendar value) {
			this.travelStart = value;
		}

		/**
		 * pendingCompleteDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getPendingCompleteDatetime() {
			return pendingCompleteDatetime;
		}

		/**
		 * pendingCompleteDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setPendingCompleteDatetime(XMLGregorianCalendar value) {
			this.pendingCompleteDatetime = value;
		}

		/**
		 * expectedDuration 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getExpectedDuration() {
			return expectedDuration;
		}

		/**
		 * expectedDuration 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setExpectedDuration(Duration value) {
			this.expectedDuration = value;
		}

		/**
		 * expectedStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getExpectedStart() {
			return expectedStart;
		}

		/**
		 * expectedStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setExpectedStart(XMLGregorianCalendar value) {
			this.expectedStart = value;
		}

		/**
		 * slaStartTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getSlaStartTime() {
			return slaStartTime;
		}

		/**
		 * slaStartTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setSlaStartTime(XMLGregorianCalendar value) {
			this.slaStartTime = value;
		}

		/**
		 * slaJeopardyTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getSlaJeopardyTime() {
			return slaJeopardyTime;
		}

		/**
		 * slaJeopardyTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setSlaJeopardyTime(XMLGregorianCalendar value) {
			this.slaJeopardyTime = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="part_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="part_usage" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "activityId", "visitId",
			"partId", "resourceId", "partUsage" })
	public static class AllocationPart implements Serializable {

		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "visit_id")
		protected int visitId;
		@XmlElement(name = "part_id", required = true)
		protected String partId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "part_usage")
		protected int partUsage;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * visitId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getVisitId() {
			return visitId;
		}

		/**
		 * visitId 속성의 값을 설정합니다.
		 * 
		 */
		public void setVisitId(int value) {
			this.visitId = value;
		}

		/**
		 * partId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPartId() {
			return partId;
		}

		/**
		 * partId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPartId(String value) {
			this.partId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * partUsage 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPartUsage() {
			return partUsage;
		}

		/**
		 * partUsage 속성의 값을 설정합니다.
		 * 
		 */
		public void setPartUsage(int value) {
			this.partUsage = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="disallowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "applicationTypeId", "organisationId",
			"datasetId", "disallowed" })
	public static class ApplicationDataset implements Serializable {

		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		@XmlElement(name = "organisation_id")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true)
		protected String datasetId;
		@XmlElement(defaultValue = "true")
		protected boolean disallowed;

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * disallowed 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isDisallowed() {
			return disallowed;
		}

		/**
		 * disallowed 속성의 값을 설정합니다.
		 * 
		 */
		public void setDisallowed(boolean value) {
			this.disallowed = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="appointment_request_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="offer_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="offer_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="offer_value" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *         &lt;element name="reason_type_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "appointmentRequestId", "id",
			"offerStartDatetime", "offerEndDatetime", "offerValue", "planId",
			"available", "reasonTypeId" })
	public static class AppointmentOffer implements Serializable {

		@XmlElement(name = "appointment_request_id", required = true)
		protected String appointmentRequestId;
		protected int id;
		@XmlElement(name = "offer_start_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar offerStartDatetime;
		@XmlElement(name = "offer_end_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar offerEndDatetime;
		@XmlElement(name = "offer_value")
		protected double offerValue;
		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(defaultValue = "true")
		protected Boolean available;
		@XmlElement(name = "reason_type_id")
		protected Integer reasonTypeId;

		/**
		 * appointmentRequestId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAppointmentRequestId() {
			return appointmentRequestId;
		}

		/**
		 * appointmentRequestId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAppointmentRequestId(String value) {
			this.appointmentRequestId = value;
		}

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 */
		public int getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 */
		public void setId(int value) {
			this.id = value;
		}

		/**
		 * offerStartDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getOfferStartDatetime() {
			return offerStartDatetime;
		}

		/**
		 * offerStartDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setOfferStartDatetime(XMLGregorianCalendar value) {
			this.offerStartDatetime = value;
		}

		/**
		 * offerEndDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getOfferEndDatetime() {
			return offerEndDatetime;
		}

		/**
		 * offerEndDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setOfferEndDatetime(XMLGregorianCalendar value) {
			this.offerEndDatetime = value;
		}

		/**
		 * offerValue 속성의 값을 가져옵니다.
		 * 
		 */
		public double getOfferValue() {
			return offerValue;
		}

		/**
		 * offerValue 속성의 값을 설정합니다.
		 * 
		 */
		public void setOfferValue(double value) {
			this.offerValue = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * available 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isAvailable() {
			return available;
		}

		/**
		 * available 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setAvailable(Boolean value) {
			this.available = value;
		}

		/**
		 * reasonTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getReasonTypeId() {
			return reasonTypeId;
		}

		/**
		 * reasonTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setReasonTypeId(Integer value) {
			this.reasonTypeId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="appointment_request_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="appointment_offer_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "appointmentRequestId",
			"appointmentOfferId" })
	public static class AppointmentOfferResponse implements Serializable {

		@XmlElement(name = "appointment_request_id", required = true)
		protected String appointmentRequestId;
		@XmlElement(name = "appointment_offer_id", defaultValue = "-1")
		protected int appointmentOfferId;

		/**
		 * appointmentRequestId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAppointmentRequestId() {
			return appointmentRequestId;
		}

		/**
		 * appointmentRequestId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAppointmentRequestId(String value) {
			this.appointmentRequestId = value;
		}

		/**
		 * appointmentOfferId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getAppointmentOfferId() {
			return appointmentOfferId;
		}

		/**
		 * appointmentOfferId 속성의 값을 설정합니다.
		 * 
		 */
		public void setAppointmentOfferId(int value) {
			this.appointmentOfferId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="offer_expiry_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="appointment_window_length" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "activityId",
			"offerExpiryDatetime", "appointmentWindowLength" })
	public static class AppointmentRequest implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "offer_expiry_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar offerExpiryDatetime;
		@XmlElement(name = "appointment_window_length")
		protected Duration appointmentWindowLength;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * offerExpiryDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getOfferExpiryDatetime() {
			return offerExpiryDatetime;
		}

		/**
		 * offerExpiryDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setOfferExpiryDatetime(XMLGregorianCalendar value) {
			this.offerExpiryDatetime = value;
		}

		/**
		 * appointmentWindowLength 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getAppointmentWindowLength() {
			return appointmentWindowLength;
		}

		/**
		 * appointmentWindowLength 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setAppointmentWindowLength(Duration value) {
			this.appointmentWindowLength = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="datetime_start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="datetime_end" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="appointment_request_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="start_based" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "datetimeStart", "datetimeEnd",
			"activityId", "locationId", "locationTypeId", "activityTypeId",
			"appointmentRequestId", "startBased" })
	public static class Availability implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "datetime_start", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar datetimeStart;
		@XmlElement(name = "datetime_end", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar datetimeEnd;
		@XmlElement(name = "activity_id")
		protected String activityId;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "location_type_id")
		protected String locationTypeId;
		@XmlElement(name = "activity_type_id")
		protected String activityTypeId;
		@XmlElement(name = "appointment_request_id")
		protected String appointmentRequestId;
		@XmlElement(name = "start_based")
		protected Boolean startBased;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * datetimeStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDatetimeStart() {
			return datetimeStart;
		}

		/**
		 * datetimeStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDatetimeStart(XMLGregorianCalendar value) {
			this.datetimeStart = value;
		}

		/**
		 * datetimeEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDatetimeEnd() {
			return datetimeEnd;
		}

		/**
		 * datetimeEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDatetimeEnd(XMLGregorianCalendar value) {
			this.datetimeEnd = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * locationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationTypeId() {
			return locationTypeId;
		}

		/**
		 * locationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationTypeId(String value) {
			this.locationTypeId = value;
		}

		/**
		 * activityTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityTypeId() {
			return activityTypeId;
		}

		/**
		 * activityTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityTypeId(String value) {
			this.activityTypeId = value;
		}

		/**
		 * appointmentRequestId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAppointmentRequestId() {
			return appointmentRequestId;
		}

		/**
		 * appointmentRequestId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAppointmentRequestId(String value) {
			this.appointmentRequestId = value;
		}

		/**
		 * startBased 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isStartBased() {
			return startBased;
		}

		/**
		 * startBased 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setStartBased(Boolean value) {
			this.startBased = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="period_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="period_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="day_pattern">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="7"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="open_time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="close_time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="location_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="appointment_request_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="time_zone" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="start_based" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "periodStartDatetime",
			"periodEndDatetime", "dayPattern", "openTime", "closeTime",
			"locationTypeId", "locationId", "activityId", "activityTypeId",
			"appointmentRequestId", "timeZone", "startBased" })
	public static class AvailabilityPattern implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "period_start_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar periodStartDatetime;
		@XmlElement(name = "period_end_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar periodEndDatetime;
		@XmlElement(name = "day_pattern", required = true, defaultValue = "YYYYYNN")
		protected String dayPattern;
		@XmlElement(name = "open_time", required = true, defaultValue = "PT8H")
		protected Duration openTime;
		@XmlElement(name = "close_time", required = true)
		protected Duration closeTime;
		@XmlElement(name = "location_type_id")
		protected String locationTypeId;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "activity_id")
		protected String activityId;
		@XmlElement(name = "activity_type_id")
		protected String activityTypeId;
		@XmlElement(name = "appointment_request_id")
		protected String appointmentRequestId;
		@XmlElement(name = "time_zone")
		protected String timeZone;
		@XmlElement(name = "start_based")
		protected Boolean startBased;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * periodStartDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getPeriodStartDatetime() {
			return periodStartDatetime;
		}

		/**
		 * periodStartDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setPeriodStartDatetime(XMLGregorianCalendar value) {
			this.periodStartDatetime = value;
		}

		/**
		 * periodEndDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getPeriodEndDatetime() {
			return periodEndDatetime;
		}

		/**
		 * periodEndDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setPeriodEndDatetime(XMLGregorianCalendar value) {
			this.periodEndDatetime = value;
		}

		/**
		 * dayPattern 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDayPattern() {
			return dayPattern;
		}

		/**
		 * dayPattern 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDayPattern(String value) {
			this.dayPattern = value;
		}

		/**
		 * openTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getOpenTime() {
			return openTime;
		}

		/**
		 * openTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setOpenTime(Duration value) {
			this.openTime = value;
		}

		/**
		 * closeTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getCloseTime() {
			return closeTime;
		}

		/**
		 * closeTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setCloseTime(Duration value) {
			this.closeTime = value;
		}

		/**
		 * locationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationTypeId() {
			return locationTypeId;
		}

		/**
		 * locationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationTypeId(String value) {
			this.locationTypeId = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * activityTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityTypeId() {
			return activityTypeId;
		}

		/**
		 * activityTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityTypeId(String value) {
			this.activityTypeId = value;
		}

		/**
		 * appointmentRequestId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAppointmentRequestId() {
			return appointmentRequestId;
		}

		/**
		 * appointmentRequestId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAppointmentRequestId(String value) {
			this.appointmentRequestId = value;
		}

		/**
		 * timeZone 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTimeZone() {
			return timeZone;
		}

		/**
		 * timeZone 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTimeZone(String value) {
			this.timeZone = value;
		}

		/**
		 * startBased 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isStartBased() {
			return startBased;
		}

		/**
		 * startBased 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setStartBased(Boolean value) {
			this.startBased = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="broadcast_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="cron_string" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="plan_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="10"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="minimum_plan_quality" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="minimum_step_interval" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="once_only" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="maximum_wait" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="input_reference_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="maximum_frequency" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="allocation_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="expiry_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "active", "broadcastTypeId",
			"cronString", "description", "planType", "minimumPlanQuality",
			"minimumStepInterval", "onceOnly", "maximumWait",
			"inputReferenceId", "maximumFrequency", "allocationType",
			"expiryDatetime" })
	public static class Broadcast implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(defaultValue = "true")
		protected boolean active;
		@XmlElement(name = "broadcast_type_id", required = true)
		protected String broadcastTypeId;
		@XmlElement(name = "cron_string")
		protected String cronString;
		protected String description;
		@XmlElement(name = "plan_type", required = true)
		protected String planType;
		@XmlElement(name = "minimum_plan_quality")
		protected Double minimumPlanQuality;
		@XmlElement(name = "minimum_step_interval")
		protected Integer minimumStepInterval;
		@XmlElement(name = "once_only", defaultValue = "false")
		protected boolean onceOnly;
		@XmlElement(name = "maximum_wait")
		protected Duration maximumWait;
		@XmlElement(name = "input_reference_id")
		protected String inputReferenceId;
		@XmlElement(name = "maximum_frequency")
		protected Duration maximumFrequency;
		@XmlElement(name = "allocation_type")
		protected Integer allocationType;
		@XmlElement(name = "expiry_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar expiryDatetime;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * active 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isActive() {
			return active;
		}

		/**
		 * active 속성의 값을 설정합니다.
		 * 
		 */
		public void setActive(boolean value) {
			this.active = value;
		}

		/**
		 * broadcastTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getBroadcastTypeId() {
			return broadcastTypeId;
		}

		/**
		 * broadcastTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setBroadcastTypeId(String value) {
			this.broadcastTypeId = value;
		}

		/**
		 * cronString 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCronString() {
			return cronString;
		}

		/**
		 * cronString 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCronString(String value) {
			this.cronString = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * planType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPlanType() {
			return planType;
		}

		/**
		 * planType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPlanType(String value) {
			this.planType = value;
		}

		/**
		 * minimumPlanQuality 속성의 값을 가져옵니다.
		 * 
		 */
		public Double getMinimumPlanQuality() {
			return minimumPlanQuality;
		}

		/**
		 * minimumPlanQuality 속성의 값을 설정합니다.
		 * 
		 */
		public void setMinimumPlanQuality(double value) {
			this.minimumPlanQuality = value;
		}

		/**
		 * minimumStepInterval 속성의 값을 가져옵니다.
		 * 
		 */
		public Integer getMinimumStepInterval() {
			return minimumStepInterval;
		}

		/**
		 * minimumStepInterval 속성의 값을 설정합니다.
		 * 
		 */
		public void setMinimumStepInterval(int value) {
			this.minimumStepInterval = value;
		}

		/**
		 * onceOnly 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isOnceOnly() {
			return onceOnly;
		}

		/**
		 * onceOnly 속성의 값을 설정합니다.
		 * 
		 */
		public void setOnceOnly(boolean value) {
			this.onceOnly = value;
		}

		/**
		 * maximumWait 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getMaximumWait() {
			return maximumWait;
		}

		/**
		 * maximumWait 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setMaximumWait(Duration value) {
			this.maximumWait = value;
		}

		/**
		 * inputReferenceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getInputReferenceId() {
			return inputReferenceId;
		}

		/**
		 * inputReferenceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setInputReferenceId(String value) {
			this.inputReferenceId = value;
		}

		/**
		 * maximumFrequency 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getMaximumFrequency() {
			return maximumFrequency;
		}

		/**
		 * maximumFrequency 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setMaximumFrequency(Duration value) {
			this.maximumFrequency = value;
		}

		/**
		 * allocationType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getAllocationType() {
			return allocationType;
		}

		/**
		 * allocationType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setAllocationType(Integer value) {
			this.allocationType = value;
		}

		/**
		 * expiryDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getExpiryDatetime() {
			return expiryDatetime;
		}

		/**
		 * expiryDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setExpiryDatetime(XMLGregorianCalendar value) {
			this.expiryDatetime = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="broadcast_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="parameter_name">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="parameter_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="1000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "broadcastId", "parameterName",
			"parameterValue" })
	public static class BroadcastParameter implements Serializable {

		@XmlElement(name = "broadcast_id", required = true)
		protected String broadcastId;
		@XmlElement(name = "parameter_name", required = true)
		protected String parameterName;
		@XmlElement(name = "parameter_value", required = true)
		protected String parameterValue;

		/**
		 * broadcastId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getBroadcastId() {
			return broadcastId;
		}

		/**
		 * broadcastId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setBroadcastId(String value) {
			this.broadcastId = value;
		}

		/**
		 * parameterName 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getParameterName() {
			return parameterName;
		}

		/**
		 * parameterName 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setParameterName(String value) {
			this.parameterName = value;
		}

		/**
		 * parameterValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getParameterValue() {
			return parameterValue;
		}

		/**
		 * parameterValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setParameterValue(String value) {
			this.parameterValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="broadcast_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="input_reference_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="broadcast_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "broadcastId", "planId",
			"inputReferenceInternalId", "broadcastDatetime", "success",
			"organisationId", "datasetId" })
	public static class BroadcastResult implements Serializable {

		@XmlElement(name = "broadcast_id", required = true)
		protected String broadcastId;
		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "input_reference_internal_id")
		protected int inputReferenceInternalId;
		@XmlElement(name = "broadcast_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar broadcastDatetime;
		@XmlElement(defaultValue = "false")
		protected boolean success;
		@XmlElement(name = "organisation_id")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true)
		protected String datasetId;

		/**
		 * broadcastId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getBroadcastId() {
			return broadcastId;
		}

		/**
		 * broadcastId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setBroadcastId(String value) {
			this.broadcastId = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * inputReferenceInternalId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getInputReferenceInternalId() {
			return inputReferenceInternalId;
		}

		/**
		 * inputReferenceInternalId 속성의 값을 설정합니다.
		 * 
		 */
		public void setInputReferenceInternalId(int value) {
			this.inputReferenceInternalId = value;
		}

		/**
		 * broadcastDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getBroadcastDatetime() {
			return broadcastDatetime;
		}

		/**
		 * broadcastDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setBroadcastDatetime(XMLGregorianCalendar value) {
			this.broadcastDatetime = value;
		}

		/**
		 * success 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isSuccess() {
			return success;
		}

		/**
		 * success 속성의 값을 설정합니다.
		 * 
		 */
		public void setSuccess(boolean value) {
			this.success = value;
		}

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description" })
	public static class BroadcastType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="calendar_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="day_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="1"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="ignore_shifts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "calendarDate", "dayType", "ignoreShifts" })
	public static class Calendar implements Serializable {

		@XmlElement(name = "calendar_date", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar calendarDate;
		@XmlElement(name = "day_type", required = true)
		protected String dayType;
		@XmlElement(name = "ignore_shifts", defaultValue = "true")
		protected boolean ignoreShifts;

		/**
		 * calendarDate 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getCalendarDate() {
			return calendarDate;
		}

		/**
		 * calendarDate 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setCalendarDate(XMLGregorianCalendar value) {
			this.calendarDate = value;
		}

		/**
		 * dayType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDayType() {
			return dayType;
		}

		/**
		 * dayType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDayType(String value) {
			this.dayType = value;
		}

		/**
		 * ignoreShifts 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isIgnoreShifts() {
			return ignoreShifts;
		}

		/**
		 * ignoreShifts 속성의 값을 설정합니다.
		 * 
		 */
		public void setIgnoreShifts(boolean value) {
			this.ignoreShifts = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="maximum_volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="maximum_part_quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "maximumVolume",
			"maximumPartQuantity" })
	public static class Capacity implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(name = "maximum_volume")
		protected Double maximumVolume;
		@XmlElement(name = "maximum_part_quantity")
		protected Integer maximumPartQuantity;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * maximumVolume 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getMaximumVolume() {
			return maximumVolume;
		}

		/**
		 * maximumVolume 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setMaximumVolume(Double value) {
			this.maximumVolume = value;
		}

		/**
		 * maximumPartQuantity 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getMaximumPartQuantity() {
			return maximumPartQuantity;
		}

		/**
		 * maximumPartQuantity 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setMaximumPartQuantity(Integer value) {
			this.maximumPartQuantity = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="capacity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="part_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="maximum_quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="exclusivity_required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "capacityId", "partId",
			"maximumQuantity", "exclusivityRequired" })
	public static class CapacityPart implements Serializable {

		@XmlElement(name = "capacity_id", required = true)
		protected String capacityId;
		@XmlElement(name = "part_id", required = true)
		protected String partId;
		@XmlElement(name = "maximum_quantity")
		protected Integer maximumQuantity;
		@XmlElement(name = "exclusivity_required", defaultValue = "true")
		protected boolean exclusivityRequired;

		/**
		 * capacityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCapacityId() {
			return capacityId;
		}

		/**
		 * capacityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCapacityId(String value) {
			this.capacityId = value;
		}

		/**
		 * partId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPartId() {
			return partId;
		}

		/**
		 * partId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPartId(String value) {
			this.partId = value;
		}

		/**
		 * maximumQuantity 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getMaximumQuantity() {
			return maximumQuantity;
		}

		/**
		 * maximumQuantity 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setMaximumQuantity(Integer value) {
			this.maximumQuantity = value;
		}

		/**
		 * exclusivityRequired 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isExclusivityRequired() {
			return exclusivityRequired;
		}

		/**
		 * exclusivityRequired 속성의 값을 설정합니다.
		 * 
		 */
		public void setExclusivityRequired(boolean value) {
			this.exclusivityRequired = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="comparison_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_column">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="default_value" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "comparisonTypeId", "objectTypeId",
			"objectColumn", "defaultValue" })
	public static class ComparisonExclusion implements Serializable {

		@XmlElement(name = "comparison_type_id", required = true)
		protected String comparisonTypeId;
		@XmlElement(name = "object_type_id", required = true)
		protected String objectTypeId;
		@XmlElement(name = "object_column", required = true)
		protected String objectColumn;
		@XmlElement(name = "default_value")
		protected String defaultValue;

		/**
		 * comparisonTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getComparisonTypeId() {
			return comparisonTypeId;
		}

		/**
		 * comparisonTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setComparisonTypeId(String value) {
			this.comparisonTypeId = value;
		}

		/**
		 * objectTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectTypeId() {
			return objectTypeId;
		}

		/**
		 * objectTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectTypeId(String value) {
			this.objectTypeId = value;
		}

		/**
		 * objectColumn 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectColumn() {
			return objectColumn;
		}

		/**
		 * objectColumn 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectColumn(String value) {
			this.objectColumn = value;
		}

		/**
		 * defaultValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDefaultValue() {
			return defaultValue;
		}

		/**
		 * defaultValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDefaultValue(String value) {
			this.defaultValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description" })
	public static class ComparisonType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="schedule_exception_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "scheduleExceptionTypeId", "activityId",
			"resourceId", "id" })
	public static class CustomException implements Serializable {

		@XmlElement(name = "schedule_exception_type_id")
		protected int scheduleExceptionTypeId;
		@XmlElement(name = "activity_id")
		protected String activityId;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(required = true)
		protected String id;

		/**
		 * scheduleExceptionTypeId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getScheduleExceptionTypeId() {
			return scheduleExceptionTypeId;
		}

		/**
		 * scheduleExceptionTypeId 속성의 값을 설정합니다.
		 * 
		 */
		public void setScheduleExceptionTypeId(int value) {
			this.scheduleExceptionTypeId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="label">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="256"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="custom_exception_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "sequence", "label", "value",
			"customExceptionId" })
	public static class CustomExceptionData implements Serializable {

		@XmlElement(defaultValue = "1")
		protected int sequence;
		@XmlElement(required = true)
		protected String label;
		@XmlElement(required = true)
		protected String value;
		@XmlElement(name = "custom_exception_id", required = true)
		protected String customExceptionId;

		/**
		 * sequence 속성의 값을 가져옵니다.
		 * 
		 */
		public int getSequence() {
			return sequence;
		}

		/**
		 * sequence 속성의 값을 설정합니다.
		 * 
		 */
		public void setSequence(int value) {
			this.sequence = value;
		}

		/**
		 * label 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLabel() {
			return label;
		}

		/**
		 * label 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLabel(String value) {
			this.label = value;
		}

		/**
		 * value 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getValue() {
			return value;
		}

		/**
		 * value 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setValue(String value) {
			this.value = value;
		}

		/**
		 * customExceptionId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCustomExceptionId() {
			return customExceptionId;
		}

		/**
		 * customExceptionId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCustomExceptionId(String value) {
			this.customExceptionId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="name">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="custom_action" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "name", "customAction",
			"activityId", "resourceId", "locationId", "activityTypeId",
			"resourceTypeId" })
	public static class CustomURL implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(required = true)
		protected String name;
		@XmlElement(name = "custom_action")
		protected String customAction;
		@XmlElement(name = "activity_id")
		protected String activityId;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "activity_type_id")
		protected String activityTypeId;
		@XmlElement(name = "resource_type_id")
		protected String resourceTypeId;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * name 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getName() {
			return name;
		}

		/**
		 * name 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setName(String value) {
			this.name = value;
		}

		/**
		 * customAction 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCustomAction() {
			return customAction;
		}

		/**
		 * customAction 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCustomAction(String value) {
			this.customAction = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * activityTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityTypeId() {
			return activityTypeId;
		}

		/**
		 * activityTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityTypeId(String value) {
			this.activityTypeId = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="profile_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="dataset_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="alias_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="dataset_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="running_state">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="last_update_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="external_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="80"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="footprint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "id", "description",
			"profileId", "datasetType", "aliasId", "datasetId", "runningState",
			"lastUpdateDatetime", "externalId", "footprint" })
	public static class Dataset implements Serializable {

		@XmlElement(name = "organisation_id", defaultValue = "1")
		protected int organisationId;
		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(name = "profile_id")
		protected String profileId;
		@XmlElement(name = "dataset_type", required = true)
		protected String datasetType;
		@XmlElement(name = "alias_id")
		protected String aliasId;
		@XmlElement(name = "dataset_id")
		protected String datasetId;
		@XmlElement(name = "running_state", required = true, defaultValue = "NO_DATA")
		protected String runningState;
		@XmlElement(name = "last_update_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar lastUpdateDatetime;
		@XmlElement(name = "external_id")
		protected String externalId;
		protected Double footprint;

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * profileId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProfileId() {
			return profileId;
		}

		/**
		 * profileId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProfileId(String value) {
			this.profileId = value;
		}

		/**
		 * datasetType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetType() {
			return datasetType;
		}

		/**
		 * datasetType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetType(String value) {
			this.datasetType = value;
		}

		/**
		 * aliasId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAliasId() {
			return aliasId;
		}

		/**
		 * aliasId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAliasId(String value) {
			this.aliasId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * runningState 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRunningState() {
			return runningState;
		}

		/**
		 * runningState 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRunningState(String value) {
			this.runningState = value;
		}

		/**
		 * lastUpdateDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getLastUpdateDatetime() {
			return lastUpdateDatetime;
		}

		/**
		 * lastUpdateDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setLastUpdateDatetime(XMLGregorianCalendar value) {
			this.lastUpdateDatetime = value;
		}

		/**
		 * externalId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getExternalId() {
			return externalId;
		}

		/**
		 * externalId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setExternalId(String value) {
			this.externalId = value;
		}

		/**
		 * footprint 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getFootprint() {
			return footprint;
		}

		/**
		 * footprint 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setFootprint(Double value) {
			this.footprint = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="datetime_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "datetimeStamp", "locationId",
			"activityId", "resourceId" })
	public static class DatasetSegmentMapping implements Serializable {

		@XmlElement(name = "datetime_stamp")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar datetimeStamp;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "activity_id")
		protected String activityId;
		@XmlElement(name = "resource_id")
		protected String resourceId;

		/**
		 * datetimeStamp 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDatetimeStamp() {
			return datetimeStamp;
		}

		/**
		 * datetimeStamp 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDatetimeStamp(XMLGregorianCalendar value) {
			this.datetimeStamp = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="datetime_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="application_instance_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="80"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="quality" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="total_allocations" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="input_reference_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="input_reference_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="input_reference_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "datasetId",
			"datetimeStamp", "applicationInstanceId", "applicationTypeId",
			"quality", "totalAllocations", "inputReferenceId",
			"inputReferenceDatetime", "inputReferenceInternalId" })
	public static class DatasetStatus implements Serializable {

		@XmlElement(name = "organisation_id")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true)
		protected String datasetId;
		@XmlElement(name = "datetime_stamp", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar datetimeStamp;
		@XmlElement(name = "application_instance_id", required = true)
		protected String applicationInstanceId;
		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		protected double quality;
		@XmlElement(name = "total_allocations")
		protected int totalAllocations;
		@XmlElement(name = "input_reference_id", required = true)
		protected String inputReferenceId;
		@XmlElement(name = "input_reference_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar inputReferenceDatetime;
		@XmlElement(name = "input_reference_internal_id")
		protected int inputReferenceInternalId;

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * datetimeStamp 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDatetimeStamp() {
			return datetimeStamp;
		}

		/**
		 * datetimeStamp 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDatetimeStamp(XMLGregorianCalendar value) {
			this.datetimeStamp = value;
		}

		/**
		 * applicationInstanceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationInstanceId() {
			return applicationInstanceId;
		}

		/**
		 * applicationInstanceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationInstanceId(String value) {
			this.applicationInstanceId = value;
		}

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * quality 속성의 값을 가져옵니다.
		 * 
		 */
		public double getQuality() {
			return quality;
		}

		/**
		 * quality 속성의 값을 설정합니다.
		 * 
		 */
		public void setQuality(double value) {
			this.quality = value;
		}

		/**
		 * totalAllocations 속성의 값을 가져옵니다.
		 * 
		 */
		public int getTotalAllocations() {
			return totalAllocations;
		}

		/**
		 * totalAllocations 속성의 값을 설정합니다.
		 * 
		 */
		public void setTotalAllocations(int value) {
			this.totalAllocations = value;
		}

		/**
		 * inputReferenceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getInputReferenceId() {
			return inputReferenceId;
		}

		/**
		 * inputReferenceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setInputReferenceId(String value) {
			this.inputReferenceId = value;
		}

		/**
		 * inputReferenceDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getInputReferenceDatetime() {
			return inputReferenceDatetime;
		}

		/**
		 * inputReferenceDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setInputReferenceDatetime(XMLGregorianCalendar value) {
			this.inputReferenceDatetime = value;
		}

		/**
		 * inputReferenceInternalId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getInputReferenceInternalId() {
			return inputReferenceInternalId;
		}

		/**
		 * inputReferenceInternalId 속성의 값을 설정합니다.
		 * 
		 */
		public void setInputReferenceInternalId(int value) {
			this.inputReferenceInternalId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_from" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_to" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="all_travels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "locationIdFrom", "locationIdTo",
			"resourceId", "shiftId", "shiftStartDatetime", "allTravels" })
	public static class DirectionRequest implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "location_id_from")
		protected String locationIdFrom;
		@XmlElement(name = "location_id_to")
		protected String locationIdTo;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "shift_id")
		protected String shiftId;
		@XmlElement(name = "shift_start_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar shiftStartDatetime;
		@XmlElement(name = "all_travels")
		protected Boolean allTravels;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * locationIdFrom 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdFrom() {
			return locationIdFrom;
		}

		/**
		 * locationIdFrom 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdFrom(String value) {
			this.locationIdFrom = value;
		}

		/**
		 * locationIdTo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdTo() {
			return locationIdTo;
		}

		/**
		 * locationIdTo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdTo(String value) {
			this.locationIdTo = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * shiftId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getShiftId() {
			return shiftId;
		}

		/**
		 * shiftId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setShiftId(String value) {
			this.shiftId = value;
		}

		/**
		 * shiftStartDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getShiftStartDatetime() {
			return shiftStartDatetime;
		}

		/**
		 * shiftStartDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setShiftStartDatetime(XMLGregorianCalendar value) {
			this.shiftStartDatetime = value;
		}

		/**
		 * allTravels 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isAllTravels() {
			return allTravels;
		}

		/**
		 * allTravels 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setAllTravels(Boolean value) {
			this.allTravels = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description" })
	public static class EventType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(required = true)
		protected String description;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="message_text_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="activation_option" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="256"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "messageTextId",
			"activationOption" })
	public static class ExceptionType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(name = "message_text_id")
		protected Integer messageTextId;
		@XmlElement(name = "activation_option")
		protected String activationOption;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * messageTextId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getMessageTextId() {
			return messageTextId;
		}

		/**
		 * messageTextId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setMessageTextId(Integer value) {
			this.messageTextId = value;
		}

		/**
		 * activationOption 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivationOption() {
			return activationOption;
		}

		/**
		 * activationOption 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivationOption(String value) {
			this.activationOption = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="input_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="20"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="load_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "datasetId",
			"internalId", "inputType", "loadStatus" })
	public static class InputLoadStatus implements Serializable {

		@XmlElement(name = "organisation_id")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true)
		protected String datasetId;
		@XmlElement(name = "internal_id")
		protected int internalId;
		@XmlElement(name = "input_type", required = true)
		protected String inputType;
		@XmlElement(name = "load_status")
		protected int loadStatus;

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * internalId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getInternalId() {
			return internalId;
		}

		/**
		 * internalId 속성의 값을 설정합니다.
		 * 
		 */
		public void setInternalId(int value) {
			this.internalId = value;
		}

		/**
		 * inputType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getInputType() {
			return inputType;
		}

		/**
		 * inputType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setInputType(String value) {
			this.inputType = value;
		}

		/**
		 * loadStatus 속성의 값을 가져옵니다.
		 * 
		 */
		public int getLoadStatus() {
			return loadStatus;
		}

		/**
		 * loadStatus 속성의 값을 설정합니다.
		 * 
		 */
		public void setLoadStatus(int value) {
			this.loadStatus = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="data_path" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="input_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="20"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="user_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="input_reference_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="input_reference_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="application_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="application_instance_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="80"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="schedule_data">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="20"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="load_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="appointment_utilisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="appointment_window_duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="licence_key" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="4000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="process_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="schedule_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="profile_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="input_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="internal_id_parent_dataset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "datetime", "id", "description",
			"dataPath", "inputType", "userId", "organisationId", "datasetId",
			"inputReferenceId", "inputReferenceDatetime", "applicationTypeId",
			"applicationInstanceId", "scheduleData", "loadStatus", "duration",
			"appointmentUtilisation", "appointmentWindowDuration",
			"licenceKey", "processType", "scheduleEndDatetime", "profileId",
			"inputDatetime", "internalIdParentDataset" })
	public static class InputReference implements Serializable {

		@XmlElement(required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar datetime;
		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(name = "data_path")
		protected String dataPath;
		@XmlElement(name = "input_type", required = true, defaultValue = "LOAD")
		protected String inputType;
		@XmlElement(name = "user_id")
		protected String userId;
		@XmlElement(name = "organisation_id", defaultValue = "1")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true, defaultValue = "360")
		protected String datasetId;
		@XmlElement(name = "input_reference_id")
		protected String inputReferenceId;
		@XmlElement(name = "input_reference_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar inputReferenceDatetime;
		@XmlElement(name = "application_type_id")
		protected String applicationTypeId;
		@XmlElement(name = "application_instance_id")
		protected String applicationInstanceId;
		@XmlElement(name = "schedule_data", required = true, defaultValue = "CONTINUOUS")
		protected String scheduleData;
		@XmlElement(name = "load_status", defaultValue = "0")
		protected int loadStatus;
		protected Duration duration;
		@XmlElement(name = "appointment_utilisation")
		protected Double appointmentUtilisation;
		@XmlElement(name = "appointment_window_duration")
		protected Duration appointmentWindowDuration;
		@XmlElement(name = "licence_key")
		protected String licenceKey;
		@XmlElement(name = "process_type", required = true, defaultValue = "DYNAMIC")
		protected String processType;
		@XmlElement(name = "schedule_end_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar scheduleEndDatetime;
		@XmlElement(name = "profile_id")
		protected String profileId;
		@XmlElement(name = "input_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar inputDatetime;
		@XmlElement(name = "internal_id_parent_dataset")
		protected Integer internalIdParentDataset;

		/**
		 * datetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDatetime() {
			return datetime;
		}

		/**
		 * datetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDatetime(XMLGregorianCalendar value) {
			this.datetime = value;
		}

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * dataPath 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDataPath() {
			return dataPath;
		}

		/**
		 * dataPath 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDataPath(String value) {
			this.dataPath = value;
		}

		/**
		 * inputType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getInputType() {
			return inputType;
		}

		/**
		 * inputType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setInputType(String value) {
			this.inputType = value;
		}

		/**
		 * userId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getUserId() {
			return userId;
		}

		/**
		 * userId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setUserId(String value) {
			this.userId = value;
		}

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * inputReferenceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getInputReferenceId() {
			return inputReferenceId;
		}

		/**
		 * inputReferenceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setInputReferenceId(String value) {
			this.inputReferenceId = value;
		}

		/**
		 * inputReferenceDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getInputReferenceDatetime() {
			return inputReferenceDatetime;
		}

		/**
		 * inputReferenceDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setInputReferenceDatetime(XMLGregorianCalendar value) {
			this.inputReferenceDatetime = value;
		}

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * applicationInstanceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationInstanceId() {
			return applicationInstanceId;
		}

		/**
		 * applicationInstanceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationInstanceId(String value) {
			this.applicationInstanceId = value;
		}

		/**
		 * scheduleData 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getScheduleData() {
			return scheduleData;
		}

		/**
		 * scheduleData 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setScheduleData(String value) {
			this.scheduleData = value;
		}

		/**
		 * loadStatus 속성의 값을 가져옵니다.
		 * 
		 */
		public int getLoadStatus() {
			return loadStatus;
		}

		/**
		 * loadStatus 속성의 값을 설정합니다.
		 * 
		 */
		public void setLoadStatus(int value) {
			this.loadStatus = value;
		}

		/**
		 * duration 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getDuration() {
			return duration;
		}

		/**
		 * duration 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setDuration(Duration value) {
			this.duration = value;
		}

		/**
		 * appointmentUtilisation 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getAppointmentUtilisation() {
			return appointmentUtilisation;
		}

		/**
		 * appointmentUtilisation 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setAppointmentUtilisation(Double value) {
			this.appointmentUtilisation = value;
		}

		/**
		 * appointmentWindowDuration 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getAppointmentWindowDuration() {
			return appointmentWindowDuration;
		}

		/**
		 * appointmentWindowDuration 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setAppointmentWindowDuration(Duration value) {
			this.appointmentWindowDuration = value;
		}

		/**
		 * licenceKey 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLicenceKey() {
			return licenceKey;
		}

		/**
		 * licenceKey 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLicenceKey(String value) {
			this.licenceKey = value;
		}

		/**
		 * processType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProcessType() {
			return processType;
		}

		/**
		 * processType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProcessType(String value) {
			this.processType = value;
		}

		/**
		 * scheduleEndDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getScheduleEndDatetime() {
			return scheduleEndDatetime;
		}

		/**
		 * scheduleEndDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setScheduleEndDatetime(XMLGregorianCalendar value) {
			this.scheduleEndDatetime = value;
		}

		/**
		 * profileId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProfileId() {
			return profileId;
		}

		/**
		 * profileId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProfileId(String value) {
			this.profileId = value;
		}

		/**
		 * inputDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getInputDatetime() {
			return inputDatetime;
		}

		/**
		 * inputDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setInputDatetime(XMLGregorianCalendar value) {
			this.inputDatetime = value;
		}

		/**
		 * internalIdParentDataset 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getInternalIdParentDataset() {
			return internalIdParentDataset;
		}

		/**
		 * internalIdParentDataset 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setInternalIdParentDataset(Integer value) {
			this.internalIdParentDataset = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="isochrone_request_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "isochroneRequestId",
			"sequence", "latitude", "longitude" })
	public static class IsochronePoint implements Serializable {

		@XmlElement(name = "plan_id")
		protected Integer planId;
		@XmlElement(name = "isochrone_request_id", required = true)
		protected String isochroneRequestId;
		protected int sequence;
		protected double latitude;
		protected double longitude;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setPlanId(Integer value) {
			this.planId = value;
		}

		/**
		 * isochroneRequestId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIsochroneRequestId() {
			return isochroneRequestId;
		}

		/**
		 * isochroneRequestId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIsochroneRequestId(String value) {
			this.isochroneRequestId = value;
		}

		/**
		 * sequence 속성의 값을 가져옵니다.
		 * 
		 */
		public int getSequence() {
			return sequence;
		}

		/**
		 * sequence 속성의 값을 설정합니다.
		 * 
		 */
		public void setSequence(int value) {
			this.sequence = value;
		}

		/**
		 * latitude 속성의 값을 가져옵니다.
		 * 
		 */
		public double getLatitude() {
			return latitude;
		}

		/**
		 * latitude 속성의 값을 설정합니다.
		 * 
		 */
		public void setLatitude(double value) {
			this.latitude = value;
		}

		/**
		 * longitude 속성의 값을 가져옵니다.
		 * 
		 */
		public double getLongitude() {
			return longitude;
		}

		/**
		 * longitude 속성의 값을 설정합니다.
		 * 
		 */
		public void setLongitude(double value) {
			this.longitude = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="profile_id_travel" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="speed_factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="calculate_envelope" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="grid_metres" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "locationId", "travelTime",
			"startDatetime", "profileIdTravel", "speedFactor",
			"calculateEnvelope", "gridMetres", "endDatetime", "latitude",
			"longitude" })
	public static class IsochroneRequest implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "travel_time")
		protected Duration travelTime;
		@XmlElement(name = "start_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar startDatetime;
		@XmlElement(name = "profile_id_travel")
		protected String profileIdTravel;
		@XmlElement(name = "speed_factor")
		protected Double speedFactor;
		@XmlElement(name = "calculate_envelope", defaultValue = "true")
		protected boolean calculateEnvelope;
		@XmlElement(name = "grid_metres")
		protected Double gridMetres;
		@XmlElement(name = "end_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar endDatetime;
		protected Double latitude;
		protected Double longitude;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * travelTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTravelTime() {
			return travelTime;
		}

		/**
		 * travelTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTravelTime(Duration value) {
			this.travelTime = value;
		}

		/**
		 * startDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getStartDatetime() {
			return startDatetime;
		}

		/**
		 * startDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setStartDatetime(XMLGregorianCalendar value) {
			this.startDatetime = value;
		}

		/**
		 * profileIdTravel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProfileIdTravel() {
			return profileIdTravel;
		}

		/**
		 * profileIdTravel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProfileIdTravel(String value) {
			this.profileIdTravel = value;
		}

		/**
		 * speedFactor 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getSpeedFactor() {
			return speedFactor;
		}

		/**
		 * speedFactor 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setSpeedFactor(Double value) {
			this.speedFactor = value;
		}

		/**
		 * calculateEnvelope 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isCalculateEnvelope() {
			return calculateEnvelope;
		}

		/**
		 * calculateEnvelope 속성의 값을 설정합니다.
		 * 
		 */
		public void setCalculateEnvelope(boolean value) {
			this.calculateEnvelope = value;
		}

		/**
		 * gridMetres 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getGridMetres() {
			return gridMetres;
		}

		/**
		 * gridMetres 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setGridMetres(Double value) {
			this.gridMetres = value;
		}

		/**
		 * endDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getEndDatetime() {
			return endDatetime;
		}

		/**
		 * endDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setEndDatetime(XMLGregorianCalendar value) {
			this.endDatetime = value;
		}

		/**
		 * latitude 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLatitude() {
			return latitude;
		}

		/**
		 * latitude 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLatitude(Double value) {
			this.latitude = value;
		}

		/**
		 * longitude 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLongitude() {
			return longitude;
		}

		/**
		 * longitude 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLongitude(Double value) {
			this.longitude = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="issue_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="raised_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="issue_value" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="200"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="issue_description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="2000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="message_text_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="dataset_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "issueTypeId", "raisedDatetime",
			"issueValue", "issueDescription", "messageTextId", "planId",
			"organisationId", "datasetId" })
	public static class Issue implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "issue_type_id")
		protected String issueTypeId;
		@XmlElement(name = "raised_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar raisedDatetime;
		@XmlElement(name = "issue_value")
		protected String issueValue;
		@XmlElement(name = "issue_description")
		protected String issueDescription;
		@XmlElement(name = "message_text_id")
		protected Integer messageTextId;
		@XmlElement(name = "plan_id")
		protected Integer planId;
		@XmlElement(name = "organisation_id")
		protected Integer organisationId;
		@XmlElement(name = "dataset_id")
		protected String datasetId;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * issueTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIssueTypeId() {
			return issueTypeId;
		}

		/**
		 * issueTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIssueTypeId(String value) {
			this.issueTypeId = value;
		}

		/**
		 * raisedDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getRaisedDatetime() {
			return raisedDatetime;
		}

		/**
		 * raisedDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setRaisedDatetime(XMLGregorianCalendar value) {
			this.raisedDatetime = value;
		}

		/**
		 * issueValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIssueValue() {
			return issueValue;
		}

		/**
		 * issueValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIssueValue(String value) {
			this.issueValue = value;
		}

		/**
		 * issueDescription 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIssueDescription() {
			return issueDescription;
		}

		/**
		 * issueDescription 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIssueDescription(String value) {
			this.issueDescription = value;
		}

		/**
		 * messageTextId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getMessageTextId() {
			return messageTextId;
		}

		/**
		 * messageTextId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setMessageTextId(Integer value) {
			this.messageTextId = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setPlanId(Integer value) {
			this.planId = value;
		}

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setOrganisationId(Integer value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="issue_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="threshold_value" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="200"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "issueTypeId", "organisationId",
			"datasetId", "thresholdValue" })
	public static class IssueDatasetThreshold implements Serializable {

		@XmlElement(name = "issue_type_id", required = true)
		protected String issueTypeId;
		@XmlElement(name = "organisation_id", defaultValue = "1")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true)
		protected String datasetId;
		@XmlElement(name = "threshold_value")
		protected String thresholdValue;

		/**
		 * issueTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIssueTypeId() {
			return issueTypeId;
		}

		/**
		 * issueTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIssueTypeId(String value) {
			this.issueTypeId = value;
		}

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * thresholdValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getThresholdValue() {
			return thresholdValue;
		}

		/**
		 * thresholdValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setThresholdValue(String value) {
			this.thresholdValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="issue_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="user_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="issue_response_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="response_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="response_description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="2000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="remind_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="dataset_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "issueId", "userId",
			"issueResponseTypeId", "responseDatetime", "responseDescription",
			"remindDatetime", "organisationId", "datasetId" })
	public static class IssueResponse implements Serializable {

		@XmlElement(name = "issue_id", required = true)
		protected String issueId;
		@XmlElement(name = "user_id", required = true)
		protected String userId;
		@XmlElement(name = "issue_response_type_id", required = true)
		protected String issueResponseTypeId;
		@XmlElement(name = "response_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar responseDatetime;
		@XmlElement(name = "response_description")
		protected String responseDescription;
		@XmlElement(name = "remind_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar remindDatetime;
		@XmlElement(name = "organisation_id")
		protected Integer organisationId;
		@XmlElement(name = "dataset_id")
		protected String datasetId;

		/**
		 * issueId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIssueId() {
			return issueId;
		}

		/**
		 * issueId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIssueId(String value) {
			this.issueId = value;
		}

		/**
		 * userId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getUserId() {
			return userId;
		}

		/**
		 * userId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setUserId(String value) {
			this.userId = value;
		}

		/**
		 * issueResponseTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIssueResponseTypeId() {
			return issueResponseTypeId;
		}

		/**
		 * issueResponseTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIssueResponseTypeId(String value) {
			this.issueResponseTypeId = value;
		}

		/**
		 * responseDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getResponseDatetime() {
			return responseDatetime;
		}

		/**
		 * responseDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setResponseDatetime(XMLGregorianCalendar value) {
			this.responseDatetime = value;
		}

		/**
		 * responseDescription 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResponseDescription() {
			return responseDescription;
		}

		/**
		 * responseDescription 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResponseDescription(String value) {
			this.responseDescription = value;
		}

		/**
		 * remindDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getRemindDatetime() {
			return remindDatetime;
		}

		/**
		 * remindDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setRemindDatetime(XMLGregorianCalendar value) {
			this.remindDatetime = value;
		}

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setOrganisationId(Integer value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="80"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="message_text_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "messageTextId" })
	public static class IssueResponseType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(name = "message_text_id")
		protected Integer messageTextId;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * messageTextId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getMessageTextId() {
			return messageTextId;
		}

		/**
		 * messageTextId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setMessageTextId(Integer value) {
			this.messageTextId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="issue_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="threshold_value" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="200"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "issueTypeId", "thresholdValue" })
	public static class IssueThreshold implements Serializable {

		@XmlElement(name = "issue_type_id", required = true)
		protected String issueTypeId;
		@XmlElement(name = "threshold_value")
		protected String thresholdValue;

		/**
		 * issueTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIssueTypeId() {
			return issueTypeId;
		}

		/**
		 * issueTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIssueTypeId(String value) {
			this.issueTypeId = value;
		}

		/**
		 * thresholdValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getThresholdValue() {
			return thresholdValue;
		}

		/**
		 * thresholdValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setThresholdValue(String value) {
			this.thresholdValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="last_load_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="last_change_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="max_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="last_update_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "datasetId",
			"lastLoadInternalId", "lastChangeInternalId", "maxInternalId",
			"lastUpdateDatetime" })
	public static class LoadInfo implements Serializable {

		@XmlElement(name = "organisation_id")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true)
		protected String datasetId;
		@XmlElement(name = "last_load_internal_id")
		protected int lastLoadInternalId;
		@XmlElement(name = "last_change_internal_id")
		protected int lastChangeInternalId;
		@XmlElement(name = "max_internal_id")
		protected int maxInternalId;
		@XmlElement(name = "last_update_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar lastUpdateDatetime;

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * lastLoadInternalId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getLastLoadInternalId() {
			return lastLoadInternalId;
		}

		/**
		 * lastLoadInternalId 속성의 값을 설정합니다.
		 * 
		 */
		public void setLastLoadInternalId(int value) {
			this.lastLoadInternalId = value;
		}

		/**
		 * lastChangeInternalId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getLastChangeInternalId() {
			return lastChangeInternalId;
		}

		/**
		 * lastChangeInternalId 속성의 값을 설정합니다.
		 * 
		 */
		public void setLastChangeInternalId(int value) {
			this.lastChangeInternalId = value;
		}

		/**
		 * maxInternalId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getMaxInternalId() {
			return maxInternalId;
		}

		/**
		 * maxInternalId 속성의 값을 설정합니다.
		 * 
		 */
		public void setMaxInternalId(int value) {
			this.maxInternalId = value;
		}

		/**
		 * lastUpdateDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getLastUpdateDatetime() {
			return lastUpdateDatetime;
		}

		/**
		 * lastUpdateDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setLastUpdateDatetime(XMLGregorianCalendar value) {
			this.lastUpdateDatetime = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="name" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="post_code_zip" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="20"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="address_line1" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="128"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="address_line2" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="128"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="city" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="region" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_geocode_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="state" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="addtime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="lack_of_coverage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *         &lt;element name="locality" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "name", "x", "y", "postCodeZip",
			"addressLine1", "addressLine2", "city", "region",
			"locationGeocodeId", "locationTypeId", "latitude", "longitude",
			"state", "addtime", "lackOfCoverage", "locality" })
	public static class Location implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String name;
		protected Integer x;
		protected Integer y;
		@XmlElement(name = "post_code_zip")
		protected String postCodeZip;
		@XmlElement(name = "address_line1")
		protected String addressLine1;
		@XmlElement(name = "address_line2")
		protected String addressLine2;
		protected String city;
		protected String region;
		@XmlElement(name = "location_geocode_id")
		protected String locationGeocodeId;
		@XmlElement(name = "location_type_id")
		protected String locationTypeId;
		protected Double latitude;
		protected Double longitude;
		protected String state;
		protected Duration addtime;
		@XmlElement(name = "lack_of_coverage")
		protected Boolean lackOfCoverage;
		protected String locality;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * name 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getName() {
			return name;
		}

		/**
		 * name 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setName(String value) {
			this.name = value;
		}

		/**
		 * x 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getX() {
			return x;
		}

		/**
		 * x 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setX(Integer value) {
			this.x = value;
		}

		/**
		 * y 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getY() {
			return y;
		}

		/**
		 * y 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setY(Integer value) {
			this.y = value;
		}

		/**
		 * postCodeZip 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPostCodeZip() {
			return postCodeZip;
		}

		/**
		 * postCodeZip 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPostCodeZip(String value) {
			this.postCodeZip = value;
		}

		/**
		 * addressLine1 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAddressLine1() {
			return addressLine1;
		}

		/**
		 * addressLine1 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAddressLine1(String value) {
			this.addressLine1 = value;
		}

		/**
		 * addressLine2 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAddressLine2() {
			return addressLine2;
		}

		/**
		 * addressLine2 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAddressLine2(String value) {
			this.addressLine2 = value;
		}

		/**
		 * city 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCity() {
			return city;
		}

		/**
		 * city 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCity(String value) {
			this.city = value;
		}

		/**
		 * region 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRegion() {
			return region;
		}

		/**
		 * region 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRegion(String value) {
			this.region = value;
		}

		/**
		 * locationGeocodeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationGeocodeId() {
			return locationGeocodeId;
		}

		/**
		 * locationGeocodeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationGeocodeId(String value) {
			this.locationGeocodeId = value;
		}

		/**
		 * locationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationTypeId() {
			return locationTypeId;
		}

		/**
		 * locationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationTypeId(String value) {
			this.locationTypeId = value;
		}

		/**
		 * latitude 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLatitude() {
			return latitude;
		}

		/**
		 * latitude 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLatitude(Double value) {
			this.latitude = value;
		}

		/**
		 * longitude 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLongitude() {
			return longitude;
		}

		/**
		 * longitude 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLongitude(Double value) {
			this.longitude = value;
		}

		/**
		 * state 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getState() {
			return state;
		}

		/**
		 * state 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setState(String value) {
			this.state = value;
		}

		/**
		 * addtime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getAddtime() {
			return addtime;
		}

		/**
		 * addtime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setAddtime(Duration value) {
			this.addtime = value;
		}

		/**
		 * lackOfCoverage 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isLackOfCoverage() {
			return lackOfCoverage;
		}

		/**
		 * lackOfCoverage 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setLackOfCoverage(Boolean value) {
			this.lackOfCoverage = value;
		}

		/**
		 * locality 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocality() {
			return locality;
		}

		/**
		 * locality 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocality(String value) {
			this.locality = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="region_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "regionId", "locationId" })
	public static class LocationRegion implements Serializable {

		@XmlElement(name = "region_id", required = true)
		protected String regionId;
		@XmlElement(name = "location_id", required = true)
		protected String locationId;

		/**
		 * regionId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRegionId() {
			return regionId;
		}

		/**
		 * regionId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRegionId(String value) {
			this.regionId = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="addtime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="lack_of_coverage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "addtime",
			"lackOfCoverage" })
	public static class LocationType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;
		protected Duration addtime;
		@XmlElement(name = "lack_of_coverage")
		protected Boolean lackOfCoverage;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * addtime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getAddtime() {
			return addtime;
		}

		/**
		 * addtime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setAddtime(Duration value) {
			this.addtime = value;
		}

		/**
		 * lackOfCoverage 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isLackOfCoverage() {
			return lackOfCoverage;
		}

		/**
		 * lackOfCoverage 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setLackOfCoverage(Boolean value) {
			this.lackOfCoverage = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="leeway" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="value_multiplier" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="same_resource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="step" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="min_delay" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "interval", "leeway",
			"valueMultiplier", "sameResource", "step", "minDelay" })
	public static class ModellingPattern implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(required = true)
		protected Duration interval;
		@XmlElement(required = true)
		protected Duration leeway;
		@XmlElement(name = "value_multiplier", defaultValue = "1")
		protected double valueMultiplier;
		@XmlElement(name = "same_resource", defaultValue = "false")
		protected boolean sameResource;
		@XmlElement(defaultValue = "1")
		protected int step;
		@XmlElement(name = "min_delay")
		protected Duration minDelay;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * interval 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getInterval() {
			return interval;
		}

		/**
		 * interval 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setInterval(Duration value) {
			this.interval = value;
		}

		/**
		 * leeway 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getLeeway() {
			return leeway;
		}

		/**
		 * leeway 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setLeeway(Duration value) {
			this.leeway = value;
		}

		/**
		 * valueMultiplier 속성의 값을 가져옵니다.
		 * 
		 */
		public double getValueMultiplier() {
			return valueMultiplier;
		}

		/**
		 * valueMultiplier 속성의 값을 설정합니다.
		 * 
		 */
		public void setValueMultiplier(double value) {
			this.valueMultiplier = value;
		}

		/**
		 * sameResource 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isSameResource() {
			return sameResource;
		}

		/**
		 * sameResource 속성의 값을 설정합니다.
		 * 
		 */
		public void setSameResource(boolean value) {
			this.sameResource = value;
		}

		/**
		 * step 속성의 값을 가져옵니다.
		 * 
		 */
		public int getStep() {
			return step;
		}

		/**
		 * step 속성의 값을 설정합니다.
		 * 
		 */
		public void setStep(int value) {
			this.step = value;
		}

		/**
		 * minDelay 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getMinDelay() {
			return minDelay;
		}

		/**
		 * minDelay 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setMinDelay(Duration value) {
			this.minDelay = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="object_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk1">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk2">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk3">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk4">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name1">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name2">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name3">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name4">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "objectTypeId", "objectPk1", "objectPk2",
			"objectPk3", "objectPk4", "objectPkName1", "objectPkName2",
			"objectPkName3", "objectPkName4" })
	public static class ObjectDeletion implements Serializable {

		@XmlElement(name = "object_type_id", required = true)
		protected String objectTypeId;
		@XmlElement(name = "object_pk1", required = true)
		protected String objectPk1;
		@XmlElement(name = "object_pk2", required = true, defaultValue = "")
		protected String objectPk2;
		@XmlElement(name = "object_pk3", required = true, defaultValue = "")
		protected String objectPk3;
		@XmlElement(name = "object_pk4", required = true, defaultValue = "")
		protected String objectPk4;
		@XmlElement(name = "object_pk_name1", required = true)
		protected String objectPkName1;
		@XmlElement(name = "object_pk_name2", required = true, defaultValue = "")
		protected String objectPkName2;
		@XmlElement(name = "object_pk_name3", required = true, defaultValue = "")
		protected String objectPkName3;
		@XmlElement(name = "object_pk_name4", required = true, defaultValue = "")
		protected String objectPkName4;

		/**
		 * objectTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectTypeId() {
			return objectTypeId;
		}

		/**
		 * objectTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectTypeId(String value) {
			this.objectTypeId = value;
		}

		/**
		 * objectPk1 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk1() {
			return objectPk1;
		}

		/**
		 * objectPk1 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk1(String value) {
			this.objectPk1 = value;
		}

		/**
		 * objectPk2 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk2() {
			return objectPk2;
		}

		/**
		 * objectPk2 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk2(String value) {
			this.objectPk2 = value;
		}

		/**
		 * objectPk3 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk3() {
			return objectPk3;
		}

		/**
		 * objectPk3 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk3(String value) {
			this.objectPk3 = value;
		}

		/**
		 * objectPk4 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk4() {
			return objectPk4;
		}

		/**
		 * objectPk4 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk4(String value) {
			this.objectPk4 = value;
		}

		/**
		 * objectPkName1 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName1() {
			return objectPkName1;
		}

		/**
		 * objectPkName1 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName1(String value) {
			this.objectPkName1 = value;
		}

		/**
		 * objectPkName2 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName2() {
			return objectPkName2;
		}

		/**
		 * objectPkName2 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName2(String value) {
			this.objectPkName2 = value;
		}

		/**
		 * objectPkName3 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName3() {
			return objectPkName3;
		}

		/**
		 * objectPkName3 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName3(String value) {
			this.objectPkName3 = value;
		}

		/**
		 * objectPkName4 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName4() {
			return objectPkName4;
		}

		/**
		 * objectPkName4 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName4(String value) {
			this.objectPkName4 = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="object_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk1">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk2">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="exception_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk3">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk4">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name1">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name2">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name3">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name4">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "objectTypeId", "objectPk1", "objectPk2",
			"exceptionTypeId", "objectPk3", "objectPk4", "objectPkName1",
			"objectPkName2", "objectPkName3", "objectPkName4" })
	public static class ObjectException implements Serializable {

		@XmlElement(name = "object_type_id", required = true)
		protected String objectTypeId;
		@XmlElement(name = "object_pk1", required = true)
		protected String objectPk1;
		@XmlElement(name = "object_pk2", required = true, defaultValue = "")
		protected String objectPk2;
		@XmlElement(name = "exception_type_id", required = true)
		protected String exceptionTypeId;
		@XmlElement(name = "object_pk3", required = true, defaultValue = "")
		protected String objectPk3;
		@XmlElement(name = "object_pk4", required = true)
		protected String objectPk4;
		@XmlElement(name = "object_pk_name1", required = true, defaultValue = "")
		protected String objectPkName1;
		@XmlElement(name = "object_pk_name2", required = true, defaultValue = "")
		protected String objectPkName2;
		@XmlElement(name = "object_pk_name3", required = true, defaultValue = "")
		protected String objectPkName3;
		@XmlElement(name = "object_pk_name4", required = true, defaultValue = "")
		protected String objectPkName4;

		/**
		 * objectTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectTypeId() {
			return objectTypeId;
		}

		/**
		 * objectTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectTypeId(String value) {
			this.objectTypeId = value;
		}

		/**
		 * objectPk1 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk1() {
			return objectPk1;
		}

		/**
		 * objectPk1 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk1(String value) {
			this.objectPk1 = value;
		}

		/**
		 * objectPk2 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk2() {
			return objectPk2;
		}

		/**
		 * objectPk2 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk2(String value) {
			this.objectPk2 = value;
		}

		/**
		 * exceptionTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getExceptionTypeId() {
			return exceptionTypeId;
		}

		/**
		 * exceptionTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setExceptionTypeId(String value) {
			this.exceptionTypeId = value;
		}

		/**
		 * objectPk3 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk3() {
			return objectPk3;
		}

		/**
		 * objectPk3 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk3(String value) {
			this.objectPk3 = value;
		}

		/**
		 * objectPk4 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk4() {
			return objectPk4;
		}

		/**
		 * objectPk4 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk4(String value) {
			this.objectPk4 = value;
		}

		/**
		 * objectPkName1 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName1() {
			return objectPkName1;
		}

		/**
		 * objectPkName1 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName1(String value) {
			this.objectPkName1 = value;
		}

		/**
		 * objectPkName2 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName2() {
			return objectPkName2;
		}

		/**
		 * objectPkName2 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName2(String value) {
			this.objectPkName2 = value;
		}

		/**
		 * objectPkName3 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName3() {
			return objectPkName3;
		}

		/**
		 * objectPkName3 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName3(String value) {
			this.objectPkName3 = value;
		}

		/**
		 * objectPkName4 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName4() {
			return objectPkName4;
		}

		/**
		 * objectPkName4 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName4(String value) {
			this.objectPkName4 = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="group_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "groupId", "activityId", "resourceId",
			"locationId", "id", "activityTypeId", "resourceTypeId",
			"locationTypeId" })
	public static class ObjectGroup implements Serializable {

		@XmlElement(name = "group_id", required = true)
		protected String groupId;
		@XmlElement(name = "activity_id", defaultValue = "")
		protected String activityId;
		@XmlElement(name = "resource_id", defaultValue = "")
		protected String resourceId;
		@XmlElement(name = "location_id", defaultValue = "")
		protected String locationId;
		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "activity_type_id")
		protected String activityTypeId;
		@XmlElement(name = "resource_type_id")
		protected String resourceTypeId;
		@XmlElement(name = "location_type_id")
		protected String locationTypeId;

		/**
		 * groupId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getGroupId() {
			return groupId;
		}

		/**
		 * groupId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setGroupId(String value) {
			this.groupId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * activityTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityTypeId() {
			return activityTypeId;
		}

		/**
		 * activityTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityTypeId(String value) {
			this.activityTypeId = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

		/**
		 * locationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationTypeId() {
			return locationTypeId;
		}

		/**
		 * locationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationTypeId(String value) {
			this.locationTypeId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description" })
	public static class ObjectType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="profile_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "profileId",
			"volume" })
	public static class Part implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(name = "profile_id")
		protected String profileId;
		protected Double volume;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * profileId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProfileId() {
			return profileId;
		}

		/**
		 * profileId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProfileId(String value) {
			this.profileId = value;
		}

		/**
		 * volume 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getVolume() {
			return volume;
		}

		/**
		 * volume 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setVolume(Double value) {
			this.volume = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="part_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="available_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="override_existing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "partId", "resourceId",
			"activityId", "availableDatetime", "stock", "overrideExisting" })
	public static class PartStock implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "part_id", required = true)
		protected String partId;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "activity_id")
		protected String activityId;
		@XmlElement(name = "available_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar availableDatetime;
		protected int stock;
		@XmlElement(name = "override_existing", defaultValue = "true")
		protected boolean overrideExisting;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * partId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPartId() {
			return partId;
		}

		/**
		 * partId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPartId(String value) {
			this.partId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * availableDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getAvailableDatetime() {
			return availableDatetime;
		}

		/**
		 * availableDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setAvailableDatetime(XMLGregorianCalendar value) {
			this.availableDatetime = value;
		}

		/**
		 * stock 속성의 값을 가져옵니다.
		 * 
		 */
		public int getStock() {
			return stock;
		}

		/**
		 * stock 속성의 값을 설정합니다.
		 * 
		 */
		public void setStock(int value) {
			this.stock = value;
		}

		/**
		 * overrideExisting 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isOverrideExisting() {
			return overrideExisting;
		}

		/**
		 * overrideExisting 속성의 값을 설정합니다.
		 * 
		 */
		public void setOverrideExisting(boolean value) {
			this.overrideExisting = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="output_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="travel_type" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="schedule_from" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="schedule_to" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="input_reference_date_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="input_reference_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="quality" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="last_plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="plan_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="diagnostics" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="time_taken" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="average_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="average_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="total_allocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="total_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="total_on_site_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_break_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_private_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="plan_margin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="input_reference_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="broadcast_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="licence_information" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="1000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="software_version" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="allocation_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="profile_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="load_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="appointment_window_end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "outputDatetime", "travelType",
			"scheduleFrom", "scheduleTo", "inputReferenceDateTime",
			"inputReferenceId", "quality", "lastPlanId", "planType",
			"diagnostics", "timeTaken", "averageTravelTime",
			"averageTravelDistance", "totalAllocations", "totalTravelTime",
			"totalTravelDistance", "utilisation", "totalOnSiteTime",
			"totalBreakTime", "totalPrivateTime", "organisationId",
			"datasetId", "planMargin", "inputReferenceInternalId",
			"broadcastId", "licenceInformation", "softwareVersion",
			"allocationType", "profileId", "loadStatus", "appointmentWindowEnd" })
	public static class Plan implements Serializable {

		protected int id;
		@XmlElement(name = "output_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar outputDatetime;
		@XmlElement(name = "travel_type")
		protected String travelType;
		@XmlElement(name = "schedule_from", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar scheduleFrom;
		@XmlElement(name = "schedule_to", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar scheduleTo;
		@XmlElement(name = "input_reference_date_time", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar inputReferenceDateTime;
		@XmlElement(name = "input_reference_id", required = true)
		protected String inputReferenceId;
		protected Double quality;
		@XmlElement(name = "last_plan_id")
		protected Integer lastPlanId;
		@XmlElement(name = "plan_type", required = true)
		protected String planType;
		protected String diagnostics;
		@XmlElement(name = "time_taken")
		protected Duration timeTaken;
		@XmlElement(name = "average_travel_time")
		protected Duration averageTravelTime;
		@XmlElement(name = "average_travel_distance")
		protected Double averageTravelDistance;
		@XmlElement(name = "total_allocations")
		protected Integer totalAllocations;
		@XmlElement(name = "total_travel_time")
		protected Duration totalTravelTime;
		@XmlElement(name = "total_travel_distance")
		protected Double totalTravelDistance;
		protected Double utilisation;
		@XmlElement(name = "total_on_site_time")
		protected Duration totalOnSiteTime;
		@XmlElement(name = "total_break_time")
		protected Duration totalBreakTime;
		@XmlElement(name = "total_private_time")
		protected Duration totalPrivateTime;
		@XmlElement(name = "organisation_id", defaultValue = "1")
		protected int organisationId;
		@XmlElement(name = "dataset_id")
		protected String datasetId;
		@XmlElement(name = "plan_margin")
		protected Double planMargin;
		@XmlElement(name = "input_reference_internal_id")
		protected int inputReferenceInternalId;
		@XmlElement(name = "broadcast_id")
		protected String broadcastId;
		@XmlElement(name = "licence_information")
		protected String licenceInformation;
		@XmlElement(name = "software_version")
		protected String softwareVersion;
		@XmlElement(name = "allocation_type", defaultValue = "1")
		protected int allocationType;
		@XmlElement(name = "profile_id")
		protected String profileId;
		@XmlElement(name = "load_status", defaultValue = "0")
		protected int loadStatus;
		@XmlElement(name = "appointment_window_end")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar appointmentWindowEnd;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 */
		public int getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 */
		public void setId(int value) {
			this.id = value;
		}

		/**
		 * outputDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getOutputDatetime() {
			return outputDatetime;
		}

		/**
		 * outputDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setOutputDatetime(XMLGregorianCalendar value) {
			this.outputDatetime = value;
		}

		/**
		 * travelType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTravelType() {
			return travelType;
		}

		/**
		 * travelType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTravelType(String value) {
			this.travelType = value;
		}

		/**
		 * scheduleFrom 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getScheduleFrom() {
			return scheduleFrom;
		}

		/**
		 * scheduleFrom 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setScheduleFrom(XMLGregorianCalendar value) {
			this.scheduleFrom = value;
		}

		/**
		 * scheduleTo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getScheduleTo() {
			return scheduleTo;
		}

		/**
		 * scheduleTo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setScheduleTo(XMLGregorianCalendar value) {
			this.scheduleTo = value;
		}

		/**
		 * inputReferenceDateTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getInputReferenceDateTime() {
			return inputReferenceDateTime;
		}

		/**
		 * inputReferenceDateTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setInputReferenceDateTime(XMLGregorianCalendar value) {
			this.inputReferenceDateTime = value;
		}

		/**
		 * inputReferenceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getInputReferenceId() {
			return inputReferenceId;
		}

		/**
		 * inputReferenceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setInputReferenceId(String value) {
			this.inputReferenceId = value;
		}

		/**
		 * quality 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getQuality() {
			return quality;
		}

		/**
		 * quality 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setQuality(Double value) {
			this.quality = value;
		}

		/**
		 * lastPlanId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getLastPlanId() {
			return lastPlanId;
		}

		/**
		 * lastPlanId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setLastPlanId(Integer value) {
			this.lastPlanId = value;
		}

		/**
		 * planType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPlanType() {
			return planType;
		}

		/**
		 * planType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPlanType(String value) {
			this.planType = value;
		}

		/**
		 * diagnostics 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDiagnostics() {
			return diagnostics;
		}

		/**
		 * diagnostics 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDiagnostics(String value) {
			this.diagnostics = value;
		}

		/**
		 * timeTaken 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTimeTaken() {
			return timeTaken;
		}

		/**
		 * timeTaken 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTimeTaken(Duration value) {
			this.timeTaken = value;
		}

		/**
		 * averageTravelTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getAverageTravelTime() {
			return averageTravelTime;
		}

		/**
		 * averageTravelTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setAverageTravelTime(Duration value) {
			this.averageTravelTime = value;
		}

		/**
		 * averageTravelDistance 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getAverageTravelDistance() {
			return averageTravelDistance;
		}

		/**
		 * averageTravelDistance 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setAverageTravelDistance(Double value) {
			this.averageTravelDistance = value;
		}

		/**
		 * totalAllocations 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getTotalAllocations() {
			return totalAllocations;
		}

		/**
		 * totalAllocations 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setTotalAllocations(Integer value) {
			this.totalAllocations = value;
		}

		/**
		 * totalTravelTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalTravelTime() {
			return totalTravelTime;
		}

		/**
		 * totalTravelTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalTravelTime(Duration value) {
			this.totalTravelTime = value;
		}

		/**
		 * totalTravelDistance 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getTotalTravelDistance() {
			return totalTravelDistance;
		}

		/**
		 * totalTravelDistance 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setTotalTravelDistance(Double value) {
			this.totalTravelDistance = value;
		}

		/**
		 * utilisation 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getUtilisation() {
			return utilisation;
		}

		/**
		 * utilisation 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setUtilisation(Double value) {
			this.utilisation = value;
		}

		/**
		 * totalOnSiteTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalOnSiteTime() {
			return totalOnSiteTime;
		}

		/**
		 * totalOnSiteTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalOnSiteTime(Duration value) {
			this.totalOnSiteTime = value;
		}

		/**
		 * totalBreakTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalBreakTime() {
			return totalBreakTime;
		}

		/**
		 * totalBreakTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalBreakTime(Duration value) {
			this.totalBreakTime = value;
		}

		/**
		 * totalPrivateTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalPrivateTime() {
			return totalPrivateTime;
		}

		/**
		 * totalPrivateTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalPrivateTime(Duration value) {
			this.totalPrivateTime = value;
		}

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * planMargin 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getPlanMargin() {
			return planMargin;
		}

		/**
		 * planMargin 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setPlanMargin(Double value) {
			this.planMargin = value;
		}

		/**
		 * inputReferenceInternalId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getInputReferenceInternalId() {
			return inputReferenceInternalId;
		}

		/**
		 * inputReferenceInternalId 속성의 값을 설정합니다.
		 * 
		 */
		public void setInputReferenceInternalId(int value) {
			this.inputReferenceInternalId = value;
		}

		/**
		 * broadcastId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getBroadcastId() {
			return broadcastId;
		}

		/**
		 * broadcastId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setBroadcastId(String value) {
			this.broadcastId = value;
		}

		/**
		 * licenceInformation 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLicenceInformation() {
			return licenceInformation;
		}

		/**
		 * licenceInformation 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLicenceInformation(String value) {
			this.licenceInformation = value;
		}

		/**
		 * softwareVersion 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSoftwareVersion() {
			return softwareVersion;
		}

		/**
		 * softwareVersion 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSoftwareVersion(String value) {
			this.softwareVersion = value;
		}

		/**
		 * allocationType 속성의 값을 가져옵니다.
		 * 
		 */
		public int getAllocationType() {
			return allocationType;
		}

		/**
		 * allocationType 속성의 값을 설정합니다.
		 * 
		 */
		public void setAllocationType(int value) {
			this.allocationType = value;
		}

		/**
		 * profileId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProfileId() {
			return profileId;
		}

		/**
		 * profileId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProfileId(String value) {
			this.profileId = value;
		}

		/**
		 * loadStatus 속성의 값을 가져옵니다.
		 * 
		 */
		public int getLoadStatus() {
			return loadStatus;
		}

		/**
		 * loadStatus 속성의 값을 설정합니다.
		 * 
		 */
		public void setLoadStatus(int value) {
			this.loadStatus = value;
		}

		/**
		 * appointmentWindowEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getAppointmentWindowEnd() {
			return appointmentWindowEnd;
		}

		/**
		 * appointmentWindowEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setAppointmentWindowEnd(XMLGregorianCalendar value) {
			this.appointmentWindowEnd = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="object_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk1">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk2">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk3">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk4">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name1">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name2">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name3">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="object_pk_name4">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "objectTypeId", "objectPk1", "objectPk2",
			"objectPk3", "objectPk4", "objectPkName1", "objectPkName2",
			"objectPkName3", "objectPkName4", "planId" })
	public static class PlanDeletion implements Serializable {

		@XmlElement(name = "object_type_id", required = true)
		protected String objectTypeId;
		@XmlElement(name = "object_pk1", required = true)
		protected String objectPk1;
		@XmlElement(name = "object_pk2", required = true, defaultValue = "")
		protected String objectPk2;
		@XmlElement(name = "object_pk3", required = true, defaultValue = "")
		protected String objectPk3;
		@XmlElement(name = "object_pk4", required = true, defaultValue = "")
		protected String objectPk4;
		@XmlElement(name = "object_pk_name1", required = true)
		protected String objectPkName1;
		@XmlElement(name = "object_pk_name2", required = true, defaultValue = "")
		protected String objectPkName2;
		@XmlElement(name = "object_pk_name3", required = true, defaultValue = "")
		protected String objectPkName3;
		@XmlElement(name = "object_pk_name4", required = true, defaultValue = "")
		protected String objectPkName4;
		@XmlElement(name = "plan_id")
		protected int planId;

		/**
		 * objectTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectTypeId() {
			return objectTypeId;
		}

		/**
		 * objectTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectTypeId(String value) {
			this.objectTypeId = value;
		}

		/**
		 * objectPk1 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk1() {
			return objectPk1;
		}

		/**
		 * objectPk1 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk1(String value) {
			this.objectPk1 = value;
		}

		/**
		 * objectPk2 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk2() {
			return objectPk2;
		}

		/**
		 * objectPk2 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk2(String value) {
			this.objectPk2 = value;
		}

		/**
		 * objectPk3 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk3() {
			return objectPk3;
		}

		/**
		 * objectPk3 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk3(String value) {
			this.objectPk3 = value;
		}

		/**
		 * objectPk4 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPk4() {
			return objectPk4;
		}

		/**
		 * objectPk4 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPk4(String value) {
			this.objectPk4 = value;
		}

		/**
		 * objectPkName1 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName1() {
			return objectPkName1;
		}

		/**
		 * objectPkName1 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName1(String value) {
			this.objectPkName1 = value;
		}

		/**
		 * objectPkName2 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName2() {
			return objectPkName2;
		}

		/**
		 * objectPkName2 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName2(String value) {
			this.objectPkName2 = value;
		}

		/**
		 * objectPkName3 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName3() {
			return objectPkName3;
		}

		/**
		 * objectPkName3 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName3(String value) {
			this.objectPkName3 = value;
		}

		/**
		 * objectPkName4 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getObjectPkName4() {
			return objectPkName4;
		}

		/**
		 * objectPkName4 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setObjectPkName4(String value) {
			this.objectPkName4 = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="location_id_from">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_to">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="total_distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="elapsed_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_elapsed_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="direction_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="direction_text">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="512"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "locationIdFrom",
			"locationIdTo", "sequence", "distance", "totalDistance",
			"elapsedTime", "totalElapsedTime", "directionType", "directionText" })
	public static class PlanDirection implements Serializable {

		@XmlElement(name = "plan_id")
		protected Integer planId;
		@XmlElement(name = "location_id_from", required = true)
		protected String locationIdFrom;
		@XmlElement(name = "location_id_to", required = true)
		protected String locationIdTo;
		protected int sequence;
		protected double distance;
		@XmlElement(name = "total_distance")
		protected double totalDistance;
		@XmlElement(name = "elapsed_time")
		protected Duration elapsedTime;
		@XmlElement(name = "total_elapsed_time")
		protected Duration totalElapsedTime;
		@XmlElement(name = "direction_type", required = true)
		protected String directionType;
		@XmlElement(name = "direction_text", required = true)
		protected String directionText;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setPlanId(Integer value) {
			this.planId = value;
		}

		/**
		 * locationIdFrom 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdFrom() {
			return locationIdFrom;
		}

		/**
		 * locationIdFrom 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdFrom(String value) {
			this.locationIdFrom = value;
		}

		/**
		 * locationIdTo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdTo() {
			return locationIdTo;
		}

		/**
		 * locationIdTo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdTo(String value) {
			this.locationIdTo = value;
		}

		/**
		 * sequence 속성의 값을 가져옵니다.
		 * 
		 */
		public int getSequence() {
			return sequence;
		}

		/**
		 * sequence 속성의 값을 설정합니다.
		 * 
		 */
		public void setSequence(int value) {
			this.sequence = value;
		}

		/**
		 * distance 속성의 값을 가져옵니다.
		 * 
		 */
		public double getDistance() {
			return distance;
		}

		/**
		 * distance 속성의 값을 설정합니다.
		 * 
		 */
		public void setDistance(double value) {
			this.distance = value;
		}

		/**
		 * totalDistance 속성의 값을 가져옵니다.
		 * 
		 */
		public double getTotalDistance() {
			return totalDistance;
		}

		/**
		 * totalDistance 속성의 값을 설정합니다.
		 * 
		 */
		public void setTotalDistance(double value) {
			this.totalDistance = value;
		}

		/**
		 * elapsedTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getElapsedTime() {
			return elapsedTime;
		}

		/**
		 * elapsedTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setElapsedTime(Duration value) {
			this.elapsedTime = value;
		}

		/**
		 * totalElapsedTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalElapsedTime() {
			return totalElapsedTime;
		}

		/**
		 * totalElapsedTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalElapsedTime(Duration value) {
			this.totalElapsedTime = value;
		}

		/**
		 * directionType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDirectionType() {
			return directionType;
		}

		/**
		 * directionType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDirectionType(String value) {
			this.directionType = value;
		}

		/**
		 * directionText 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDirectionText() {
			return directionText;
		}

		/**
		 * directionText 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDirectionText(String value) {
			this.directionText = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="last_complete_plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="last_plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="last_update_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="last_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="max_plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "datasetId",
			"lastCompletePlanId", "lastPlanId", "lastUpdateDatetime",
			"lastInternalId", "maxPlanId" })
	public static class PlanInfo implements Serializable {

		@XmlElement(name = "organisation_id")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true)
		protected String datasetId;
		@XmlElement(name = "last_complete_plan_id")
		protected int lastCompletePlanId;
		@XmlElement(name = "last_plan_id")
		protected int lastPlanId;
		@XmlElement(name = "last_update_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar lastUpdateDatetime;
		@XmlElement(name = "last_internal_id")
		protected int lastInternalId;
		@XmlElement(name = "max_plan_id")
		protected int maxPlanId;

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * lastCompletePlanId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getLastCompletePlanId() {
			return lastCompletePlanId;
		}

		/**
		 * lastCompletePlanId 속성의 값을 설정합니다.
		 * 
		 */
		public void setLastCompletePlanId(int value) {
			this.lastCompletePlanId = value;
		}

		/**
		 * lastPlanId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getLastPlanId() {
			return lastPlanId;
		}

		/**
		 * lastPlanId 속성의 값을 설정합니다.
		 * 
		 */
		public void setLastPlanId(int value) {
			this.lastPlanId = value;
		}

		/**
		 * lastUpdateDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getLastUpdateDatetime() {
			return lastUpdateDatetime;
		}

		/**
		 * lastUpdateDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setLastUpdateDatetime(XMLGregorianCalendar value) {
			this.lastUpdateDatetime = value;
		}

		/**
		 * lastInternalId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getLastInternalId() {
			return lastInternalId;
		}

		/**
		 * lastInternalId 속성의 값을 설정합니다.
		 * 
		 */
		public void setLastInternalId(int value) {
			this.lastInternalId = value;
		}

		/**
		 * maxPlanId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getMaxPlanId() {
			return maxPlanId;
		}

		/**
		 * maxPlanId 속성의 값을 설정합니다.
		 * 
		 */
		public void setMaxPlanId(int value) {
			this.maxPlanId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="plan_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="load_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "datasetId", "planId",
			"planType", "loadStatus", "internalId" })
	public static class PlanLoadStatus implements Serializable {

		@XmlElement(name = "organisation_id")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true)
		protected String datasetId;
		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "plan_type", required = true)
		protected String planType;
		@XmlElement(name = "load_status")
		protected int loadStatus;
		@XmlElement(name = "internal_id")
		protected int internalId;

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * planType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPlanType() {
			return planType;
		}

		/**
		 * planType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPlanType(String value) {
			this.planType = value;
		}

		/**
		 * loadStatus 속성의 값을 가져옵니다.
		 * 
		 */
		public int getLoadStatus() {
			return loadStatus;
		}

		/**
		 * loadStatus 속성의 값을 설정합니다.
		 * 
		 */
		public void setLoadStatus(int value) {
			this.loadStatus = value;
		}

		/**
		 * internalId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getInternalId() {
			return internalId;
		}

		/**
		 * internalId 속성의 값을 설정합니다.
		 * 
		 */
		public void setInternalId(int value) {
			this.internalId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_margin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="average_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="average_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="total_allocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="total_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_on_site_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_break_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_private_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "resourceId", "resourceMargin",
			"averageTravelTime", "averageTravelDistance", "totalAllocations",
			"utilisation", "totalTravelTime", "totalOnSiteTime",
			"totalBreakTime", "totalPrivateTime" })
	public static class PlanResource implements Serializable {

		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "resource_margin")
		protected Double resourceMargin;
		@XmlElement(name = "average_travel_time")
		protected Duration averageTravelTime;
		@XmlElement(name = "average_travel_distance")
		protected Double averageTravelDistance;
		@XmlElement(name = "total_allocations")
		protected Integer totalAllocations;
		protected Double utilisation;
		@XmlElement(name = "total_travel_time")
		protected Duration totalTravelTime;
		@XmlElement(name = "total_on_site_time")
		protected Duration totalOnSiteTime;
		@XmlElement(name = "total_break_time")
		protected Duration totalBreakTime;
		@XmlElement(name = "total_private_time")
		protected Duration totalPrivateTime;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * resourceMargin 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getResourceMargin() {
			return resourceMargin;
		}

		/**
		 * resourceMargin 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setResourceMargin(Double value) {
			this.resourceMargin = value;
		}

		/**
		 * averageTravelTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getAverageTravelTime() {
			return averageTravelTime;
		}

		/**
		 * averageTravelTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setAverageTravelTime(Duration value) {
			this.averageTravelTime = value;
		}

		/**
		 * averageTravelDistance 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getAverageTravelDistance() {
			return averageTravelDistance;
		}

		/**
		 * averageTravelDistance 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setAverageTravelDistance(Double value) {
			this.averageTravelDistance = value;
		}

		/**
		 * totalAllocations 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getTotalAllocations() {
			return totalAllocations;
		}

		/**
		 * totalAllocations 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setTotalAllocations(Integer value) {
			this.totalAllocations = value;
		}

		/**
		 * utilisation 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getUtilisation() {
			return utilisation;
		}

		/**
		 * utilisation 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setUtilisation(Double value) {
			this.utilisation = value;
		}

		/**
		 * totalTravelTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalTravelTime() {
			return totalTravelTime;
		}

		/**
		 * totalTravelTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalTravelTime(Duration value) {
			this.totalTravelTime = value;
		}

		/**
		 * totalOnSiteTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalOnSiteTime() {
			return totalOnSiteTime;
		}

		/**
		 * totalOnSiteTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalOnSiteTime(Duration value) {
			this.totalOnSiteTime = value;
		}

		/**
		 * totalBreakTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalBreakTime() {
			return totalBreakTime;
		}

		/**
		 * totalBreakTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalBreakTime(Duration value) {
			this.totalBreakTime = value;
		}

		/**
		 * totalPrivateTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalPrivateTime() {
			return totalPrivateTime;
		}

		/**
		 * totalPrivateTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalPrivateTime(Duration value) {
			this.totalPrivateTime = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="route_margin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="average_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="average_travel_distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="total_allocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="shift_pattern_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="shift_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="shift_overtime_end" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="shift_actual_start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="shift_actual_end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="total_travel_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_on_site_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_break_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="total_private_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "resourceId", "shiftId",
			"routeMargin", "averageTravelTime", "averageTravelDistance",
			"totalAllocations", "utilisation", "shiftPatternId",
			"shiftStartDatetime", "shiftEndDatetime", "shiftOvertimeEnd",
			"shiftActualStart", "shiftActualEnd", "totalTravelTime",
			"totalOnSiteTime", "totalBreakTime", "totalPrivateTime" })
	public static class PlanRoute implements Serializable {

		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "shift_id")
		protected String shiftId;
		@XmlElement(name = "route_margin")
		protected Double routeMargin;
		@XmlElement(name = "average_travel_time")
		protected Duration averageTravelTime;
		@XmlElement(name = "average_travel_distance")
		protected Double averageTravelDistance;
		@XmlElement(name = "total_allocations")
		protected Integer totalAllocations;
		protected Double utilisation;
		@XmlElement(name = "shift_pattern_id")
		protected String shiftPatternId;
		@XmlElement(name = "shift_start_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar shiftStartDatetime;
		@XmlElement(name = "shift_end_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar shiftEndDatetime;
		@XmlElement(name = "shift_overtime_end", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar shiftOvertimeEnd;
		@XmlElement(name = "shift_actual_start")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar shiftActualStart;
		@XmlElement(name = "shift_actual_end")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar shiftActualEnd;
		@XmlElement(name = "total_travel_time")
		protected Duration totalTravelTime;
		@XmlElement(name = "total_on_site_time")
		protected Duration totalOnSiteTime;
		@XmlElement(name = "total_break_time")
		protected Duration totalBreakTime;
		@XmlElement(name = "total_private_time")
		protected Duration totalPrivateTime;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * shiftId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getShiftId() {
			return shiftId;
		}

		/**
		 * shiftId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setShiftId(String value) {
			this.shiftId = value;
		}

		/**
		 * routeMargin 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getRouteMargin() {
			return routeMargin;
		}

		/**
		 * routeMargin 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setRouteMargin(Double value) {
			this.routeMargin = value;
		}

		/**
		 * averageTravelTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getAverageTravelTime() {
			return averageTravelTime;
		}

		/**
		 * averageTravelTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setAverageTravelTime(Duration value) {
			this.averageTravelTime = value;
		}

		/**
		 * averageTravelDistance 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getAverageTravelDistance() {
			return averageTravelDistance;
		}

		/**
		 * averageTravelDistance 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setAverageTravelDistance(Double value) {
			this.averageTravelDistance = value;
		}

		/**
		 * totalAllocations 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getTotalAllocations() {
			return totalAllocations;
		}

		/**
		 * totalAllocations 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setTotalAllocations(Integer value) {
			this.totalAllocations = value;
		}

		/**
		 * utilisation 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getUtilisation() {
			return utilisation;
		}

		/**
		 * utilisation 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setUtilisation(Double value) {
			this.utilisation = value;
		}

		/**
		 * shiftPatternId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getShiftPatternId() {
			return shiftPatternId;
		}

		/**
		 * shiftPatternId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setShiftPatternId(String value) {
			this.shiftPatternId = value;
		}

		/**
		 * shiftStartDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getShiftStartDatetime() {
			return shiftStartDatetime;
		}

		/**
		 * shiftStartDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setShiftStartDatetime(XMLGregorianCalendar value) {
			this.shiftStartDatetime = value;
		}

		/**
		 * shiftEndDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getShiftEndDatetime() {
			return shiftEndDatetime;
		}

		/**
		 * shiftEndDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setShiftEndDatetime(XMLGregorianCalendar value) {
			this.shiftEndDatetime = value;
		}

		/**
		 * shiftOvertimeEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getShiftOvertimeEnd() {
			return shiftOvertimeEnd;
		}

		/**
		 * shiftOvertimeEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setShiftOvertimeEnd(XMLGregorianCalendar value) {
			this.shiftOvertimeEnd = value;
		}

		/**
		 * shiftActualStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getShiftActualStart() {
			return shiftActualStart;
		}

		/**
		 * shiftActualStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setShiftActualStart(XMLGregorianCalendar value) {
			this.shiftActualStart = value;
		}

		/**
		 * shiftActualEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getShiftActualEnd() {
			return shiftActualEnd;
		}

		/**
		 * shiftActualEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setShiftActualEnd(XMLGregorianCalendar value) {
			this.shiftActualEnd = value;
		}

		/**
		 * totalTravelTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalTravelTime() {
			return totalTravelTime;
		}

		/**
		 * totalTravelTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalTravelTime(Duration value) {
			this.totalTravelTime = value;
		}

		/**
		 * totalOnSiteTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalOnSiteTime() {
			return totalOnSiteTime;
		}

		/**
		 * totalOnSiteTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalOnSiteTime(Duration value) {
			this.totalOnSiteTime = value;
		}

		/**
		 * totalBreakTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalBreakTime() {
			return totalBreakTime;
		}

		/**
		 * totalBreakTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalBreakTime(Duration value) {
			this.totalBreakTime = value;
		}

		/**
		 * totalPrivateTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTotalPrivateTime() {
			return totalPrivateTime;
		}

		/**
		 * totalPrivateTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTotalPrivateTime(Duration value) {
			this.totalPrivateTime = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="end_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="start_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="start_location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="end_location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="previous_activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="previous_visit_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="shift_pattern_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="schedule_event_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "resourceId", "shiftId",
			"distance", "endTime", "startTime", "startLocationId",
			"endLocationId", "activityId", "previousActivityId", "visitId",
			"previousVisitId", "shiftPatternId", "shiftStartDatetime",
			"scheduleEventId" })
	public static class PlanTravel implements Serializable {

		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "shift_id")
		protected String shiftId;
		protected double distance;
		@XmlElement(name = "end_time", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar endTime;
		@XmlElement(name = "start_time", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar startTime;
		@XmlElement(name = "start_location_id")
		protected String startLocationId;
		@XmlElement(name = "end_location_id")
		protected String endLocationId;
		@XmlElement(name = "activity_id")
		protected String activityId;
		@XmlElement(name = "previous_activity_id")
		protected String previousActivityId;
		@XmlElement(name = "visit_id")
		protected Integer visitId;
		@XmlElement(name = "previous_visit_id")
		protected Integer previousVisitId;
		@XmlElement(name = "shift_pattern_id")
		protected String shiftPatternId;
		@XmlElement(name = "shift_start_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar shiftStartDatetime;
		@XmlElement(name = "schedule_event_id")
		protected String scheduleEventId;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * shiftId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getShiftId() {
			return shiftId;
		}

		/**
		 * shiftId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setShiftId(String value) {
			this.shiftId = value;
		}

		/**
		 * distance 속성의 값을 가져옵니다.
		 * 
		 */
		public double getDistance() {
			return distance;
		}

		/**
		 * distance 속성의 값을 설정합니다.
		 * 
		 */
		public void setDistance(double value) {
			this.distance = value;
		}

		/**
		 * endTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getEndTime() {
			return endTime;
		}

		/**
		 * endTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setEndTime(XMLGregorianCalendar value) {
			this.endTime = value;
		}

		/**
		 * startTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getStartTime() {
			return startTime;
		}

		/**
		 * startTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setStartTime(XMLGregorianCalendar value) {
			this.startTime = value;
		}

		/**
		 * startLocationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getStartLocationId() {
			return startLocationId;
		}

		/**
		 * startLocationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setStartLocationId(String value) {
			this.startLocationId = value;
		}

		/**
		 * endLocationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEndLocationId() {
			return endLocationId;
		}

		/**
		 * endLocationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEndLocationId(String value) {
			this.endLocationId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * previousActivityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPreviousActivityId() {
			return previousActivityId;
		}

		/**
		 * previousActivityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPreviousActivityId(String value) {
			this.previousActivityId = value;
		}

		/**
		 * visitId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getVisitId() {
			return visitId;
		}

		/**
		 * visitId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setVisitId(Integer value) {
			this.visitId = value;
		}

		/**
		 * previousVisitId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getPreviousVisitId() {
			return previousVisitId;
		}

		/**
		 * previousVisitId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setPreviousVisitId(Integer value) {
			this.previousVisitId = value;
		}

		/**
		 * shiftPatternId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getShiftPatternId() {
			return shiftPatternId;
		}

		/**
		 * shiftPatternId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setShiftPatternId(String value) {
			this.shiftPatternId = value;
		}

		/**
		 * shiftStartDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getShiftStartDatetime() {
			return shiftStartDatetime;
		}

		/**
		 * shiftStartDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setShiftStartDatetime(XMLGregorianCalendar value) {
			this.shiftStartDatetime = value;
		}

		/**
		 * scheduleEventId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getScheduleEventId() {
			return scheduleEventId;
		}

		/**
		 * scheduleEventId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setScheduleEventId(String value) {
			this.scheduleEventId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="region_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "regionId" })
	public static class Region implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(name = "region_id")
		protected String regionId;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * regionId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRegionId() {
			return regionId;
		}

		/**
		 * regionId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRegionId(String value) {
			this.regionId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="capacity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "resourceId", "capacityId" })
	public static class ResourceCapacity implements Serializable {

		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "capacity_id", required = true)
		protected String capacityId;

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * capacityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCapacityId() {
			return capacityId;
		}

		/**
		 * capacityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCapacityId(String value) {
			this.capacityId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="movement_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "resourceId", "movementType",
			"locationId", "resourceTypeId", "latitude", "longitude" })
	public static class ResourceMovement implements Serializable {

		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "movement_type")
		protected int movementType;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "resource_type_id")
		protected String resourceTypeId;
		protected Double latitude;
		protected Double longitude;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * movementType 속성의 값을 가져옵니다.
		 * 
		 */
		public int getMovementType() {
			return movementType;
		}

		/**
		 * movementType 속성의 값을 설정합니다.
		 * 
		 */
		public void setMovementType(int value) {
			this.movementType = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

		/**
		 * latitude 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLatitude() {
			return latitude;
		}

		/**
		 * latitude 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLatitude(Double value) {
			this.latitude = value;
		}

		/**
		 * longitude 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLongitude() {
			return longitude;
		}

		/**
		 * longitude 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLongitude(Double value) {
			this.longitude = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="part_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "partId", "resourceId", "stock" })
	public static class ResourcePart implements Serializable {

		@XmlElement(name = "part_id", required = true)
		protected String partId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(defaultValue = "1")
		protected int stock;

		/**
		 * partId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPartId() {
			return partId;
		}

		/**
		 * partId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPartId(String value) {
			this.partId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * stock 속성의 값을 가져옵니다.
		 * 
		 */
		public int getStock() {
			return stock;
		}

		/**
		 * stock 속성의 값을 설정합니다.
		 * 
		 */
		public void setStock(int value) {
			this.stock = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="preference" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "resourceId", "activityId", "preference",
			"id", "activityTypeId", "locationId", "resourceTypeId" })
	public static class ResourcePreference implements Serializable {

		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "activity_id")
		protected String activityId;
		protected double preference;
		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "activity_type_id")
		protected String activityTypeId;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "resource_type_id")
		protected String resourceTypeId;

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * preference 속성의 값을 가져옵니다.
		 * 
		 */
		public double getPreference() {
			return preference;
		}

		/**
		 * preference 속성의 값을 설정합니다.
		 * 
		 */
		public void setPreference(double value) {
			this.preference = value;
		}

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * activityTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityTypeId() {
			return activityTypeId;
		}

		/**
		 * activityTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityTypeId(String value) {
			this.activityTypeId = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="region_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="within_region_multiplier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "regionId", "resourceId",
			"withinRegionMultiplier" })
	public static class ResourceRegion implements Serializable {

		@XmlElement(name = "region_id", required = true)
		protected String regionId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "within_region_multiplier")
		protected Double withinRegionMultiplier;

		/**
		 * regionId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRegionId() {
			return regionId;
		}

		/**
		 * regionId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRegionId(String value) {
			this.regionId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * withinRegionMultiplier 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getWithinRegionMultiplier() {
			return withinRegionMultiplier;
		}

		/**
		 * withinRegionMultiplier 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setWithinRegionMultiplier(Double value) {
			this.withinRegionMultiplier = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="skill_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="proficiency" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "skillId", "resourceId", "proficiency" })
	public static class ResourceSkill implements Serializable {

		@XmlElement(name = "skill_id", required = true)
		protected String skillId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(defaultValue = "1")
		protected double proficiency;

		/**
		 * skillId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSkillId() {
			return skillId;
		}

		/**
		 * skillId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSkillId(String value) {
			this.skillId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * proficiency 속성의 값을 가져옵니다.
		 * 
		 */
		public double getProficiency() {
			return proficiency;
		}

		/**
		 * proficiency 속성의 값을 설정합니다.
		 * 
		 */
		public void setProficiency(double value) {
			this.proficiency = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="skill_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="availability_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="availability_pattern_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "resourceId", "skillId",
			"availabilityId", "availabilityPatternId" })
	public static class ResourceSkillAvailability implements Serializable {

		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "skill_id", required = true)
		protected String skillId;
		@XmlElement(name = "availability_id")
		protected String availabilityId;
		@XmlElement(name = "availability_pattern_id")
		protected String availabilityPatternId;

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * skillId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSkillId() {
			return skillId;
		}

		/**
		 * skillId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSkillId(String value) {
			this.skillId = value;
		}

		/**
		 * availabilityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAvailabilityId() {
			return availabilityId;
		}

		/**
		 * availabilityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAvailabilityId(String value) {
			this.availabilityId = value;
		}

		/**
		 * availabilityPatternId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAvailabilityPatternId() {
			return availabilityPatternId;
		}

		/**
		 * availabilityPatternId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAvailabilityPatternId(String value) {
			this.availabilityPatternId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="max_travel" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="travel_to" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="travel_from" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="cost_ph" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="cost_phot" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="cost_km" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="max_call_activities_committed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="location_id_start" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_end" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="speedfactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="hire_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="release_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="relocation_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="out_of_region_multiplier" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="profile_id_travel" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "maxTravel", "travelTo",
			"travelFrom", "costPh", "costPhot", "costKm", "description",
			"maxCallActivitiesCommitted", "locationIdStart", "locationIdEnd",
			"speedfactor", "utilisation", "hireCost", "releaseCost",
			"relocationCost", "outOfRegionMultiplier", "profileIdTravel",
			"shiftCost" })
	public static class ResourceType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "max_travel")
		protected Duration maxTravel;
		@XmlElement(name = "travel_to", defaultValue = "PT0S")
		protected Duration travelTo;
		@XmlElement(name = "travel_from", defaultValue = "PT0S")
		protected Duration travelFrom;
		@XmlElement(name = "cost_ph", defaultValue = "20")
		protected double costPh;
		@XmlElement(name = "cost_phot", defaultValue = "30")
		protected double costPhot;
		@XmlElement(name = "cost_km", defaultValue = "0.25")
		protected double costKm;
		protected String description;
		@XmlElement(name = "max_call_activities_committed")
		protected Integer maxCallActivitiesCommitted;
		@XmlElement(name = "location_id_start")
		protected String locationIdStart;
		@XmlElement(name = "location_id_end")
		protected String locationIdEnd;
		@XmlElement(defaultValue = "1")
		protected Double speedfactor;
		@XmlElement(defaultValue = "100")
		protected int utilisation;
		@XmlElement(name = "hire_cost")
		protected Double hireCost;
		@XmlElement(name = "release_cost")
		protected Double releaseCost;
		@XmlElement(name = "relocation_cost")
		protected Double relocationCost;
		@XmlElement(name = "out_of_region_multiplier", defaultValue = "0")
		protected double outOfRegionMultiplier;
		@XmlElement(name = "profile_id_travel")
		protected String profileIdTravel;
		@XmlElement(name = "shift_cost")
		protected Double shiftCost;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * maxTravel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getMaxTravel() {
			return maxTravel;
		}

		/**
		 * maxTravel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setMaxTravel(Duration value) {
			this.maxTravel = value;
		}

		/**
		 * travelTo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTravelTo() {
			return travelTo;
		}

		/**
		 * travelTo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTravelTo(Duration value) {
			this.travelTo = value;
		}

		/**
		 * travelFrom 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTravelFrom() {
			return travelFrom;
		}

		/**
		 * travelFrom 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTravelFrom(Duration value) {
			this.travelFrom = value;
		}

		/**
		 * costPh 속성의 값을 가져옵니다.
		 * 
		 */
		public double getCostPh() {
			return costPh;
		}

		/**
		 * costPh 속성의 값을 설정합니다.
		 * 
		 */
		public void setCostPh(double value) {
			this.costPh = value;
		}

		/**
		 * costPhot 속성의 값을 가져옵니다.
		 * 
		 */
		public double getCostPhot() {
			return costPhot;
		}

		/**
		 * costPhot 속성의 값을 설정합니다.
		 * 
		 */
		public void setCostPhot(double value) {
			this.costPhot = value;
		}

		/**
		 * costKm 속성의 값을 가져옵니다.
		 * 
		 */
		public double getCostKm() {
			return costKm;
		}

		/**
		 * costKm 속성의 값을 설정합니다.
		 * 
		 */
		public void setCostKm(double value) {
			this.costKm = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * maxCallActivitiesCommitted 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getMaxCallActivitiesCommitted() {
			return maxCallActivitiesCommitted;
		}

		/**
		 * maxCallActivitiesCommitted 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setMaxCallActivitiesCommitted(Integer value) {
			this.maxCallActivitiesCommitted = value;
		}

		/**
		 * locationIdStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdStart() {
			return locationIdStart;
		}

		/**
		 * locationIdStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdStart(String value) {
			this.locationIdStart = value;
		}

		/**
		 * locationIdEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdEnd() {
			return locationIdEnd;
		}

		/**
		 * locationIdEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdEnd(String value) {
			this.locationIdEnd = value;
		}

		/**
		 * speedfactor 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getSpeedfactor() {
			return speedfactor;
		}

		/**
		 * speedfactor 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setSpeedfactor(Double value) {
			this.speedfactor = value;
		}

		/**
		 * utilisation 속성의 값을 가져옵니다.
		 * 
		 */
		public int getUtilisation() {
			return utilisation;
		}

		/**
		 * utilisation 속성의 값을 설정합니다.
		 * 
		 */
		public void setUtilisation(int value) {
			this.utilisation = value;
		}

		/**
		 * hireCost 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getHireCost() {
			return hireCost;
		}

		/**
		 * hireCost 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setHireCost(Double value) {
			this.hireCost = value;
		}

		/**
		 * releaseCost 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getReleaseCost() {
			return releaseCost;
		}

		/**
		 * releaseCost 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setReleaseCost(Double value) {
			this.releaseCost = value;
		}

		/**
		 * relocationCost 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getRelocationCost() {
			return relocationCost;
		}

		/**
		 * relocationCost 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setRelocationCost(Double value) {
			this.relocationCost = value;
		}

		/**
		 * outOfRegionMultiplier 속성의 값을 가져옵니다.
		 * 
		 */
		public double getOutOfRegionMultiplier() {
			return outOfRegionMultiplier;
		}

		/**
		 * outOfRegionMultiplier 속성의 값을 설정합니다.
		 * 
		 */
		public void setOutOfRegionMultiplier(double value) {
			this.outOfRegionMultiplier = value;
		}

		/**
		 * profileIdTravel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProfileIdTravel() {
			return profileIdTravel;
		}

		/**
		 * profileIdTravel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProfileIdTravel(String value) {
			this.profileIdTravel = value;
		}

		/**
		 * shiftCost 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getShiftCost() {
			return shiftCost;
		}

		/**
		 * shiftCost 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setShiftCost(Double value) {
			this.shiftCost = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="resource_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="skill_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="proficiency" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "resourceTypeId", "skillId",
			"proficiency" })
	public static class ResourceTypeSkill implements Serializable {

		@XmlElement(name = "resource_type_id", required = true)
		protected String resourceTypeId;
		@XmlElement(name = "skill_id", required = true)
		protected String skillId;
		@XmlElement(defaultValue = "1")
		protected double proficiency;

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

		/**
		 * skillId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSkillId() {
			return skillId;
		}

		/**
		 * skillId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSkillId(String value) {
			this.skillId = value;
		}

		/**
		 * proficiency 속성의 값을 가져옵니다.
		 * 
		 */
		public double getProficiency() {
			return proficiency;
		}

		/**
		 * proficiency 속성의 값을 설정합니다.
		 * 
		 */
		public void setProficiency(double value) {
			this.proficiency = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_start" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_end" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="max_travel" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="travel_to" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="travel_from" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="cost_ph" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="cost_phot" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="cost_km" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="first_name" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="surname" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="memo" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="2000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="max_call_activities_committed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="out_of_region_multiplier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="speedfactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="travel_location_geocode_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="profile_id_travel" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="travel_with_resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="contact_details" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="256"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "locationIdStart", "locationIdEnd",
			"resourceTypeId", "maxTravel", "travelTo", "travelFrom", "costPh",
			"costPhot", "costKm", "firstName", "surname", "memo",
			"maxCallActivitiesCommitted", "outOfRegionMultiplier",
			"utilisation", "speedfactor", "travelLocationGeocodeId",
			"profileIdTravel", "travelWithResourceId", "shiftCost",
			"contactDetails" })
	public static class Resources implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "location_id_start")
		protected String locationIdStart;
		@XmlElement(name = "location_id_end")
		protected String locationIdEnd;
		@XmlElement(name = "resource_type_id", required = true, defaultValue = "Default")
		protected String resourceTypeId;
		@XmlElement(name = "max_travel")
		protected Duration maxTravel;
		@XmlElement(name = "travel_to")
		protected Duration travelTo;
		@XmlElement(name = "travel_from")
		protected Duration travelFrom;
		@XmlElement(name = "cost_ph")
		protected Double costPh;
		@XmlElement(name = "cost_phot")
		protected Double costPhot;
		@XmlElement(name = "cost_km")
		protected Double costKm;
		@XmlElement(name = "first_name")
		protected String firstName;
		protected String surname;
		protected String memo;
		@XmlElement(name = "max_call_activities_committed")
		protected Integer maxCallActivitiesCommitted;
		@XmlElement(name = "out_of_region_multiplier")
		protected Double outOfRegionMultiplier;
		protected Integer utilisation;
		protected Double speedfactor;
		@XmlElement(name = "travel_location_geocode_id")
		protected String travelLocationGeocodeId;
		@XmlElement(name = "profile_id_travel")
		protected String profileIdTravel;
		@XmlElement(name = "travel_with_resource_id")
		protected String travelWithResourceId;
		@XmlElement(name = "shift_cost")
		protected Double shiftCost;
		@XmlElement(name = "contact_details")
		protected String contactDetails;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * locationIdStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdStart() {
			return locationIdStart;
		}

		/**
		 * locationIdStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdStart(String value) {
			this.locationIdStart = value;
		}

		/**
		 * locationIdEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdEnd() {
			return locationIdEnd;
		}

		/**
		 * locationIdEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdEnd(String value) {
			this.locationIdEnd = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

		/**
		 * maxTravel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getMaxTravel() {
			return maxTravel;
		}

		/**
		 * maxTravel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setMaxTravel(Duration value) {
			this.maxTravel = value;
		}

		/**
		 * travelTo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTravelTo() {
			return travelTo;
		}

		/**
		 * travelTo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTravelTo(Duration value) {
			this.travelTo = value;
		}

		/**
		 * travelFrom 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTravelFrom() {
			return travelFrom;
		}

		/**
		 * travelFrom 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTravelFrom(Duration value) {
			this.travelFrom = value;
		}

		/**
		 * costPh 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getCostPh() {
			return costPh;
		}

		/**
		 * costPh 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setCostPh(Double value) {
			this.costPh = value;
		}

		/**
		 * costPhot 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getCostPhot() {
			return costPhot;
		}

		/**
		 * costPhot 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setCostPhot(Double value) {
			this.costPhot = value;
		}

		/**
		 * costKm 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getCostKm() {
			return costKm;
		}

		/**
		 * costKm 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setCostKm(Double value) {
			this.costKm = value;
		}

		/**
		 * firstName 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * firstName 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setFirstName(String value) {
			this.firstName = value;
		}

		/**
		 * surname 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSurname() {
			return surname;
		}

		/**
		 * surname 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSurname(String value) {
			this.surname = value;
		}

		/**
		 * memo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMemo() {
			return memo;
		}

		/**
		 * memo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMemo(String value) {
			this.memo = value;
		}

		/**
		 * maxCallActivitiesCommitted 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getMaxCallActivitiesCommitted() {
			return maxCallActivitiesCommitted;
		}

		/**
		 * maxCallActivitiesCommitted 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setMaxCallActivitiesCommitted(Integer value) {
			this.maxCallActivitiesCommitted = value;
		}

		/**
		 * outOfRegionMultiplier 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getOutOfRegionMultiplier() {
			return outOfRegionMultiplier;
		}

		/**
		 * outOfRegionMultiplier 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setOutOfRegionMultiplier(Double value) {
			this.outOfRegionMultiplier = value;
		}

		/**
		 * utilisation 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getUtilisation() {
			return utilisation;
		}

		/**
		 * utilisation 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setUtilisation(Integer value) {
			this.utilisation = value;
		}

		/**
		 * speedfactor 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getSpeedfactor() {
			return speedfactor;
		}

		/**
		 * speedfactor 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setSpeedfactor(Double value) {
			this.speedfactor = value;
		}

		/**
		 * travelLocationGeocodeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTravelLocationGeocodeId() {
			return travelLocationGeocodeId;
		}

		/**
		 * travelLocationGeocodeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTravelLocationGeocodeId(String value) {
			this.travelLocationGeocodeId = value;
		}

		/**
		 * profileIdTravel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProfileIdTravel() {
			return profileIdTravel;
		}

		/**
		 * profileIdTravel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProfileIdTravel(String value) {
			this.profileIdTravel = value;
		}

		/**
		 * travelWithResourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTravelWithResourceId() {
			return travelWithResourceId;
		}

		/**
		 * travelWithResourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTravelWithResourceId(String value) {
			this.travelWithResourceId = value;
		}

		/**
		 * shiftCost 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getShiftCost() {
			return shiftCost;
		}

		/**
		 * shiftCost 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setShiftCost(Double value) {
			this.shiftCost = value;
		}

		/**
		 * contactDetails 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getContactDetails() {
			return contactDetails;
		}

		/**
		 * contactDetails 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setContactDetails(String value) {
			this.contactDetails = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="data_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="default_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "applicationTypeId", "id", "description",
			"dataType", "defaultValue" })
	public static class Rule implements Serializable {

		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(name = "data_type", required = true)
		protected String dataType;
		@XmlElement(name = "default_value", required = true)
		protected String defaultValue;

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * dataType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDataType() {
			return dataType;
		}

		/**
		 * dataType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDataType(String value) {
			this.dataType = value;
		}

		/**
		 * defaultValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDefaultValue() {
			return defaultValue;
		}

		/**
		 * defaultValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDefaultValue(String value) {
			this.defaultValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="default_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "applicationTypeId", "ruleId",
			"defaultValue" })
	public static class RuleDataset implements Serializable {

		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		@XmlElement(name = "rule_id", required = true)
		protected String ruleId;
		@XmlElement(name = "default_value", required = true)
		protected String defaultValue;

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * ruleId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleId() {
			return ruleId;
		}

		/**
		 * ruleId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleId(String value) {
			this.ruleId = value;
		}

		/**
		 * defaultValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDefaultValue() {
			return defaultValue;
		}

		/**
		 * defaultValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDefaultValue(String value) {
			this.defaultValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_override_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="override_threshold" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="override_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "applicationTypeId",
			"ruleOverrideTypeId", "ruleId", "overrideThreshold",
			"overrideValue" })
	public static class RuleDatasetOverride implements Serializable {

		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		@XmlElement(name = "rule_override_type_id", required = true)
		protected String ruleOverrideTypeId;
		@XmlElement(name = "rule_id", required = true)
		protected String ruleId;
		@XmlElement(name = "override_threshold")
		protected String overrideThreshold;
		@XmlElement(name = "override_value", required = true)
		protected String overrideValue;

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * ruleOverrideTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleOverrideTypeId() {
			return ruleOverrideTypeId;
		}

		/**
		 * ruleOverrideTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleOverrideTypeId(String value) {
			this.ruleOverrideTypeId = value;
		}

		/**
		 * ruleId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleId() {
			return ruleId;
		}

		/**
		 * ruleId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleId(String value) {
			this.ruleId = value;
		}

		/**
		 * overrideThreshold 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOverrideThreshold() {
			return overrideThreshold;
		}

		/**
		 * overrideThreshold 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOverrideThreshold(String value) {
			this.overrideThreshold = value;
		}

		/**
		 * overrideValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOverrideValue() {
			return overrideValue;
		}

		/**
		 * overrideValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOverrideValue(String value) {
			this.overrideValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_override_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="override_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "applicationTypeId",
			"ruleOverrideTypeId", "ruleId", "locationId", "locationTypeId",
			"overrideValue" })
	public static class RuleLocationOverride implements Serializable {

		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		@XmlElement(name = "rule_override_type_id", required = true)
		protected String ruleOverrideTypeId;
		@XmlElement(name = "rule_id", required = true)
		protected String ruleId;
		@XmlElement(name = "location_id")
		protected String locationId;
		@XmlElement(name = "location_type_id")
		protected String locationTypeId;
		@XmlElement(name = "override_value", required = true)
		protected String overrideValue;

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * ruleOverrideTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleOverrideTypeId() {
			return ruleOverrideTypeId;
		}

		/**
		 * ruleOverrideTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleOverrideTypeId(String value) {
			this.ruleOverrideTypeId = value;
		}

		/**
		 * ruleId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleId() {
			return ruleId;
		}

		/**
		 * ruleId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleId(String value) {
			this.ruleId = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

		/**
		 * locationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationTypeId() {
			return locationTypeId;
		}

		/**
		 * locationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationTypeId(String value) {
			this.locationTypeId = value;
		}

		/**
		 * overrideValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOverrideValue() {
			return overrideValue;
		}

		/**
		 * overrideValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOverrideValue(String value) {
			this.overrideValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_override_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="override_threshold" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="override_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "applicationTypeId",
			"ruleOverrideTypeId", "ruleId", "overrideThreshold",
			"overrideValue" })
	public static class RuleOverride implements Serializable {

		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		@XmlElement(name = "rule_override_type_id", required = true)
		protected String ruleOverrideTypeId;
		@XmlElement(name = "rule_id", required = true)
		protected String ruleId;
		@XmlElement(name = "override_threshold")
		protected String overrideThreshold;
		@XmlElement(name = "override_value", required = true)
		protected String overrideValue;

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * ruleOverrideTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleOverrideTypeId() {
			return ruleOverrideTypeId;
		}

		/**
		 * ruleOverrideTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleOverrideTypeId(String value) {
			this.ruleOverrideTypeId = value;
		}

		/**
		 * ruleId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleId() {
			return ruleId;
		}

		/**
		 * ruleId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleId(String value) {
			this.ruleId = value;
		}

		/**
		 * overrideThreshold 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOverrideThreshold() {
			return overrideThreshold;
		}

		/**
		 * overrideThreshold 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOverrideThreshold(String value) {
			this.overrideThreshold = value;
		}

		/**
		 * overrideValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOverrideValue() {
			return overrideValue;
		}

		/**
		 * overrideValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOverrideValue(String value) {
			this.overrideValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="data_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "applicationTypeId", "id", "description",
			"dataType" })
	public static class RuleOverrideType implements Serializable {

		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(name = "data_type", required = true)
		protected String dataType;

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * dataType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDataType() {
			return dataType;
		}

		/**
		 * dataType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDataType(String value) {
			this.dataType = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "applicationTypeId", "ruleId",
			"resourceId", "resourceTypeId", "ruleValue" })
	public static class RuleResource implements Serializable {

		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		@XmlElement(name = "rule_id", required = true)
		protected String ruleId;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "resource_type_id")
		protected String resourceTypeId;
		@XmlElement(name = "rule_value", required = true)
		protected String ruleValue;

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * ruleId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleId() {
			return ruleId;
		}

		/**
		 * ruleId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleId(String value) {
			this.ruleId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

		/**
		 * ruleValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleValue() {
			return ruleValue;
		}

		/**
		 * ruleValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleValue(String value) {
			this.ruleValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="application_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_override_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="rule_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="override_threshold" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="override_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "applicationTypeId",
			"ruleOverrideTypeId", "ruleId", "resourceId", "resourceTypeId",
			"overrideThreshold", "overrideValue" })
	public static class RuleResourceOverride implements Serializable {

		@XmlElement(name = "application_type_id", required = true)
		protected String applicationTypeId;
		@XmlElement(name = "rule_override_type_id", required = true)
		protected String ruleOverrideTypeId;
		@XmlElement(name = "rule_id", required = true)
		protected String ruleId;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "resource_type_id")
		protected String resourceTypeId;
		@XmlElement(name = "override_threshold")
		protected String overrideThreshold;
		@XmlElement(name = "override_value", required = true)
		protected String overrideValue;

		/**
		 * applicationTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getApplicationTypeId() {
			return applicationTypeId;
		}

		/**
		 * applicationTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setApplicationTypeId(String value) {
			this.applicationTypeId = value;
		}

		/**
		 * ruleOverrideTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleOverrideTypeId() {
			return ruleOverrideTypeId;
		}

		/**
		 * ruleOverrideTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleOverrideTypeId(String value) {
			this.ruleOverrideTypeId = value;
		}

		/**
		 * ruleId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRuleId() {
			return ruleId;
		}

		/**
		 * ruleId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRuleId(String value) {
			this.ruleId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

		/**
		 * overrideThreshold 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOverrideThreshold() {
			return overrideThreshold;
		}

		/**
		 * overrideThreshold 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOverrideThreshold(String value) {
			this.overrideThreshold = value;
		}

		/**
		 * overrideValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOverrideValue() {
			return overrideValue;
		}

		/**
		 * overrideValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOverrideValue(String value) {
			this.overrideValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="penalty" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="early_sla_benefit" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="mechanism_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="20"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="base_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="end_proportion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="curve_shape" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="activity_ageing_factor" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="curve_scaling_option" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="20"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="start_proportion" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="generate_jeopardy_exceptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "revenue",
			"penalty", "cost", "earlySlaBenefit", "mechanismType", "baseValue",
			"endProportion", "curveShape", "activityAgeingFactor",
			"curveScalingOption", "startProportion",
			"generateJeopardyExceptions" })
	public static class SLAType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(defaultValue = "1000")
		protected double revenue;
		@XmlElement(defaultValue = "1000")
		protected double penalty;
		@XmlElement(defaultValue = "0")
		protected double cost;
		@XmlElement(name = "early_sla_benefit", defaultValue = "0")
		protected double earlySlaBenefit;
		@XmlElement(name = "mechanism_type", required = true, defaultValue = "SLA")
		protected String mechanismType;
		@XmlElement(name = "base_value")
		protected Double baseValue;
		@XmlElement(name = "end_proportion")
		protected Double endProportion;
		@XmlElement(name = "curve_shape", defaultValue = "1")
		protected double curveShape;
		@XmlElement(name = "activity_ageing_factor", defaultValue = "1")
		protected double activityAgeingFactor;
		@XmlElement(name = "curve_scaling_option", defaultValue = "SCALE")
		protected String curveScalingOption;
		@XmlElement(name = "start_proportion", defaultValue = "1")
		protected double startProportion;
		@XmlElement(name = "generate_jeopardy_exceptions", defaultValue = "true")
		protected boolean generateJeopardyExceptions;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * revenue 속성의 값을 가져옵니다.
		 * 
		 */
		public double getRevenue() {
			return revenue;
		}

		/**
		 * revenue 속성의 값을 설정합니다.
		 * 
		 */
		public void setRevenue(double value) {
			this.revenue = value;
		}

		/**
		 * penalty 속성의 값을 가져옵니다.
		 * 
		 */
		public double getPenalty() {
			return penalty;
		}

		/**
		 * penalty 속성의 값을 설정합니다.
		 * 
		 */
		public void setPenalty(double value) {
			this.penalty = value;
		}

		/**
		 * cost 속성의 값을 가져옵니다.
		 * 
		 */
		public double getCost() {
			return cost;
		}

		/**
		 * cost 속성의 값을 설정합니다.
		 * 
		 */
		public void setCost(double value) {
			this.cost = value;
		}

		/**
		 * earlySlaBenefit 속성의 값을 가져옵니다.
		 * 
		 */
		public double getEarlySlaBenefit() {
			return earlySlaBenefit;
		}

		/**
		 * earlySlaBenefit 속성의 값을 설정합니다.
		 * 
		 */
		public void setEarlySlaBenefit(double value) {
			this.earlySlaBenefit = value;
		}

		/**
		 * mechanismType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMechanismType() {
			return mechanismType;
		}

		/**
		 * mechanismType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMechanismType(String value) {
			this.mechanismType = value;
		}

		/**
		 * baseValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getBaseValue() {
			return baseValue;
		}

		/**
		 * baseValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setBaseValue(Double value) {
			this.baseValue = value;
		}

		/**
		 * endProportion 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getEndProportion() {
			return endProportion;
		}

		/**
		 * endProportion 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setEndProportion(Double value) {
			this.endProportion = value;
		}

		/**
		 * curveShape 속성의 값을 가져옵니다.
		 * 
		 */
		public double getCurveShape() {
			return curveShape;
		}

		/**
		 * curveShape 속성의 값을 설정합니다.
		 * 
		 */
		public void setCurveShape(double value) {
			this.curveShape = value;
		}

		/**
		 * activityAgeingFactor 속성의 값을 가져옵니다.
		 * 
		 */
		public double getActivityAgeingFactor() {
			return activityAgeingFactor;
		}

		/**
		 * activityAgeingFactor 속성의 값을 설정합니다.
		 * 
		 */
		public void setActivityAgeingFactor(double value) {
			this.activityAgeingFactor = value;
		}

		/**
		 * curveScalingOption 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCurveScalingOption() {
			return curveScalingOption;
		}

		/**
		 * curveScalingOption 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCurveScalingOption(String value) {
			this.curveScalingOption = value;
		}

		/**
		 * startProportion 속성의 값을 가져옵니다.
		 * 
		 */
		public double getStartProportion() {
			return startProportion;
		}

		/**
		 * startProportion 속성의 값을 설정합니다.
		 * 
		 */
		public void setStartProportion(double value) {
			this.startProportion = value;
		}

		/**
		 * generateJeopardyExceptions 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isGenerateJeopardyExceptions() {
			return generateJeopardyExceptions;
		}

		/**
		 * generateJeopardyExceptions 속성의 값을 설정합니다.
		 * 
		 */
		public void setGenerateJeopardyExceptions(boolean value) {
			this.generateJeopardyExceptions = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="event_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="date_time_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="event_date_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="location_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "eventTypeId", "resourceId",
			"dateTimeStamp", "eventDateTime", "latitude", "longitude",
			"locationId" })
	public static class ScheduleEvent implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "event_type_id", required = true)
		protected String eventTypeId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "date_time_stamp", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar dateTimeStamp;
		@XmlElement(name = "event_date_time", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar eventDateTime;
		protected Double latitude;
		protected Double longitude;
		@XmlElement(name = "location_id")
		protected String locationId;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * eventTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEventTypeId() {
			return eventTypeId;
		}

		/**
		 * eventTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEventTypeId(String value) {
			this.eventTypeId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * dateTimeStamp 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDateTimeStamp() {
			return dateTimeStamp;
		}

		/**
		 * dateTimeStamp 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDateTimeStamp(XMLGregorianCalendar value) {
			this.dateTimeStamp = value;
		}

		/**
		 * eventDateTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getEventDateTime() {
			return eventDateTime;
		}

		/**
		 * eventDateTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setEventDateTime(XMLGregorianCalendar value) {
			this.eventDateTime = value;
		}

		/**
		 * latitude 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLatitude() {
			return latitude;
		}

		/**
		 * latitude 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLatitude(Double value) {
			this.latitude = value;
		}

		/**
		 * longitude 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLongitude() {
			return longitude;
		}

		/**
		 * longitude 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLongitude(Double value) {
			this.longitude = value;
		}

		/**
		 * locationId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationId() {
			return locationId;
		}

		/**
		 * locationId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationId(String value) {
			this.locationId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="schedule_exception_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="datetime_generated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "scheduleExceptionTypeId", "planId",
			"resourceId", "activityId", "age", "datetimeGenerated" })
	public static class ScheduleException implements Serializable {

		@XmlElement(name = "schedule_exception_type_id")
		protected int scheduleExceptionTypeId;
		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "resource_id", required = true, defaultValue = "")
		protected String resourceId;
		@XmlElement(name = "activity_id", required = true, defaultValue = "")
		protected String activityId;
		protected Duration age;
		@XmlElement(name = "datetime_generated", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar datetimeGenerated;

		/**
		 * scheduleExceptionTypeId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getScheduleExceptionTypeId() {
			return scheduleExceptionTypeId;
		}

		/**
		 * scheduleExceptionTypeId 속성의 값을 설정합니다.
		 * 
		 */
		public void setScheduleExceptionTypeId(int value) {
			this.scheduleExceptionTypeId = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * age 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getAge() {
			return age;
		}

		/**
		 * age 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setAge(Duration value) {
			this.age = value;
		}

		/**
		 * datetimeGenerated 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDatetimeGenerated() {
			return datetimeGenerated;
		}

		/**
		 * datetimeGenerated 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDatetimeGenerated(XMLGregorianCalendar value) {
			this.datetimeGenerated = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="schedule_exception_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="label">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="label_message_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="256"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="reason_type_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "scheduleExceptionTypeId", "planId",
			"resourceId", "activityId", "label", "labelMessageId", "sequence",
			"value", "reasonTypeId" })
	public static class ScheduleExceptionData implements Serializable {

		@XmlElement(name = "schedule_exception_type_id")
		protected int scheduleExceptionTypeId;
		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "resource_id", required = true, defaultValue = "")
		protected String resourceId;
		@XmlElement(name = "activity_id", required = true, defaultValue = "")
		protected String activityId;
		@XmlElement(required = true)
		protected String label;
		@XmlElement(name = "label_message_id")
		protected Integer labelMessageId;
		@XmlElement(defaultValue = "1")
		protected int sequence;
		@XmlElement(required = true)
		protected String value;
		@XmlElement(name = "reason_type_id")
		protected Integer reasonTypeId;

		/**
		 * scheduleExceptionTypeId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getScheduleExceptionTypeId() {
			return scheduleExceptionTypeId;
		}

		/**
		 * scheduleExceptionTypeId 속성의 값을 설정합니다.
		 * 
		 */
		public void setScheduleExceptionTypeId(int value) {
			this.scheduleExceptionTypeId = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * label 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLabel() {
			return label;
		}

		/**
		 * label 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLabel(String value) {
			this.label = value;
		}

		/**
		 * labelMessageId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getLabelMessageId() {
			return labelMessageId;
		}

		/**
		 * labelMessageId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setLabelMessageId(Integer value) {
			this.labelMessageId = value;
		}

		/**
		 * sequence 속성의 값을 가져옵니다.
		 * 
		 */
		public int getSequence() {
			return sequence;
		}

		/**
		 * sequence 속성의 값을 설정합니다.
		 * 
		 */
		public void setSequence(int value) {
			this.sequence = value;
		}

		/**
		 * value 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getValue() {
			return value;
		}

		/**
		 * value 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setValue(String value) {
			this.value = value;
		}

		/**
		 * reasonTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getReasonTypeId() {
			return reasonTypeId;
		}

		/**
		 * reasonTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setReasonTypeId(Integer value) {
			this.reasonTypeId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="schedule_exception_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="resource_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="acknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *         &lt;element name="acknowledgement_comment" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="2000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="acknowledgement_user_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="acknowledgement_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "scheduleExceptionTypeId",
			"resourceId", "activityId", "acknowledged",
			"acknowledgementComment", "acknowledgementUserId",
			"acknowledgementDatetime" })
	public static class ScheduleExceptionResponse implements Serializable {

		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "schedule_exception_type_id")
		protected int scheduleExceptionTypeId;
		@XmlElement(name = "resource_id", required = true)
		protected String resourceId;
		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		protected Boolean acknowledged;
		@XmlElement(name = "acknowledgement_comment")
		protected String acknowledgementComment;
		@XmlElement(name = "acknowledgement_user_id")
		protected String acknowledgementUserId;
		@XmlElement(name = "acknowledgement_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar acknowledgementDatetime;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * scheduleExceptionTypeId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getScheduleExceptionTypeId() {
			return scheduleExceptionTypeId;
		}

		/**
		 * scheduleExceptionTypeId 속성의 값을 설정합니다.
		 * 
		 */
		public void setScheduleExceptionTypeId(int value) {
			this.scheduleExceptionTypeId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * acknowledged 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isAcknowledged() {
			return acknowledged;
		}

		/**
		 * acknowledged 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setAcknowledged(Boolean value) {
			this.acknowledged = value;
		}

		/**
		 * acknowledgementComment 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAcknowledgementComment() {
			return acknowledgementComment;
		}

		/**
		 * acknowledgementComment 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAcknowledgementComment(String value) {
			this.acknowledgementComment = value;
		}

		/**
		 * acknowledgementUserId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAcknowledgementUserId() {
			return acknowledgementUserId;
		}

		/**
		 * acknowledgementUserId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAcknowledgementUserId(String value) {
			this.acknowledgementUserId = value;
		}

		/**
		 * acknowledgementDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getAcknowledgementDatetime() {
			return acknowledgementDatetime;
		}

		/**
		 * acknowledgementDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setAcknowledgementDatetime(XMLGregorianCalendar value) {
			this.acknowledgementDatetime = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="dataset_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="input_reference_internal_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "organisationId", "datasetId",
			"inputReferenceInternalId", "planId", "datum" })
	public static class SecuredData implements Serializable {

		protected int id;
		@XmlElement(name = "organisation_id")
		protected int organisationId;
		@XmlElement(name = "dataset_id", required = true)
		protected String datasetId;
		@XmlElement(name = "input_reference_internal_id")
		protected Integer inputReferenceInternalId;
		@XmlElement(name = "plan_id")
		protected Integer planId;
		protected byte[] datum;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 */
		public int getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 */
		public void setId(int value) {
			this.id = value;
		}

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

		/**
		 * datasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDatasetId() {
			return datasetId;
		}

		/**
		 * datasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDatasetId(String value) {
			this.datasetId = value;
		}

		/**
		 * inputReferenceInternalId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getInputReferenceInternalId() {
			return inputReferenceInternalId;
		}

		/**
		 * inputReferenceInternalId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setInputReferenceInternalId(Integer value) {
			this.inputReferenceInternalId = value;
		}

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setPlanId(Integer value) {
			this.planId = value;
		}

		/**
		 * datum 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is byte[]
		 */
		public byte[] getDatum() {
			return datum;
		}

		/**
		 * datum 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is byte[]
		 */
		public void setDatum(byte[] value) {
			this.datum = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_start" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_end" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="overtime_period" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="resource_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="snap_time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="shift_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="utilisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="split_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="max_no_activities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="profile_id_travel" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="travel_with_resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="shift_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="max_travel" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="travel_from" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="travel_to" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="cost_ph" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="cost_phot" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="cost_km" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="early_end_leeway" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="late_end_leeway" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "locationIdStart", "locationIdEnd",
			"resourceId", "startDatetime", "endDatetime", "overtimePeriod",
			"resourceTypeId", "snapTime", "shiftTypeId", "actual",
			"utilisation", "splitAllowed", "maxNoActivities",
			"profileIdTravel", "travelWithResourceId", "shiftCost",
			"maxTravel", "travelFrom", "travelTo", "costPh", "costPhot",
			"costKm", "earlyEndLeeway", "lateEndLeeway" })
	public static class Shift implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "location_id_start")
		protected String locationIdStart;
		@XmlElement(name = "location_id_end")
		protected String locationIdEnd;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "start_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar startDatetime;
		@XmlElement(name = "end_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar endDatetime;
		@XmlElement(name = "overtime_period")
		protected Duration overtimePeriod;
		@XmlElement(name = "resource_type_id")
		protected String resourceTypeId;
		@XmlElement(name = "snap_time")
		protected Duration snapTime;
		@XmlElement(name = "shift_type_id")
		protected String shiftTypeId;
		@XmlElement(defaultValue = "true")
		protected boolean actual;
		protected Integer utilisation;
		@XmlElement(name = "split_allowed", defaultValue = "true")
		protected boolean splitAllowed;
		@XmlElement(name = "max_no_activities")
		protected Integer maxNoActivities;
		@XmlElement(name = "profile_id_travel")
		protected String profileIdTravel;
		@XmlElement(name = "travel_with_resource_id")
		protected String travelWithResourceId;
		@XmlElement(name = "shift_cost")
		protected Double shiftCost;
		@XmlElement(name = "max_travel")
		protected Duration maxTravel;
		@XmlElement(name = "travel_from")
		protected Duration travelFrom;
		@XmlElement(name = "travel_to")
		protected Duration travelTo;
		@XmlElement(name = "cost_ph")
		protected Double costPh;
		@XmlElement(name = "cost_phot")
		protected Double costPhot;
		@XmlElement(name = "cost_km")
		protected Double costKm;
		@XmlElement(name = "early_end_leeway")
		protected Duration earlyEndLeeway;
		@XmlElement(name = "late_end_leeway")
		protected Duration lateEndLeeway;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * locationIdStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdStart() {
			return locationIdStart;
		}

		/**
		 * locationIdStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdStart(String value) {
			this.locationIdStart = value;
		}

		/**
		 * locationIdEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdEnd() {
			return locationIdEnd;
		}

		/**
		 * locationIdEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdEnd(String value) {
			this.locationIdEnd = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * startDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getStartDatetime() {
			return startDatetime;
		}

		/**
		 * startDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setStartDatetime(XMLGregorianCalendar value) {
			this.startDatetime = value;
		}

		/**
		 * endDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getEndDatetime() {
			return endDatetime;
		}

		/**
		 * endDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setEndDatetime(XMLGregorianCalendar value) {
			this.endDatetime = value;
		}

		/**
		 * overtimePeriod 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getOvertimePeriod() {
			return overtimePeriod;
		}

		/**
		 * overtimePeriod 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setOvertimePeriod(Duration value) {
			this.overtimePeriod = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

		/**
		 * snapTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getSnapTime() {
			return snapTime;
		}

		/**
		 * snapTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setSnapTime(Duration value) {
			this.snapTime = value;
		}

		/**
		 * shiftTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getShiftTypeId() {
			return shiftTypeId;
		}

		/**
		 * shiftTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setShiftTypeId(String value) {
			this.shiftTypeId = value;
		}

		/**
		 * actual 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isActual() {
			return actual;
		}

		/**
		 * actual 속성의 값을 설정합니다.
		 * 
		 */
		public void setActual(boolean value) {
			this.actual = value;
		}

		/**
		 * utilisation 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getUtilisation() {
			return utilisation;
		}

		/**
		 * utilisation 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setUtilisation(Integer value) {
			this.utilisation = value;
		}

		/**
		 * splitAllowed 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isSplitAllowed() {
			return splitAllowed;
		}

		/**
		 * splitAllowed 속성의 값을 설정합니다.
		 * 
		 */
		public void setSplitAllowed(boolean value) {
			this.splitAllowed = value;
		}

		/**
		 * maxNoActivities 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getMaxNoActivities() {
			return maxNoActivities;
		}

		/**
		 * maxNoActivities 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setMaxNoActivities(Integer value) {
			this.maxNoActivities = value;
		}

		/**
		 * profileIdTravel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProfileIdTravel() {
			return profileIdTravel;
		}

		/**
		 * profileIdTravel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProfileIdTravel(String value) {
			this.profileIdTravel = value;
		}

		/**
		 * travelWithResourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTravelWithResourceId() {
			return travelWithResourceId;
		}

		/**
		 * travelWithResourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTravelWithResourceId(String value) {
			this.travelWithResourceId = value;
		}

		/**
		 * shiftCost 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getShiftCost() {
			return shiftCost;
		}

		/**
		 * shiftCost 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setShiftCost(Double value) {
			this.shiftCost = value;
		}

		/**
		 * maxTravel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getMaxTravel() {
			return maxTravel;
		}

		/**
		 * maxTravel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setMaxTravel(Duration value) {
			this.maxTravel = value;
		}

		/**
		 * travelFrom 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTravelFrom() {
			return travelFrom;
		}

		/**
		 * travelFrom 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTravelFrom(Duration value) {
			this.travelFrom = value;
		}

		/**
		 * travelTo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTravelTo() {
			return travelTo;
		}

		/**
		 * travelTo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTravelTo(Duration value) {
			this.travelTo = value;
		}

		/**
		 * costPh 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getCostPh() {
			return costPh;
		}

		/**
		 * costPh 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setCostPh(Double value) {
			this.costPh = value;
		}

		/**
		 * costPhot 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getCostPhot() {
			return costPhot;
		}

		/**
		 * costPhot 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setCostPhot(Double value) {
			this.costPhot = value;
		}

		/**
		 * costKm 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getCostKm() {
			return costKm;
		}

		/**
		 * costKm 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setCostKm(Double value) {
			this.costKm = value;
		}

		/**
		 * earlyEndLeeway 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getEarlyEndLeeway() {
			return earlyEndLeeway;
		}

		/**
		 * earlyEndLeeway 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setEarlyEndLeeway(Duration value) {
			this.earlyEndLeeway = value;
		}

		/**
		 * lateEndLeeway 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getLateEndLeeway() {
			return lateEndLeeway;
		}

		/**
		 * lateEndLeeway 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setLateEndLeeway(Duration value) {
			this.lateEndLeeway = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="period_start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="period_end_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="day_pattern">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="7"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="start_time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="shift_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="split_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
	 *         &lt;element name="time_zone" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="travel_with_resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "periodStartDatetime",
			"periodEndDatetime", "dayPattern", "startTime", "shiftTypeId",
			"resourceId", "resourceTypeId", "splitAllowed", "timeZone",
			"travelWithResourceId" })
	public static class ShiftPattern implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "period_start_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar periodStartDatetime;
		@XmlElement(name = "period_end_datetime", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar periodEndDatetime;
		@XmlElement(name = "day_pattern", required = true, defaultValue = "YYYYYNN")
		protected String dayPattern;
		@XmlElement(name = "start_time", required = true, defaultValue = "PT8H")
		protected Duration startTime;
		@XmlElement(name = "shift_type_id", required = true)
		protected String shiftTypeId;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "resource_type_id")
		protected String resourceTypeId;
		@XmlElement(name = "split_allowed", defaultValue = "true")
		protected Boolean splitAllowed;
		@XmlElement(name = "time_zone")
		protected String timeZone;
		@XmlElement(name = "travel_with_resource_id")
		protected String travelWithResourceId;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * periodStartDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getPeriodStartDatetime() {
			return periodStartDatetime;
		}

		/**
		 * periodStartDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setPeriodStartDatetime(XMLGregorianCalendar value) {
			this.periodStartDatetime = value;
		}

		/**
		 * periodEndDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getPeriodEndDatetime() {
			return periodEndDatetime;
		}

		/**
		 * periodEndDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setPeriodEndDatetime(XMLGregorianCalendar value) {
			this.periodEndDatetime = value;
		}

		/**
		 * dayPattern 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDayPattern() {
			return dayPattern;
		}

		/**
		 * dayPattern 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDayPattern(String value) {
			this.dayPattern = value;
		}

		/**
		 * startTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getStartTime() {
			return startTime;
		}

		/**
		 * startTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setStartTime(Duration value) {
			this.startTime = value;
		}

		/**
		 * shiftTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getShiftTypeId() {
			return shiftTypeId;
		}

		/**
		 * shiftTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setShiftTypeId(String value) {
			this.shiftTypeId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

		/**
		 * splitAllowed 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isSplitAllowed() {
			return splitAllowed;
		}

		/**
		 * splitAllowed 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setSplitAllowed(Boolean value) {
			this.splitAllowed = value;
		}

		/**
		 * timeZone 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTimeZone() {
			return timeZone;
		}

		/**
		 * timeZone 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTimeZone(String value) {
			this.timeZone = value;
		}

		/**
		 * travelWithResourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTravelWithResourceId() {
			return travelWithResourceId;
		}

		/**
		 * travelWithResourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTravelWithResourceId(String value) {
			this.travelWithResourceId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="snap_time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="overtime_period" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *         &lt;element name="early_end_leeway" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *         &lt;element name="late_end_leeway" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "duration",
			"snapTime", "overtimePeriod", "earlyEndLeeway", "lateEndLeeway" })
	public static class ShiftType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;
		@XmlElement(required = true, defaultValue = "PT8H")
		protected Duration duration;
		@XmlElement(name = "snap_time", required = true, defaultValue = "PT3H")
		protected Duration snapTime;
		@XmlElement(name = "overtime_period", required = true, defaultValue = "PT0S")
		protected Duration overtimePeriod;
		@XmlElement(name = "early_end_leeway")
		protected Duration earlyEndLeeway;
		@XmlElement(name = "late_end_leeway")
		protected Duration lateEndLeeway;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * duration 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getDuration() {
			return duration;
		}

		/**
		 * duration 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setDuration(Duration value) {
			this.duration = value;
		}

		/**
		 * snapTime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getSnapTime() {
			return snapTime;
		}

		/**
		 * snapTime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setSnapTime(Duration value) {
			this.snapTime = value;
		}

		/**
		 * overtimePeriod 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getOvertimePeriod() {
			return overtimePeriod;
		}

		/**
		 * overtimePeriod 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setOvertimePeriod(Duration value) {
			this.overtimePeriod = value;
		}

		/**
		 * earlyEndLeeway 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getEarlyEndLeeway() {
			return earlyEndLeeway;
		}

		/**
		 * earlyEndLeeway 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setEarlyEndLeeway(Duration value) {
			this.earlyEndLeeway = value;
		}

		/**
		 * lateEndLeeway 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getLateEndLeeway() {
			return lateEndLeeway;
		}

		/**
		 * lateEndLeeway 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setLateEndLeeway(Duration value) {
			this.lateEndLeeway = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description" })
	public static class Skill implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected String description;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="skill_id_parent">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="skill_id_child">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "skillIdParent", "skillIdChild" })
	public static class SkillHierarchy implements Serializable {

		@XmlElement(name = "skill_id_parent", required = true)
		protected String skillIdParent;
		@XmlElement(name = "skill_id_child", required = true)
		protected String skillIdChild;

		/**
		 * skillIdParent 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSkillIdParent() {
			return skillIdParent;
		}

		/**
		 * skillIdParent 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSkillIdParent(String value) {
			this.skillIdParent = value;
		}

		/**
		 * skillIdChild 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSkillIdChild() {
			return skillIdChild;
		}

		/**
		 * skillIdChild 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSkillIdChild(String value) {
			this.skillIdChild = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="source_data_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="source_dataset_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="source_db" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "sourceDataTypeId", "sourceDatasetId",
			"sourceDb" })
	public static class SourceData implements Serializable {

		@XmlElement(name = "source_data_type_id", required = true)
		protected String sourceDataTypeId;
		@XmlElement(name = "source_dataset_id")
		protected String sourceDatasetId;
		@XmlElement(name = "source_db")
		protected String sourceDb;

		/**
		 * sourceDataTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSourceDataTypeId() {
			return sourceDataTypeId;
		}

		/**
		 * sourceDataTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSourceDataTypeId(String value) {
			this.sourceDataTypeId = value;
		}

		/**
		 * sourceDatasetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSourceDatasetId() {
			return sourceDatasetId;
		}

		/**
		 * sourceDatasetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSourceDatasetId(String value) {
			this.sourceDatasetId = value;
		}

		/**
		 * sourceDb 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSourceDb() {
			return sourceDb;
		}

		/**
		 * sourceDb 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSourceDb(String value) {
			this.sourceDb = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="source_data_type_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="parameter_name">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="parameter_value" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="1000"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "sourceDataTypeId", "parameterName",
			"parameterValue" })
	public static class SourceDataParameter implements Serializable {

		@XmlElement(name = "source_data_type_id", required = true)
		protected String sourceDataTypeId;
		@XmlElement(name = "parameter_name", required = true)
		protected String parameterName;
		@XmlElement(name = "parameter_value")
		protected String parameterValue;

		/**
		 * sourceDataTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSourceDataTypeId() {
			return sourceDataTypeId;
		}

		/**
		 * sourceDataTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSourceDataTypeId(String value) {
			this.sourceDataTypeId = value;
		}

		/**
		 * parameterName 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getParameterName() {
			return parameterName;
		}

		/**
		 * parameterName 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setParameterName(String value) {
			this.parameterName = value;
		}

		/**
		 * parameterValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getParameterValue() {
			return parameterValue;
		}

		/**
		 * parameterValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setParameterValue(String value) {
			this.parameterValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description" })
	public static class SourceDataType implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(required = true)
		protected String description;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="description">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="100"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="display_type" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="200"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="message_text_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "displayType",
			"messageTextId" })
	public static class StatusType implements Serializable {

		protected int id;
		@XmlElement(required = true)
		protected String description;
		@XmlElement(name = "display_type")
		protected String displayType;
		@XmlElement(name = "message_text_id")
		protected Integer messageTextId;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 */
		public int getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 */
		public void setId(int value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * displayType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDisplayType() {
			return displayType;
		}

		/**
		 * displayType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDisplayType(String value) {
			this.displayType = value;
		}

		/**
		 * messageTextId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getMessageTextId() {
			return messageTextId;
		}

		/**
		 * messageTextId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setMessageTextId(Integer value) {
			this.messageTextId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="status_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="date_time_status" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="fixed_resource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="date_time_fixed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="commit_sort_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "activityId", "resourceId",
			"statusId", "dateTimeStatus", "fixedResource", "dateTimeFixed",
			"commitSortValue", "source", "expectedStartDatetime",
			"expectedEndDatetime" })
	public static class SuggestedDispatch implements Serializable {

		@XmlElement(name = "plan_id")
		protected int planId;
		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "resource_id")
		protected String resourceId;
		@XmlElement(name = "status_id")
		protected int statusId;
		@XmlElement(name = "date_time_status", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar dateTimeStatus;
		@XmlElement(name = "fixed_resource", defaultValue = "false")
		protected boolean fixedResource;
		@XmlElement(name = "date_time_fixed")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar dateTimeFixed;
		@XmlElement(name = "commit_sort_value")
		protected Double commitSortValue;
		protected Integer source;
		@XmlElement(name = "expected_start_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar expectedStartDatetime;
		@XmlElement(name = "expected_end_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar expectedEndDatetime;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 */
		public void setPlanId(int value) {
			this.planId = value;
		}

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * resourceId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceId() {
			return resourceId;
		}

		/**
		 * resourceId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceId(String value) {
			this.resourceId = value;
		}

		/**
		 * statusId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getStatusId() {
			return statusId;
		}

		/**
		 * statusId 속성의 값을 설정합니다.
		 * 
		 */
		public void setStatusId(int value) {
			this.statusId = value;
		}

		/**
		 * dateTimeStatus 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDateTimeStatus() {
			return dateTimeStatus;
		}

		/**
		 * dateTimeStatus 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDateTimeStatus(XMLGregorianCalendar value) {
			this.dateTimeStatus = value;
		}

		/**
		 * fixedResource 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isFixedResource() {
			return fixedResource;
		}

		/**
		 * fixedResource 속성의 값을 설정합니다.
		 * 
		 */
		public void setFixedResource(boolean value) {
			this.fixedResource = value;
		}

		/**
		 * dateTimeFixed 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getDateTimeFixed() {
			return dateTimeFixed;
		}

		/**
		 * dateTimeFixed 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setDateTimeFixed(XMLGregorianCalendar value) {
			this.dateTimeFixed = value;
		}

		/**
		 * commitSortValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getCommitSortValue() {
			return commitSortValue;
		}

		/**
		 * commitSortValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setCommitSortValue(Double value) {
			this.commitSortValue = value;
		}

		/**
		 * source 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getSource() {
			return source;
		}

		/**
		 * source 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setSource(Integer value) {
			this.source = value;
		}

		/**
		 * Gets the value of the expectedStartDatetime property.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getExpectedStartDatetime() {
			return expectedStartDatetime;
		}

		/**
		 * Sets the value of the expectedStartDatetime property.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setExpectedStartDatetime(XMLGregorianCalendar value) {
			this.expectedStartDatetime = value;
		}

		/**
		 * Gets the value of the expectedEndDatetime property.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getExpectedEndDatetime() {
			return expectedEndDatetime;
		}

		/**
		 * Sets the value of the expectedEndDatetime property.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setExpectedEndDatetime(XMLGregorianCalendar value) {
			this.expectedEndDatetime = value;
		}
	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "value", "organisationId" })
	public static class SystemCounter implements Serializable {

		@XmlElement(required = true)
		protected String id;
		protected int value;
		@XmlElement(name = "organisation_id")
		protected int organisationId;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * value 속성의 값을 가져옵니다.
		 * 
		 */
		public int getValue() {
			return value;
		}

		/**
		 * value 속성의 값을 설정합니다.
		 * 
		 */
		public void setValue(int value) {
			this.value = value;
		}

		/**
		 * organisationId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getOrganisationId() {
			return organisationId;
		}

		/**
		 * organisationId 속성의 값을 설정합니다.
		 * 
		 */
		public void setOrganisationId(int value) {
			this.organisationId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="description">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="200"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="statistic_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="range_start" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="range_end" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="benefit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="benefit_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "statisticTypeId",
			"rangeStart", "rangeEnd", "benefit", "benefitType" })
	public static class Target implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(required = true)
		protected String description;
		@XmlElement(name = "statistic_type_id")
		protected int statisticTypeId;
		@XmlElement(name = "range_start")
		protected Double rangeStart;
		@XmlElement(name = "range_end")
		protected Double rangeEnd;
		protected Double benefit;
		@XmlElement(name = "benefit_type", required = true)
		protected String benefitType;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * description 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * description 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * statisticTypeId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getStatisticTypeId() {
			return statisticTypeId;
		}

		/**
		 * statisticTypeId 속성의 값을 설정합니다.
		 * 
		 */
		public void setStatisticTypeId(int value) {
			this.statisticTypeId = value;
		}

		/**
		 * rangeStart 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getRangeStart() {
			return rangeStart;
		}

		/**
		 * rangeStart 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setRangeStart(Double value) {
			this.rangeStart = value;
		}

		/**
		 * rangeEnd 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getRangeEnd() {
			return rangeEnd;
		}

		/**
		 * rangeEnd 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setRangeEnd(Double value) {
			this.rangeEnd = value;
		}

		/**
		 * benefit 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getBenefit() {
			return benefit;
		}

		/**
		 * benefit 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setBenefit(Double value) {
			this.benefit = value;
		}

		/**
		 * benefitType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getBenefitType() {
			return benefitType;
		}

		/**
		 * benefitType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setBenefitType(String value) {
			this.benefitType = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="target_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="activity_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="resource_type_id" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "targetId", "activityTypeId",
			"resourceTypeId" })
	public static class TargetItem implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "target_id", required = true)
		protected String targetId;
		@XmlElement(name = "activity_type_id")
		protected String activityTypeId;
		@XmlElement(name = "resource_type_id")
		protected String resourceTypeId;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * targetId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTargetId() {
			return targetId;
		}

		/**
		 * targetId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTargetId(String value) {
			this.targetId = value;
		}

		/**
		 * activityTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityTypeId() {
			return activityTypeId;
		}

		/**
		 * activityTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityTypeId(String value) {
			this.activityTypeId = value;
		}

		/**
		 * resourceTypeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getResourceTypeId() {
			return resourceTypeId;
		}

		/**
		 * resourceTypeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setResourceTypeId(String value) {
			this.resourceTypeId = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="from_location_geocode_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="to_location_geocode_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="time_taken" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="symmetric" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="from_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="to_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "fromLocationGeocodeId",
			"toLocationGeocodeId", "timeTaken", "distance", "symmetric",
			"fromDate", "toDate" })
	public static class TravelCalculation implements Serializable {

		@XmlElement(name = "from_location_geocode_id", required = true)
		protected String fromLocationGeocodeId;
		@XmlElement(name = "to_location_geocode_id", required = true)
		protected String toLocationGeocodeId;
		@XmlElement(name = "time_taken")
		protected double timeTaken;
		protected double distance;
		@XmlElement(defaultValue = "true")
		protected boolean symmetric;
		@XmlElement(name = "from_date")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar fromDate;
		@XmlElement(name = "to_date")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar toDate;

		/**
		 * fromLocationGeocodeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getFromLocationGeocodeId() {
			return fromLocationGeocodeId;
		}

		/**
		 * fromLocationGeocodeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setFromLocationGeocodeId(String value) {
			this.fromLocationGeocodeId = value;
		}

		/**
		 * toLocationGeocodeId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getToLocationGeocodeId() {
			return toLocationGeocodeId;
		}

		/**
		 * toLocationGeocodeId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setToLocationGeocodeId(String value) {
			this.toLocationGeocodeId = value;
		}

		/**
		 * timeTaken 속성의 값을 가져옵니다.
		 * 
		 */
		public double getTimeTaken() {
			return timeTaken;
		}

		/**
		 * timeTaken 속성의 값을 설정합니다.
		 * 
		 */
		public void setTimeTaken(double value) {
			this.timeTaken = value;
		}

		/**
		 * distance 속성의 값을 가져옵니다.
		 * 
		 */
		public double getDistance() {
			return distance;
		}

		/**
		 * distance 속성의 값을 설정합니다.
		 * 
		 */
		public void setDistance(double value) {
			this.distance = value;
		}

		/**
		 * symmetric 속성의 값을 가져옵니다.
		 * 
		 */
		public boolean isSymmetric() {
			return symmetric;
		}

		/**
		 * symmetric 속성의 값을 설정합니다.
		 * 
		 */
		public void setSymmetric(boolean value) {
			this.symmetric = value;
		}

		/**
		 * fromDate 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getFromDate() {
			return fromDate;
		}

		/**
		 * fromDate 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setFromDate(XMLGregorianCalendar value) {
			this.fromDate = value;
		}

		/**
		 * toDate 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getToDate() {
			return toDate;
		}

		/**
		 * toDate 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setToDate(XMLGregorianCalendar value) {
			this.toDate = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="plan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="travel_detail_request_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}duration"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "planId", "travelDetailRequestId",
			"distance", "time" })
	public static class TravelDetail implements Serializable {

		@XmlElement(name = "plan_id")
		protected Integer planId;
		@XmlElement(name = "travel_detail_request_id", required = true)
		protected String travelDetailRequestId;
		protected double distance;
		@XmlElement(required = true)
		protected Duration time;

		/**
		 * planId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getPlanId() {
			return planId;
		}

		/**
		 * planId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setPlanId(Integer value) {
			this.planId = value;
		}

		/**
		 * travelDetailRequestId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTravelDetailRequestId() {
			return travelDetailRequestId;
		}

		/**
		 * travelDetailRequestId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTravelDetailRequestId(String value) {
			this.travelDetailRequestId = value;
		}

		/**
		 * distance 속성의 값을 가져옵니다.
		 * 
		 */
		public double getDistance() {
			return distance;
		}

		/**
		 * distance 속성의 값을 설정합니다.
		 * 
		 */
		public void setDistance(double value) {
			this.distance = value;
		}

		/**
		 * time 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Duration }
		 * 
		 */
		public Duration getTime() {
			return time;
		}

		/**
		 * time 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Duration }
		 * 
		 */
		public void setTime(Duration value) {
			this.time = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_from" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="location_id_to" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="start_datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *         &lt;element name="profile_id_travel" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="speed_factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="latitude_from" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="longitude_from" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="latitude_to" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *         &lt;element name="longitude_to" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "locationIdFrom", "locationIdTo",
			"startDatetime", "profileIdTravel", "speedFactor", "latitudeFrom",
			"longitudeFrom", "latitudeTo", "longitudeTo" })
	public static class TravelDetailRequest implements Serializable {

		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "location_id_from")
		protected String locationIdFrom;
		@XmlElement(name = "location_id_to")
		protected String locationIdTo;
		@XmlElement(name = "start_datetime")
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar startDatetime;
		@XmlElement(name = "profile_id_travel")
		protected String profileIdTravel;
		@XmlElement(name = "speed_factor")
		protected Double speedFactor;
		@XmlElement(name = "latitude_from")
		protected Double latitudeFrom;
		@XmlElement(name = "longitude_from")
		protected Double longitudeFrom;
		@XmlElement(name = "latitude_to")
		protected Double latitudeTo;
		@XmlElement(name = "longitude_to")
		protected Double longitudeTo;

		/**
		 * id 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * id 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * locationIdFrom 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdFrom() {
			return locationIdFrom;
		}

		/**
		 * locationIdFrom 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdFrom(String value) {
			this.locationIdFrom = value;
		}

		/**
		 * locationIdTo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLocationIdTo() {
			return locationIdTo;
		}

		/**
		 * locationIdTo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLocationIdTo(String value) {
			this.locationIdTo = value;
		}

		/**
		 * startDatetime 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getStartDatetime() {
			return startDatetime;
		}

		/**
		 * startDatetime 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setStartDatetime(XMLGregorianCalendar value) {
			this.startDatetime = value;
		}

		/**
		 * profileIdTravel 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getProfileIdTravel() {
			return profileIdTravel;
		}

		/**
		 * profileIdTravel 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setProfileIdTravel(String value) {
			this.profileIdTravel = value;
		}

		/**
		 * speedFactor 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getSpeedFactor() {
			return speedFactor;
		}

		/**
		 * speedFactor 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setSpeedFactor(Double value) {
			this.speedFactor = value;
		}

		/**
		 * latitudeFrom 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLatitudeFrom() {
			return latitudeFrom;
		}

		/**
		 * latitudeFrom 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLatitudeFrom(Double value) {
			this.latitudeFrom = value;
		}

		/**
		 * longitudeFrom 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLongitudeFrom() {
			return longitudeFrom;
		}

		/**
		 * longitudeFrom 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLongitudeFrom(Double value) {
			this.longitudeFrom = value;
		}

		/**
		 * latitudeTo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLatitudeTo() {
			return latitudeTo;
		}

		/**
		 * latitudeTo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLatitudeTo(Double value) {
			this.latitudeTo = value;
		}

		/**
		 * longitudeTo 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getLongitudeTo() {
			return longitudeTo;
		}

		/**
		 * longitudeTo 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link Double }
		 * 
		 */
		public void setLongitudeTo(Double value) {
			this.longitudeTo = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="custom_url_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="parameter_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="500"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="parameter_value_table" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "customUrlId", "sequence",
			"parameterValue", "parameterValueTable" })
	public static class URLParameter implements Serializable {

		@XmlElement(name = "custom_url_id", required = true)
		protected String customUrlId;
		protected int sequence;
		@XmlElement(name = "parameter_value", required = true)
		protected String parameterValue;
		@XmlElement(name = "parameter_value_table")
		protected String parameterValueTable;

		/**
		 * customUrlId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCustomUrlId() {
			return customUrlId;
		}

		/**
		 * customUrlId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCustomUrlId(String value) {
			this.customUrlId = value;
		}

		/**
		 * sequence 속성의 값을 가져옵니다.
		 * 
		 */
		public int getSequence() {
			return sequence;
		}

		/**
		 * sequence 속성의 값을 설정합니다.
		 * 
		 */
		public void setSequence(int value) {
			this.sequence = value;
		}

		/**
		 * parameterValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getParameterValue() {
			return parameterValue;
		}

		/**
		 * parameterValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setParameterValue(String value) {
			this.parameterValue = value;
		}

		/**
		 * parameterValueTable 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getParameterValueTable() {
			return parameterValueTable;
		}

		/**
		 * parameterValueTable 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setParameterValueTable(String value) {
			this.parameterValueTable = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="custom_url_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="string_value">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="500"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "customUrlId", "sequence", "stringValue" })
	public static class URLString implements Serializable {

		@XmlElement(name = "custom_url_id", required = true)
		protected String customUrlId;
		protected int sequence;
		@XmlElement(name = "string_value", required = true)
		protected String stringValue;

		/**
		 * customUrlId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCustomUrlId() {
			return customUrlId;
		}

		/**
		 * customUrlId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCustomUrlId(String value) {
			this.customUrlId = value;
		}

		/**
		 * sequence 속성의 값을 가져옵니다.
		 * 
		 */
		public int getSequence() {
			return sequence;
		}

		/**
		 * sequence 속성의 값을 설정합니다.
		 * 
		 */
		public void setSequence(int value) {
			this.sequence = value;
		}

		/**
		 * stringValue 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getStringValue() {
			return stringValue;
		}

		/**
		 * stringValue 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setStringValue(String value) {
			this.stringValue = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="version_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="version_type">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="version_stamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="version_user">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="128"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "versionId", "versionType",
			"versionStamp", "versionUser" })
	public static class VersionHistory implements Serializable {

		@XmlElement(name = "version_id", required = true)
		protected String versionId;
		@XmlElement(name = "version_type", required = true)
		protected String versionType;
		@XmlElement(name = "version_stamp", required = true)
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar versionStamp;
		@XmlElement(name = "version_user", required = true)
		protected String versionUser;

		/**
		 * versionId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVersionId() {
			return versionId;
		}

		/**
		 * versionId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVersionId(String value) {
			this.versionId = value;
		}

		/**
		 * versionType 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVersionType() {
			return versionType;
		}

		/**
		 * versionType 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVersionType(String value) {
			this.versionType = value;
		}

		/**
		 * versionStamp 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getVersionStamp() {
			return versionStamp;
		}

		/**
		 * versionStamp 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setVersionStamp(XMLGregorianCalendar value) {
			this.versionStamp = value;
		}

		/**
		 * versionUser 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVersionUser() {
			return versionUser;
		}

		/**
		 * versionUser 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVersionUser(String value) {
			this.versionUser = value;
		}

	}

	/**
	 * <p>
	 * anonymous complex type에 대한 Java 클래스입니다.
	 * 
	 * <p>
	 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="activity_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="visit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="part_id">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;maxLength value="32"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="part_usage" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "activityId", "visitId", "partId",
			"partUsage" })
	public static class VisitPart implements Serializable {

		@XmlElement(name = "activity_id", required = true)
		protected String activityId;
		@XmlElement(name = "visit_id")
		protected int visitId;
		@XmlElement(name = "part_id", required = true)
		protected String partId;
		@XmlElement(name = "part_usage")
		protected int partUsage;

		/**
		 * activityId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActivityId() {
			return activityId;
		}

		/**
		 * activityId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActivityId(String value) {
			this.activityId = value;
		}

		/**
		 * visitId 속성의 값을 가져옵니다.
		 * 
		 */
		public int getVisitId() {
			return visitId;
		}

		/**
		 * visitId 속성의 값을 설정합니다.
		 * 
		 */
		public void setVisitId(int value) {
			this.visitId = value;
		}

		/**
		 * partId 속성의 값을 가져옵니다.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPartId() {
			return partId;
		}

		/**
		 * partId 속성의 값을 설정합니다.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPartId(String value) {
			this.partId = value;
		}

		/**
		 * partUsage 속성의 값을 가져옵니다.
		 * 
		 */
		public int getPartUsage() {
			return partUsage;
		}

		/**
		 * partUsage 속성의 값을 설정합니다.
		 * 
		 */
		public void setPartUsage(int value) {
			this.partUsage = value;
		}

	}

}
