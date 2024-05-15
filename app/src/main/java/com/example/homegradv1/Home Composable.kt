import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.homegradv1.ImageAndIcons
import com.example.homegradv1.QuickPicks
import com.example.homegradv1.scrolls


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SectionOne() {
    Scaffold {
        LazyColumn {
            item {
                ImageAndIcons()
            }
            item {
                QuickPicks()
            }
            item {
                scrolls()
            }
        }
    }
}






@Preview
@Composable
fun SectionOnePrev() {
    SectionOne()
}
