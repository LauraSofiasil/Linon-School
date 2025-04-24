package br.senai.sp.jandira.ppdm_lionschool.screens.component

import android.media.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_lionschool.R

@Composable
fun courses(
    imagem: Painter = painterResource(R.drawable.image),
    sigla: String = "Sigla",
    nomeCurso: String = "Nome do curso",
    descricao: String = "Descrição do curso",
    corFundo: Brush = Brush.horizontalGradient(listOf(Color(0xff3347B0), Color(0xffCFD4EA))),
    tempoCurso: String = "Tempo de curso"
){
    Card (
        modifier = Modifier
            .width(350.dp)
            .height(209.dp)
            .background(Color.Transparent)
            .padding(bottom = 10.dp),
        shape = RoundedCornerShape(15.dp),
        border =  BorderStroke (
            width = 1.dp,
            color = Color(0xffFFC23D)
        )
    ) {
        Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(corFundo)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .padding(start = 10.dp)
                    .padding(end = 10.dp)
                    .background(Color.Transparent),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = imagem,
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                )
                Text(
                    text = sigla,
                    fontSize = 40.sp,
                    color = Color(0xffFFC23D),
                    modifier = Modifier
                        .padding(start = 15.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(start = 10.dp)
                    .padding(end = 10.dp)
                    .padding(top = 15.dp)
                    .background(Color.Transparent)
            ) {
                Text(
                    text = nomeCurso,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = descricao,
                    color = Color.White,
                    fontSize = 13.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .padding(start = 10.dp)
                    .padding(end = 10.dp)
                    .background(Color.Transparent),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.relogio),
                    contentDescription = "",
                    modifier = Modifier
                        .size(15.5.dp)
                )
                Text(
                    text = tempoCurso,
                    fontSize = 8.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 3.dp)
                )
            }
        }
    }
}


@Preview
@Composable
private fun coursesPreview(){
    courses()
}