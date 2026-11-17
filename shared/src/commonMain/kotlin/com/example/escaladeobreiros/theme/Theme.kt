package com.example.escaladeobreiros.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// ==========================================
// 1. PALETA DE CORES (Extraída da Identidade)
// ==========================================
val AzulConfiancaBase = Color(0xFF0F1E36)   // #0F1E36 (Fundo Principal / Primária Light)
val AzulEscuroVariante = Color(0xFF1C2331)  // #1C2331 (Fundo Secundário / Superfície)
val DouradoOrganizacao = Color(0xFFD4AF37)  // #D4AF37 (Elementos principais / Fé)
val OuroClaroDestaque = Color(0xFFF4D068)   // #F4D068 (Destaques e Cliques / CTA)
val BrancoNeutro = Color(0xFFFFFFFF)        // #FFFFFF (Textos e Contrastes)
val CinzaSuperficieLight = Color(0xFFF5F7FA) // Cinza bem claro para fundos em modo Light

// ==========================================
// 2. CONFIGURAÇÃO DOS ESQUEMAS DE CORES
// ==========================================

// Esquema para o Modo Escuro (Focado no Azul Escuro com detalhes em Ouro)
private val GesobDarkColorScheme = darkColorScheme(
    primary = DouradoOrganizacao,
    onPrimary = AzulConfiancaBase,
    primaryContainer = OuroClaroDestaque,
    onPrimaryContainer = AzulEscuroVariante,
    secondary = OuroClaroDestaque,
    onSecondary = AzulConfiancaBase,
    background = AzulConfiancaBase,
    onBackground = BrancoNeutro,
    surface = AzulEscuroVariante,
    onSurface = BrancoNeutro
)

// Esquema para o Modo Claro (Inverte o fundo para legibilidade sob a luz do dia)
private val GesobLightColorScheme = lightColorScheme(
    primary = AzulConfiancaBase,
    onPrimary = BrancoNeutro,
    primaryContainer = DouradoOrganizacao,
    onPrimaryContainer = AzulConfiancaBase,
    secondary = DouradoOrganizacao,
    onSecondary = BrancoNeutro,
    background = CinzaSuperficieLight,
    onBackground = AzulConfiancaBase,
    surface = BrancoNeutro,
    onSurface = AzulConfiancaBase
)

// ==========================================
// 3. COMPOSABLE DO TEMA GLOBAL DO APP
// ==========================================
@Composable
fun GesobTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = GesobDarkColorScheme ,
        // Você pode manter ou adicionar suas definições de Typography e Shapes aqui se necessário:
        // typography = Typography,
        content = content
    )
}
