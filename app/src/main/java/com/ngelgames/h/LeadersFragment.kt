package com.ngelgames.h

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import com.google.android.material.snackbar.Snackbar
import com.ngelgames.h.databinding.FragmentLeadersBinding
import com.ngelgames.h.gogogogo.SingleUserrrrrr
import com.ngelgames.h.gogogogo.UserRaitingListAdapterrrrrr


class LeadersFragment : Fragment() {
    private var ypjkukokkgvk: FragmentLeadersBinding? = null
    private val gygyhhy get() = ypjkukokkgvk ?: throw RuntimeException("FragmentLeadersBinding = null")

    private val frhgtuhghthug by lazy {
        UserRaitingListAdapterrrrrr()
    }

    val frugfrgfgryut = listOf(
        "William",
        "James",
        "Sasha",
        "Masha",
        "Dasha",
        "Marina",
        "Lena",
        "Robert",
        "John",
        "David",
        "Olga",
        "Richard",
        "Barbara",
        "Susan",
        "Eva",
        "Jessica",
        "Amina"
    )

    val defkorf = mutableListOf<SingleUserrrrrr>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ypjkukokkgvk = FragmentLeadersBinding.inflate(inflater, container, false)
        return gygyhhy.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        for (i in 1..50){
            val person = SingleUserrrrrr(name = frugfrgfgryut.random())
            defkorf.add(person)
        }

        try {
            nkukoukjou()
            gyjhijyiojhou()
            frhgtuhghthug.submitList(defkorf)
            gygyhhy.recyclerViewRaitlist.adapter = frhgtuhghthug
            gygyhhy.btnImgExitRaitFragment.setOnClickListener {
                requireActivity().onBackPressed()
            }
            gygyhhy.btnGoUnderstand.setOnClickListener {
                requireActivity().onBackPressed()
            }

        } catch (e: Exception) {
            gtgtgttg()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        ypjkukokkgvk = null
        super.onDestroy()
    }

    private fun gyjhijyiojhou() {
        gygyhhy.recyclerViewRaitlist.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun gtgtgttg() {
        Snackbar.make(
            gygyhhy.root,
            "Oops error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }



    private fun nkukoukjou() {
        frhgtuhghthug.gyhftgyh {
            Snackbar.make(
                gygyhhy.root,
                "My name is ${it.name}",
                Snackbar.LENGTH_LONG
            ).show()

        }
    }
}