/* Generated By:JJTree: Do not edit this line. VariableDeclaratorId.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class VariableDeclaratorId extends SimpleNode {
  public VariableDeclaratorId(int id) {
    super(id);
  }

  public VariableDeclaratorId(JavaParser1_7 p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParser1_7Visitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d916ce31cf6a9da226a0e2e0b90fceb7 (do not edit this line) */
