package com.ngelgames.h.gogogogo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.ngelgames.h.R
import com.ngelgames.h.databinding.FragmentOneeeeBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class OneeeeFragment : Fragment() {
    private val edeffrtttgllll = SlotListAdapter()
    private val ceeeeeeentrgtgt = SlotListAdapter()
    private val rrrrrrrrrrroght = SlotListAdapter()

    private val rftgyhyhyy = dfrgtthyhyy56()

    private var frgyhyjuji: FragmentOneeeeBinding? = null
    private val frgttgyhy5 get() = frgyhyjuji ?: throw RuntimeException("FragmentOneeeeBinding = null")

    private var dfrgtggyh66 = 300

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        frgyhyjuji = FragmentOneeeeBinding.inflate(inflater, container, false)
        return frgttgyhy5.root
    }


    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        frgttgyhy5.tvUserBetCount.text = dfrgtggyh66.toString()

        frgttgyhy5.btnImgPlus.setOnClickListener {
            dfrgtggyh66 += 100
            frgttgyhy5.tvUserBetCount.text = dfrgtggyh66.toString()
        }
        frgttgyhy5.btnImgMinus.setOnClickListener {
            if (dfrgtggyh66 >= 100) dfrgtggyh66 -= 100
            frgttgyhy5.tvUserBetCount.text = dfrgtggyh66.toString()
        }


        initExitBtn()
        val gtgt = frgttgyhy5.recVLeft.layoutManager as LinearLayoutManager
        val gtgtt = frgttgyhy5.recVCenter.layoutManager as LinearLayoutManager
        val frgthyhyhyyh = frgttgyhy5.recVRight.layoutManager as LinearLayoutManager

        vrgttgt()
        gtgtt()
        gtgt()

        frgttgyhy5.btnGoSpin.setOnClickListener {
            gtgtgt(gtgt, 8, 12)
            gtgtgt(gtgtt, 12, 18)
            gtgtgt(frgthyhyhyyh, 20, 27)
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initExitBtn() {
        frgttgyhy5.btnImgExitttttt.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    override fun onDestroy() {
        frgyhyjuji = null
        super.onDestroy()
    }

    private fun gtgt() {
        edeffrtttgllll.submitList(frgtghyhyhyhhy())
        ceeeeeeentrgtgt.submitList(frgtghyhyhyhhy())
        rrrrrrrrrrroght.submitList(frgtghyhyhyhhy())
    }

    private fun gtgtt() {
        frgttgyhy5.recVLeft.adapter = edeffrtttgllll
        frgttgyhy5.recVRight.adapter = ceeeeeeentrgtgt
        frgttgyhy5.recVCenter.adapter = rrrrrrrrrrroght
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun vrgttgt() {
        frgttgyhy5.recVLeft.setOnTouchListener { _, _ -> true }
        frgttgyhy5.recVRight.setOnTouchListener { _, _ -> true }
        frgttgyhy5.recVCenter.setOnTouchListener { _, _ -> true }
    }

    private fun gtgtgt(
        linearLayoutManager: LinearLayoutManager,
        minNumberScrolling: Int,
        maxNumberScrolling: Int
    ) {
        lifecycleScope.launch {
            val numberTopdrfgtgtgt = Random.nextInt(minNumberScrolling, maxNumberScrolling)
            var timeForDelayLeftfrgtgtgt = 100L
            for (i in 1..numberTopdrfgtgtgt) {
                linearLayoutManager.scrollToPositionWithOffset(i, 0)
                delay(timeForDelayLeftfrgtgtgt)
                timeForDelayLeftfrgtgtgt += 5
            }
            if (maxNumberScrolling == 27) {
                Snackbar.make(
                    frgttgyhy5.root,
                    "You win ${Random.nextInt(from = 100, until = 1500)} points",
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }

    private fun frgtghyhyhyhhy(): List<SlotElement> {
        val hyhyhyy = mutableListOf<SlotElement>()
        for (i in 1..50) {
            hyhyhyy.add(
                SlotElement(
                    Random.nextInt(Int.MAX_VALUE),
                    rftgyhyhyy.random(),
                )
            )
        }
        return hyhyhyy
    }

    private fun dfrgtthyhyy56(): List<Int> {
        return listOf(
            R.drawable.e1,
            R.drawable.e2,
            R.drawable.e3,
            R.drawable.e4,

        )
    }
}