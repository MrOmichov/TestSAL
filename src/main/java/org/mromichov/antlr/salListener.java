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
	 * Enter a parse tree produced by {@link salParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(salParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(salParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(salParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(salParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(salParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(salParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(salParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(salParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(salParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(salParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(salParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(salParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(salParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(salParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#algorithmReturn}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmReturn(salParser.AlgorithmReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#algorithmReturn}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmReturn(salParser.AlgorithmReturnContext ctx);
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
	 * Enter a parse tree produced by {@link salParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(salParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(salParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(salParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(salParser.ArgumentContext ctx);
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
	 * Enter a parse tree produced by the {@code Algorithm_Call}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm_Call(salParser.Algorithm_CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Algorithm_Call}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm_Call(salParser.Algorithm_CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableReference}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(salParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableReference}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(salParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(salParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(salParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleNumber}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDoubleNumber(salParser.DoubleNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleNumber}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDoubleNumber(salParser.DoubleNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterString(salParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitString(salParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(salParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link salParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(salParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#termSign}.
	 * @param ctx the parse tree
	 */
	void enterTermSign(salParser.TermSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#termSign}.
	 * @param ctx the parse tree
	 */
	void exitTermSign(salParser.TermSignContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#atomSign}.
	 * @param ctx the parse tree
	 */
	void enterAtomSign(salParser.AtomSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#atomSign}.
	 * @param ctx the parse tree
	 */
	void exitAtomSign(salParser.AtomSignContext ctx);
	/**
	 * Enter a parse tree produced by {@link salParser#comparisonSign}.
	 * @param ctx the parse tree
	 */
	void enterComparisonSign(salParser.ComparisonSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link salParser#comparisonSign}.
	 * @param ctx the parse tree
	 */
	void exitComparisonSign(salParser.ComparisonSignContext ctx);
}