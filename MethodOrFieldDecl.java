/* Generated By:JJTree: Do not edit this line. MethodOrFieldDecl.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class MethodOrFieldDecl extends SimpleNode {
  public MethodOrFieldDecl(int id) {
    super(id);
  }

  public MethodOrFieldDecl(JavaParser1_7 p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParser1_7Visitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bedf2eb884dfe7cdae5531fef9bd35ac (do not edit this line) */
