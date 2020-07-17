package com.example.quizapp

import com.example.quizapp.R.drawable.*

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS :String= "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            id = 1,
            question = "What country does this flag belongs to?",
            image = ic_argentina,
            optionOne = "Argentina",
            optionTwo = "Austria",
            optionThree = "Japan",
            optionFour = "Kuwait",
            correctAnswer = 1
        )

        questionList.add(que1)

        val que2 = Question(
            id = 2,
            question = "What country does this flag belongs to?",
            image = ic_cuba,
            optionOne = "Argentina",
            optionTwo = "Cuba",
            optionThree = "Japan",
            optionFour = "Kuwait",
            correctAnswer = 2
        )

        questionList.add(que2)

        val que3 = Question(
            id = 3,
            question = "What country does this flag belongs to?",
            image = ic_spain,
            optionOne = "Argentina",
            optionTwo = "Cuba",
            optionThree = "Spain",
            optionFour = "Kuwait",
            correctAnswer = 3
        )
        questionList.add(que3)

        return questionList
    }
}