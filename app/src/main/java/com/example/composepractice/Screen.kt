package com.example.composepractice

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.Locale.Category

@Preview(heightDp = 400)
@Composable
fun previewScreen()
{
 LazyColumn(content ={
     items(getCategorList()){item ->
         BlogCategory(img = item.img, title = item.title, subtitle =item.subtitle )

     }


 } )

}

@Composable
fun BlogCategory(img:Int,title: String,subtitle:String)
{
    Card(elevation = CardDefaults.cardElevation(10.dp), modifier =Modifier
        .padding(20.dp)
        .wrapContentWidth()
        .wrapContentHeight(),
        border = BorderStroke(2.dp, Color.Red)

    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
            ) {
            Image(painter = painterResource(id=img), contentDescription ="",
                modifier = Modifier
                    .size(49.dp)
                    .padding(8.dp)
                    .weight(.2f)
                )
            Column(modifier = Modifier
                .weight(.8f)
            ) {
                Text(text = title,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,



                )
                Text(text = subtitle,
                 style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Thin

                    )
                
            }
            
        }

    }

}


data class category(val img:Int,val title:String,val subtitle:String)

fun getCategorList():MutableList<category>{
    val list= mutableListOf<category>()
list.add(category(R.drawable.ic_launcher_foreground,"rasel","rasel")  )
list.add(category(R.drawable.ic_launcher_foreground,"C++","Learn C++")  )
list.add(category(R.drawable.ic_launcher_foreground,"Java","Learn Java++")  )
list.add(category(R.drawable.ic_launcher_foreground,"Programming","Learn Programming")  )
list.add(category(R.drawable.ic_launcher_foreground,"Technology","Learn Learn Technolog")  )
list.add(category(R.drawable.ic_launcher_foreground,"python","Learn Learn python")  )
list.add(category(R.drawable.ic_launcher_foreground,"kotlin","Learn Learn kotlin")  )
list.add(category(R.drawable.ic_launcher_foreground,"rasel","rasel")  )
list.add(category(R.drawable.ic_launcher_foreground,"C++","Learn C++")  )
list.add(category(R.drawable.ic_launcher_foreground,"Java","Learn Java++")  )
list.add(category(R.drawable.ic_launcher_foreground,"Programming","Learn Programming")  )
list.add(category(R.drawable.ic_launcher_foreground,"Technology","Learn Learn Technolog")  )
list.add(category(R.drawable.ic_launcher_foreground,"python","Learn Learn python")  )
list.add(category(R.drawable.ic_launcher_foreground,"kotlin","Learn Learn kotlin")  )

return list
}