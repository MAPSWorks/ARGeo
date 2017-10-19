package vyglab.argeo.app.controller.ListenersTTARView;

import android.view.View;

import vyglab.argeo.app.MainActivity;
import vyglab.argeo.app.MainActivityState;
import vyglab.argeo.app.controller.FabOnClickListener;
import vyglab.argeo.app.controller.SecondaryFabStateMachine.SecondaryFabState;
import vyglab.argeo.app.view.FragmentTTARView;

/**
 * Created by ngazcon on 02/08/2017.
 */

public class ListenerTTARViewSketch implements View.OnClickListener {
    private MainActivity m_activity;
    private MainActivityState m_main_activity_state;
    private FragmentTTARView m_fragment_ttarview;
    private FabOnClickListener m_fab_listener;

    public ListenerTTARViewSketch(MainActivity activity, MainActivityState activity_state, FragmentTTARView fragment_ttarview, FabOnClickListener fab_listener){
        m_activity = activity;
        m_main_activity_state = activity_state;
        m_fragment_ttarview = fragment_ttarview;
        m_fab_listener = fab_listener;
    }

    @Override
    public void onClick(View v){
        // Check if right menu is open

        // Prepare fragment
        //m_activity.openPictureInPicture(m_fragment_ttarview.getCurrentTTARView());
        //m_fragment_ttarview.prepareForPictureInPictureARView();
        //todo prepare fragment for sketch
        //todo set the touch listener for the picture in picture

        // Go to next State
        m_main_activity_state.getSecondaryFabContext().goNextState(SecondaryFabState.Transitions.SECONDARY_FAB_1);
        m_main_activity_state.getSecondaryFabContext().getState().handle();
    }
}