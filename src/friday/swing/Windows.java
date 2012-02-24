package friday.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.MalformedURLException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class Windows {
	
	public static JTabbedPane getTabbedPane(String panelTitle, String panelToolTip) {
		JTabbedPane myTabbedPane = new JTabbedPane();
		JComponent myPanel = makeTextPanel(panelTitle);
		myTabbedPane.addTab(panelTitle, null, myPanel, panelToolTip);
		return myTabbedPane;	
	}
	
	public static JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
	
	
	public static JMenuBar getMenuBar() {
		JMenuBar myMenuBar = new JMenuBar();
		JMenu myFirstMenu = new JMenu("File");
		JMenu mySecondMenu = new JMenu("Edit");
		JMenu myThirdMenu = new JMenu("Help");
		myMenuBar.add(myFirstMenu);
		myMenuBar.add(mySecondMenu);
		myMenuBar.add(myThirdMenu);
		return myMenuBar;	
	}
	
	public static JToolBar getToolBar() throws MalformedURLException {
		JToolBar myToolBar = new JToolBar();
		ImageIcon myIcon = new ImageIcon(Windows.class.getResource("/resources/application-exit.png"));
		JButton myButton = new JButton(myIcon);
		myButton.setText("Button");
		myToolBar.setAlignmentX(00);
		return myToolBar;
	}
	
	public static void main(String[] args) throws MalformedURLException {
		JFrame myFrame = new JFrame("FrameDemo");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setPreferredSize(new Dimension(500, 300));
		myFrame.setJMenuBar(getMenuBar());
		JPanel myToolBarPanel = new JPanel();
		myToolBarPanel.setLayout(new BoxLayout(myToolBarPanel, BoxLayout.Y_AXIS));
		myToolBarPanel.add(getToolBar());
		myFrame.add(myToolBarPanel, BorderLayout.NORTH);

		myFrame.add(getTabbedPane("TabTitleOne", "This is the tooltip for tabTitleOne."), BorderLayout.CENTER);
		myFrame.pack();
		myFrame.setVisible(true);
	}
	
}
