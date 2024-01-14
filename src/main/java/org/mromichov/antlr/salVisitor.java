// Generated from D:/IdeaProjects/TestSAL/src/main/java/org/mromichov/antlr/sal.g4 by ANTLR 4.13.1
package org.mromichov.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link salParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface salVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link salParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(salParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#algorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithm(salParser.AlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#algorithmDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDeclaration(salParser.AlgorithmDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#algorithmName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmName(salParser.AlgorithmNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#algorithmArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmArgument(salParser.AlgorithmArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(salParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(salParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(salParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#algorithmCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmCall(salParser.AlgorithmCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(salParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(salParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(salParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#varReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(salParser.VarReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(salParser.ValueContext ctx);
}