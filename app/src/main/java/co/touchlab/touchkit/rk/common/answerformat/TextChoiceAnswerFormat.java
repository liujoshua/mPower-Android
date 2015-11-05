package co.touchlab.touchkit.rk.common.answerformat;

import co.touchlab.touchkit.rk.common.helpers.TextChoice;

public class TextChoiceAnswerFormat extends AnswerFormat
{

    private AnswerFormat.ChoiceAnswerStyle answerStyle;
    private TextChoice[] textChoices;

    public TextChoiceAnswerFormat(AnswerFormat.ChoiceAnswerStyle answerStyle, TextChoice[] textChoices)
    {
        this.answerStyle = answerStyle;
        this.textChoices = textChoices;
    }

    @Override
    public QuestionType getQuestionType()
    {
        // TODO not sure what the point of question type is since answer style already has this distinction
        return answerStyle == ChoiceAnswerStyle.MultipleChoice ? QuestionType.MultipleChoice : QuestionType.SingleChoice;
    }

    public TextChoice[] getTextChoices()
    {
        return textChoices;
    }
}
