/* Generated By:JJTree: Do not edit this line. QualifiedIdentifier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class QualifiedIdentifier extends SimpleNode {
  public QualifiedIdentifier(int id) {
    super(id);
  }

  public QualifiedIdentifier(JavaParser1_7 p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParser1_7Visitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7238c2e4dbdbd47057221dfaef4b86bc (do not edit this line) */
