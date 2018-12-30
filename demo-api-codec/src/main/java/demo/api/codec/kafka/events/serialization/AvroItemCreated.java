/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package demo.api.codec.kafka.events.serialization;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroItemCreated extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -1273740320282567370L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroItemCreated\",\"namespace\":\"demo.api.codec.kafka.events.serialization\",\"fields\":[{\"name\":\"itemId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<AvroItemCreated> ENCODER =
            new BinaryMessageEncoder<AvroItemCreated>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<AvroItemCreated> DECODER =
            new BinaryMessageDecoder<AvroItemCreated>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     */
    public static BinaryMessageDecoder<AvroItemCreated> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     */
    public static BinaryMessageDecoder<AvroItemCreated> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<AvroItemCreated>(MODEL$, SCHEMA$, resolver);
    }

    /** Serializes this AvroItemCreated to a ByteBuffer. */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /** Deserializes a AvroItemCreated from a ByteBuffer. */
    public static AvroItemCreated fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    @Deprecated
    public java.lang.String itemId;
    @Deprecated
    public java.lang.String description;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public AvroItemCreated() {
    }

    /**
     * All-args constructor.
     * @param itemId The new value for itemId
     * @param description The new value for description
     */
    public AvroItemCreated(java.lang.String itemId, java.lang.String description) {
        this.itemId = itemId;
        this.description = description;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return itemId;
            case 1:
                return description;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                itemId = (java.lang.String) value$;
                break;
            case 1:
                description = (java.lang.String) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'itemId' field.
     * @return The value of the 'itemId' field.
     */
    public java.lang.String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the 'itemId' field.
     * @param value the value to set.
     */
    public void setItemId(java.lang.String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the 'description' field.
     * @return The value of the 'description' field.
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the 'description' field.
     * @param value the value to set.
     */
    public void setDescription(java.lang.String value) {
        this.description = value;
    }

    /**
     * Creates a new AvroItemCreated RecordBuilder.
     * @return A new AvroItemCreated RecordBuilder
     */
    public static demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder newBuilder() {
        return new demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder();
    }

    /**
     * Creates a new AvroItemCreated RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new AvroItemCreated RecordBuilder
     */
    public static demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder newBuilder(demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder other) {
        return new demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder(other);
    }

    /**
     * Creates a new AvroItemCreated RecordBuilder by copying an existing AvroItemCreated instance.
     * @param other The existing instance to copy.
     * @return A new AvroItemCreated RecordBuilder
     */
    public static demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder newBuilder(demo.api.codec.kafka.events.serialization.AvroItemCreated other) {
        return new demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder(other);
    }

    /**
     * RecordBuilder for AvroItemCreated instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroItemCreated>
            implements org.apache.avro.data.RecordBuilder<AvroItemCreated> {

        private java.lang.String itemId;
        private java.lang.String description;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.itemId)) {
                this.itemId = data().deepCopy(fields()[0].schema(), other.itemId);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.description)) {
                this.description = data().deepCopy(fields()[1].schema(), other.description);
                fieldSetFlags()[1] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing AvroItemCreated instance
         * @param other The existing instance to copy.
         */
        private Builder(demo.api.codec.kafka.events.serialization.AvroItemCreated other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.itemId)) {
                this.itemId = data().deepCopy(fields()[0].schema(), other.itemId);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.description)) {
                this.description = data().deepCopy(fields()[1].schema(), other.description);
                fieldSetFlags()[1] = true;
            }
        }

        /**
         * Gets the value of the 'itemId' field.
         * @return The value.
         */
        public java.lang.String getItemId() {
            return itemId;
        }

        /**
         * Sets the value of the 'itemId' field.
         * @param value The value of 'itemId'.
         * @return This builder.
         */
        public demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder setItemId(java.lang.String value) {
            validate(fields()[0], value);
            this.itemId = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'itemId' field has been set.
         * @return True if the 'itemId' field has been set, false otherwise.
         */
        public boolean hasItemId() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'itemId' field.
         * @return This builder.
         */
        public demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder clearItemId() {
            itemId = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'description' field.
         * @return The value.
         */
        public java.lang.String getDescription() {
            return description;
        }

        /**
         * Sets the value of the 'description' field.
         * @param value The value of 'description'.
         * @return This builder.
         */
        public demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder setDescription(java.lang.String value) {
            validate(fields()[1], value);
            this.description = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'description' field has been set.
         * @return True if the 'description' field has been set, false otherwise.
         */
        public boolean hasDescription() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'description' field.
         * @return This builder.
         */
        public demo.api.codec.kafka.events.serialization.AvroItemCreated.Builder clearDescription() {
            description = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public AvroItemCreated build() {
            try {
                AvroItemCreated record = new AvroItemCreated();
                record.itemId = fieldSetFlags()[0] ? this.itemId : (java.lang.String) defaultValue(fields()[0]);
                record.description = fieldSetFlags()[1] ? this.description : (java.lang.String) defaultValue(fields()[1]);
                return record;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<AvroItemCreated>
            WRITER$ = (org.apache.avro.io.DatumWriter<AvroItemCreated>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<AvroItemCreated>
            READER$ = (org.apache.avro.io.DatumReader<AvroItemCreated>) MODEL$.createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

}
