package mgm.u.runny.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import mgm.u.runny.R
import mgm.u.runny.ui.viewmodels.MainViewModel
import mgm.u.runny.ui.viewmodels.StatisticsViewModel

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}