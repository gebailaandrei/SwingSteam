package Swing.SignUpFrameComponents;

import Scripts.ImageHandler;
import Scripts.SignUpScript;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SignUpFrame extends JFrame implements MouseListener {

    JLabel mainLbl, accNameLbl, passLbl;
    JTextField userTxt;
    JPasswordField passTxt;
    JButton signUpBtn;
    JLabel notARobotLbl;
    JCheckBox notARobotCheckBox, agreeCheckBox;
    JPanel panel = new JPanel();

    public SignUpFrame(){

        this.setTitle("Steam Sign Up");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(700, 850));
        this.setResizable(false);

        panel.setBackground(new Color(33, 35, 40));
        panel.setLayout(null);

        setMainLbl();
        setFields();
        setNotARobotCheckBox();
        setAgreeCheckBox();
        setSignUpBtn();
        setScrollTextArea();

        this.add(panel);
        this.setVisible(true);

    }

    public void setMainLbl() {
        accNameLbl = new JLabel("CREATE YOUR ACCOUNT");
        accNameLbl.setForeground(new Color(173, 173, 174));
        accNameLbl.setBounds(70, 50, 400, 50);
        accNameLbl.setFont(new Font(null, Font.BOLD, 30));
        panel.add(accNameLbl);
    }

    public void setFields(){

        accNameLbl = new JLabel("USERNAME");
        accNameLbl.setForeground(new Color(173, 173, 174));
        accNameLbl.setBounds(70, 125, 250, 15);
        accNameLbl.setFont(new Font(null, Font.BOLD, 15));
        panel.add(accNameLbl);

        userTxt = new JTextField();
        userTxt.setForeground(new Color(173, 173, 174));
        userTxt.setBounds(70, 150, 535, 35);
        userTxt.setFont(new Font(null, Font.PLAIN, 15));
        userTxt.setBackground(new Color(42, 46, 51));
        userTxt.setCaretColor(Color.WHITE);
        userTxt.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(null,
                        javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        panel.add(userTxt);

        passLbl = new JLabel("PASSWORD");
        passLbl.setForeground(new Color(173, 173, 174));
        passLbl.setBounds(70, 200, 250, 15);
        passLbl.setFont(new Font(null, Font.BOLD, 15));
        panel.add(passLbl);

        passTxt = new JPasswordField();
        passTxt.setForeground(new Color(173, 173, 174));
        passTxt.setBounds(70, 225, 535, 35);
        passTxt.setFont(new Font(null, Font.PLAIN, 15));
        passTxt.setBackground(new Color(42, 46, 51));
        passTxt.setCaretColor(Color.WHITE);
        passTxt.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(null,
                        javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        panel.add(passTxt);

    }

    public void setNotARobotCheckBox(){

        notARobotLbl = new JLabel(ImageHandler.loadImageIcon(ImageHandler.NOT_A_ROBOT_ICON));
        notARobotLbl.setBounds(70, 265, 400, 70);
        panel.add(notARobotLbl);

        notARobotCheckBox = new JCheckBox("I'm not a robot");
        notARobotCheckBox.setBounds(70, 295, 400, 20);
        notARobotCheckBox.setForeground(new Color(173, 173, 174));
        notARobotCheckBox.setOpaque(false);
        notARobotCheckBox.setFocusable(false);
        notARobotCheckBox.setBackground(new Color(33, 35, 40));
        notARobotCheckBox.setIconTextGap(10);
        notARobotCheckBox.setSelectedIcon(ImageHandler.loadImageIcon(ImageHandler.CHECKED_BOX));
        notARobotCheckBox.setIcon(ImageHandler.loadImageIcon(ImageHandler.UNCHECKED_BOX));
        panel.add(notARobotCheckBox);
    }

    public void setScrollTextArea(){

        JPanel scrollPanel = new JPanel();
        scrollPanel.setOpaque(false);
        scrollPanel.setBounds(70, 355, 535, 350);

        JTextArea termsText = new JTextArea(15, 45);
        termsText.setEditable(false);
        termsText.setForeground(new Color(173, 173, 174));
        termsText.setText("STEAM® SUBSCRIBER AGREEMENT\n" + "Table of contents:\n" + "Registration as a subscriber; application of terms to you; your account; conclusion of agreements\n" + "Licenses\n" + "Billing, payment and other subscriptions\n" + "Online conduct, cheating and illegal behavior\n" + "Third-party content\n" + "User generated content\n" + "Disclaimers; limitation of liability; no guarantees; limited warranty & agreement\n" + "Amendments to this agreement\n" + "Term and termination\n" + "Applicable law/mediation/jurisdiction/attorney’s fees\n" + "Dispute resolution/binding arbitration/class action waiver\n" + "PLEASE NOTE: If you are a consumer with place of residence in Germany, a different version of Section 8 applies to you, which is available here.\n" + "A. Mutual Amendment\n" + "This Agreement may at any time be mutually amended by your explicit consent to changes proposed by Valve.\n" + "B. Unilateral Amendment\n" + "Furthermore, Valve may amend this Agreement (including any Subscription Terms or Rules of Use) unilaterally at any time in its sole discretion. In this case, you will be notified by e-mail of any amendment to this Agreement made by Valve at least 30 (30) days before the effective date of the amendment. You can view the Agreement at any time at http://www.steampowered.com/. Your failure to cancel your Account prior to the effective date of the amendment will constitute your acceptance of the amended terms. If you don’t agree to the amendments or to any of the terms in this Agreement, your only remedy is to cancel your Account or to cease use of the affected Subscription(s). Valve shall not have any obligation to refund any fees that may have accrued to your Account before cancellation of your Account or cessation of use of any Subscription, nor shall Valve have any obligation to prorate any fees in such circumstances.\n" + "9. TERM AND TERMINATION ⏶\n" + "A. Term\n" + "The term of this Agreement (the \"Term\") commences on the date you first indicate your acceptance of these terms, and will continue in effect until otherwise terminated in accordance with this Agreement.\n" + "B. Termination by You\n" + "You may cancel your Account at any time. You may cease use of a Subscription at any time or, if you choose, you may request that Valve terminate your access to a Subscription. However, Subscriptions are not transferable, and even if your access to a Subscription for a particular game or application is terminated, the original activation key will not be able to be registered to any other account, even if the Subscription was obtained in a retail store. Access to Subscriptions ordered as a part of a pack or bundle cannot be terminated individually, termination of access to one game within the bundle will result in termination of access to all games ordered in the pack. Your cancellation of an Account, or your cessation of use of any Subscription or request that access to a Subscription be terminated, will not entitle you to any refund, including of any Subscription fees. Valve reserves the right to collect fees, surcharges or costs incurred prior to the cancellation of your Account or termination of your access to a particular Subscription. In addition, you are responsible for any charges incurred to third-party vendors or content providers before your cancellation.\n" + "C. Termination by Valve\n" + "Valve may restrict or cancel your Account or any particular Subscription(s) at any time in the event that (a) Valve ceases providing such Subscriptions to similarly situated Subscribers generally, or (b) you breach any terms of this Agreement (including any Subscription Terms or Rules of Use). In the event that your Account or a particular Subscription is restricted or terminated or cancelled by Valve for a violation of this Agreement or improper or illegal activity, no refund, including of any Subscription fees or of any unused funds in your Steam Wallet, will be granted.\n" + "D. Survival of Terms\n" + "Sections 2.C., 2.D., 2.F., 2.G., 3.A., 3.B., 3.D., 3.H., and 5 - 12 will survive any expiration or termination of this Agreement.\n" + "10. APPLICABLE LAW/MEDIATION/JURISDICTION/ATTORNEYS’ FEES ⏶\n" + "For All Subscribers Outside the European Union and United Kingdom:\n" + "You and Valve agree that this Agreement shall be deemed to have been made and executed in the State of Washington, U.S.A., and Washington law, excluding conflict of laws principles and the Convention on Contracts for the International Sale of Goods, governs all claims arising out of or relating to: (i) any aspect of the relationship between us; (ii) this Agreement; or (iii) your use of Steam, your Account or the Content and Services; except that the U.S. Federal Arbitration Act governs arbitration as far as your country’s laws permit. Subject to Section 11 (Dispute Resolution/Binding Arbitration/Class Action Waiver) below, you and Valve agree that any claim asserted in any legal proceeding shall be commenced and maintained exclusively in any state or federal court located in King County, Washington, having subject matter jurisdiction. You and Valve hereby consent to the exclusive jurisdiction of such courts. In any dispute arising out of or relating to this Agreement, your use of Steam, your account, or the Content and Services, the prevailing party will be entitled to attorneys’ fees and expenses (except arbitration -- see Section 11.C.)\n" + "For EU and UK Subscribers:\n" + "In the event of a dispute relating to the interpretation, the performance or the validity of the Subscriber Agreement, an amicable solution will be sought before any legal action. You can file your complaint at http://help.steampowered.com. The European Commission provides an Online Dispute Resolution website for EU consumers at https://ec.europa.eu/consumers/odr. Participation in this website is not available to US companies, which is why Valve is not registered there. However, insofar as your complaint concerns the behavior of Valve’s data protection representative Valve GmbH you can file your complaint there.\n" + "In the event that out-of-court dispute resolutions fail, the dispute may be brought before the competent courts.\n" + "11. DISPUTE RESOLUTION/BINDING ARBITRATION/CLASS ACTION WAIVER ⏶\n" + "This Section 11 shall apply to the maximum extent permitted by applicable law. IN PARTICULAR, IF YOU ARE A CONSUMER WHO LIVES IN A EUROPEAN UNION MEMBER COUNTRY, THE UNITED KINGDOM, THE PROVINCE OF QUEBEC (CANADA), AUSTRALIA, OR NEW ZEALAND, THIS SECTION 11 DOES NOT APPLY TO YOU. IF YOU ARE A CONSUMER WHO LIVES IN RUSSIA,YOU MAY UTILIZE THE ARBITRATION PROCESS IDENTIFIED IN THIS SECTION 11 OR YOU MAY USE LOCAL RUSSIAN STATE COURTS TO RESOLVE YOUR DISPUTE.\n" + "Most user concerns can be resolved by use of our Steam support site at https://support.steampowered.com/. If Valve is unable to resolve your concerns and a dispute remains between you and Valve, this Section explains how the parties have agreed to resolve it.\n" + "A. Must Arbitrate All Claims Except Intellectual Property, Unauthorized Use, Piracy, or Theft\n" + "YOU AND VALVE AGREE TO RESOLVE ALL DISPUTES AND CLAIMS BETWEEN US IN INDIVIDUAL BINDING ARBITRATION. THAT INCLUDES, BUT IS NOT LIMITED TO, ANY CLAIMS ARISING OUT OF OR RELATING TO: (i) ANY ASPECT OF THE RELATIONSHIP BETWEEN US; (ii) THIS AGREEMENT; OR (iii) YOUR USE OF STEAM, YOUR ACCOUNT, HARDWARE OR THE CONTENT AND SERVICES. IT APPLIES REGARDLESS OF WHETHER SUCH CLAIMS ARE BASED IN CONTRACT, TORT, STATUTE, FRAUD, UNFAIR COMPETITION, MISREPRESENTATION OR ANY OTHER LEGAL THEORY, AND INCLUDES ALL CLAIMS BROUGHT ON BEHALF OF ANOTHER PARTY.\n" + "However, this Section 11 does not apply to the following types of claims or disputes, which you or Valve may bring in any court with jurisdiction: (i) claims of infringement or other misuse of intellectual property rights, including such claims seeking injunctive relief; and (ii) claims related to or arising from any alleged unauthorized use, piracy, or theft.\n" + "This Section 11 does not prevent you from bringing your dispute to the attention of any federal, state, or local government agencies that can, if the law allows, seek relief from us for you.\n" + "An arbitration is a proceeding before a neutral arbitrator, instead of before a judge or jury. Arbitration is less formal than a lawsuit in court, and provides more limited discovery. It follows different rules than court proceedings, and is subject to very limited review by courts. The arbitrator will issue a written decision and provide a statement of reasons if requested by either party. YOU UNDERSTAND THAT YOU AND VALVE ARE GIVING UP THE RIGHT TO SUE IN COURT AND TO HAVE A TRIAL BEFORE A JUDGE OR JURY.\n" + "B. Try to Resolve Dispute Informally First\n" + "You and Valve agree to make reasonable, good faith efforts to informally resolve any dispute before initiating arbitration. A party who intends to seek arbitration must first send the other a written notice that describes the nature and basis of the claim or dispute and sets forth the relief sought. If you and Valve do not reach an agreement to resolve that claim or dispute within thirty (30) calendar days after the notice is received, you or Valve may commence an arbitration. Written notice to Valve must be sent via postal mail to: ATTN: Arbitration Notice, Valve Corporation, P.O. Box 1688, Bellevue, WA 98004.\n" + "C. Arbitration Rules and Fees\n");
        termsText.setBackground(new Color(33, 35, 40));

        JScrollPane scrollPane = new JScrollPane(termsText);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

        scrollPanel.add(scrollPane);

        panel.add(scrollPanel);
    }

    public void setAgreeCheckBox(){

        agreeCheckBox = new JCheckBox("<html>I am 13 years of age or older and agree to the terms of the Steam<br />Subscriber Agreement and the Valve Privacy Policy.</html>");
        agreeCheckBox.setBounds(70, 635, 600, 40);
        agreeCheckBox.setForeground(new Color(173, 173, 174));
        agreeCheckBox.setOpaque(false);
        agreeCheckBox.setFocusable(false);
        agreeCheckBox.setBackground(new Color(33, 35, 40));
        agreeCheckBox.setIconTextGap(10);
        agreeCheckBox.setSelectedIcon(ImageHandler.loadImageIcon(ImageHandler.CHECKED_BOX));
        agreeCheckBox.setIcon(ImageHandler.loadImageIcon(ImageHandler.UNCHECKED_BOX));
        panel.add(agreeCheckBox);
    }

    public void setSignUpBtn(){

        signUpBtn = new JButton();
        signUpBtn.setIcon(ImageHandler.loadImageIcon(ImageHandler.SIGN_UP_ICON));
        signUpBtn.setBounds(260, 700, 170, 50);
        signUpBtn.addMouseListener(this);
        panel.add(signUpBtn);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == signUpBtn){
            if(userTxt.getText().length() >= 1 && passTxt.getPassword().length >= 1
                    && notARobotCheckBox.isSelected() && agreeCheckBox.isSelected()) {
                SignUpScript.signUp(userTxt.getText(), String.valueOf(passTxt.getPassword()));
            }
        }
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
