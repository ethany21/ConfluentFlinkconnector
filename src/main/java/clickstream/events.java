/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package clickstream;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class events extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -121642928519029390L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"events\",\"namespace\":\"clickstream\",\"fields\":[{\"name\":\"ip\",\"type\":\"string\"},{\"name\":\"userid\",\"type\":\"int\"},{\"name\":\"remote_user\",\"type\":\"string\"},{\"name\":\"time\",\"type\":\"string\"},{\"name\":\"_time\",\"type\":\"long\"},{\"name\":\"request\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"bytes\",\"type\":\"string\"},{\"name\":\"referrer\",\"type\":\"string\"},{\"name\":\"agent\",\"type\":\"string\"}],\"connect.name\":\"clickstream.events\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<events> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<events> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<events> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<events> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<events> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this events to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a events from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a events instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static events fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence ip;
  private int userid;
  private java.lang.CharSequence remote_user;
  private java.lang.CharSequence time;
  private long _time;
  private java.lang.CharSequence request;
  private java.lang.CharSequence status;
  private java.lang.CharSequence bytes;
  private java.lang.CharSequence referrer;
  private java.lang.CharSequence agent;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public events() {}

  /**
   * All-args constructor.
   * @param ip The new value for ip
   * @param userid The new value for userid
   * @param remote_user The new value for remote_user
   * @param time The new value for time
   * @param _time The new value for _time
   * @param request The new value for request
   * @param status The new value for status
   * @param bytes The new value for bytes
   * @param referrer The new value for referrer
   * @param agent The new value for agent
   */
  public events(java.lang.CharSequence ip, java.lang.Integer userid, java.lang.CharSequence remote_user, java.lang.CharSequence time, java.lang.Long _time, java.lang.CharSequence request, java.lang.CharSequence status, java.lang.CharSequence bytes, java.lang.CharSequence referrer, java.lang.CharSequence agent) {
    this.ip = ip;
    this.userid = userid;
    this.remote_user = remote_user;
    this.time = time;
    this._time = _time;
    this.request = request;
    this.status = status;
    this.bytes = bytes;
    this.referrer = referrer;
    this.agent = agent;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ip;
    case 1: return userid;
    case 2: return remote_user;
    case 3: return time;
    case 4: return _time;
    case 5: return request;
    case 6: return status;
    case 7: return bytes;
    case 8: return referrer;
    case 9: return agent;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ip = (java.lang.CharSequence)value$; break;
    case 1: userid = (java.lang.Integer)value$; break;
    case 2: remote_user = (java.lang.CharSequence)value$; break;
    case 3: time = (java.lang.CharSequence)value$; break;
    case 4: _time = (java.lang.Long)value$; break;
    case 5: request = (java.lang.CharSequence)value$; break;
    case 6: status = (java.lang.CharSequence)value$; break;
    case 7: bytes = (java.lang.CharSequence)value$; break;
    case 8: referrer = (java.lang.CharSequence)value$; break;
    case 9: agent = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ip' field.
   * @return The value of the 'ip' field.
   */
  public java.lang.CharSequence getIp() {
    return ip;
  }


  /**
   * Sets the value of the 'ip' field.
   * @param value the value to set.
   */
  public void setIp(java.lang.CharSequence value) {
    this.ip = value;
  }

  /**
   * Gets the value of the 'userid' field.
   * @return The value of the 'userid' field.
   */
  public int getUserid() {
    return userid;
  }


  /**
   * Sets the value of the 'userid' field.
   * @param value the value to set.
   */
  public void setUserid(int value) {
    this.userid = value;
  }

  /**
   * Gets the value of the 'remote_user' field.
   * @return The value of the 'remote_user' field.
   */
  public java.lang.CharSequence getRemoteUser() {
    return remote_user;
  }


  /**
   * Sets the value of the 'remote_user' field.
   * @param value the value to set.
   */
  public void setRemoteUser(java.lang.CharSequence value) {
    this.remote_user = value;
  }

  /**
   * Gets the value of the 'time' field.
   * @return The value of the 'time' field.
   */
  public java.lang.CharSequence getTime() {
    return time;
  }


  /**
   * Sets the value of the 'time' field.
   * @param value the value to set.
   */
  public void setTime(java.lang.CharSequence value) {
    this.time = value;
  }

  /**
   * Gets the value of the '_time' field.
   * @return The value of the '_time' field.
   */
  public long getTime$1() {
    return _time;
  }


  /**
   * Sets the value of the '_time' field.
   * @param value the value to set.
   */
  public void setTime$1(long value) {
    this._time = value;
  }

  /**
   * Gets the value of the 'request' field.
   * @return The value of the 'request' field.
   */
  public java.lang.CharSequence getRequest() {
    return request;
  }


  /**
   * Sets the value of the 'request' field.
   * @param value the value to set.
   */
  public void setRequest(java.lang.CharSequence value) {
    this.request = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'bytes' field.
   * @return The value of the 'bytes' field.
   */
  public java.lang.CharSequence getBytes() {
    return bytes;
  }


  /**
   * Sets the value of the 'bytes' field.
   * @param value the value to set.
   */
  public void setBytes(java.lang.CharSequence value) {
    this.bytes = value;
  }

  /**
   * Gets the value of the 'referrer' field.
   * @return The value of the 'referrer' field.
   */
  public java.lang.CharSequence getReferrer() {
    return referrer;
  }


  /**
   * Sets the value of the 'referrer' field.
   * @param value the value to set.
   */
  public void setReferrer(java.lang.CharSequence value) {
    this.referrer = value;
  }

  /**
   * Gets the value of the 'agent' field.
   * @return The value of the 'agent' field.
   */
  public java.lang.CharSequence getAgent() {
    return agent;
  }


  /**
   * Sets the value of the 'agent' field.
   * @param value the value to set.
   */
  public void setAgent(java.lang.CharSequence value) {
    this.agent = value;
  }

  /**
   * Creates a new events RecordBuilder.
   * @return A new events RecordBuilder
   */
  public static clickstream.events.Builder newBuilder() {
    return new clickstream.events.Builder();
  }

  /**
   * Creates a new events RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new events RecordBuilder
   */
  public static clickstream.events.Builder newBuilder(clickstream.events.Builder other) {
    if (other == null) {
      return new clickstream.events.Builder();
    } else {
      return new clickstream.events.Builder(other);
    }
  }

  /**
   * Creates a new events RecordBuilder by copying an existing events instance.
   * @param other The existing instance to copy.
   * @return A new events RecordBuilder
   */
  public static clickstream.events.Builder newBuilder(clickstream.events other) {
    if (other == null) {
      return new clickstream.events.Builder();
    } else {
      return new clickstream.events.Builder(other);
    }
  }

  /**
   * RecordBuilder for events instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<events>
    implements org.apache.avro.data.RecordBuilder<events> {

    private java.lang.CharSequence ip;
    private int userid;
    private java.lang.CharSequence remote_user;
    private java.lang.CharSequence time;
    private long _time;
    private java.lang.CharSequence request;
    private java.lang.CharSequence status;
    private java.lang.CharSequence bytes;
    private java.lang.CharSequence referrer;
    private java.lang.CharSequence agent;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(clickstream.events.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ip)) {
        this.ip = data().deepCopy(fields()[0].schema(), other.ip);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.userid)) {
        this.userid = data().deepCopy(fields()[1].schema(), other.userid);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.remote_user)) {
        this.remote_user = data().deepCopy(fields()[2].schema(), other.remote_user);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.time)) {
        this.time = data().deepCopy(fields()[3].schema(), other.time);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other._time)) {
        this._time = data().deepCopy(fields()[4].schema(), other._time);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.request)) {
        this.request = data().deepCopy(fields()[5].schema(), other.request);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.status)) {
        this.status = data().deepCopy(fields()[6].schema(), other.status);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.bytes)) {
        this.bytes = data().deepCopy(fields()[7].schema(), other.bytes);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.referrer)) {
        this.referrer = data().deepCopy(fields()[8].schema(), other.referrer);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.agent)) {
        this.agent = data().deepCopy(fields()[9].schema(), other.agent);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
    }

    /**
     * Creates a Builder by copying an existing events instance
     * @param other The existing instance to copy.
     */
    private Builder(clickstream.events other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.ip)) {
        this.ip = data().deepCopy(fields()[0].schema(), other.ip);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userid)) {
        this.userid = data().deepCopy(fields()[1].schema(), other.userid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.remote_user)) {
        this.remote_user = data().deepCopy(fields()[2].schema(), other.remote_user);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.time)) {
        this.time = data().deepCopy(fields()[3].schema(), other.time);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._time)) {
        this._time = data().deepCopy(fields()[4].schema(), other._time);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.request)) {
        this.request = data().deepCopy(fields()[5].schema(), other.request);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.status)) {
        this.status = data().deepCopy(fields()[6].schema(), other.status);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.bytes)) {
        this.bytes = data().deepCopy(fields()[7].schema(), other.bytes);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.referrer)) {
        this.referrer = data().deepCopy(fields()[8].schema(), other.referrer);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.agent)) {
        this.agent = data().deepCopy(fields()[9].schema(), other.agent);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'ip' field.
      * @return The value.
      */
    public java.lang.CharSequence getIp() {
      return ip;
    }


    /**
      * Sets the value of the 'ip' field.
      * @param value The value of 'ip'.
      * @return This builder.
      */
    public clickstream.events.Builder setIp(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ip = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ip' field has been set.
      * @return True if the 'ip' field has been set, false otherwise.
      */
    public boolean hasIp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ip' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearIp() {
      ip = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userid' field.
      * @return The value.
      */
    public int getUserid() {
      return userid;
    }


    /**
      * Sets the value of the 'userid' field.
      * @param value The value of 'userid'.
      * @return This builder.
      */
    public clickstream.events.Builder setUserid(int value) {
      validate(fields()[1], value);
      this.userid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userid' field has been set.
      * @return True if the 'userid' field has been set, false otherwise.
      */
    public boolean hasUserid() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userid' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearUserid() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'remote_user' field.
      * @return The value.
      */
    public java.lang.CharSequence getRemoteUser() {
      return remote_user;
    }


    /**
      * Sets the value of the 'remote_user' field.
      * @param value The value of 'remote_user'.
      * @return This builder.
      */
    public clickstream.events.Builder setRemoteUser(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.remote_user = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'remote_user' field has been set.
      * @return True if the 'remote_user' field has been set, false otherwise.
      */
    public boolean hasRemoteUser() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'remote_user' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearRemoteUser() {
      remote_user = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'time' field.
      * @return The value.
      */
    public java.lang.CharSequence getTime() {
      return time;
    }


    /**
      * Sets the value of the 'time' field.
      * @param value The value of 'time'.
      * @return This builder.
      */
    public clickstream.events.Builder setTime(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.time = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'time' field has been set.
      * @return True if the 'time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'time' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearTime() {
      time = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the '_time' field.
      * @return The value.
      */
    public long getTime$1() {
      return _time;
    }


    /**
      * Sets the value of the '_time' field.
      * @param value The value of '_time'.
      * @return This builder.
      */
    public clickstream.events.Builder setTime$1(long value) {
      validate(fields()[4], value);
      this._time = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the '_time' field has been set.
      * @return True if the '_time' field has been set, false otherwise.
      */
    public boolean hasTime$1() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the '_time' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearTime$1() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'request' field.
      * @return The value.
      */
    public java.lang.CharSequence getRequest() {
      return request;
    }


    /**
      * Sets the value of the 'request' field.
      * @param value The value of 'request'.
      * @return This builder.
      */
    public clickstream.events.Builder setRequest(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.request = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'request' field has been set.
      * @return True if the 'request' field has been set, false otherwise.
      */
    public boolean hasRequest() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'request' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearRequest() {
      request = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public clickstream.events.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.status = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearStatus() {
      status = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'bytes' field.
      * @return The value.
      */
    public java.lang.CharSequence getBytes() {
      return bytes;
    }


    /**
      * Sets the value of the 'bytes' field.
      * @param value The value of 'bytes'.
      * @return This builder.
      */
    public clickstream.events.Builder setBytes(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.bytes = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'bytes' field has been set.
      * @return True if the 'bytes' field has been set, false otherwise.
      */
    public boolean hasBytes() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'bytes' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearBytes() {
      bytes = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'referrer' field.
      * @return The value.
      */
    public java.lang.CharSequence getReferrer() {
      return referrer;
    }


    /**
      * Sets the value of the 'referrer' field.
      * @param value The value of 'referrer'.
      * @return This builder.
      */
    public clickstream.events.Builder setReferrer(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.referrer = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'referrer' field has been set.
      * @return True if the 'referrer' field has been set, false otherwise.
      */
    public boolean hasReferrer() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'referrer' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearReferrer() {
      referrer = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'agent' field.
      * @return The value.
      */
    public java.lang.CharSequence getAgent() {
      return agent;
    }


    /**
      * Sets the value of the 'agent' field.
      * @param value The value of 'agent'.
      * @return This builder.
      */
    public clickstream.events.Builder setAgent(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.agent = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'agent' field has been set.
      * @return True if the 'agent' field has been set, false otherwise.
      */
    public boolean hasAgent() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'agent' field.
      * @return This builder.
      */
    public clickstream.events.Builder clearAgent() {
      agent = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public events build() {
      try {
        events record = new events();
        record.ip = fieldSetFlags()[0] ? this.ip : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.userid = fieldSetFlags()[1] ? this.userid : (java.lang.Integer) defaultValue(fields()[1]);
        record.remote_user = fieldSetFlags()[2] ? this.remote_user : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.time = fieldSetFlags()[3] ? this.time : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._time = fieldSetFlags()[4] ? this._time : (java.lang.Long) defaultValue(fields()[4]);
        record.request = fieldSetFlags()[5] ? this.request : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.status = fieldSetFlags()[6] ? this.status : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.bytes = fieldSetFlags()[7] ? this.bytes : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.referrer = fieldSetFlags()[8] ? this.referrer : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.agent = fieldSetFlags()[9] ? this.agent : (java.lang.CharSequence) defaultValue(fields()[9]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<events>
    WRITER$ = (org.apache.avro.io.DatumWriter<events>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<events>
    READER$ = (org.apache.avro.io.DatumReader<events>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.ip);

    out.writeInt(this.userid);

    out.writeString(this.remote_user);

    out.writeString(this.time);

    out.writeLong(this._time);

    out.writeString(this.request);

    out.writeString(this.status);

    out.writeString(this.bytes);

    out.writeString(this.referrer);

    out.writeString(this.agent);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.ip = in.readString(this.ip instanceof Utf8 ? (Utf8)this.ip : null);

      this.userid = in.readInt();

      this.remote_user = in.readString(this.remote_user instanceof Utf8 ? (Utf8)this.remote_user : null);

      this.time = in.readString(this.time instanceof Utf8 ? (Utf8)this.time : null);

      this._time = in.readLong();

      this.request = in.readString(this.request instanceof Utf8 ? (Utf8)this.request : null);

      this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);

      this.bytes = in.readString(this.bytes instanceof Utf8 ? (Utf8)this.bytes : null);

      this.referrer = in.readString(this.referrer instanceof Utf8 ? (Utf8)this.referrer : null);

      this.agent = in.readString(this.agent instanceof Utf8 ? (Utf8)this.agent : null);

    } else {
      for (int i = 0; i < 10; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.ip = in.readString(this.ip instanceof Utf8 ? (Utf8)this.ip : null);
          break;

        case 1:
          this.userid = in.readInt();
          break;

        case 2:
          this.remote_user = in.readString(this.remote_user instanceof Utf8 ? (Utf8)this.remote_user : null);
          break;

        case 3:
          this.time = in.readString(this.time instanceof Utf8 ? (Utf8)this.time : null);
          break;

        case 4:
          this._time = in.readLong();
          break;

        case 5:
          this.request = in.readString(this.request instanceof Utf8 ? (Utf8)this.request : null);
          break;

        case 6:
          this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
          break;

        case 7:
          this.bytes = in.readString(this.bytes instanceof Utf8 ? (Utf8)this.bytes : null);
          break;

        case 8:
          this.referrer = in.readString(this.referrer instanceof Utf8 ? (Utf8)this.referrer : null);
          break;

        case 9:
          this.agent = in.readString(this.agent instanceof Utf8 ? (Utf8)this.agent : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










