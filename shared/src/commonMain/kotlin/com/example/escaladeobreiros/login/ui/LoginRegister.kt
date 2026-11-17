package com.example.escaladeobreiros.login.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import escaladeobreiros.shared.generated.resources.Res
import escaladeobreiros.shared.generated.resources.montserrat_extrabold
import org.jetbrains.compose.resources.Font

@Composable
fun LoginRegister(onReturnToLogin:() -> Unit){
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showpassword by remember { mutableStateOf(false) }

    val montserratextraBold = FontFamily(Font(Res.font.montserrat_extrabold, weight = FontWeight.ExtraBold))

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // 1. Sua Imagem/Logo Centralizada
//        Image(
//            painter = painterResource(Res.drawable.Emblema_Dourado_sem_nome),
//            contentDescription = "Logo GESOB",
//            contentScale = ContentScale.Fit,
//            modifier = Modifier.width(150.dp)
//        )
        Text(text = "GESOB", fontSize = 50.sp, fontFamily = montserratextraBold)
        Text(text = "Preenchar os campos para começar",
            fontSize = 14.sp,
            fontFamily = montserratextraBold,
            color = MaterialTheme.colorScheme.primary)

        Spacer(modifier = Modifier.height(32.dp))

        // 2. Campo de Nome
        OutlinedTextField(
            value = fullName,
            onValueChange = { fullName = it },
            label = { Text("Nome") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                // Cor da borda quando focado
                focusedIndicatorColor  = Color.White,
                // Cor do label (texto flutuante) quando focado
                focusedLabelColor = Color.White,
                // Cor do indicador do cursor quando focado
                focusedTrailingIconColor = Color.White,
                cursorColor = Color.White
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 2. Campo de Email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("E-mail") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                // Cor da borda quando focado
                focusedIndicatorColor  = Color.White,
                // Cor do label (texto flutuante) quando focado
                focusedLabelColor = Color.White,
                // Cor do indicador do cursor quando focado
                focusedTrailingIconColor = Color.White,
                cursorColor = Color.White
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 3. Campo de Senha
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Senha") },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = if (showpassword) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            trailingIcon = {
                IconButton(
                    onClick = { showpassword = !showpassword }
                ) {
                    Icon(
                        imageVector = if (showpassword) {
                            Icons.Default.VisibilityOff
                        } else {
                            Icons.Default.Visibility
                        },
                        contentDescription = if (showpassword) {
                            "Ocultar senha"
                        } else {
                            "Mostrar senha"
                        }
                    )
                }
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                // Cor da borda quando focado
                focusedIndicatorColor  = Color.White,
                // Cor do label (texto flutuante) quando focado
                focusedLabelColor = Color.White,
                // Cor do indicador do cursor quando focado
                focusedTrailingIconColor = Color.White,
                cursorColor = Color.White
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 4. Botão de Cadastro
        Button(
            onClick = { /* Lógica de login aqui */ },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD4AF37)
            )
        ) {
            Text("Cadastrar", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextButton(
            onClick = { onReturnToLogin() }
        ) {
            Text("Já possui uma conta? Entrar")
        }
    }
}