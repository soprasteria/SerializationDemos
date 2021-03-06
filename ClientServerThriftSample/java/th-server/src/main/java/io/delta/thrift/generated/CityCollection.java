/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.delta.thrift.generated;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-3-3")
public class CityCollection implements org.apache.thrift.TBase<CityCollection, CityCollection._Fields>, java.io.Serializable, Cloneable, Comparable<CityCollection> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CityCollection");

  private static final org.apache.thrift.protocol.TField ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("items", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CityCollectionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CityCollectionTupleSchemeFactory());
  }

  public List<City> items; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEMS((short)1, "items");

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
        case 1: // ITEMS
          return ITEMS;
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
    tmpMap.put(_Fields.ITEMS, new org.apache.thrift.meta_data.FieldMetaData("items", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, City.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CityCollection.class, metaDataMap);
  }

  public CityCollection() {
  }

  public CityCollection(
    List<City> items)
  {
    this();
    this.items = items;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CityCollection(CityCollection other) {
    if (other.isSetItems()) {
      List<City> __this__items = new ArrayList<City>(other.items.size());
      for (City other_element : other.items) {
        __this__items.add(new City(other_element));
      }
      this.items = __this__items;
    }
  }

  public CityCollection deepCopy() {
    return new CityCollection(this);
  }

  @Override
  public void clear() {
    this.items = null;
  }

  public int getItemsSize() {
    return (this.items == null) ? 0 : this.items.size();
  }

  public java.util.Iterator<City> getItemsIterator() {
    return (this.items == null) ? null : this.items.iterator();
  }

  public void addToItems(City elem) {
    if (this.items == null) {
      this.items = new ArrayList<City>();
    }
    this.items.add(elem);
  }

  public List<City> getItems() {
    return this.items;
  }

  public CityCollection setItems(List<City> items) {
    this.items = items;
    return this;
  }

  public void unsetItems() {
    this.items = null;
  }

  /** Returns true if field items is set (has been assigned a value) and false otherwise */
  public boolean isSetItems() {
    return this.items != null;
  }

  public void setItemsIsSet(boolean value) {
    if (!value) {
      this.items = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEMS:
      if (value == null) {
        unsetItems();
      } else {
        setItems((List<City>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEMS:
      return getItems();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEMS:
      return isSetItems();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CityCollection)
      return this.equals((CityCollection)that);
    return false;
  }

  public boolean equals(CityCollection that) {
    if (that == null)
      return false;

    boolean this_present_items = true && this.isSetItems();
    boolean that_present_items = true && that.isSetItems();
    if (this_present_items || that_present_items) {
      if (!(this_present_items && that_present_items))
        return false;
      if (!this.items.equals(that.items))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_items = true && (isSetItems());
    list.add(present_items);
    if (present_items)
      list.add(items);

    return list.hashCode();
  }

  @Override
  public int compareTo(CityCollection other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetItems()).compareTo(other.isSetItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.items, other.items);
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
    StringBuilder sb = new StringBuilder("CityCollection(");
    boolean first = true;

    sb.append("items:");
    if (this.items == null) {
      sb.append("null");
    } else {
      sb.append(this.items);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (items == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'items' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class CityCollectionStandardSchemeFactory implements SchemeFactory {
    public CityCollectionStandardScheme getScheme() {
      return new CityCollectionStandardScheme();
    }
  }

  private static class CityCollectionStandardScheme extends StandardScheme<CityCollection> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CityCollection struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.items = new ArrayList<City>(_list0.size);
                City _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new City();
                  _elem1.read(iprot);
                  struct.items.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setItemsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CityCollection struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.items != null) {
        oprot.writeFieldBegin(ITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.items.size()));
          for (City _iter3 : struct.items)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CityCollectionTupleSchemeFactory implements SchemeFactory {
    public CityCollectionTupleScheme getScheme() {
      return new CityCollectionTupleScheme();
    }
  }

  private static class CityCollectionTupleScheme extends TupleScheme<CityCollection> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CityCollection struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.items.size());
        for (City _iter4 : struct.items)
        {
          _iter4.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CityCollection struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.items = new ArrayList<City>(_list5.size);
        City _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new City();
          _elem6.read(iprot);
          struct.items.add(_elem6);
        }
      }
      struct.setItemsIsSet(true);
    }
  }

}

