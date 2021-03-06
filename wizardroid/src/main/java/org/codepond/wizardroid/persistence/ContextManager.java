package org.codepond.wizardroid.persistence;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/**
 * This interface defines the wizard context manager API
 * used to pass data between steps.
 */
public interface ContextManager {
    void loadStepContext(Fragment step);
    void persistStepContext(Fragment step);
    Bundle getContext();
    void setContext(Bundle context);
}
