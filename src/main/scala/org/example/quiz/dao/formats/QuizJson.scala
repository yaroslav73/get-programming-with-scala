package org.example.quiz.dao.formats

import io.circe._
import io.circe.generic.semiauto._
import org.example.quiz.dao.domain.Quiz
import org.example.quiz.dao.domain.Quiz.QuizQuestion

object QuizJson {
  import AnswerJson._

  implicit val quizQuestionEncoder: Encoder[QuizQuestion] = deriveEncoder[QuizQuestion]
  implicit val quizQuestionDecoder: Decoder[QuizQuestion] = deriveDecoder[QuizQuestion]

  implicit val quizEncoder: Encoder[Quiz] = deriveEncoder[Quiz]
  implicit val quizDecoder: Decoder[Quiz] = deriveDecoder[Quiz]
}
