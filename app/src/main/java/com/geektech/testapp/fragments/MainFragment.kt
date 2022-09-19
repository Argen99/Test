package com.geektech.testapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isNotEmpty
import androidx.recyclerview.widget.GridLayoutManager
import com.geektech.testapp.adapters.DocAdapter
import com.geektech.testapp.adapters.MainAdapter
import com.geektech.testapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.layoutManager = GridLayoutManager(requireActivity().applicationContext,4)
        binding.recyclerView.adapter = MainAdapter()

        binding.btnScanDoc.setOnClickListener {
            Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
            binding.progressBar.visibility = View.VISIBLE
            binding.rvDocuments.adapter = DocAdapter()
            if (binding.rvDocuments.adapter != null) {
                Toast.makeText(requireContext(), "isNotEmpty", Toast.LENGTH_SHORT).show()
                binding.ivVis.visibility = View.GONE
                binding.tvVis.visibility = View.GONE
                binding.btnScanDoc.visibility = View.GONE
                binding.rvDocuments.visibility = View.VISIBLE
                binding.progressBar.visibility = View.GONE
            }else{
                Toast.makeText(requireContext(), "else", Toast.LENGTH_SHORT).show()
                binding.ivVis.visibility = View.VISIBLE
                binding.tvVis.visibility = View.VISIBLE
                binding.btnScanDoc.visibility = View.VISIBLE
                binding.rvDocuments.visibility = View.GONE
                binding.progressBar.visibility = View.GONE
            }
        }
    }
}