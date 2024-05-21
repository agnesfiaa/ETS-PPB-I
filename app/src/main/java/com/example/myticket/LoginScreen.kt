package com.example.myticket

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){
    var email by remember{
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFFCEE5FF))
            .padding(30.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,

    ){
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "logo", modifier = Modifier.align(alignment = Alignment.CenterHorizontally).width(16.dp))
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Email" , fontSize = 15.sp)
        TextField(modifier = Modifier
            .background(Color.White)
            .fillMaxWidth(), value = email, onValueChange = {
            email = it
        }, label ={
            Text(text = "Email")
        }, visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Password")
        TextField(modifier = Modifier
            .background(Color.White)
            .fillMaxWidth(), value = password, onValueChange = {
            password = it
        }, label ={
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation()
        )
        ElevatedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(150.dp)
                .padding(20.dp, 20.dp)
                .height(45.dp)
                .shadow(4.dp, RoundedCornerShape(12.dp))
                .align(alignment = Alignment.CenterHorizontally),
            shape = RoundedCornerShape(30),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3873CB))
        ) {
            Row{

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "Login",
                    fontSize = 18.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Divider(
                color = Color.Gray,
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
            )
            Text(
                text = "OR",
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 8.dp),
                fontSize = 18.sp
            )
            Divider(
                color = Color.Gray,
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
            )
        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()){
//            Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "logo google",
//                modifier = Modifier
//                    .padding(15.dp)
//                    .height(15.dp)
//            )
//            Spacer(modifier = Modifier.width(75.dp))
//            Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "logo google",
//                modifier = Modifier
//                    .padding(15.dp)
//                    .height(15.dp)
//
//            )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()){
            Text(text = "Belum punya akun?", fontSize = 18.sp)
            Text(text = "Buat akun baru", fontSize = 15.sp)

        }




    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
    SearchTicketScreen()
}