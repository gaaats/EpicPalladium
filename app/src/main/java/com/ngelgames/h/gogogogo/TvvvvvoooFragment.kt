package com.ngelgames.h.gogogogo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.ngelgames.h.R
import com.ngelgames.h.databinding.FragmentTvvvvvoooBinding
import kotlinx.coroutines.delay
import kotlin.random.Random

class TvvvvvoooFragment : Fragment() {

    private var yhhhy: FragmentTvvvvvoooBinding? = null
    private val frkfkkgtkg
        get() = yhhhy ?: throw RuntimeException("FragmentTvvvvvoooBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        yhhhy = FragmentTvvvvvoooBinding.inflate(inflater, container, false)
        return frkfkkgtkg.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            Snackbar.make(
                frkfkkgtkg.root,
                "You have already earned ${Random.nextInt(from = 10, until = 5000)} points!!!",
                Snackbar.LENGTH_LONG
            ).show()

            lifecycleScope.launchWhenCreated {
                delay(2000)
                findNavController().navigate(R.id.action_tvvvvvoooFragment_to_oneeeeFragment)
            }


            frkfkkgtkg.erfrftgee.setOnClickListener {
                alalalal()
            }
            frkfkkgtkg.ftgyhyju.setOnClickListener {
                requireActivity().onBackPressed()
            }


        } catch (e: Exception) {
            moskdkerf()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        yhhhy = null
        super.onDestroy()
    }

    private fun alalalal() {

        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Are you reaaaaly want to exit, the current data will not be save?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    private fun moskdkerf() {
        Snackbar.make(
            frkfkkgtkg.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}