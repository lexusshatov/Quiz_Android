package com.mouse.quizandroid.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.mouse.quizandroid.data.Answer
import com.mouse.quizandroid.data.Question
import com.mouse.quizandroid.ui.theme.QuizAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    QuestionScreen(question = testQuestion)
                }
            }
        }
    }
}

private val testAnswer1 = Answer(
    answer = "Yes!",
    isCorrect = true
)

private val testAnswer2 = Answer(
    answer = "No",
    isCorrect = false
)

private val testQuestion = Question(
    question = "Android is good?",
    answers = listOf(testAnswer1, testAnswer2)
)
