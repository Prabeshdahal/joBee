package com.gtappdevelopers.prabesh

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment

class additional : Fragment() {
    private lateinit var facebookDev: ImageView
    private lateinit var facebookFac: ImageView
    private lateinit var buttonRate: TextView
    private lateinit var buttonShare: TextView
    private lateinit var textViewOtherApps: TextView
    private lateinit var imageViewTic: ImageView
    private lateinit var textViewTic: TextView
    private lateinit var imageViewTally: ImageView
    private lateinit var textViewTally: TextView
    private lateinit var imageViewCit: ImageView
    private lateinit var textViewCit: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?

    ): View? {
        val view =
            LayoutInflater.from(context).inflate(R.layout.fragment_additional, container, false)





        buttonRate = view.findViewById(R.id.textVieRate)
        buttonRate.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://play.google.com/store/apps/details?id=com.prabesh.bl"
                )
                setPackage("com.android.vending")
            }
            startActivity(intent)
        }

        buttonShare = view.findViewById(R.id.textVieShare)
        buttonShare.setOnClickListener {
            val sharingIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                val shareBody =
                    "https://play.google.com/store/apps/details?id=com.prabesh.bl"
                putExtra(Intent.EXTRA_SUBJECT, "Download our app")
                putExtra(Intent.EXTRA_TEXT, shareBody)
            }
            startActivity(Intent.createChooser(sharingIntent, "Share App Link With:"))
        }

        textViewOtherApps = view.findViewById(R.id.outOtherAppLabel)
        textViewOtherApps.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://play.google.com/store/apps/dev?id=5777996065898984915"
                )
                setPackage("com.android.vending")
            }
            startActivity(intent)
        }

        imageViewTic = view.findViewById(R.id.imageViewTic)
        imageViewTic.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://play.google.com/store/apps/details?id=com.sukajee.tictactoe"
                )
                setPackage("com.android.vending")
            }
            startActivity(intent)
        }

        textViewTic = view.findViewById(R.id.textViewTic)
        textViewTic.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://play.google.com/store/apps/details?id=com.sukajee.tictactoe"
                )
                setPackage("com.android.vending")
            }
            startActivity(intent)
        }

        imageViewTally = view.findViewById(R.id.imageViewTally)
        imageViewTally.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://play.google.com/store/apps/details?id=com.sukajee.tallycounter"
                )
                setPackage("com.android.vending")
            }
            startActivity(intent)
        }

        textViewTally = view.findViewById(R.id.textViewTally)
        textViewTally.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://play.google.com/store/apps/details?id=com.sukajee.tallycounter"
                )
                setPackage("com.android.vending")
            }
            startActivity(intent)
        }

        imageViewCit = view.findViewById(R.id.imageCit)
        imageViewCit.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://play.google.com/store/apps/details?id=com.sukajee.uscitizenshiptest"
                )
                setPackage("com.android.vending")
            }
            startActivity(intent)
        }

        textViewCit = view.findViewById(R.id.textCit)
        textViewCit.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://play.google.com/store/apps/details?id=com.sukajee.uscitizenshiptest"
                )
                setPackage("com.android.vending")
            }
            startActivity(intent)
        }

        return view


    }


}