package com.android.jenkins_go

import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.unmockkAll
import org.amshove.kluent.shouldNotEqual
import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 *   Created by Alham Wa on 2019-07-01
 */
class MainModelTest {
    @InjectMockKs
    var viewModel = MainViewModel()

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun check_changeDefaultText() {
        viewModel.changeDefaultText()
        viewModel.textToShow.get() shouldNotEqual viewModel.defaultText
    }

    @After
    fun finish() {
        unmockkAll()
    }
}