/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package demo.api.codec.kafka.events.serialization;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroItemSpringCloudBus extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 668775471552476472L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroItemSpringCloudBus\",\"namespace\":\"demo.api.codec.kafka.events.serialization\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"originService\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"destinationService\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroItemSpringCloudBus> ENCODER =
      new BinaryMessageEncoder<AvroItemSpringCloudBus>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroItemSpringCloudBus> DECODER =
      new BinaryMessageDecoder<AvroItemSpringCloudBus>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AvroItemSpringCloudBus> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AvroItemSpringCloudBus> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroItemSpringCloudBus>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AvroItemSpringCloudBus to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AvroItemSpringCloudBus from a ByteBuffer. */
  public static AvroItemSpringCloudBus fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String type;
  @Deprecated public long timestamp;
  @Deprecated public java.lang.String originService;
  @Deprecated public java.lang.String destinationService;
  @Deprecated public java.lang.String id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroItemSpringCloudBus() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param timestamp The new value for timestamp
   * @param originService The new value for originService
   * @param destinationService The new value for destinationService
   * @param id The new value for id
   */
  public AvroItemSpringCloudBus(java.lang.String type, java.lang.Long timestamp, java.lang.String originService, java.lang.String destinationService, java.lang.String id) {
    this.type = type;
    this.timestamp = timestamp;
    this.originService = originService;
    this.destinationService = destinationService;
    this.id = id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return timestamp;
    case 2: return originService;
    case 3: return destinationService;
    case 4: return id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.String)value$; break;
    case 1: timestamp = (java.lang.Long)value$; break;
    case 2: originService = (java.lang.String)value$; break;
    case 3: destinationService = (java.lang.String)value$; break;
    case 4: id = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'originService' field.
   * @return The value of the 'originService' field.
   */
  public java.lang.String getOriginService() {
    return originService;
  }

  /**
   * Sets the value of the 'originService' field.
   * @param value the value to set.
   */
  public void setOriginService(java.lang.String value) {
    this.originService = value;
  }

  /**
   * Gets the value of the 'destinationService' field.
   * @return The value of the 'destinationService' field.
   */
  public java.lang.String getDestinationService() {
    return destinationService;
  }

  /**
   * Sets the value of the 'destinationService' field.
   * @param value the value to set.
   */
  public void setDestinationService(java.lang.String value) {
    this.destinationService = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Creates a new AvroItemSpringCloudBus RecordBuilder.
   * @return A new AvroItemSpringCloudBus RecordBuilder
   */
  public static demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder newBuilder() {
    return new demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder();
  }

  /**
   * Creates a new AvroItemSpringCloudBus RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroItemSpringCloudBus RecordBuilder
   */
  public static demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder newBuilder(demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder other) {
    return new demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder(other);
  }

  /**
   * Creates a new AvroItemSpringCloudBus RecordBuilder by copying an existing AvroItemSpringCloudBus instance.
   * @param other The existing instance to copy.
   * @return A new AvroItemSpringCloudBus RecordBuilder
   */
  public static demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder newBuilder(demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus other) {
    return new demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder(other);
  }

  /**
   * RecordBuilder for AvroItemSpringCloudBus instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroItemSpringCloudBus>
    implements org.apache.avro.data.RecordBuilder<AvroItemSpringCloudBus> {

    private java.lang.String type;
    private long timestamp;
    private java.lang.String originService;
    private java.lang.String destinationService;
    private java.lang.String id;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.originService)) {
        this.originService = data().deepCopy(fields()[2].schema(), other.originService);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.destinationService)) {
        this.destinationService = data().deepCopy(fields()[3].schema(), other.destinationService);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.id)) {
        this.id = data().deepCopy(fields()[4].schema(), other.id);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroItemSpringCloudBus instance
     * @param other The existing instance to copy.
     */
    private Builder(demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.originService)) {
        this.originService = data().deepCopy(fields()[2].schema(), other.originService);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.destinationService)) {
        this.destinationService = data().deepCopy(fields()[3].schema(), other.destinationService);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.id)) {
        this.id = data().deepCopy(fields()[4].schema(), other.id);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.String getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder setType(java.lang.String value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder setTimestamp(long value) {
      validate(fields()[1], value);
      this.timestamp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder clearTimestamp() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'originService' field.
      * @return The value.
      */
    public java.lang.String getOriginService() {
      return originService;
    }

    /**
      * Sets the value of the 'originService' field.
      * @param value The value of 'originService'.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder setOriginService(java.lang.String value) {
      validate(fields()[2], value);
      this.originService = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'originService' field has been set.
      * @return True if the 'originService' field has been set, false otherwise.
      */
    public boolean hasOriginService() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'originService' field.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder clearOriginService() {
      originService = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'destinationService' field.
      * @return The value.
      */
    public java.lang.String getDestinationService() {
      return destinationService;
    }

    /**
      * Sets the value of the 'destinationService' field.
      * @param value The value of 'destinationService'.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder setDestinationService(java.lang.String value) {
      validate(fields()[3], value);
      this.destinationService = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'destinationService' field has been set.
      * @return True if the 'destinationService' field has been set, false otherwise.
      */
    public boolean hasDestinationService() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'destinationService' field.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder clearDestinationService() {
      destinationService = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder setId(java.lang.String value) {
      validate(fields()[4], value);
      this.id = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public demo.api.codec.kafka.events.serialization.AvroItemSpringCloudBus.Builder clearId() {
      id = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroItemSpringCloudBus build() {
      try {
        AvroItemSpringCloudBus record = new AvroItemSpringCloudBus();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.String) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.originService = fieldSetFlags()[2] ? this.originService : (java.lang.String) defaultValue(fields()[2]);
        record.destinationService = fieldSetFlags()[3] ? this.destinationService : (java.lang.String) defaultValue(fields()[3]);
        record.id = fieldSetFlags()[4] ? this.id : (java.lang.String) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroItemSpringCloudBus>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroItemSpringCloudBus>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroItemSpringCloudBus>
    READER$ = (org.apache.avro.io.DatumReader<AvroItemSpringCloudBus>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
