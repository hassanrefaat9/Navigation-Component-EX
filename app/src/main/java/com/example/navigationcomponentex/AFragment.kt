package com.example.navigationcomponentex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigatorExtras
import com.example.navigationcomponentex.databinding.FragmentABinding

class AFragment : Fragment() {
    lateinit var binding: FragmentABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View? {
        binding = FragmentABinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnB.setOnClickListener { v ->
            val extra = FragmentNavigatorExtras(binding.imageView to "transition")
                Navigation.findNavController(v).navigate(R.id.action_AFragment_to_BFragment)

        }
        binding.btnC.setOnClickListener { v ->
            Navigation.findNavController(v).navigate(R.id.action_AFragment_to_CFragment)
        }
    }
}

