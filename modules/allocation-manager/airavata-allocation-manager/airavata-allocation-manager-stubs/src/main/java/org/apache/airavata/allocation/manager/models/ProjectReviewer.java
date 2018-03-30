/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.allocation.manager.models;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * <p>Allocation Request status details</p>
 * <li>projectId: Unique id of the project</li>
 * <li>reviewerUsername: Name of the reviewer who submitted the review</li>
 * <li>id: Unique id of mapping</li>
 * 
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class ProjectReviewer implements org.apache.thrift.TBase<ProjectReviewer, ProjectReviewer._Fields>, java.io.Serializable, Cloneable, Comparable<ProjectReviewer> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProjectReviewer");

  private static final org.apache.thrift.protocol.TField PROJECT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("projectId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField REVIEWER_USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("reviewerUsername", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProjectReviewerStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProjectReviewerTupleSchemeFactory();

  public long projectId; // optional
  public java.lang.String reviewerUsername; // optional
  public long id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROJECT_ID((short)1, "projectId"),
    REVIEWER_USERNAME((short)2, "reviewerUsername"),
    ID((short)3, "id");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROJECT_ID
          return PROJECT_ID;
        case 2: // REVIEWER_USERNAME
          return REVIEWER_USERNAME;
        case 3: // ID
          return ID;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PROJECTID_ISSET_ID = 0;
  private static final int __ID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PROJECT_ID,_Fields.REVIEWER_USERNAME,_Fields.ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROJECT_ID, new org.apache.thrift.meta_data.FieldMetaData("projectId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REVIEWER_USERNAME, new org.apache.thrift.meta_data.FieldMetaData("reviewerUsername", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProjectReviewer.class, metaDataMap);
  }

  public ProjectReviewer() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProjectReviewer(ProjectReviewer other) {
    __isset_bitfield = other.__isset_bitfield;
    this.projectId = other.projectId;
    if (other.isSetReviewerUsername()) {
      this.reviewerUsername = other.reviewerUsername;
    }
    this.id = other.id;
  }

  public ProjectReviewer deepCopy() {
    return new ProjectReviewer(this);
  }

  @Override
  public void clear() {
    setProjectIdIsSet(false);
    this.projectId = 0;
    this.reviewerUsername = null;
    setIdIsSet(false);
    this.id = 0;
  }

  public long getProjectId() {
    return this.projectId;
  }

  public ProjectReviewer setProjectId(long projectId) {
    this.projectId = projectId;
    setProjectIdIsSet(true);
    return this;
  }

  public void unsetProjectId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PROJECTID_ISSET_ID);
  }

  /** Returns true if field projectId is set (has been assigned a value) and false otherwise */
  public boolean isSetProjectId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PROJECTID_ISSET_ID);
  }

  public void setProjectIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PROJECTID_ISSET_ID, value);
  }

  public java.lang.String getReviewerUsername() {
    return this.reviewerUsername;
  }

  public ProjectReviewer setReviewerUsername(java.lang.String reviewerUsername) {
    this.reviewerUsername = reviewerUsername;
    return this;
  }

  public void unsetReviewerUsername() {
    this.reviewerUsername = null;
  }

  /** Returns true if field reviewerUsername is set (has been assigned a value) and false otherwise */
  public boolean isSetReviewerUsername() {
    return this.reviewerUsername != null;
  }

  public void setReviewerUsernameIsSet(boolean value) {
    if (!value) {
      this.reviewerUsername = null;
    }
  }

  public long getId() {
    return this.id;
  }

  public ProjectReviewer setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PROJECT_ID:
      if (value == null) {
        unsetProjectId();
      } else {
        setProjectId((java.lang.Long)value);
      }
      break;

    case REVIEWER_USERNAME:
      if (value == null) {
        unsetReviewerUsername();
      } else {
        setReviewerUsername((java.lang.String)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PROJECT_ID:
      return getProjectId();

    case REVIEWER_USERNAME:
      return getReviewerUsername();

    case ID:
      return getId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PROJECT_ID:
      return isSetProjectId();
    case REVIEWER_USERNAME:
      return isSetReviewerUsername();
    case ID:
      return isSetId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ProjectReviewer)
      return this.equals((ProjectReviewer)that);
    return false;
  }

  public boolean equals(ProjectReviewer that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_projectId = true && this.isSetProjectId();
    boolean that_present_projectId = true && that.isSetProjectId();
    if (this_present_projectId || that_present_projectId) {
      if (!(this_present_projectId && that_present_projectId))
        return false;
      if (this.projectId != that.projectId)
        return false;
    }

    boolean this_present_reviewerUsername = true && this.isSetReviewerUsername();
    boolean that_present_reviewerUsername = true && that.isSetReviewerUsername();
    if (this_present_reviewerUsername || that_present_reviewerUsername) {
      if (!(this_present_reviewerUsername && that_present_reviewerUsername))
        return false;
      if (!this.reviewerUsername.equals(that.reviewerUsername))
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetProjectId()) ? 131071 : 524287);
    if (isSetProjectId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(projectId);

    hashCode = hashCode * 8191 + ((isSetReviewerUsername()) ? 131071 : 524287);
    if (isSetReviewerUsername())
      hashCode = hashCode * 8191 + reviewerUsername.hashCode();

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    return hashCode;
  }

  @Override
  public int compareTo(ProjectReviewer other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetProjectId()).compareTo(other.isSetProjectId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProjectId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.projectId, other.projectId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReviewerUsername()).compareTo(other.isSetReviewerUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReviewerUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reviewerUsername, other.reviewerUsername);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ProjectReviewer(");
    boolean first = true;

    if (isSetProjectId()) {
      sb.append("projectId:");
      sb.append(this.projectId);
      first = false;
    }
    if (isSetReviewerUsername()) {
      if (!first) sb.append(", ");
      sb.append("reviewerUsername:");
      if (this.reviewerUsername == null) {
        sb.append("null");
      } else {
        sb.append(this.reviewerUsername);
      }
      first = false;
    }
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProjectReviewerStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProjectReviewerStandardScheme getScheme() {
      return new ProjectReviewerStandardScheme();
    }
  }

  private static class ProjectReviewerStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProjectReviewer> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProjectReviewer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROJECT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.projectId = iprot.readI64();
              struct.setProjectIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REVIEWER_USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reviewerUsername = iprot.readString();
              struct.setReviewerUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProjectReviewer struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetProjectId()) {
        oprot.writeFieldBegin(PROJECT_ID_FIELD_DESC);
        oprot.writeI64(struct.projectId);
        oprot.writeFieldEnd();
      }
      if (struct.reviewerUsername != null) {
        if (struct.isSetReviewerUsername()) {
          oprot.writeFieldBegin(REVIEWER_USERNAME_FIELD_DESC);
          oprot.writeString(struct.reviewerUsername);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProjectReviewerTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProjectReviewerTupleScheme getScheme() {
      return new ProjectReviewerTupleScheme();
    }
  }

  private static class ProjectReviewerTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProjectReviewer> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProjectReviewer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetProjectId()) {
        optionals.set(0);
      }
      if (struct.isSetReviewerUsername()) {
        optionals.set(1);
      }
      if (struct.isSetId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetProjectId()) {
        oprot.writeI64(struct.projectId);
      }
      if (struct.isSetReviewerUsername()) {
        oprot.writeString(struct.reviewerUsername);
      }
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProjectReviewer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.projectId = iprot.readI64();
        struct.setProjectIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reviewerUsername = iprot.readString();
        struct.setReviewerUsernameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

