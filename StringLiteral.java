/* Generated By:JJTree: Do not edit this line. StringLiteral.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class StringLiteral extends SimpleNode {
  public StringLiteral(int id) {
    super(id);
  }

  public StringLiteral(JavaParser1_7 p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParser1_7Visitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=12814f38c4057616d2b445858114f2eb (do not edit this line) */