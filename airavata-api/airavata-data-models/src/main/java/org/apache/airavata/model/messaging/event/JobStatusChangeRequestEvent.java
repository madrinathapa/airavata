/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.messaging.event;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-19")
public class JobStatusChangeRequestEvent implements org.apache.thrift.TBase<JobStatusChangeRequestEvent, JobStatusChangeRequestEvent._Fields>, java.io.Serializable, Cloneable, Comparable<JobStatusChangeRequestEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobStatusChangeRequestEvent");

  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_IDENTITY_FIELD_DESC = new org.apache.thrift.protocol.TField("jobIdentity", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobStatusChangeRequestEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobStatusChangeRequestEventTupleSchemeFactory());
  }

  private org.apache.airavata.model.status.JobState state; // required
  private JobIdentifier jobIdentity; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.airavata.model.status.JobState
     */
    STATE((short)1, "state"),
    JOB_IDENTITY((short)2, "jobIdentity");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATE
          return STATE;
        case 2: // JOB_IDENTITY
          return JOB_IDENTITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.airavata.model.status.JobState.class)));
    tmpMap.put(_Fields.JOB_IDENTITY, new org.apache.thrift.meta_data.FieldMetaData("jobIdentity", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobIdentifier.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobStatusChangeRequestEvent.class, metaDataMap);
  }

  public JobStatusChangeRequestEvent() {
  }

  public JobStatusChangeRequestEvent(
    org.apache.airavata.model.status.JobState state,
    JobIdentifier jobIdentity)
  {
    this();
    this.state = state;
    this.jobIdentity = jobIdentity;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobStatusChangeRequestEvent(JobStatusChangeRequestEvent other) {
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetJobIdentity()) {
      this.jobIdentity = new JobIdentifier(other.jobIdentity);
    }
  }

  public JobStatusChangeRequestEvent deepCopy() {
    return new JobStatusChangeRequestEvent(this);
  }

  @Override
  public void clear() {
    this.state = null;
    this.jobIdentity = null;
  }

  /**
   * 
   * @see org.apache.airavata.model.status.JobState
   */
  public org.apache.airavata.model.status.JobState getState() {
    return this.state;
  }

  /**
   * 
   * @see org.apache.airavata.model.status.JobState
   */
  public void setState(org.apache.airavata.model.status.JobState state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public JobIdentifier getJobIdentity() {
    return this.jobIdentity;
  }

  public void setJobIdentity(JobIdentifier jobIdentity) {
    this.jobIdentity = jobIdentity;
  }

  public void unsetJobIdentity() {
    this.jobIdentity = null;
  }

  /** Returns true if field jobIdentity is set (has been assigned a value) and false otherwise */
  public boolean isSetJobIdentity() {
    return this.jobIdentity != null;
  }

  public void setJobIdentityIsSet(boolean value) {
    if (!value) {
      this.jobIdentity = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((org.apache.airavata.model.status.JobState)value);
      }
      break;

    case JOB_IDENTITY:
      if (value == null) {
        unsetJobIdentity();
      } else {
        setJobIdentity((JobIdentifier)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case JOB_IDENTITY:
      return getJobIdentity();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case JOB_IDENTITY:
      return isSetJobIdentity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobStatusChangeRequestEvent)
      return this.equals((JobStatusChangeRequestEvent)that);
    return false;
  }

  public boolean equals(JobStatusChangeRequestEvent that) {
    if (that == null)
      return false;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_jobIdentity = true && this.isSetJobIdentity();
    boolean that_present_jobIdentity = true && that.isSetJobIdentity();
    if (this_present_jobIdentity || that_present_jobIdentity) {
      if (!(this_present_jobIdentity && that_present_jobIdentity))
        return false;
      if (!this.jobIdentity.equals(that.jobIdentity))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_state = true && (isSetState());
    list.add(present_state);
    if (present_state)
      list.add(state.getValue());

    boolean present_jobIdentity = true && (isSetJobIdentity());
    list.add(present_jobIdentity);
    if (present_jobIdentity)
      list.add(jobIdentity);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobStatusChangeRequestEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobIdentity()).compareTo(other.isSetJobIdentity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobIdentity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobIdentity, other.jobIdentity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("JobStatusChangeRequestEvent(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobIdentity:");
    if (this.jobIdentity == null) {
      sb.append("null");
    } else {
      sb.append(this.jobIdentity);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetState()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state' is unset! Struct:" + toString());
    }

    if (!isSetJobIdentity()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobIdentity' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (jobIdentity != null) {
      jobIdentity.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobStatusChangeRequestEventStandardSchemeFactory implements SchemeFactory {
    public JobStatusChangeRequestEventStandardScheme getScheme() {
      return new JobStatusChangeRequestEventStandardScheme();
    }
  }

  private static class JobStatusChangeRequestEventStandardScheme extends StandardScheme<JobStatusChangeRequestEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = org.apache.airavata.model.status.JobState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_IDENTITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jobIdentity = new JobIdentifier();
              struct.jobIdentity.read(iprot);
              struct.setJobIdentityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.jobIdentity != null) {
        oprot.writeFieldBegin(JOB_IDENTITY_FIELD_DESC);
        struct.jobIdentity.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobStatusChangeRequestEventTupleSchemeFactory implements SchemeFactory {
    public JobStatusChangeRequestEventTupleScheme getScheme() {
      return new JobStatusChangeRequestEventTupleScheme();
    }
  }

  private static class JobStatusChangeRequestEventTupleScheme extends TupleScheme<JobStatusChangeRequestEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.state.getValue());
      struct.jobIdentity.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.state = org.apache.airavata.model.status.JobState.findByValue(iprot.readI32());
      struct.setStateIsSet(true);
      struct.jobIdentity = new JobIdentifier();
      struct.jobIdentity.read(iprot);
      struct.setJobIdentityIsSet(true);
    }
  }

}

