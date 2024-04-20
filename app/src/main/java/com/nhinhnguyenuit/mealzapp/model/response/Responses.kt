package com.nhinhnguyenuit.mealzapp.model.response

import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse(@SerializedName("categories") val mealsCategories: List<MealResponse>)

data class MealResponse(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("dstrCategoryDescription") val escription: String,
    @SerializedName("imageUrl") val strCategoryThumb: String
)

//Gson deserialization
