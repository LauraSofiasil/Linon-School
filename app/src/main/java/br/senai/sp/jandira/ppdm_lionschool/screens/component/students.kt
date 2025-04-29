package br.senai.sp.jandira.ppdm_lionschool.screens.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_lionschool.R


@Composable
fun students(
    foto: Painter = painterResource(R.drawable.user),
    nome: String = "Nome do estudante",
    numeroMatricula: String = "12345678",
    data: String = "2025",
    corFundo: Color = Color(0xff9FA9E1),
    corFaixa: Color = Color.White
){
    Card (
        modifier = Modifier
            .width(320.dp)
            .height(78.dp)
            .background(Color.Transparent)
            .padding(bottom = 10.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxSize()
                .background(corFundo),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .width(15.dp)
                    .fillMaxHeight(),
                shape = RoundedCornerShape(2.dp),
                colors = CardDefaults.cardColors(
                    containerColor = corFaixa
                )
            ) { }
            Image(
                painter = foto,
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(start = 5.dp)
            )
            Column (
                modifier = Modifier
                    .width(200.dp)
                    .background(Color.Transparent)
                    .padding(start = 10.dp)
            ){
                Text(
                    text = nome,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 3.dp)
                )
                Row(
                    modifier = Modifier
                        .width(200.dp)
                        .background(Color.Transparent)
                        .padding(start = 2.dp)
                        .padding(top = 3.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.documents),
                        contentDescription = "",
                        modifier = Modifier
                            .size(15.dp),
                    )
                    Text(
                        text = numeroMatricula,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Light,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 3.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .width(40.dp)
                    .background(Color.Transparent)
                    .padding(top = 50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.calendario),
                    contentDescription = "",
                    modifier = Modifier
                        .size(10.dp)
                )
                Text(
                    text = data,
                    fontSize = 8.sp,
                    color = corFaixa,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 3.dp)
                )
            }
        }
    }
}


@Preview
@Composable
private fun studentsPreview(){
    students()
}