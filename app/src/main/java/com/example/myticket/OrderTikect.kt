package com.example.myticket

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OrderTicket(){
    Surface (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        NewTopBar()
        OrderTicket()
    }
}

@Composable
fun NewTopBar() {
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFcee5ff))
            .padding(horizontal = 16.dp)
    ) {
        Column {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
//            GAMBAR FERIZY
                Image(
                    painter = painterResource(id = R.drawable.logo_ferizy),
                    contentDescription = "logo ferizy",
                    modifier = Modifier
                        .fillMaxHeight()
                )
//            BURGER MENU
                Image(
                    painter = painterResource(id = R.drawable.logo_burger),
                    contentDescription = "burger menu",
                    modifier = Modifier
                        .size(50.dp)
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column (
                    verticalArrangement = Arrangement.Center
                ) {
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Ajibata", fontSize = 17.sp)
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "Arrow Forward",
                            modifier = Modifier
                                .padding(horizontal = 5.dp)
                                .height(50.dp)
                        )
                        Text(text = "Ambarita", fontSize = 17.sp)
                    }
                    Row {
                        Text(
                            text = "Reguler . Kendaraan . 1 Penumpang",
                            modifier = Modifier,
                            textAlign = TextAlign.Left
                        )
                    }
                }
                Button(
                    onClick = { /* Handle change action */ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFE4F3FB), // Warna latar belakang tombol
                        contentColor = Color.White          // Warna teks tombol
                    ),
                    modifier = Modifier
//                        .fillMaxWidth()
                        .width(100.dp)
                        .height(40.dp),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Text(text = "UBAH", fontSize = 16.sp, color = Color.Gray)
                }
            }
        }
    }
}

@Composable
fun TopBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFcee5ff))
            .padding(horizontal = 16.dp)
    ) {
        Column (modifier =Modifier.padding(0.dp),
            horizontalAlignment = Alignment.Start
        ) {
            val logo: Painter = painterResource(id = R.drawable.logo_ferizy) // Pastikan Anda memiliki resource logo di drawable
            Image(painter = logo, contentDescription = "Logo",
                modifier = Modifier
                    .width(120.dp)
                    .padding(top = 16.dp, bottom = 0.dp, start = 0.dp, end = 0.dp)
            )

            Row {
                Text(text = "Ajibata")
                Icon(
                    painter = painterResource(id = R.drawable.logo_google),
                    contentDescription = "Arrow",
                    modifier =Modifier.padding(horizontal = 8.dp))
                Text(text = "Ambarita")

                Spacer(modifier = Modifier.width(20.dp))

                Icon(
                    painter = painterResource(id = R.drawable.arrow_kanan),
                    contentDescription = "Arrow",
                    modifier =Modifier.padding(horizontal = 10.dp))
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Reguler . Kendaraan . 1 Penumpang",
                modifier = Modifier,
                textAlign = TextAlign.Left
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun Ticketdetails(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Text(
            text = "Jadwal Masuk Pelabuhan",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Jumat, 24 Mei 2023 Pukul 12:00",
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom =16.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier =Modifier.padding(bottom = 8.dp)
        ){
            Column {
                Text(text = "Ajibata", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
//                    painter = painterResource(id = R.drawable.arrow_bawah),
                    contentDescription = "Arrow",
                    modifier =Modifier.padding(horizontal = 8.dp)
                )
                Text(text = "Ambarita", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }

            Spacer(modifier = Modifier.width(50.dp))

            Text(text = "Reguler",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                )
            Spacer(modifier = Modifier.width(60.dp))

            Column{
                Text(
                    text = "Rp39.900",
                    fontSize = 24.sp,
                    color = Color(0XFFF57C00),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
//                        .align(Alignment.End)
                )
            }
        }

        Column(modifier = Modifier.padding(bottom= 16.dp)) {
        TextWithDivider(title = "Daftar Nama Kapal")
        TextWithDivider(title = "Rincian Harga")
        TextWithDivider(title = "Kebijakan")
    }

        ElevatedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(180.dp)
                .padding(5.dp, 5.dp)
                .height(50.dp)
                .shadow(4.dp, RoundedCornerShape(15.dp))
                .align(alignment = Alignment.CenterHorizontally),
            shape = RoundedCornerShape(35),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3873CB))
        ) {
            Row{

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "PESAN TIKET",
                    fontSize = 16.sp
                )
            }
        }

    }
    Image(
        painter = painterResource(id = R.drawable.logo_whatsapp),
        contentDescription = "logo Whatsapp",
        modifier = Modifier
            .offset(y = (-40).dp)
//            .align(Alignment.BottomEnd)
            .size(50.dp)

    )
}

@Composable
fun TextWithDivider(title: String) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(text = title, fontSize = 16.sp, fontWeight = FontWeight.Medium)
        Divider(color = Color.Gray, thickness = 1.dp)
    }
}

@Preview(showBackground = true)
@Composable
fun OrderTicketPreview() {
    OrderTicket()
}
//@Preview(showBackground = true)
//@Composable
//fun TopBarPreview() {
//    TopBar()
//}