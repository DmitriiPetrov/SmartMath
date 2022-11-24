package com.android.petrov.dmitrii.smartmath

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_summa1.*

class FragmentSumma1 : Fragment() {

    var summa: Int = 0
    var variant1 = 0
    var variant2 = 0
    var variant3 = 0
    var variant4 = 0
    var variant5 = 0
    var variant6 = 0

    val questionsQuantity = 10
    var counter = 0
    var rightAnswers = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_summa1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewQuestions.text = "$questionsQuantity вопросов"
        buttonSumma.setOnClickListener {
            textViewQuestions.visibility = View.GONE
            counter = 0
            rightAnswers = 0
            summa()
            buttonSumma.visibility = View.GONE
        }

        textViewVar1.setOnClickListener {
            counter++
            imageView.visibility = View.VISIBLE
            if (variant1 == summa) {
                rightAnswers++
                textViewVar1.setTextColor(Color.GREEN)
                textViewVar2.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.RED)
                imageView.setImageResource(R.drawable.ic_ok)
            } else if (variant2 == summa) {
                textViewVar1.setTextColor(Color.RED)
                textViewVar2.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant3 == summa) {
                textViewVar1.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant4 == summa) {
                textViewVar1.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant4 == summa) {
                textViewVar1.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else {
                textViewVar1.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            }
            Handler().postDelayed(Runnable {
                summa()
            }, 2000)
        }

        textViewVar2.setOnClickListener {
            counter++
            imageView.visibility = View.VISIBLE
            if (variant2 == summa) {
                rightAnswers++
                textViewVar2.setTextColor(Color.GREEN)
                textViewVar1.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.RED)
                imageView.setImageResource(R.drawable.ic_ok)
            } else if (variant1 == summa) {
                textViewVar2.setTextColor(Color.RED)
                textViewVar1.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant3 == summa) {
                textViewVar2.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant4 == summa) {
                textViewVar2.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant5 == summa) {
                textViewVar2.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else {
                textViewVar2.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            }
            Handler().postDelayed(Runnable {
                summa()
            }, 2000)
        }

        textViewVar3.setOnClickListener {
            counter++
            imageView.visibility = View.VISIBLE
            if (variant3 == summa) {
                rightAnswers++
                textViewVar3.setTextColor(Color.GREEN)
                textViewVar1.setTextColor(Color.RED)
                textViewVar2.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.RED)
                imageView.setImageResource(R.drawable.ic_ok)
            } else if (variant1 == summa) {
                textViewVar3.setTextColor(Color.RED)
                textViewVar1.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant2 == summa) {
                textViewVar3.setTextColor(Color.RED)
                textViewVar2.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant4 == summa) {
                textViewVar3.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant5 == summa) {
                textViewVar3.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else {
                textViewVar3.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            }
            Handler().postDelayed(Runnable {
                summa()
            }, 2000)
        }

        textViewVar4.setOnClickListener {
            counter++
            imageView.visibility = View.VISIBLE
            if (variant4 == summa) {
                rightAnswers++
                textViewVar4.setTextColor(Color.GREEN)
                textViewVar1.setTextColor(Color.RED)
                textViewVar2.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.RED)
                imageView.setImageResource(R.drawable.ic_ok)
            } else if (variant1 == summa) {
                textViewVar4.setTextColor(Color.RED)
                textViewVar1.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant3 == summa) {
                textViewVar4.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant2 == summa) {
                textViewVar4.setTextColor(Color.RED)
                textViewVar2.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant5 == summa) {
                textViewVar4.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else {
                textViewVar4.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            }
            Handler().postDelayed(Runnable {
                summa()
            }, 2000)
        }

        textViewVar5.setOnClickListener {
            counter++
            imageView.visibility = View.VISIBLE
            if (variant5 == summa) {
                rightAnswers++
                textViewVar5.setTextColor(Color.GREEN)
                textViewVar1.setTextColor(Color.RED)
                textViewVar2.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.RED)
                imageView.setImageResource(R.drawable.ic_ok)
            } else if (variant1 == summa) {
                textViewVar5.setTextColor(Color.RED)
                textViewVar1.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant3 == summa) {
                textViewVar5.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant2 == summa) {
                textViewVar5.setTextColor(Color.RED)
                textViewVar2.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant4 == summa) {
                textViewVar5.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else {
                textViewVar5.setTextColor(Color.RED)
                textViewVar6.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            }

            Handler().postDelayed(Runnable {
                summa()
            }, 2000)
        }

