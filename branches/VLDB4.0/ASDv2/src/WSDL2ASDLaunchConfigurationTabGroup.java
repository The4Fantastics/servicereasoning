import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;


public class WSDL2ASDLaunchConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
			
			ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
					new WSDL2ASDLaunchConfigurationTab(),
					new CommonTab()
			};
			setTabs(tabs);		
		}

}