// automatically generated by the FlatBuffers compiler, do not modify

package ppx;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")public final class SampleResult extends Table {
  public static SampleResult getRootAsSampleResult(ByteBuffer _bb) { return getRootAsSampleResult(_bb, new SampleResult()); }
  public static SampleResult getRootAsSampleResult(ByteBuffer _bb, SampleResult obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public SampleResult __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public Tensor result() { return result(new Tensor()); }
  public Tensor result(Tensor obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createSampleResult(FlatBufferBuilder builder,
      int resultOffset) {
    builder.startObject(1);
    SampleResult.addResult(builder, resultOffset);
    return SampleResult.endSampleResult(builder);
  }

  public static void startSampleResult(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addResult(FlatBufferBuilder builder, int resultOffset) { builder.addOffset(0, resultOffset, 0); }
  public static int endSampleResult(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

