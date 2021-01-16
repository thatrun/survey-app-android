package com.surveyapp.presentation.question

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class AnswerItemDecoration(
    private val marginTop: Int
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        if (parent.getChildAdapterPosition(view) != 0) {
            outRect.top = marginTop
        }
    }
}