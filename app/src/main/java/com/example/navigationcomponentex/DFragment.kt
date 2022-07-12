package com.example.navigationcomponentex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import com.example.navigationcomponentex.databinding.FragmentDBinding

class DFragment :Fragment(){
    lateinit var binding: FragmentDBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backToC.setOnClickListener{v ->
            Navigation.findNavController(v).popBackStack(R.id.AFragment,true)
        }
    }
}