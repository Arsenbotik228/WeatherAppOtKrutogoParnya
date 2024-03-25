package com.myself223.weatherappotkrutogoparnya.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.myself223.weatherappotkrutogoparnya.databinding.FragmentGetNameCountryBinding

class GetNameCountryFragment : BottomSheetDialogFragment() {
    private val binding:FragmentGetNameCountryBinding by lazy {
        FragmentGetNameCountryBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments!=null){
            val text = arguments?.getString("key").toString()
        }
    }
}