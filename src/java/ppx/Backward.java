// automatically generated by the FlatBuffers compiler, do not modify

package ppx;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")public final class Backward extends Table {
  public static Backward getRootAsBackward(ByteBuffer _bb) { return getRootAsBackward(_bb, new Backward()); }
  public static Backward getRootAsBackward(ByteBuffer _bb, Backward obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Backward __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public Tensor input() { return input(new Tensor()); }
  public Tensor input(Tensor obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Tensor gradOutput() { return gradOutput(new Tensor()); }
  public Tensor gradOutput(Tensor obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createBackward(FlatBufferBuilder builder,
      int nameOffset,
      int inputOffset,
      int grad_outputOffset) {
    builder.startObject(3);
    Backward.addGradOutput(builder, grad_outputOffset);
    Backward.addInput(builder, inputOffset);
    Backward.addName(builder, nameOffset);
    return Backward.endBackward(builder);
  }

  public static void startBackward(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addInput(FlatBufferBuilder builder, int inputOffset) { builder.addOffset(1, inputOffset, 0); }
  public static void addGradOutput(FlatBufferBuilder builder, int gradOutputOffset) { builder.addOffset(2, gradOutputOffset, 0); }
  public static int endBackward(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