        textViewVar6.setOnClickListener {
            counter++
            imageView.visibility = View.VISIBLE
            if (variant6 == summa) {
                rightAnswers++
                textViewVar6.setTextColor(Color.GREEN)
                textViewVar1.setTextColor(Color.RED)
                textViewVar2.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.RED)
                imageView.setImageResource(R.drawable.ic_ok)
            } else if (variant1 == summa) {
                textViewVar6.setTextColor(Color.RED)
                textViewVar1.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant3 == summa) {
                textViewVar6.setTextColor(Color.RED)
                textViewVar3.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant2 == summa) {
                textViewVar6.setTextColor(Color.RED)
                textViewVar2.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else if (variant4 == summa) {
                textViewVar6.setTextColor(Color.RED)
                textViewVar4.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            } else {
                textViewVar6.setTextColor(Color.RED)
                textViewVar5.setTextColor(Color.GREEN)
                imageView.setImageResource(R.drawable.ic_nok)
            }
            Handler().postDelayed(Runnable {
                summa()
            }, 2000)
        }
    }

    fun summa() {

        imageView.visibility = View.INVISIBLE
        textViewRightAnswers.text = "$rightAnswers из $questionsQuantity   ($counter попыток)"

        if(rightAnswers != questionsQuantity) {

            textViewVar1.visibility = View.INVISIBLE
            textViewVar1.setTextColor(Color.BLACK)
            textViewVar2.visibility = View.INVISIBLE
            textViewVar2.setTextColor(Color.BLACK)
            textViewVar3.visibility = View.INVISIBLE
            textViewVar3.setTextColor(Color.BLACK)
            textViewVar4.visibility = View.INVISIBLE
            textViewVar4.setTextColor(Color.BLACK)
            textViewVar5.visibility = View.INVISIBLE
            textViewVar5.setTextColor(Color.BLACK)
            textViewVar6.visibility = View.INVISIBLE
            textViewVar6.setTextColor(Color.BLACK)

            val number1 = (2..20).shuffled().first()
            val number2 = (2..20).shuffled().first()
            textViewTask.text = "$number1 + $number2 ="
            summa = number1 + number2
            val option1 = summa
            var option2: Int = 0
            var option3: Int = 0
            var option4: Int = 0
            var option5: Int = 0
            var option6: Int = 0

            do{
                option2 = (4..40).shuffled().first()
            } while (option2 == option1)
            do{
                option3 = (4..40).shuffled().first()
            } while (option3 == option1 || option3 == option2)
            do{
                option4 = (4..40).shuffled().first()
            } while (option4 == option1 || option4 == option2 || option4 == option3)
            do{
                option5 = (4..40).shuffled().first()
            } while (option5 == option1 || option5 == option2 || option5 == option3 || option5 == option4)
            do{
                option6 = (4..40).shuffled().first()
            } while (option6 == option1 || option6 == option2 || option6 == option3 || option6 == option4 || option6 == option5)

            val numbers = listOf(option1, option2, option3, option4, option5, option6)
            val numbersSorted = numbers.shuffled()

            variant1 = numbersSorted[0]
            variant2 = numbersSorted[1]
            variant3 = numbersSorted[2]
            variant4 = numbersSorted[3]
            variant5 = numbersSorted[4]
            variant6 = numbersSorted[5]

            textViewVar1.text = variant1.toString()
            textViewVar2.text = variant2.toString()
            textViewVar3.text = variant3.toString()
            textViewVar4.text = variant4.toString()
            textViewVar5.text = variant5.toString()
            textViewVar6.text = variant6.toString()
            textViewVar1.visibility = View.VISIBLE
            textViewVar2.visibility = View.VISIBLE
            textViewVar3.visibility = View.VISIBLE
            textViewVar4.visibility = View.VISIBLE
            textViewVar5.visibility = View.VISIBLE
            textViewVar6.visibility = View.VISIBLE
        } else {
            buttonSumma.visibility = View.VISIBLE
            if(rightAnswers == counter) {
                textViewTask.text = "$counter из $questionsQuantity"
                textViewQuestions.visibility = View.VISIBLE
                textViewQuestions.text = "СУПЕР"
            } else if (counter >= questionsQuantity && counter < questionsQuantity + 2) {
                textViewTask.text = "$counter из $questionsQuantity"
                textViewQuestions.visibility = View.VISIBLE
                textViewQuestions.text = "НЕПЛОХО"
            } else {
                textViewTask.text = "$counter из $questionsQuantity"
                textViewQuestions.visibility = View.VISIBLE
                textViewQuestions.text = "МОЖЕШЬ ЛУЧШЕ"
            }
            textViewRightAnswers.text = "Твой результат"
            //textViewTask.text = "$counter попыток"
            counter = 0
            rightAnswers = 0

            textViewVar1.visibility = View.INVISIBLE
            textViewVar2.visibility = View.INVISIBLE
            textViewVar3.visibility = View.INVISIBLE
            textViewVar4.visibility = View.INVISIBLE
            textViewVar5.visibility = View.INVISIBLE
            textViewVar6.visibility = View.INVISIBLE
        }
    }
}