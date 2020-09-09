package mgm.u.runny.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_setup.*
import mgm.u.runny.R

class SetupFragment : Fragment(R.layout.fragment_setup) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvContinue.setOnClickListener {
            findNavController().navigate(R.id.action_setupFragment_to_runFragment)
        }
    }
}