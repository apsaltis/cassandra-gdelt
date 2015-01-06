// Generated by Cap'n Proto compiler, DO NOT EDIT
// source: column_storage.capnp

package org.velvia;

public final class CapnColumn {
  public static class NaMask {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)1);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return NaMask.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public Which which() {
        switch(_getShortField(0)) {
          case 0 : return Which.ALL_ZEROES;
          case 1 : return Which.SIMPLE_BIT_MASK;
          case 2 : return Which.ALL_ONES;
          default: return Which._NOT_IN_SCHEMA;
        }
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final boolean isAllZeroes() {
        return which() == NaMask.Which.ALL_ZEROES;
      }
      public final org.capnproto.Void getAllZeroes() {
        assert which() == NaMask.Which.ALL_ZEROES:
                    "Must check which() before get()ing a union member.";
        return org.capnproto.Void.VOID;
      }
      public final void setAllZeroes(org.capnproto.Void value) {
        _setShortField(0, (short)NaMask.Which.ALL_ZEROES.ordinal());
      }

      public final boolean isSimpleBitMask() {
        return which() == NaMask.Which.SIMPLE_BIT_MASK;
      }
      public final boolean hasSimpleBitMask() {
        return !_pointerFieldIsNull(0);
      }
      public final org.capnproto.PrimitiveList.Boolean.Builder getSimpleBitMask() {
        return _getPointerField(org.capnproto.PrimitiveList.Boolean.factory, 0, null, 0);
      }
      public final void setSimpleBitMask(org.capnproto.PrimitiveList.Boolean.Reader value) {
        _setPointerField(org.capnproto.PrimitiveList.Boolean.factory, 0, value);
      }
      public final org.capnproto.PrimitiveList.Boolean.Builder initSimpleBitMask(int size) {
        return _initPointerField(org.capnproto.PrimitiveList.Boolean.factory, 0, size);
      }
      public final boolean isAllOnes() {
        return which() == NaMask.Which.ALL_ONES;
      }
      public final org.capnproto.Void getAllOnes() {
        assert which() == NaMask.Which.ALL_ONES:
                    "Must check which() before get()ing a union member.";
        return org.capnproto.Void.VOID;
      }
      public final void setAllOnes(org.capnproto.Void value) {
        _setShortField(0, (short)NaMask.Which.ALL_ONES.ordinal());
      }

    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public Which which() {
        switch(_getShortField(0)) {
          case 0 : return Which.ALL_ZEROES;
          case 1 : return Which.SIMPLE_BIT_MASK;
          case 2 : return Which.ALL_ONES;
          default: return Which._NOT_IN_SCHEMA;
        }
      }
      public final boolean isAllZeroes() {
        return which() == NaMask.Which.ALL_ZEROES;
      }
      public final org.capnproto.Void getAllZeroes() {
        assert which() == NaMask.Which.ALL_ZEROES:
                    "Must check which() before get()ing a union member.";
        return org.capnproto.Void.VOID;
      }

      public final boolean isSimpleBitMask() {
        return which() == NaMask.Which.SIMPLE_BIT_MASK;
      }
      public final boolean hasSimpleBitMask() {
        return !_pointerFieldIsNull(0);
      }
      public final org.capnproto.PrimitiveList.Boolean.Reader getSimpleBitMask() {
        return _getPointerField(org.capnproto.PrimitiveList.Boolean.factory, 0, null, 0);
      }

      public final boolean isAllOnes() {
        return which() == NaMask.Which.ALL_ONES;
      }
      public final org.capnproto.Void getAllOnes() {
        assert which() == NaMask.Which.ALL_ONES:
                    "Must check which() before get()ing a union member.";
        return org.capnproto.Void.VOID;
      }

    }

    public enum Which {
      ALL_ZEROES,
      SIMPLE_BIT_MASK,
      ALL_ONES,
      _NOT_IN_SCHEMA,
    }
  }


  public static class SimpleColumn {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)2);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return SimpleColumn.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final CapnColumn.NaMask.Builder getNaMask() {
        return _getPointerField(CapnColumn.NaMask.factory, 0, null, 0);
      }
      public final void setNaMask(CapnColumn.NaMask.Reader value) {
        _setPointerField(CapnColumn.NaMask.factory,0, value);
      }
      public final CapnColumn.NaMask.Builder initNaMask() {
        return _initPointerField(CapnColumn.NaMask.factory,0, 0);
      }
      public final Vector.Builder getVector() {
        return new SimpleColumn.Vector.Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final Vector.Builder initVector() {
        _setShortField(0,(short)0);
        _clearPointerField(1);
  return new SimpleColumn.Vector.Builder(segment, data, pointers, dataSize, pointerCount);
      }

    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public boolean hasNaMask() {
        return !_pointerFieldIsNull(0);
      }
      public CapnColumn.NaMask.Reader getNaMask() {
        return _getPointerField(CapnColumn.NaMask.factory,0,null, 0);
      }

      public Vector.Reader getVector() {
        return new SimpleColumn.Vector.Reader(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

    }

    public static class Vector {
      public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)2);
      public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
        public Factory() {
        }
        public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
          return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
        }
        public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
          return new Builder(segment, data, pointers, dataSize, pointerCount);
        }
        public final org.capnproto.StructSize structSize() {
          return SimpleColumn.Vector.STRUCT_SIZE;
        }
        public final Reader asReader(Builder builder) {
          return builder.asReader();
        }
      }
      public static final Factory factory = new Factory();
      public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
        new org.capnproto.StructList.Factory<Builder, Reader>(factory);
      public static final class Builder extends org.capnproto.StructBuilder {
        Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
          super(segment, data, pointers, dataSize, pointerCount);
        }
        public Which which() {
          switch(_getShortField(0)) {
            case 0 : return Which.INT_VEC;
            case 1 : return Which.SHORT_VEC;
            case 2 : return Which.BYTE_VEC;
            default: return Which._NOT_IN_SCHEMA;
          }
        }
        public final Reader asReader() {
          return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
        }
        public final boolean isIntVec() {
          return which() == SimpleColumn.Vector.Which.INT_VEC;
        }
        public final boolean hasIntVec() {
          return !_pointerFieldIsNull(1);
        }
        public final org.capnproto.PrimitiveList.Int.Builder getIntVec() {
          return _getPointerField(org.capnproto.PrimitiveList.Int.factory, 1, null, 0);
        }
        public final void setIntVec(org.capnproto.PrimitiveList.Int.Reader value) {
          _setPointerField(org.capnproto.PrimitiveList.Int.factory, 1, value);
        }
        public final org.capnproto.PrimitiveList.Int.Builder initIntVec(int size) {
          return _initPointerField(org.capnproto.PrimitiveList.Int.factory, 1, size);
        }
        public final boolean isShortVec() {
          return which() == SimpleColumn.Vector.Which.SHORT_VEC;
        }
        public final boolean hasShortVec() {
          return !_pointerFieldIsNull(1);
        }
        public final org.capnproto.PrimitiveList.Short.Builder getShortVec() {
          return _getPointerField(org.capnproto.PrimitiveList.Short.factory, 1, null, 0);
        }
        public final void setShortVec(org.capnproto.PrimitiveList.Short.Reader value) {
          _setPointerField(org.capnproto.PrimitiveList.Short.factory, 1, value);
        }
        public final org.capnproto.PrimitiveList.Short.Builder initShortVec(int size) {
          return _initPointerField(org.capnproto.PrimitiveList.Short.factory, 1, size);
        }
        public final boolean isByteVec() {
          return which() == SimpleColumn.Vector.Which.BYTE_VEC;
        }
        public final boolean hasByteVec() {
          return !_pointerFieldIsNull(1);
        }
        public final org.capnproto.PrimitiveList.Byte.Builder getByteVec() {
          return _getPointerField(org.capnproto.PrimitiveList.Byte.factory, 1, null, 0);
        }
        public final void setByteVec(org.capnproto.PrimitiveList.Byte.Reader value) {
          _setPointerField(org.capnproto.PrimitiveList.Byte.factory, 1, value);
        }
        public final org.capnproto.PrimitiveList.Byte.Builder initByteVec(int size) {
          return _initPointerField(org.capnproto.PrimitiveList.Byte.factory, 1, size);
        }
      }

      public static final class Reader extends org.capnproto.StructReader {
        Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
          super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
        }

        public Which which() {
          switch(_getShortField(0)) {
            case 0 : return Which.INT_VEC;
            case 1 : return Which.SHORT_VEC;
            case 2 : return Which.BYTE_VEC;
            default: return Which._NOT_IN_SCHEMA;
          }
        }
        public final boolean isIntVec() {
          return which() == SimpleColumn.Vector.Which.INT_VEC;
        }
        public final boolean hasIntVec() {
          return !_pointerFieldIsNull(1);
        }
        public final org.capnproto.PrimitiveList.Int.Reader getIntVec() {
          return _getPointerField(org.capnproto.PrimitiveList.Int.factory, 1, null, 0);
        }

        public final boolean isShortVec() {
          return which() == SimpleColumn.Vector.Which.SHORT_VEC;
        }
        public final boolean hasShortVec() {
          return !_pointerFieldIsNull(1);
        }
        public final org.capnproto.PrimitiveList.Short.Reader getShortVec() {
          return _getPointerField(org.capnproto.PrimitiveList.Short.factory, 1, null, 0);
        }

        public final boolean isByteVec() {
          return which() == SimpleColumn.Vector.Which.BYTE_VEC;
        }
        public final boolean hasByteVec() {
          return !_pointerFieldIsNull(1);
        }
        public final org.capnproto.PrimitiveList.Byte.Reader getByteVec() {
          return _getPointerField(org.capnproto.PrimitiveList.Byte.factory, 1, null, 0);
        }

      }

      public enum Which {
        INT_VEC,
        SHORT_VEC,
        BYTE_VEC,
        _NOT_IN_SCHEMA,
      }
    }


  }


  public static class Column {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)1);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return Column.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public Which which() {
        switch(_getShortField(0)) {
          case 0 : return Which.SIMPLE_COLUMN;
          case 1 : return Which.DICT_STR_COLUMN;
          default: return Which._NOT_IN_SCHEMA;
        }
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final boolean isSimpleColumn() {
        return which() == Column.Which.SIMPLE_COLUMN;
      }
      public final CapnColumn.SimpleColumn.Builder getSimpleColumn() {
        assert which() == Column.Which.SIMPLE_COLUMN:
                    "Must check which() before get()ing a union member.";
        return _getPointerField(CapnColumn.SimpleColumn.factory, 0, null, 0);
      }
      public final void setSimpleColumn(CapnColumn.SimpleColumn.Reader value) {
        _setShortField(0, (short)Column.Which.SIMPLE_COLUMN.ordinal());
        _setPointerField(CapnColumn.SimpleColumn.factory,0, value);
      }
      public final CapnColumn.SimpleColumn.Builder initSimpleColumn() {
        _setShortField(0, (short)Column.Which.SIMPLE_COLUMN.ordinal());
        return _initPointerField(CapnColumn.SimpleColumn.factory,0, 0);
      }
      public final boolean isDictStrColumn() {
        return which() == Column.Which.DICT_STR_COLUMN;
      }
      public final org.capnproto.Void getDictStrColumn() {
        assert which() == Column.Which.DICT_STR_COLUMN:
                    "Must check which() before get()ing a union member.";
        return org.capnproto.Void.VOID;
      }
      public final void setDictStrColumn(org.capnproto.Void value) {
        _setShortField(0, (short)Column.Which.DICT_STR_COLUMN.ordinal());
      }

    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public Which which() {
        switch(_getShortField(0)) {
          case 0 : return Which.SIMPLE_COLUMN;
          case 1 : return Which.DICT_STR_COLUMN;
          default: return Which._NOT_IN_SCHEMA;
        }
      }
      public final boolean isSimpleColumn() {
        return which() == Column.Which.SIMPLE_COLUMN;
      }
      public boolean hasSimpleColumn() {
        return !_pointerFieldIsNull(0);
      }
      public CapnColumn.SimpleColumn.Reader getSimpleColumn() {
        assert which() == Column.Which.SIMPLE_COLUMN:
                    "Must check which() before get()ing a union member.";
        return _getPointerField(CapnColumn.SimpleColumn.factory,0,null, 0);
      }

      public final boolean isDictStrColumn() {
        return which() == Column.Which.DICT_STR_COLUMN;
      }
      public final org.capnproto.Void getDictStrColumn() {
        assert which() == Column.Which.DICT_STR_COLUMN:
                    "Must check which() before get()ing a union member.";
        return org.capnproto.Void.VOID;
      }

    }

    public enum Which {
      SIMPLE_COLUMN,
      DICT_STR_COLUMN,
      _NOT_IN_SCHEMA,
    }
  }



