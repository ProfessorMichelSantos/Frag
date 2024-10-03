package com.example.frag

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.frag.databinding.ActivityMainBinding

import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.escuro.setOnCheckedChangeListener { compoundButton, ischecked ->
            if (ischecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

        }

        binding.btn1.setOnClickListener{
            val fragment = frag2.newInstance("", "")
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView3, fragment)
            transaction.commit()
        }

        binding.btn2.setOnClickListener{
            var fragment1 : frag1 = frag1.newInstance("","")
            var transacao1 : FragmentTransaction = supportFragmentManager.beginTransaction();
            transacao1.replace(R.id.fragmentContainerView3, fragment1)
            transacao1.commit()
        }

    }

}