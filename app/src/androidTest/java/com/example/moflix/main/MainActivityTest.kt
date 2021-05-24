package com.example.moflix.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.moflix.R
import com.example.moflix.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

class MainActivityTest {

    private val dummyMovies = DataDummy.generateDummyMovies()
    private val dummyTvshow = DataDummy.generateDummyTvshow()

    @get: Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies(){
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadDetailMovie(){
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,click()))
        onView(withId(R.id.text_title)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.text_description)).check(matches(isDisplayed()))
        onView(withId(R.id.text_description)).check(matches(withText(dummyMovies[0].description)))
        onView(withId(R.id.text_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.text_rating)).check(matches(withText(dummyMovies[0].rating)))
        onView(withId(R.id.text_release)).check(matches(isDisplayed()))
        onView(withId(R.id.text_release)).check(matches(withText(dummyMovies[0].releaseDate)))
        onView(withId(R.id.img_poster)).check(matches(isDisplayed()))
    }

    @Test
    fun loadTvshow(){
        onView(withText("TvShow")).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvshow.size))
    }

    @Test
    fun loadDetailTvshow(){
        onView(withText("TvShow")).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,click()))
        onView(withId(R.id.text_title)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title)).check(matches(withText(dummyTvshow[0].title)))
        onView(withId(R.id.text_description)).check(matches(isDisplayed()))
        onView(withId(R.id.text_description)).check(matches(withText(dummyTvshow[0].description)))
        onView(withId(R.id.text_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.text_rating)).check(matches(withText(dummyTvshow[0].rating)))
        onView(withId(R.id.text_release)).check(matches(isDisplayed()))
        onView(withId(R.id.text_release)).check(matches(withText(dummyTvshow[0].releaseDate)))
        onView(withId(R.id.img_poster)).check(matches(isDisplayed()))
    }
}