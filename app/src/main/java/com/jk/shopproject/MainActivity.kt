package com.jk.shopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listview)
        //seprate listview variable create
        var list = mutableListOf<Model>()

        list.add(Model("Iphone","iphone 5s",R.drawable.ip))
        list.add(Model("Iphone","iphone 6s",R.drawable.ip))
        list.add(Model("Iphone","iphone 7s",R.drawable.ip))
        list.add(Model("Iphone","iphone 8s",R.drawable.ip))
        list.add(Model("Iphone","iphone 9s",R.drawable.ip))

        listview.adapter = MyAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener { parent:AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this@MainActivity,"You click on iphone5s",Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(this@MainActivity,"You click on iphone6s",Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(this@MainActivity,"You click on iphone7s",Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(this@MainActivity,"You click on iphone8s",Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(this@MainActivity,"You click on iphone9s",Toast.LENGTH_LONG).show()
            }
        }
    }
}
 //now create a model class
//now create a adapter class