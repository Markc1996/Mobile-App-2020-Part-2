package ie.wit.ProjectFragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ie.wit.R


class TableFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        activity?.title = getString(R.string.nav_table_header)
        return inflater.inflate(R.layout.fragment_table, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            TableFragment().apply {
                arguments = Bundle().apply { }
            }
    }
}