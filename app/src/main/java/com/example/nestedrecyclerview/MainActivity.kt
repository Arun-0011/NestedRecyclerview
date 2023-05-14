package com.example.nestedrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nestedrecyclerview.adapter.ParentAdapter
import com.example.nestedrecyclerview.databinding.ActivityMainBinding
import com.example.nestedrecyclerview.models.ChildModel
import com.example.nestedrecyclerview.models.ParentModel

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        init()
    }

    private fun init() {
        val data = ArrayList<ParentModel>()
        data.add(
            ParentModel(
                "Question 1", options = arrayListOf(
                    ChildModel("Option 1"),
                    ChildModel("Option 2"),
                    ChildModel("Option 3")

                )
            )
        )
        data.add(
            ParentModel(
                "Question 2", options = arrayListOf(
                    ChildModel("Yes"),
                    ChildModel("No")
                )
            )
        )
        data.add(
            ParentModel(
                "Question 3", options = arrayListOf(
                    ChildModel("Option 1"),
                    ChildModel("Option 2"),
                    ChildModel("Option 3")

                )
            )
        )
        data.add(
            ParentModel(
                "Question 4", options = arrayListOf(
                    ChildModel("Option 1"),
                    ChildModel("Option 2"),
                    ChildModel("Option 3")

                )
            )
        )
        data.add(
            ParentModel(
                "Question 5", options = arrayListOf(
                    ChildModel("Option 1"),
                    ChildModel("Option 2"),
                    ChildModel("Option 3")

                )
            )
        )
        data.add(
            ParentModel(
                "Question 6", options = arrayListOf(
                    ChildModel("Option 1"),
                    ChildModel("Option 2"),
                    ChildModel("Option 3")

                )
            )
        )
        data.add(
            ParentModel(
                "Question 7", options = arrayListOf(
                    ChildModel("Option 1"),
                    ChildModel("Option 2"),
                    ChildModel("Option 3")

                )
            )
        )

        val adapter = ParentAdapter(data)
        binding?.rvParent?.adapter = adapter
    }
}