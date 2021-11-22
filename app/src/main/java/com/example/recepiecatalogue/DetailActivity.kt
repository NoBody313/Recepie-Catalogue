package com.example.recepiecatalogue

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.recepiecatalogue.data.Recipe
import com.example.recepiecatalogue.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val RECIPE_DATA = "recipe"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataRecipe = intent.getParcelableExtra<Recipe>(RECIPE_DATA) as Recipe

        Glide.with(this).load(dataRecipe.photo).into(binding.imgDetail)

        binding.apply {
            tvNameRecipeDetail.text = dataRecipe.name
            tvCaloriesDetail.text = dataRecipe.calories
            tvCarboDetail.text = dataRecipe.carbo
            tvProteinDetail.text = dataRecipe.protein
            tvDescriptionDetail.text = dataRecipe.description
            tvIngredientsDetail.text = dataRecipe.ingredients
            tvInstructionDetail.text = dataRecipe.instructions
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}