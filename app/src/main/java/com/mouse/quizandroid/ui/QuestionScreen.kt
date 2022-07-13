package com.mouse.quizandroid.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.mouse.quizandroid.data.Answer
import com.mouse.quizandroid.data.Question

@Composable
fun QuestionScreen(question: Question) {
    Column {
        Text(text = question.question)
        question.answers.forEach { answer ->
            AnswerCard(answer = answer)
        }
    }
}


@Composable
fun AnswerCard(answer: Answer) {
    Card {
        Text(text = answer.answer)
    }
}
