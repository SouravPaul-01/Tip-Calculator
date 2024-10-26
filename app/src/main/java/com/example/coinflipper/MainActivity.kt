package com.example.coinflipper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button=findViewById(R.id.button)
        button.setOnClickListener { CoinFlip() }
    }
    private fun CoinFlip(){
        val coin =Coin(2)
        val toss=coin.Toss()
        val imageView:ImageView=findViewById(R.id.imageView)

        when(toss){
            1->imageView.setImageResource(R.drawable.angel)
            2->imageView.setImageResource(R.drawable.devil)
        }
    }
}
class Coin(private val flip:Int){
    fun Toss():Int{
        return (1..2).random()
    }

}