public static final class Schemas {
public static final org.capnproto.SegmentReader b_bb77c88b0479fbec =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u00ec\u00fb\u0079\u0004\u008b\u00c8\u0077\u00bb" +
   "\u0015\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\r\u00c5\u00ff\u0066\u00cc\u0086\u00ee\u00c0" +
   "\u0001\u0000\u0007\u0000\u0000\u0000\u0003\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00e2\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u00af\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0063\u006f\u006c\u0075\u006d\u006e\u005f\u0073" +
   "\u0074\u006f\u0072\u0061\u0067\u0065\u002e\u0063" +
   "\u0061\u0070\u006e\u0070\u003a\u004e\u0061\u004d" +
   "\u0061\u0073\u006b\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u000c\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0045\u0000\u0000\u0000\u0052\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0044\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0050\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u00fe\u00ff\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u004d\u0000\u0000\u0000\u0072\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u004c\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0068\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0002\u0000\u00fd\u00ff\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0065\u0000\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0060\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u006c\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0061\u006c\u006c\u005a\u0065\u0072\u006f\u0065" +
   "\u0073\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0073\u0069\u006d\u0070\u006c\u0065\u0042\u0069" +
   "\u0074\u004d\u0061\u0073\u006b\u0000\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0061\u006c\u006c\u004f\u006e\u0065\u0073\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_fdeb853e5e48797e =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u007e\u0079\u0048\u005e\u003e\u0085\u00eb\u00fd" +
   "\u0015\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\r\u00c5\u00ff\u0066\u00cc\u0086\u00ee\u00c0" +
   "\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u0012\u0001\u0000\u0000" +
   "\u0025\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0077\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0063\u006f\u006c\u0075\u006d\u006e\u005f\u0073" +
   "\u0074\u006f\u0072\u0061\u0067\u0065\u002e\u0063" +
   "\u0061\u0070\u006e\u0070\u003a\u0053\u0069\u006d" +
   "\u0070\u006c\u0065\u0043\u006f\u006c\u0075\u006d" +
   "\u006e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0008\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0029\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0024\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0030\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0045\u0094\u0090\u00d8\"\u0016\u0012\u00cc" +
   "\u002d\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0061\u004d\u0061\u0073\u006b\u0000\u0000" +
   "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u00ec\u00fb\u0079\u0004\u008b\u00c8\u0077\u00bb" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0076\u0065\u0063\u0074\u006f\u0072\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_cc121622d8909445 =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u0045\u0094\u0090\u00d8\"\u0016\u0012\u00cc" +
   "\"\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u007e\u0079\u0048\u005e\u003e\u0085\u00eb\u00fd" +
   "\u0002\u0000\u0007\u0000\u0001\u0000\u0003\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u004a\u0001\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u00af\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0063\u006f\u006c\u0075\u006d\u006e\u005f\u0073" +
   "\u0074\u006f\u0072\u0061\u0067\u0065\u002e\u0063" +
   "\u0061\u0070\u006e\u0070\u003a\u0053\u0069\u006d" +
   "\u0070\u006c\u0065\u0043\u006f\u006c\u0075\u006d" +
   "\u006e\u002e\u0076\u0065\u0063\u0074\u006f\u0072" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u00ff\u00ff\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0045\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0040\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\\\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0059\u0000\u0000\u0000\u004a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0058\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0074\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0002\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0071\u0000\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006c\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0088\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0069\u006e\u0074\u0056\u0065\u0063\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0073\u0068\u006f\u0072\u0074\u0056\u0065\u0063" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0062\u0079\u0074\u0065\u0056\u0065\u0063\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_e96f0365c8253c22 =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\"\u003c\u0025\u00c8\u0065\u0003\u006f\u00e9" +
   "\u0015\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\r\u00c5\u00ff\u0066\u00cc\u0086\u00ee\u00c0" +
   "\u0001\u0000\u0007\u0000\u0000\u0000\u0002\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00e2\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u0077\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0063\u006f\u006c\u0075\u006d\u006e\u005f\u0073" +
   "\u0074\u006f\u0072\u0061\u0067\u0065\u002e\u0063" +
   "\u0061\u0070\u006e\u0070\u003a\u0043\u006f\u006c" +
   "\u0075\u006d\u006e\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0008\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0029\u0000\u0000\u0000\u006a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0028\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0034\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u00fe\u00ff\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0031\u0000\u0000\u0000\u0072\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0030\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u003c\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0073\u0069\u006d\u0070\u006c\u0065\u0043\u006f" +
   "\u006c\u0075\u006d\u006e\u0000\u0000\u0000\u0000" +
   "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u007e\u0079\u0048\u005e\u003e\u0085\u00eb\u00fd" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0064\u0069\u0063\u0074\u0053\u0074\u0072\u0043" +
   "\u006f\u006c\u0075\u006d\u006e\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
}
}

