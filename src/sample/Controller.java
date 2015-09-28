package sample;

import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.time.LocalDate;



public class Controller
{

    public static Stage STAGE;

    public CheckBox ctvShowChk;
    public RadioButton ctvShowBtnYes;
    public RadioButton ctvShowBtnNo;
    public DatePicker testDatePicker;
    public CheckBox soSlovClienta;
    public CheckBox podklychenieCabelya;
    public CheckBox udobnoeVremya;
    public ComboBox timeSz;
    public DatePicker dateCZ;
    public Label textKT;
    public TextField contactPhone;
    public CheckBox clientConflict;
    public CheckBox fromPPd;
    public CheckBox szWithoutGraffic;
    public CheckBox onHold;
    public CheckBox garantService;
    public javafx.scene.control.Button createReqest;
    public TextArea textReqest;
    public Tab tabInternet;
    public Tab tabTV;
    public Tab tabPhone;
    public Tab tabErrors651;
    public Tab tabBreaks;
    public Tab tabSpeed;
    public Tab tabCktv;
    public Tab tabKTV;
    public Tab noSession;
    public Tab tabIncOut;
    public Tab tabQalityOfComm;
    public Tab tabIVR;
    public Button copyBtn;
    public CheckBox chkBreaks;
    public CheckBox chkBreaks1Pair;
    public CheckBox chkBreaks2Pair;
    public CheckBox chkPortRestarted;
    public TextField txtfieldBreaks1Pair;
    public TextField txtfieldBreaks2Pair;
    public Label txtBreaks1Pair;
    public Label txtBreaks2Pair;
    public Label txtMacBelongs;
    public Label txtMacVisiable;
    public Label txtMacOfNeighbors;
    public RadioButton radioOperStatUp;
    public RadioButton radioOperStatDown;
    public RadioButton radioMacVisiableYes;
    public RadioButton radioMacVisiableNo;
    public RadioButton radioMacBelongsYes;
    public RadioButton radioMacBelongsNo;
    public RadioButton radioCommutIsControlledYes;
    public RadioButton radioCommutIsControlledNo;
    public RadioButton radioMacOfNeighborsYes;
    public RadioButton radioMacOfNeighborsNo;









    public void initializeTestexe()
    {
        testDatePicker.setValue(LocalDate.now());
        soSlovClienta.setVisible(false);
        podklychenieCabelya.setVisible(false);
        udobnoeVremya.setVisible(false);
        timeSz.setVisible(false);
        dateCZ.setVisible(false);
        textKT.setVisible(false);
        contactPhone.setVisible(false);
        clientConflict.setVisible(false);
        fromPPd.setVisible(false);
        szWithoutGraffic.setVisible(false);
        onHold.setVisible(false);
        garantService.setVisible(false);
        createReqest.setVisible(false);
        textReqest.setVisible(false);
        copyBtn.setVisible(false);
    }

    public void initializeDiagnostic ()
    {
        try {
            soSlovClienta.setVisible(true);
            podklychenieCabelya.setVisible(true);
            udobnoeVremya.setVisible(true);
            timeSz.setVisible(true);
            dateCZ.setVisible(true);
            textKT.setVisible(true);
            contactPhone.setVisible(true);
            clientConflict.setVisible(true);
            fromPPd.setVisible(true);
            szWithoutGraffic.setVisible(true);
            onHold.setVisible(true);
            garantService.setVisible(true);
            createReqest.setVisible(true);
            textReqest.setVisible(true);
            copyBtn.setVisible(true);
        } catch (Exception e)
        {

        }
    }

    //Logic for INTERNET
    //-----------------------------------------------------------------------------------------------
    //Tab ERRORS:

    public void operStatClicled() {
        if (radioOperStatUp.isSelected()) {
            radioMacVisiableYes.setDisable(false);
            radioMacVisiableNo.setDisable(false);
            txtMacVisiable.setDisable(false);
        } else {
            radioMacVisiableYes.setDisable(true);
            radioMacVisiableNo.setDisable(true);
            txtMacVisiable.setDisable(true);
            txtMacBelongs.setDisable(true);
            radioMacBelongsNo.setDisable(true);
            radioMacBelongsYes.setDisable(true);
            radioMacVisiableNo.setSelected(true);
        }

        if (radioCommutIsControlledNo.isSelected() && radioOperStatUp.isSelected()) {
            radioMacOfNeighborsNo.setDisable(false);
            radioMacOfNeighborsYes.setDisable(false);
            txtMacOfNeighbors.setDisable(false);

        } else {
            radioMacOfNeighborsNo.setDisable(true);
            radioMacOfNeighborsYes.setDisable(true);
            txtMacOfNeighbors.setDisable(true);

        }

    }

    public void macAddrVisibleClicked() {
        if (radioOperStatUp.isSelected() && radioMacVisiableYes.isSelected()) {
            txtMacBelongs.setDisable(false);
            radioMacBelongsNo.setDisable(false);
            radioMacBelongsYes.setDisable(false);
        } else {
            txtMacBelongs.setDisable(true);
            radioMacBelongsNo.setDisable(true);
            radioMacBelongsYes.setDisable(true);
        }
    }

