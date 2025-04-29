package br.senai.sp.jandira.ppdm_lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import br.senai.sp.jandira.ppdm_lionschool.R
import br.senai.sp.jandira.ppdm_lionschool.screens.component.courses
import br.senai.sp.jandira.ppdm_lionschool.screens.component.students

@Composable
fun studentsDataScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(start = 15.dp)
                    .padding(end = 15.dp)
                    .padding(top = 18.dp)
                    .weight(0.2f),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(Color.Transparent)
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
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(top = 3.dp)
                    )
                }
                Card(
                    modifier = Modifier
                        .width(52.dp)
                        .height(52.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC23D)
                    ),
                    shape = CircleShape
                ) {}
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 10.dp),
                color = Color(0xffFFC23D)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(top = 15.dp)
                    .weight(0.4f),
                horizontalAlignment = Alignment.CenterHorizontally
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
                        .width(355.dp)
                        .height(45.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xffFFC23D),
                        unfocusedContainerColor = Color(0XFFF5F5F5)
                    )
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(100.dp)
                            .height(60.dp)
                            .padding(top = 25.dp)
                            .padding(start = 8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFF3347B0)
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Todos",
                            color = Color.White
                        )
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(120.dp)
                            .height(60.dp)
                            .padding(top = 25.dp)
                            .padding(start = 8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFFFC23D)
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Cursando",
                            color = Color(0xff3347B0)
                        )
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(121.dp)
                            .height(60.dp)
                            .padding(top = 25.dp)
                            .padding(start = 8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0XFFFFC23D)
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Finalizado",
                            color = Color(0xff3347B0)
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent)
                        .padding(start = 20.dp)
                        .padding(top = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.graduation),
                        contentDescription = "",
                        modifier = Modifier
                            .size(30.dp)
                    )
                    Text(
                        text = "Students List",
                        fontSize = 20.sp,
                        color = Color(0xff3347B0),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 8.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(top = 10.dp)
                    .weight(1.3f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                students(
                    nome= "Luana Oliveira Dias",
                    numeroMatricula =  "20151001018",
                    data = "2022",
                    corFaixa = Color(0xffFFC23D)
                )
                students(
                    nome= "Luana Oliveira Dias",
                    numeroMatricula =  "20151001018",
                    data = "2022",
                    corFaixa = Color(0xff3347B0)
                )
                students(
                    nome= "Luana Oliveira Dias",
                    numeroMatricula =  "20151001018",
                    data = "2022",
                    corFaixa = Color(0xffFFC23D)
                )
                students(
                    nome= "Luana Oliveira Dias",
                    numeroMatricula =  "20151001018",
                    data = "2022",
                    corFaixa = Color(0xff3347B0)
                )
                students(
                    nome= "Luana Oliveira Dias",
                    numeroMatricula =  "20151001018",
                    data = "2022",
                    corFaixa = Color(0xffFFC23D)
                )
                students(
                    nome= "Luana Oliveira Dias",
                    numeroMatricula =  "20151001018",
                    data = "2022",
                    corFaixa = Color(0xffFFC23D)
                )
                students(
                    nome= "Luana Oliveira Dias",
                    numeroMatricula =  "20151001018",
                    data = "2022",
                    corFaixa = Color(0xff3347B0)
                )
            }
        }
    }

}


@Preview
@Composable
private fun studentsDataScreenPreview(){
    studentsDataScreen()
}