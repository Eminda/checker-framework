import checkers.interning.quals.Interned;

class OverrideInterned {

  // This code is extracted from FreePastry

  @Interned class NodeHandle { }

  public interface TransportLayer<IDENTIFIER> {
    public void sendMessage(IDENTIFIER i);
  }

  public class CommonAPITransportLayerImpl<IDENTIFIER extends NodeHandle>
    implements TransportLayer<IDENTIFIER>
  {
    public void sendMessage(IDENTIFIER i) { }
  }

  interface MessageReceipt {
    public NodeHandle getHint();
  }

  void useAnonymousClass() {
    MessageReceipt ret = new MessageReceipt(){
      public NodeHandle getHint() {
        return null;
      }
    };
  }

  // This code is from Daikon

  public abstract class TwoSequenceString {
    public abstract Object check_modified1(/*@Interned*/ String /*@Interned*/ [] v1);
    public abstract Object check_modified1(String /*@Interned*/ [] v1);
  }

  public class PairwiseStringEqual extends TwoSequenceString {
    public Object check_modified1(String /*@Interned*/ [] a1) {
      return new Object();
    }
    public Object check_modified2(Interned*/ String /*@Interned*/ [] a1) {
      return new Object();
    }
  }  

}

