/* Generated By:JJTree: Do not edit this line. OTraverseProjectionItem.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public class OTraverseProjectionItem extends SimpleNode {
  protected boolean         star = false;
  protected OBaseIdentifier base;
  protected OModifier       modifier;

  public OTraverseProjectionItem(int id) {
    super(id);
  }

  public OTraverseProjectionItem(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public void toString(Map<Object, Object> params, StringBuilder builder) {

    if (star) {
      builder.append("*");
      return;
    }

    base.toString(params, builder);
    if (modifier != null) {
      modifier.toString(params, builder);
    }
  }

}
/* JavaCC - OriginalChecksum=0c562254fd4d11266edc0504fd36fc99 (do not edit this line) */
