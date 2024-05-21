package com.example.myticket

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import kotlin.math.round

@Composable
fun SearchTicketScreen() {
    var asal by remember { mutableStateOf("") }
    var tujuan by remember { mutableStateOf("") }
    var jadwal by remember { mutableStateOf("") }
    var penumpang by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFEF4F4))
            .verticalScroll(rememberScrollState()),
    ) {
        Image(
            painter = painterResource(id = R.drawable.imgheader),
            contentDescription = "Login Image",
            modifier = Modifier
                .fillMaxWidth()
                .zIndex(0f),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .zIndex(1f)
                .offset(y = (-60).dp)
                .padding(20.dp)
                .background(androidx.compose.ui.graphics.Color.White, RoundedCornerShape(20.dp))
//                .border(10.dp, color = androidx.compose.ui.graphics.Color.Blue, RoundedCornerShape(20.dp))


        ) {
            Column(modifier = Modifier.padding(20.dp, 25.dp)) {
                Text(
                    text = "Cari Tiket Anda", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                    modifier = Modifier


                )
                Text(
                    text = "Atur Jadwal Kedatangan Anda di Pelabuhan", fontSize = 16.sp,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )

                Row {
                    Text(text = "Pelabuhan Asal")
                    Spacer(modifier = Modifier.width(79.dp))
                    Text(text = "Pelabuhan Tujuan")
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Absolute.SpaceEvenly
                ) {
                    TextField(
                        value = asal,
                        onValueChange = { asal = it },
                        label = { Text(text = "asal") },
                        modifier = Modifier.width(130.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.logo_google),
                        contentDescription = "icon switch",
                        modifier = Modifier.size(35.dp)
                    )
                    TextField(
                        value = tujuan,
                        onValueChange = { tujuan = it },
                        label = { Text(text = "tujuan") },
                        modifier = Modifier.width(130.dp)
                    )

                }
                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Jadwal Masuk Pelabuhan (Check In)")
                TextField(
                    value = jadwal,
                    onValueChange = { jadwal = it },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Penumpang")
                TextField(
                    value = penumpang,
                    onValueChange = { penumpang = it },
                    label = { Text(text = "penumpang") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Kebijakan:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = "1. Kendaraan Over Dimension dan Over Loading (ODOL) tidak diperkenankan memasuki area pelabuhan;\n" +
                            "2. Anda sudah dapat Masuk Pelabuhan (Check In) mulai dari 2 (dua) jam sebelum Jadwal Masuk Pelabuhan yang Anda pilih;\n" +
                            "3. Tiket akan hangus (expired) apabila Anda belum Masuk Pelabuhan (Check In) hingga melewati batas waktu Jadwal Masuk Pelabuhan yang Anda pilih;\n" +
                            "4. Nama Penumpang harus sesuai dengan Kartu Identitas (KTP/SIM/Passpor/Dll);\n" +
                            "5. Jumlah Penumpang dan Nomor Polisi Kendaraan harus sesuai dengan Penumpang dan Nomor Polisi Kendaraan yang akan menyeberang;",
                    fontSize = 14.sp,
                    textAlign = TextAlign.Justify
                )
                Image(
                    painter = painterResource(id = R.drawable.logo_whatsapp),
                    contentDescription = "logo Whatsapp",
                    modifier = Modifier
                        .offset(y = (-60).dp)
                        .align(Alignment.End)
                        .size(50.dp)

                )
                BottomNavBar()

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SearchTicketScreenPreview() {
    SearchTicketScreen()
}






