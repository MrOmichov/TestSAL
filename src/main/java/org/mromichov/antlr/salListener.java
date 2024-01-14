// Generated from D:/IdeaProjects/TestSAL/src/main/java/org/mromichov/antlr/sal.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(salParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(salParser.ExpressionContext ctx);
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