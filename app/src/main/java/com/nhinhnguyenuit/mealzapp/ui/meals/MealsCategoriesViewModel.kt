package com.nhinhnguyenuit.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.nhinhnguyenuit.mealzapp.model.MealsRepository
import com.nhinhnguyenuit.mealzapp.model.response.MealResponse

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()) :
    ViewModel() {
    fun getMeals(): List<MealResponse> {
        return repository.getMeals().mealsCategories
    }
}