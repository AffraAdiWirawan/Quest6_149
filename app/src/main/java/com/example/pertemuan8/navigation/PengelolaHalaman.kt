package com.pam.quest6_139.PengelolaHalaman

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan8.ui.theme.view.SplashView
import com.example.pertemuan8.ui.theme.view.screen.MahasiswaFormView
import com.example.pertemuan8.ui.theme.view.screen.RencanaStudyView
import com.example.pertemuan8.ui.theme.view.screen.TampilView
import com.example.pertemuan8.ui.theme.viewmodel.MahasiswaViewModel
import com.example.pertemuan8.ui.theme.viewmodel.RencanaStudyViewModel


enum class Halaman {
    Splash,
    Mahasiswa,
    Peminatan,
    TampilKrs
}

