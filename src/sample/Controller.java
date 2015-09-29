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


    //Logic for DOM.RU TV
    //-----------------------------------------------------------------------------------------------
    //Tab CKTV:
    public RadioButton radioCKTVDecoder;
    public RadioButton radioCamModule;
    public CheckBox chkDecoderRestarted;
    public CheckBox chkDecoderRebootet;
    public CheckBox chkCamInsered;
    public CheckBox chkCamChannelsResearched;

    public CheckBox chkSpillageImage;
    public CheckBox chkFadingImage;
    public CheckBox chkBroadcastingInterruption;
    public CheckBox chkNoBrodcastOnAllChannels;
    public CheckBox chkNoBrodcastOnCoddedChannels;
    public CheckBox chkNoBrodcastOnSomeChannels;
    public CheckBox chkDontOpenPortal;
    public CheckBox chkNoSound;

    public void WhatHappeningClicked() {
        if (chkSpillageImage.isSelected() || chkFadingImage.isSelected() || chkBroadcastingInterruption.isSelected()
                || chkNoBrodcastOnCoddedChannels.isSelected() || chkNoBrodcastOnSomeChannels.isSelected() || chkNoSound.isSelected()) {
            chkNoBrodcastOnAllChannels.setSelected(false);
        }
    }

    public void NoBrodcastOnAllChannelsClicked() {
        if (chkNoBrodcastOnAllChannels.isSelected()) {
            chkSpillageImage.setSelected(false);
            chkFadingImage.setSelected(false);
            chkBroadcastingInterruption.setSelected(false);
            chkNoBrodcastOnCoddedChannels.setSelected(false);
            chkNoBrodcastOnSomeChannels.setSelected(false);
            chkNoSound.setSelected(false);
        }

    }

    public void CktvDecoderOrCamClicked()
    {
        if (radioCKTVDecoder.isSelected())
        {
            chkDecoderRestarted.setDisable(false);
            chkDecoderRebootet.setDisable(false);
            chkCamInsered.setDisable(true);
            chkCamChannelsResearched.setDisable(true);
        } else {
            chkDecoderRestarted.setDisable(true);
            chkDecoderRebootet.setDisable(true);
            chkCamInsered.setDisable(false);
            chkCamChannelsResearched.setDisable(false);
        }
    }

    public void CktvCtvChekClicked() {
        if (ctvShowChk.isSelected() == true) {
            ctvShowBtnYes.setDisable(false);
            ctvShowBtnNo.setDisable(false);
        } else {
            ctvShowBtnYes.setDisable(true);
            ctvShowBtnNo.setDisable(true);
        }
    }

    //-----------------------------------------------------------------------------------------------

    //Tab KTV:
    public CheckBox ktvQalityOfSignal;
    public CheckBox ktvInterferencel;
    public CheckBox ktvNoSound;
    public CheckBox ktvBlackAndWhiteImage;
    public CheckBox ktvNoSignal;
    public RadioButton ktvNoSignalAll;
    public RadioButton ktvNoSignalOnSome;


    public void KtvQalityOfSignalClicked() {
        if (ktvQalityOfSignal.isSelected()) {
            ktvInterferencel.setDisable(false);
            ktvNoSound.setDisable(false);
            ktvBlackAndWhiteImage.setDisable(false);
        } else {
            ktvInterferencel.setDisable(true);
            ktvNoSound.setDisable(true);
            ktvBlackAndWhiteImage.setDisable(true);
        }
    }

    public void KtvNoSignalClicked() {
        if (ktvNoSignal.isSelected()) {
            ktvNoSignalAll.setDisable(false);
            ktvNoSignalOnSome.setDisable(false);
        } else {
            ktvNoSignalAll.setDisable(true);
            ktvNoSignalOnSome.setDisable(true);
        }
    }
    //-----------------------------------------------------------------------------------------------

    //Logic for Phone
    //-----------------------------------------------------------------------------------------------
    //Tab NoSession:
    public RadioButton radioPhoneOperStatDown;
    public RadioButton radioPhoneOperStatUp;
    public RadioButton radioPhoneMacVisiableNo;
    public RadioButton radioPhoneMacVisiableYes;

    public void PhoneNoSessionOperStatClicked() {
        if (radioPhoneOperStatDown.isSelected()) {
            radioPhoneMacVisiableNo.setDisable(true);
            radioPhoneMacVisiableYes.setDisable(true);
        } else {
            radioPhoneMacVisiableNo.setDisable(false);
            radioPhoneMacVisiableYes.setDisable(false);
        }
    }

    //-----------------------------------------------------------------------------------------------

    //-----------------------------------------------------------------------------------------------
    //Tab NoSession:
    public CheckBox chkNoIncConnection;
    public CheckBox chkNoOutConnection;
    public CheckBox chkSipRegistration;
    public CheckBox chkCallFromOffice;
    public CheckBox chkWithSpecificNumber;
    public CheckBox chkOtherTA;
    public RadioButton radioNumberMatch;
    public RadioButton radioNumberNoMatch;
    public RadioButton radioBeepInHandsetYes;
    public RadioButton radioBeepInHandsetNo;
    public RadioButton radioSipRegistrationYes;
    public RadioButton radioSipRegistrationNo;
    public RadioButton radioCallFromOfficeNo;
    public RadioButton radioCallFromOfficeYes;
    public RadioButton radioOtherTAYes;
    public RadioButton radioOtherTANo;
    public TextField txtfieldWithSpecificNumber;

    public void NoIncConnectionClicked() {
        if (chkNoIncConnection.isSelected() && !chkNoOutConnection.isSelected()) {
            radioNumberMatch.setDisable(false);
            radioNumberNoMatch.setDisable(false);
            radioBeepInHandsetYes.setDisable(true);
            radioBeepInHandsetNo.setDisable(true);
        } else if (chkNoIncConnection.isSelected() && chkNoOutConnection.isSelected()) {
            radioNumberMatch.setDisable(true);
            radioNumberNoMatch.setDisable(true);
            radioBeepInHandsetYes.setDisable(false);
            radioBeepInHandsetNo.setDisable(false);
        } else {
            radioNumberMatch.setDisable(true);
            radioNumberNoMatch.setDisable(true);
            radioBeepInHandsetYes.setDisable(true);
            radioBeepInHandsetNo.setDisable(true);
        }
    }

    public void SipRegistrationClicked() {
        if (chkSipRegistration.isSelected()) {
            radioSipRegistrationYes.setDisable(false);
            radioSipRegistrationNo.setDisable(false);
        } else {
            radioSipRegistrationYes.setDisable(true);
            radioSipRegistrationNo.setDisable(true);
        }
    }

    public void CallFromOfficeClicked() {
        if (chkCallFromOffice.isSelected()) {
            radioCallFromOfficeYes.setDisable(false);
            radioCallFromOfficeNo.setDisable(false);
        } else {
            radioCallFromOfficeYes.setDisable(true);
            radioCallFromOfficeNo.setDisable(true);
        }
    }

    public void WithSpecificNumberClicked() {
        if (chkWithSpecificNumber.isSelected()) {
            txtfieldWithSpecificNumber.setDisable(false);
        } else {
            txtfieldWithSpecificNumber.setDisable(true);

        }
    }

    public void OtherTAClicked() {
        if (chkOtherTA.isSelected()) {
            radioOtherTAYes.setDisable(false);
            radioOtherTANo.setDisable(false);
        } else {
            radioOtherTAYes.setDisable(true);
            radioOtherTANo.setDisable(true);
        }
    }

    //-----------------------------------------------------------------------------------------------

    //-----------------------------------------------------------------------------------------------
    //Tab ConnectionQality:
    public CheckBox chkLossToSwitch;
    public CheckBox chkErrorsForPort;
    public CheckBox chkLossToGateway;
    public CheckBox chkSignalAmplification;
    public TextField txtfieldLossToSwitch;
    public TextField txtfieldErrorsForPort;
    public TextField txtfieldLossToGateway;
    public RadioButton radioSignalAmplificationUp;
    public RadioButton radioSignalAmplificationDown;

    public void LossToSwitchClicked() {
        if (chkLossToSwitch.isSelected()) {
            txtfieldLossToSwitch.setDisable(false);
        } else {
            txtfieldLossToSwitch.setDisable(true);
        }
    }

    public void ErrorsForPortClicked() {
        if (chkErrorsForPort.isSelected()) {
            txtfieldErrorsForPort.setDisable(false);
        } else {
            txtfieldErrorsForPort.setDisable(true);
        }
    }

    public void LossToGatewayClicked() {
        if (chkLossToGateway.isSelected()) {
            txtfieldLossToGateway.setDisable(false);
        } else {
            txtfieldLossToGateway.setDisable(true);
        }
    }

    public void SignalAmplificationClicked() {
        if (chkSignalAmplification.isSelected()) {
            radioSignalAmplificationUp.setDisable(false);
            radioSignalAmplificationDown.setDisable(false);
        } else {
            radioSignalAmplificationUp.setDisable(true);
            radioSignalAmplificationDown.setDisable(true);
        }
    }

    //-----------------------------------------------------------------------------------------------
    //Tab IVR,AON...:
    public CheckBox chkAon;
    public CheckBox chkIVR;
    public RadioButton radioAonNotWork;
    public RadioButton radioAonIncorrectWork;
    public RadioButton radioThrough7;
    public RadioButton radioThrough7and8;
    public RadioButton radioDialingLandlineNumber;
    public Label lableSimplesOfNumber;
    public Label lableDetectedNumber;
    public Label labelFormatOfNumber;
    public Label labelNumberSimpleses;
    public TextField txtfieldSimplesOfNumber;
    public TextField txtfieldDetectedNumber;
    public TextField txtfieldNumberSimpleses;

    public void AonClicked() {
        if (chkAon.isSelected()) {
            radioAonNotWork.setDisable(false);
            radioAonIncorrectWork.setDisable(false);
            lableSimplesOfNumber.setDisable(false);
            lableDetectedNumber.setDisable(false);
            txtfieldSimplesOfNumber.setDisable(false);
            txtfieldDetectedNumber.setDisable(false);
        } else {
            radioAonNotWork.setDisable(true);
            radioAonIncorrectWork.setDisable(true);
            lableSimplesOfNumber.setDisable(true);
            lableDetectedNumber.setDisable(true);
            txtfieldSimplesOfNumber.setDisable(true);
            txtfieldDetectedNumber.setDisable(true);
        }
    }

    public void IVRClicked() {
        if (chkIVR.isSelected()) {
            labelFormatOfNumber.setDisable(false);
            labelNumberSimpleses.setDisable(false);
            radioThrough7.setDisable(false);
            radioThrough7and8.setDisable(false);
            radioDialingLandlineNumber.setDisable(false);
            txtfieldNumberSimpleses.setDisable(false);
        } else {
            labelFormatOfNumber.setDisable(true);
            labelNumberSimpleses.setDisable(true);
            radioThrough7.setDisable(true);
            radioThrough7and8.setDisable(true);
            radioDialingLandlineNumber.setDisable(true);
            txtfieldNumberSimpleses.setDisable(true);
        }
    }
    //-----------------------------------------------------------------------------------------------

}
