package com.ngelgames.h

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.ngelgames.h.databinding.FragmentEnteringBinding
import com.ngelgames.h.databinding.FragmentInfoBinding


class EnteringFragment : Fragment() {
    private var gtgtgthyjhuju: FragmentEnteringBinding? = null
    private val gtgyhujuju get() = gtgtgthyjhuju ?: throw RuntimeException("FragmentEnteringBinding = null")



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gtgyhujuju.root.background.alpha = 215

            gtgyhujuju.btnPlayGame.setOnClickListener {
                findNavController().navigate(R.id.action_enteringFragment_to_oneeeeFragment)
            }
            gtgyhujuju.imgTitpleGame.setOnClickListener {
                findNavController().navigate(R.id.action_enteringFragment_to_oneeeeFragment)
            }
            gtgyhujuju.btnImgInfo.setOnClickListener {
                findNavController().navigate(R.id.action_enteringFragment_to_infoFragment)
            }
            gtgyhujuju.btnImgReitList.setOnClickListener {
                findNavController().navigate(R.id.action_enteringFragment_to_leadersFragment)
            }


        } catch (e: Exception) {
            gthyhuyjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        gtgtgthyjhuju = null
        super.onDestroy()
    }




    private fun gthyhuyjuju() {
        Snackbar.make(
            gtgyhujuju.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gtgtgthyjhuju = FragmentEnteringBinding.inflate(inflater, container, false)
        return gtgyhujuju.root
    }




}