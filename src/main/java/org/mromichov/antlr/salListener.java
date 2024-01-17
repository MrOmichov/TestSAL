// Generated from C:/TestSAL/src/main/java/org/mromichov/antlr/sal.g4 by ANTLR 4.13.1
package org.mromichov.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link salParser}.
 */
public interface salListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link salParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(salParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(salParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm(salParser.AlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm(salParser.AlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#algorithmDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDeclaration(salParser.AlgorithmDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#algorithmDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDeclaration(salParser.AlgorithmDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#algorithmName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmName(salParser.AlgorithmNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#algorithmName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmName(salParser.AlgorithmNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#algorithmArgument}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmArgument(salParser.AlgorithmArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#algorithmArgument}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmArgument(salParser.AlgorithmArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(salParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(salParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(salParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(salParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(salParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(salParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#algorithmCall}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmCall(salParser.AlgorithmCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#algorithmCall}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmCall(salParser.AlgorithmCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(salParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(salParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADD(salParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADD(salParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUBSTRACT}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSUBSTRACT(salParser.SUBSTRACTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUBSTRACT}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSUBSTRACT(salParser.SUBSTRACTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCALL}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFUNCALL(salParser.FUNCALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCALL}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFUNCALL(salParser.FUNCALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTIPLY}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMULTIPLY(salParser.MULTIPLYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTIPLY}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMULTIPLY(salParser.MULTIPLYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VALUE}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVALUE(salParser.VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VALUE}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVALUE(salParser.VALUEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARREFERENCE}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVARREFERENCE(salParser.VARREFERENCEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARREFERENCE}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVARREFERENCE(salParser.VARREFERENCEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIVIDE}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDIVIDE(salParser.DIVIDEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIVIDE}
	 * labeled alternative in {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDIVIDE(salParser.DIVIDEContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(salParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(salParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#varReference}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(salParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#varReference}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(salParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(salParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(salParser.ValueContext ctx);
}