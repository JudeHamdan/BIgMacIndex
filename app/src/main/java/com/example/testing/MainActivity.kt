package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.button)
        var flag : String = "Select City"
        val spinner : Spinner = findViewById(R.id.spSelect)
        val result : TextView = findViewById(R.id.Result)
        var options = arrayOf("Select City","Amman, Jordan","Bangkok, Thailand","Barcelona, Spain","Berlin, Germany","Brussels, Belgium","Cairo, Egypt","Doha, Qatar","Dubai, UAE","Dublin, Ireland","Helsinki, Finland","Hong Kong, China","Istanbul, Turkey","Jakarta, Indonesia","London, England","Madrid, Spain","Manilla, Philippines","Mexico City, Mexico","Miami, USA","Montreal, Canada","Moscow, Russia","Mumbai, India","Munich, Germany","Nairobi, Kenya","Paris, France","Prague, Czech Republic","Rome, Italy","Sao Paolo, Brazil","Stockholm, Sweden","Sydney, Australia","Tokyo, Japan","Toronto, Canada","Vienna, Austria","Zurich, Switzerland")
        spinner.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,options)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        button.setOnClickListener() { view ->
            if (flag == "Select City")
                result.text = ""
            else if (flag == "Hong Kong, China")
                result.text = "9 minutes"
            else if (flag == "Tokyo, Japan")
                result.text = "10 minutes"
            else if (flag == "Miami, USA" || flag == "Sydney, Australia" || flag == "Zurich, Switzerland")
                result.text = "11 minutes"
            else if (flag == "London, England" || flag == "Vienna, Austria")
                result.text = "12 minutes"
            else if (flag == "Munich, Germany" || flag == "Berlin, Germany" || flag == "Montreal, Canada")
                result.text = "13 minutes"
            else if (flag == "Dublin, Ireland" || flag == "Paris, France" || flag == "Toronto, Canada")
                result.text = "15 minutes"
            else if (flag == "Brussels, Belgium" || flag == "Helsinki, Finland")
                result.text = "16 minutes"
            else if (flag == "Stockholm, Sweden" || flag == "Dubai, UAE")
                result.text = "17 minutes"
            else if (flag == "Rome, Italy" || flag == "Doha, Qatar")
                result.text = "18 minutes"
            else if (flag == "Madrid, Spain")
                result.text = "19 minutes"
            else if (flag == "Moscow, Russia")
                result.text = "20 minutes"
            else if (flag == "Barcelona, Spain")
                result.text = "21 minutes"
            else if (flag == "Sao Paolo, Brazil")
                result.text = "25 minutes"
            else if (flag == "Prague, Czech Republic")
                result.text = "30 minutes"
            else if(flag=="Istanbul, Turkey")
                result.text="34 minutes"
            else if(flag=="Bangkok, Thailand")
                result.text="36 minutes"
            else if(flag=="Amman, Jordan")
                result.text="37 minutes"
            else if(flag=="Mumbai, India")
                result.text="40 minutes"
            else if(flag=="Cairo, Egypt")
                    result.text="1 hour, 2 minutes"
            else if(flag=="Jakarta, Indonesia")
                result.text="1 hour, 7 minutes"
            else if(flag=="Mexico City, Mexico")
                result.text="1 hour, 8 minutes"
            else if(flag=="Manilla, Philippines")
                result.text="1 hour ,17 minutes"
            else if(flag=="Nairobi, Kenya")
                result.text="2 hours, 53 minutes"

        }
    }
    }
