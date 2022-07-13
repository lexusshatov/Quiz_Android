package com.mouse.quizandroid.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mouse.quizandroid.data.Answer
import com.mouse.quizandroid.data.Question

@Composable
fun QuestionScreen(question: Question) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = question.question
        )
        Spacer(modifier = Modifier.height(15.dp))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            items(question.answers) { answer ->
                AnswerCard(answer = answer)
            }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AnswerCard(answer: Answer) {
    var colorBorder by remember {
        mutableStateOf(Color.Blue)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        border = BorderStroke(3.dp, colorBorder),
        shape = RoundedCornerShape(10.dp),
        onClick = { colorBorder = Color.Green }
    ) {
        Text(
            modifier = Modifier.padding(10.dp),
            text = answer.answer,
            textAlign = TextAlign.Center
        )
    }
}