    public void breaksClicked() {
        if (chkBreaks.isSelected() == true) {
            chkBreaks1Pair.setDisable(false);
            chkBreaks2Pair.setDisable(false);
            txtfieldBreaks1Pair.setDisable(false);
            txtfieldBreaks2Pair.setDisable(false);
            txtBreaks1Pair.setDisable(false);
            txtBreaks2Pair.setDisable(false);
        } else {
            chkBreaks1Pair.setDisable(true);
            chkBreaks2Pair.setDisable(true);
            txtfieldBreaks1Pair.setDisable(true);
            txtfieldBreaks2Pair.setDisable(true);
            txtBreaks1Pair.setDisable(true);
            txtBreaks2Pair.setDisable(true);
        }
    }

    public void CommutIsControlledClicked() {
        if (radioCommutIsControlledNo.isSelected() && radioOperStatUp.isSelected()) {
            chkPortRestarted.setDisable(true);
            radioMacOfNeighborsNo.setDisable(false);
            radioMacOfNeighborsYes.setDisable(false);
            txtMacOfNeighbors.setDisable(false);

        } else {
            chkPortRestarted.setDisable(false);
            radioMacOfNeighborsNo.setDisable(true);
            radioMacOfNeighborsYes.setDisable(true);
            txtMacOfNeighbors.setDisable(true);

        }
        if (radioCommutIsControlledNo.isSelected()) {
            chkPortRestarted.setDisable(true);
        } else {
            chkPortRestarted.setDisable(false);
        }
    }

    //-----------------------------------------------------------------------------------------------
    //Tab Speed:
    public CheckBox chkExternalPing;
    public CheckBox chkDNSPing;
    public CheckBox chkSwitchPing;
    public CheckBox chkSpeedST;
    public CheckBox chkSpeedIperf;
    public TextField txtfieldExternalPingSize;
    public TextField txtfieldExternalPingSend;
    public TextField txtfieldExternalPingReceived;
    public TextField txtfieldExternalPingAddr;
    public TextField txtfieldDNSSize;
    public TextField txtfieldDNSSend;
    public TextField txtfieldDNSRecived;
    public TextField txtfieldSwitchSize;
    public TextField txtfieldSwitchSend;
    public TextField txtfieldSwitchRecived;
    public TextField txtfieldSwitchIP;
    public TextField txtfieldSwitchPort;
    public TextField txtfieldSpeedSTDownload;
    public TextField txtfieldSpeedSTUpload;
    public TextField txtfieldSpeedSTMustBe;
    public TextField txtfieldSpeedIperfSpeed;
    public TextField txtfieldSpeedIperfCity;

    public void ExternalPingClicked() {
        if (chkExternalPing.isSelected()) {
            txtfieldExternalPingSize.setDisable(false);
            txtfieldExternalPingSend.setDisable(false);
            txtfieldExternalPingReceived.setDisable(false);
            txtfieldExternalPingAddr.setDisable(false);
        } else {
            txtfieldExternalPingSize.setDisable(true);
            txtfieldExternalPingSend.setDisable(true);
            txtfieldExternalPingReceived.setDisable(true);
            txtfieldExternalPingAddr.setDisable(true);
        }
    }

    public void DNSPingClicked() {
        if (chkDNSPing.isSelected()) {
            txtfieldDNSSize.setDisable(false);
            txtfieldDNSSend.setDisable(false);
            txtfieldDNSRecived.setDisable(false);
        } else {
            txtfieldDNSSize.setDisable(true);
            txtfieldDNSSend.setDisable(true);
            txtfieldDNSRecived.setDisable(true);
        }
    }

    public void SwitchPingClicked() {
        if (chkSwitchPing.isSelected()) {
            txtfieldSwitchSize.setDisable(false);
            txtfieldSwitchSend.setDisable(false);
            txtfieldSwitchRecived.setDisable(false);
            txtfieldSwitchIP.setDisable(false);
            txtfieldSwitchPort.setDisable(false);
        } else {
            txtfieldSwitchSize.setDisable(true);
            txtfieldSwitchSend.setDisable(true);
            txtfieldSwitchRecived.setDisable(true);
            txtfieldSwitchIP.setDisable(true);
            txtfieldSwitchPort.setDisable(true);
        }
    }

    public void SpeedSTClicked() {
        if (chkSpeedST.isSelected()) {
            txtfieldSpeedSTDownload.setDisable(false);
            txtfieldSpeedSTUpload.setDisable(false);
            txtfieldSpeedSTMustBe.setDisable(false);
        } else {
            txtfieldSpeedSTDownload.setDisable(true);
            txtfieldSpeedSTUpload.setDisable(true);
            txtfieldSpeedSTMustBe.setDisable(true);
        }
    }

    public void SpeedIperfClicked() {
        if (chkSpeedIperf.isSelected()) {
            txtfieldSpeedIperfSpeed.setDisable(false);
            txtfieldSpeedIperfCity.setDisable(false);
        } else {
            txtfieldSpeedIperfSpeed.setDisable(true);
            txtfieldSpeedIperfCity.setDisable(true);
        }
    }


    //-----------------------------------------------------------------------------------------------
    public void setCtvShowChek()
    {
        if (ctvShowChk.isSelected() == true)
        {
            ctvShowBtnYes.setDisable(false);
            ctvShowBtnNo.setDisable(false);
        } else {
            ctvShowBtnYes.setDisable(true);
            ctvShowBtnNo.setDisable(true);
        }

    }


}
