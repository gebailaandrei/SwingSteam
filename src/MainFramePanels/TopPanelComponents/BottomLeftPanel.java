package MainFramePanels.TopPanelComponents;

import MainFramePanels.BottomPanel;

import javax.swing.*;
import javax.swing.text.rtf.RTFEditorKit;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.UIManager;

public class BottomLeftPanel extends JPanel implements MouseListener {

    JMenuBar menuBar;
    JMenu profileDrop, communityDrop, libraryDrop, storeDrop;
    JMenuItem activityBtn, profileBtn, friendsBtn, groupsBtn, contentBtn, badgesBtn, inventoryBtn;
    JMenuItem homeCommBtn, discussionsBtn, workshopBtn, marketBtn, broadcastsBtn;
    JMenuItem homeBtn, collectionsBtn, downloadsBtn;
    JMenuItem featuredBtn, discoveryBtn, wishlistBtn, pointsShopBtn, newsBtn, statsBtn;

    public BottomLeftPanel(){

        this.setOpaque(false);
        this.setLayout(null);

        menuBar = new JMenuBar();
        menuBar.setSize(1500, 40);
        menuBar.setLocation(0, 0);
        menuBar.setOpaque(false);
        menuBar.setBorderPainted(false);
        menuBar.setFocusable(false);

        setMenus();
        setProfileDropdown();
        setCommunityDropdown();
        setLibraryDropdown();
        setStoreDropdown();

        menuBar.add(libraryDrop);
        menuBar.add(storeDrop);
        menuBar.add(communityDrop);
        menuBar.add(profileDrop);

        this.add(menuBar);

    }

    private void setMenus(){

        profileDrop = new JMenu("Profile");
        communityDrop = new JMenu("Community");
        libraryDrop = new JMenu("Library");
        storeDrop = new JMenu("Store");

        JMenu[] menus = {profileDrop, communityDrop, libraryDrop, storeDrop};

        for(JMenu menu : menus){
            menu.setPreferredSize(new Dimension(150, 40));
            menu.setFocusable(false);
            menu.setOpaque(false);
            menu.setContentAreaFilled(false);
            menu.setBackground(null);
            menu.setBorderPainted(false);
            menu.setFocusPainted(false);
            menu.setMenuLocation(0, 40);
            menu.setFont(new Font("", Font.BOLD, 20));
            menu.setForeground(new Color(173, 173, 174));
        }

    }

    private void setProfileDropdown(){

        activityBtn = new JMenuItem("Activity");
        profileBtn = new JMenuItem("Profile");
        friendsBtn = new JMenuItem("Friends");
        groupsBtn = new JMenuItem("Groups");
        contentBtn = new JMenuItem("Content");
        badgesBtn = new JMenuItem("Badges");
        inventoryBtn = new JMenuItem("Inventory");

        JMenuItem[] items = {activityBtn, profileBtn, friendsBtn, groupsBtn, contentBtn, badgesBtn, inventoryBtn};

        for(JMenuItem item : items) {
            item.setPreferredSize(new Dimension(100, 20));
            item.setBackground(new Color(46, 47, 48));
            item.setForeground(new Color(173, 173, 174));
        }

        for(JMenuItem item : items)
            profileDrop.add(item);
    }

    private void setCommunityDropdown(){


        homeCommBtn = new JMenuItem("Home");
        discussionsBtn = new JMenuItem("Discussions");
        workshopBtn = new JMenuItem("Workshop");
        marketBtn = new JMenuItem("Market");
        broadcastsBtn = new JMenuItem("Broadcasts");

        JMenuItem[] items = {homeCommBtn, discussionsBtn, workshopBtn, marketBtn, broadcastsBtn};

        for(JMenuItem item : items) {
            item.setPreferredSize(new Dimension(100, 20));
            item.setBackground(new Color(46, 47, 48));
            item.setForeground(new Color(173, 173, 174));
        }

        for(JMenuItem item : items)
            communityDrop.add(item);
    }

    private void setLibraryDropdown(){

        homeBtn = new JMenuItem("Home");
        collectionsBtn = new JMenuItem("Collections");
        downloadsBtn = new JMenuItem("Downloads");

        JMenuItem[] items = {homeBtn, collectionsBtn, downloadsBtn};

        for(JMenuItem item : items) {
            item.setPreferredSize(new Dimension(100, 20));
            item.setBackground(new Color(46, 47, 48));
            item.setForeground(new Color(173, 173, 174));
        }

        for(JMenuItem item : items)
            libraryDrop.add(item);
    }

    private void setStoreDropdown(){

        featuredBtn = new JMenuItem("Featured");
        discoveryBtn = new JMenuItem("Discovery");
        wishlistBtn = new JMenuItem("Wishlist");
        pointsShopBtn = new JMenuItem("Points Shop");
        newsBtn = new JMenuItem("News");
        statsBtn = new JMenuItem("Stats");

        JMenuItem[] items = {featuredBtn, discoveryBtn, wishlistBtn, pointsShopBtn, newsBtn, statsBtn};

        for(JMenuItem item : items) {
            item.setPreferredSize(new Dimension(100, 20));
            item.setBackground(new Color(46, 47, 48));
            item.setForeground(new Color(173, 173, 174));
        }

        for(JMenuItem item : items)
            storeDrop.add(item);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
