package cubex.mahesh.viewpager_tabbedactivity_nov9am

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cubex.mahesh.navigationdrawer_nov9am.R

class HomeFrag : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
          container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(
            R.layout.home,container,
            false)
        return v
    }


}