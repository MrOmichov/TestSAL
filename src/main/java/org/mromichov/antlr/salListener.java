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
	 * Enter a parse tree produced by {@link salParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(salParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(salParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(salParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(salParser.PrintContext ctx);
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
	 * Enter a parse tree produced by {@link salParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(salParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(salParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(salParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(salParser.AtomContext ctx);
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