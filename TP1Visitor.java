/**
 * @author Yan Xu
 * 2015-01-16
 * This visitor give:
 * id, fileName, className, methodName, #if, #while, #break, #varLocal
 */


public class TP1Visitor implements JavaParser1_7Visitor {

    protected int numberOfId = 1;
    protected int numberOfIf;
    protected int numberOfWhile;
    protected int numberOfBreak;
    protected int numberOfVarLocal;

    public Object visit(CompilationUnit node, Object data){
        
        String fileName = data.toString();
 
        node.childrenAccept(this, fileName);

        return data;  
    }

    public Object visit(NormalClassDeclaration node, Object data){

        String className = "aClass";
        int i;
        for (i = 0; i < node.jjtGetNumChildren(); i++){
            Node childNode = node.jjtGetChild(i);
            if (childNode.toString() == "Identifier"){
                className = "aClass"; // need to change to the real class name
                break;
            }
        }
 
        node.childrenAccept(this, data.toString() + ", " + className);
 
        return data;  
    }

    public Object visit(ConstructorDecl node, Object data){
        
        String methodName = "aMethod";
        int i;
        for (i = 0; i < node.jjtGetNumChildren(); i++){
            Node childNode = node.jjtGetChild(i);
            if (childNode.toString() == "Identifier"){
                methodName = "aMethod"; // need to change to the real method name
                break;
            }
        }

        node.childrenAccept(this, data);

        String stringToPrint = 
            data.toString() + ", " + 
            methodName + ", #if:" +
            this.numberOfIf + ", #while:" +
            this.numberOfWhile + ", #break:" +
            this.numberOfBreak + ", #varLocal:" +
            this.numberOfVarLocal;

        System.out.println(stringToPrint);

        // return to 0
        this.numberOfIf = 0;
        this.numberOfWhile = 0;
        this.numberOfBreak = 0;
        this.numberOfVarLocal = 0;

        return data;  
    }

    public Object visit(IfStatement node, Object data){
 
        node.childrenAccept(this, data);

        this.numberOfIf += 1;
 
        return data;  
    }

    public Object visit(WhileStatement node, Object data){
 
        node.childrenAccept(this, data);

        this.numberOfWhile += 1;
 
        return data;  
    }

    public Object visit(BreakStatement node, Object data){
 
        node.childrenAccept(this, data);

        this.numberOfBreak += 1;
 
        return data;  
    }

    public Object visit(LocalVariableDeclarationStatement node, Object data){
 
        node.childrenAccept(this, data);

        this.numberOfVarLocal += 1;
 
        return data;  
    }

/*=========================Don't need to change after===========================================================*/

    public Object visit(SimpleNode node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;          
    }

    public Object visit(Identifier node, Object data){
 
        node.childrenAccept(this, data);
  
        return data;    
    }

    public Object visit(QualifiedIdentifier node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(QualifiedIdentifierList node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ImportDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Ellipsis node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(HasEllipsis node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(HasNotEllipsis node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(PossibleStaticModifier node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(HasStaticModifier node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(HasNotStaticModifier node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(TypeDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(EmptyInterfaceDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ClassOrInterfaceDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ModifierList node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ClassDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InterfaceDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(EnumDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(NormalInterfaceDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AnnotationTypeDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Type node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(BasicType node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ReferenceType node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(TypeArguments node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(TypeArgument node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(NonWildcardTypeArguments node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(TypeList node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(TypeArgumentsOrDiamond node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(NonWildcardTypeArgumentsOrDiamond node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(TypeParameters node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(TypeParameter node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Bound node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Modifier node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(KeywordModifier node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Annotations node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Annotation node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AnnotationElement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ElementValuePairs node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ElementValuePair node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ElementValue node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ElementValueArrayInitializer node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ElementValues node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ClassBody node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ClassBodyDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(StaticInitBlock node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(MemberDecl node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(VoidMethodDecl node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(MethodOrFieldDecl node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(MethodOrFieldRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(FieldDeclaratorsRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(MethodDeclaratorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(MethodBody node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(EmptyBody node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(VoidMethodDeclaratorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ConstructorDeclaratorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(GenericMethodOrConstructorDecl node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(GenericMethodOrConstructorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InterfaceBody node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InterfaceBodyDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(NonEmptyInterfaceDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InterfaceMemberDecl node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InterfaceMethodOrFieldDecl node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InterfaceMethodOrFieldRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ConstantDeclaratorsRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ConstantDeclaratorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ConstantDeclarator node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InterfaceMethodDeclaratorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(VoidInterfaceMethodDeclaratorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InterfaceGenericMethodDecl node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(FormalParameters node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(FormalParameterDecls node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(VariableModifier node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(FormalParameterDeclsRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(VariableDeclaratorId node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(VariableDeclarators node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(VariableDeclarator node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(VariableDeclaratorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(VariableInitializer node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ArrayInitializer node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Block node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(BlockStatements node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(BlockStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Statement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(EmptyStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(IdentifierStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(StatementExpression node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ElseStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(NoElseStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AssertStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(SwitchStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }


    public Object visit(DoStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ForStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(LabeledBreak node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(UnlabeledBreak node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ContinueStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(LabeledContinue node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(UnlabeledContinue node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ReturnStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ThrowStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(SynchronizedStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(TryStatement node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Catches node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(CatchClause node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(CatchType node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Finally node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ResourceSpecification node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Resources node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Resource node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(SwitchBlockStatementGroups node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(SwitchBlockStatementGroup node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(SwitchLabels node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(SwitchLabel node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(EnumConstantName node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ForControl node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ForVarControl node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ForVarControlRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ForVariableDeclaratorsRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ForInit node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ForUpdate node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Expression node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ExpressionRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AssignmentOperator node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Expression1 node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Expression1Rest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Expression2 node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Expression2Rest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InfixOp node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Expression3 node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(PrefixOp node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(PostfixOp node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Primary node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Literal node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(IntegerLiteral node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(FloatingPointLiteral node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(CharacterLiteral node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(StringLiteral node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(BooleanLiteral node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(NullLiteral node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ParExpression node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Arguments node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(SuperSuffix node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ExplicitGenericInvocationSuffix node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Creator node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(CreatedName node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ClassCreatorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ArrayCreatorRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(IdentifierSuffix node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(ExplicitGenericInvocation node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(InnerCreator node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(Selector node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(EnumBody node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(EnumConstants node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(EnumConstant node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(EnumBodyDeclarations node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AnnotationTypeBody node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AnnotationTypeElementDeclarations node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AnnotationTypeElementDeclaration node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AnnotationTypeElementRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AnnotationMethodOrConstantRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

    public Object visit(AnnotationMethodRest node, Object data){
 
        node.childrenAccept(this, data);
 
        return data;  
    }

}