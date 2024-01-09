package org.mromichov.antlr;// Generated from sal.g4 by ANTLR 4.13.1
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