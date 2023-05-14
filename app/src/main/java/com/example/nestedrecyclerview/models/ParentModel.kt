package com.example.nestedrecyclerview.models

data class ParentModel(
    val ques: String,
    var options: ArrayList<ChildModel>
)
