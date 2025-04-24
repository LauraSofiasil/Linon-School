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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_lionschool.R
import br.senai.sp.jandira.ppdm_lionschool.screens.component.courses

@Composable
fun coursesDataScreen(){

    val scroll = rememberScrollState() //Dá a função de rolagem

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
                    .padding(top = 18.dp)
                    .weight(0.5f)
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.logo
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .size(60.dp)
                )
                Text(
                    text = "Lion \nSchool",
                    fontSize = 18.sp,
                    color = Color(0xff3347B0),
                    fontWeight = FontWeight.SemiBold
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 10.dp),
                color = Color(0xffFFC23D)
            )
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(top = 10.dp)
                    .weight(0.8f)
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent)
                        .height(80.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(
                                text = "Find your course",
                                color = Color(0xff9E9FA4),
                                modifier = Modifier
                                    .padding(start = 30.dp)
                            )
                        },
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "",
                                tint = Color(0xff9E9FA4)
                            )
                        },
                        modifier = Modifier
                            .width(322.dp)
                            .height(46.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color(0xffFFC23D),
                            unfocusedContainerColor = Color(0XFFF5F5F5)
                        )
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent)
                        .padding(top = 10.dp)
                        .padding(start = 30.dp)
                        .height(50.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(
                            R.drawable.list
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .size(30.dp)
                    )
                    Text(
                        text = "Courses",
                        color = Color(0xFF3347B0),
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .verticalScroll(scroll) //Dá a função de rolagem
                    .weight(3f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                courses(
                    imagem = painterResource(R.drawable.programming),
                    sigla = "DS",
                    nomeCurso = "Desenvolvimento de Sistemas",
                    descricao = "Learn to develop web and mobile applications.",
                    tempoCurso = "3 semesters"
                )
                courses(
                    imagem = painterResource(R.drawable.internet),
                    sigla = "RDS",
                    nomeCurso = "Redes de Computadores",
                    descricao = "Learn to design communication networks.",
                    tempoCurso = "3 semesters"
                )
                courses(
                    imagem = painterResource(R.drawable.eletro),
                    sigla = "ELE",
                    nomeCurso = "Eletroeletrônica",
                    descricao = "Learn to design communication networks.",
                    tempoCurso = "3 semesters"
                )
            }
        }

    }
}


@Preview
@Composable
private fun coursesDataScreenPreview(){
    coursesDataScreen()
}