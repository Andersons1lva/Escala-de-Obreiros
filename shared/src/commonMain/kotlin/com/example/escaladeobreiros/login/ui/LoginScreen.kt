package com.example.escaladeobreiros.login.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.escaladeobreiros.login.data.User
import escaladeobreiros.shared.generated.resources.Emblema_Dourado_GESOB
import escaladeobreiros.shared.generated.resources.Res
import org.jetbrains.compose.resources.painterResource

@Composable
fun LoginScreen(onIrToRegister:() -> Unit) {
    // Estados para armazenar o que o usuário digita
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var mostrarSenha by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp), // Espaçamento nas bordas da tela
        horizontalAlignment = Alignment.CenterHorizontally, // Centraliza tudo na horizontal
        verticalArrangement = Arrangement.Center // Centraliza todo o bloco no meio da tela (vertical)
    ) {
        // 1. Sua Imagem/Logo Centralizada
        Image(
            painter = painterResource(Res.drawable.Emblema_Dourado_GESOB),
            contentDescription = "Logo GESOB",
            contentScale = ContentScale.Fit,
            modifier = Modifier.width(220.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

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
            visualTransformation = if (mostrarSenha) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            trailingIcon = {
                IconButton(
                    onClick = { mostrarSenha = !mostrarSenha }
                ) {
                    Icon(
                        imageVector = if (mostrarSenha) {
                            Icons.Default.VisibilityOff
                        } else {
                            Icons.Default.Visibility
                        },
                        contentDescription = if (mostrarSenha) {
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

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(
                onClick = { /* Recuperar senha */ }
            ) {
                Text("Esqueci minha senha")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // 4. Botão de Entrar
        Button(
            onClick = {

            },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD4AF37)
            )
        ) {
            Text("Entrar", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextButton(
            onClick = { onIrToRegister() }
        ) {
            Text("Não tem conta? Cadastre-se")
        }
    }
}