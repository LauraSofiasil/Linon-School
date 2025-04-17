package br.senai.sp.jandira.ppdm_lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_lionschool.R

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(start = 15.dp)
                    .padding(end = 15.dp)
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.logo
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .size(150.dp)
                )
                Text(
                    text = "Lion \nSchool",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xff3347B0)
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .weight(1f)
                    .padding(top = 60.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Find your favorite course",
                    color = Color(0xff3347B0),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp
                )
                Card(
                    modifier = Modifier
                        .width(60.dp)
                        .height(16.dp)
                        .padding(top = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC23D)
                    ),
                    shape = RoundedCornerShape(3.dp)
                ) { }
                Text(
                    text = "Get to your destination faster, study at \nthe best vocational school in Brazil. Be \nthe best version of yourself.",
                    color = Color(0xff9E9FA4),
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(top = 30.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(250.dp)
                        .padding(top = 25.dp),
                    border = BorderStroke(
                        width = 1.5.dp,
                        color = Color(0xff3347B0)
                    ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFFFFC23D)
                    ),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(
                        text = "Get Started",
                        color = Color(0xff3347B0),
                        fontSize = 15.sp
                    )
                }
                Image(
                    painter = painterResource(
                        R.drawable.youtube
                    ),
                    contentDescription = ""
                )
            }

        }
    }
}


@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}