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
	 * Visit a parse tree produced by {@link salParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(salParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(salParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(salParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(salParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(salParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(salParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(salParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#algorithmCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmCall(salParser.AlgorithmCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(salParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(salParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(salParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(salParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(salParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(salParser.ValueContext ctx);
}