package com.nhinhnguyenuit.mealzapp.model

import com.nhinhnguyenuit.mealzapp.model.response.MealsCategoriesResponse

class MealsRepository {
    fun getMeals(): MealsCategoriesResponse = MealsCategoriesResponse(arrayListOf())
}