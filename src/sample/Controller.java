package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.Optional;


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
    public CheckBox chkPortNoReaction;
    public CheckBox chkPortMode;
    public CheckBox chkRouterFaulty;
    public CheckBox chkRouterReplacement;
    public CheckBox chkDisconnectsOnGN;
    public CheckBox chkRouterFaultys;
    public CheckBox chkZamena;
    public ComboBox timeSz;
    public ComboBox comboPortMode;
    public ComboBox comboReason;
    public ComboBox comboSpeedIperfCity;
    public DatePicker dateCZ;
    public Label textKT;
    public TextField contactPhone;
    public CheckBox clientConflict;
    public CheckBox fromPPd;
    public CheckBox szWithoutGraffic;
    public CheckBox chkNeighborsMore3Disc;
    public CheckBox chkAccumErros;
    public CheckBox chkPortFlopCheck;
    public CheckBox chkSrotmControl;
    public CheckBox chkStp;
    public CheckBox onHold;
    public CheckBox garantService;
    public CheckBox chkErrorsOnPortSpeedUp;
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
    public TextField txtDisconnectsOnGN;
    public TextField txtErrorsOnPortSpeed;
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
            textReqest.setWrapText(true);
        } catch (Exception e)
        {

        }
    }

    //Logic for INTERNET
    //-----------------------------------------------------------------------------------------------
    //Tab ERRORS:

    public RadioButton radioNetCableNotConnected;
    public RadioButton radioRemotePCNotAnswer;
    public CheckBox chkMagistralPortNo;
    public CheckBox chkNoSessionsOfNeighbors;
    public CheckBox chkProblemPort;


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
            radioMacBelongsNo.setSelected(true);
            chkNoSessionsOfNeighbors.setVisible(false);
            chkNoSessionsOfNeighbors.setSelected(false);
            chkMagistralPortNo.setVisible(false);
            chkMagistralPortNo.setSelected(false);
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
            chkNoSessionsOfNeighbors.setVisible(false);
            chkNoSessionsOfNeighbors.setSelected(false);
            chkMagistralPortNo.setVisible(false);
            chkMagistralPortNo.setSelected(false);
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
            chkBreaks1Pair.setSelected(false);
            chkBreaks2Pair.setSelected(false);
            txtfieldBreaks1Pair.setText("");
            txtfieldBreaks2Pair.setText("");
        }
    }

    public void CommutIsControlledClicked() {
        if (radioCommutIsControlledNo.isSelected() && radioOperStatUp.isSelected()) {
            chkPortRestarted.setDisable(true);
            chkPortRestarted.setSelected(false);
            radioMacOfNeighborsNo.setDisable(false);
            radioMacOfNeighborsYes.setDisable(false);
            txtMacOfNeighbors.setDisable(false);

        } else {
            chkPortRestarted.setDisable(false);
            chkPortRestarted.setSelected(false);
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

    public void MacBelongsClientClicked() {
        if (radioMacBelongsYes.isSelected()) {
            chkNoSessionsOfNeighbors.setVisible(true);
        } else {
            chkNoSessionsOfNeighbors.setVisible(false);
            chkNoSessionsOfNeighbors.setSelected(false);
            chkMagistralPortNo.setVisible(false);
            chkMagistralPortNo.setSelected(false);
        }
    }

    public void NoSessionsOfNeighborsClicked() {
        if (chkNoSessionsOfNeighbors.isSelected()) {
            chkMagistralPortNo.setVisible(true);
        } else {
            chkMagistralPortNo.setVisible(false);
            chkMagistralPortNo.setSelected(false);
        }
    }

    //-----------------------------------------------------------------------------------------------
    //Tab Speed:
    public CheckBox chkExternalPing;
    public CheckBox chkDNSPing;
    public CheckBox chkSwitchPing;
    public CheckBox chkSpeedST;
    public CheckBox chkSpeedIperf;
    public CheckBox chkDiffWifi;
    public CheckBox chkRouterFaultyses;
    public CheckBox chkZamenas;
    public ComboBox comboDiffWifi;
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

    public void RouterFaultClicked() {
        if (chkRouterFaultyses.isSelected()) {
            chkDiffWifi.setDisable(false);
            chkZamenas.setDisable(false);
            comboDiffWifi.setDisable(false);
        } else {
            chkDiffWifi.setDisable(true);
            chkZamenas.setDisable(true);
            comboDiffWifi.setDisable(true);
            chkDiffWifi.setSelected(false);
            chkZamenas.setSelected(false);
        }
    }


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
            comboSpeedIperfCity.setDisable(false);
        } else {
            txtfieldSpeedIperfSpeed.setDisable(true);
            comboSpeedIperfCity.setDisable(true);
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
    public CheckBox chkCardInsered;
    public CheckBox chkSubscription;
    public CheckBox chkFaulty;
    public CheckBox chkReplacement;
    public CheckBox chkCheckKTV;

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
            chkCamChannelsResearched.setSelected(false);
            chkCamInsered.setSelected(false);
        } else {
            chkDecoderRestarted.setDisable(true);
            chkDecoderRebootet.setDisable(true);
            chkCamInsered.setDisable(false);
            chkCamChannelsResearched.setDisable(false);
            chkDecoderRestarted.setSelected(false);
            chkDecoderRebootet.setSelected(false);
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
    public CheckBox chkCheckLevelSignal;
    public CheckBox chkCabelContinuity;
    public CheckBox chkChannelsResearcheded;
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
    public TextField txtGNum;

    public void PhoneNoSessionOperStatClicked() {
        if (radioPhoneOperStatDown.isSelected()) {
            radioPhoneMacVisiableNo.setDisable(true);
            radioPhoneMacVisiableYes.setDisable(true);
            radioPhoneMacVisiableNo.setSelected(true);
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
    public CheckBox chkAdapterReboteded;
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
    public TextArea txtSamplesIncNumbers;
    public TextArea txtSamplesOutNumbers;

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
        if (chkNoIncConnection.isSelected()) {
            txtSamplesIncNumbers.setDisable(false);
        } else {
            txtSamplesIncNumbers.setDisable(true);
            txtSamplesIncNumbers.setText("");
        }
        if (chkNoOutConnection.isSelected()) {
            txtSamplesOutNumbers.setDisable(false);
        } else {
            txtSamplesOutNumbers.setDisable(true);
            txtSamplesOutNumbers.setText("");
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
    public CheckBox chkAdapterReboted;
    public CheckBox chkErrorsForPort;
    public CheckBox chkLossToGateway;
    public CheckBox chkSignalAmplification;
    public CheckBox chkOutNapr;
    public CheckBox chkIncNapr;
    public CheckBox chkWhoHerarsClient;
    public CheckBox chkWhoHerarsSob;
    public CheckBox chkShluzRebooted;
    public CheckBox chkErrorsRastut;
    public TextField txtfieldLossToSwitch;
    public TextField txtfieldErrorsForPort;
    public TextField txtfieldLossToGateway;
    public RadioButton radioSignalAmplificationUp;
    public RadioButton radioSignalAmplificationDown;
    public RadioButton radioCharacterTresk;
    public RadioButton radioCharacterLowVoliume;
    public RadioButton radioOtherTAAYes;
    public RadioButton radioOtherTAANo;
    public TextArea txtAreaSamplesInc;
    public TextArea txtAreaSamplesOut;

    public void NapravlenieClicked() {
        if (chkIncNapr.isSelected()) {
            txtAreaSamplesInc.setDisable(false);
        } else {
            txtAreaSamplesInc.setDisable(true);
            txtAreaSamplesInc.setText("");
        }
        if (chkOutNapr.isSelected()) {
            txtAreaSamplesOut.setDisable(false);
        } else {
            txtAreaSamplesOut.setDisable(true);
            txtAreaSamplesOut.setText("");

        }
    }
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
            chkErrorsRastut.setDisable(false);
        } else {
            txtfieldErrorsForPort.setDisable(true);
            chkErrorsRastut.setDisable(true);
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
    public CheckBox chkTime;
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
    public TextField txtMoroMoro;

    public void AonClicked() {
        if (chkAon.isSelected()) {
            radioAonNotWork.setDisable(false);
            radioAonIncorrectWork.setDisable(false);
        } else {
            radioAonNotWork.setDisable(true);
            radioAonIncorrectWork.setDisable(true);
            radioAonNotWork.setSelected(true);

        }
    }

    public void NotCorrectClicked() {
        if (radioAonIncorrectWork.isSelected()) {
            lableSimplesOfNumber.setDisable(false);
            txtfieldSimplesOfNumber.setDisable(false);
            lableDetectedNumber.setDisable(false);
            txtfieldDetectedNumber.setDisable(false);
        } else {
            lableSimplesOfNumber.setDisable(true);
            txtfieldSimplesOfNumber.setDisable(true);
            lableDetectedNumber.setDisable(true);
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

    //-----------------------------------------------------------------------------------------------
    //Create Button:

    public void CreateButton() {
        String reqest = "";

        if (tabInternet.isSelected() || tabTV.isSelected() || tabPhone.isSelected()) {
            try {
                if (udobnoeVremya.isSelected() && !szWithoutGraffic.isSelected())
                    reqest = reqest + "Клиенту удобно принять техника " + dateCZ.getValue().getDayOfMonth() + "." + dateCZ.getValue().getMonthValue()
                            + "." + dateCZ.getValue().getYear() + " " + timeSz.getEditor().getText() + ". ";

            if (szWithoutGraffic.isSelected()) {
                reqest = reqest + "ВЫСОКИЙ ПРИОРИТЕТ! ";
                if (udobnoeVremya.isSelected()) {
                    reqest = reqest + "Клиенту удобно принять техника " + dateCZ.getValue().getDayOfMonth() + "." + dateCZ.getValue().getMonthValue()
                            + "." + dateCZ.getValue().getYear() + " " + timeSz.getEditor().getText() + ". ";
                } else {
                    reqest = reqest + "Требуется СЗ вне графика на " + dateCZ.getValue().getDayOfMonth() + "." + dateCZ.getValue().getMonthValue()
                            + "." + dateCZ.getValue().getYear() + " " + timeSz.getEditor().getText() + ". ";
                }
            }
            } catch (Exception e) {
                Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
                alert4.setTitle("Ошибка");
                alert4.setHeaderText(null);
                alert4.setContentText("Пожалуйста выберите дату!");
                alert4.showAndWait();
            }
            if (fromPPd.isSelected()) {
                reqest = reqest + "От ППД. ";
            }
            if (onHold.isSelected()) {
                reqest = reqest + "Удержание. ";
            }
            if (garantService.isSelected()) {
                reqest = reqest + "Гарантийное обслуживание. ";
            }
        }


        if (tabInternet.isSelected()) {
            //logic for create requests on the internet tab:
            if (chkProblemPort.isSelected()) {
                reqest = reqest + "Клиент попал в отчет по проблемным портам. ";
            }
            if (tabErrors651.isSelected()) {
                //logic for create requests on the internet and errors tab:
                if (chkRouterFaulty.isSelected()) {
                    reqest = reqest + "Подозрение на неисправность роутера. ";
                } else {
                    if (radioNetCableNotConnected.isSelected()) {
                        reqest = reqest + "Сетевой кабель не подключен. ";
                    } else {
                        reqest = reqest + "Удалённый компьютер не отвечает. ";
                    }
                }

                if (radioCommutIsControlledYes.isSelected()) {
                    reqest = reqest + "Подключен к упр. коммутатору. ";
                } else {
                    reqest = reqest + "Подключен к неупр. коммутатору. ";
                }
                if (radioOperStatDown.isSelected()) {
                    reqest = reqest + "По EQM Oper status DOWN. Mac-адрес не виден. ";
                } else {
                    reqest = reqest + "По EQM Oper status UP. ";
                    if (radioMacVisiableNo.isSelected()) {
                        reqest = reqest + "Mac-адрес не виден. ";
                    } else {
                        if (radioMacBelongsNo.isSelected()) {
                            reqest = reqest + "За портом Mac-адрес не клиента. ";
                        } else if (chkNoSessionsOfNeighbors.isSelected() && chkMagistralPortNo.isSelected()) {
                            reqest = reqest + "На коммутаторе нет сессий соседей. Магистральный порт NO. ";
                        } else if (chkNoSessionsOfNeighbors.isSelected() && !chkMagistralPortNo.isSelected()) {
                            reqest = reqest + "На коммутаторе нет сессий соседей. Магистральный порт определен. ";
                        }
                        if (radioCommutIsControlledNo.isSelected() && radioMacOfNeighborsNo.isSelected()) {
                            reqest = reqest + "Mac-адреса других клиентов не видны. ";
                        }
                        if (radioCommutIsControlledNo.isSelected() && radioMacOfNeighborsYes.isSelected()) {
                            reqest = reqest + "Mac-адреса других клиентов видны. ";
                        }
                    }
                }

                if (radioOperStatDown.isSelected() && chkBreaks.isSelected()) {
                    reqest = reqest + "Зафиксирован обрыв ";
                    if (chkBreaks1Pair.isSelected()) {
                        reqest = reqest + "1 пары на " + txtfieldBreaks1Pair.getText() + " метре. ";
                    }
                    if (chkBreaks2Pair.isSelected()) {
                        reqest = reqest + "2 пары на " + txtfieldBreaks1Pair.getText() + " метре. ";
                    }
                }
                if (chkPortNoReaction.isSelected()) {
                    reqest = reqest + "Порт не реагирует на отключение кабеля. ";
                }
                if (chkPortRestarted.isSelected()) {
                    reqest = reqest + "Порт перезапускали. ";
                }
                if (chkPortMode.isSelected()) {
                    reqest = reqest + "Порт работает в режиме " + comboPortMode.getEditor().getText() +
                            " В параметрах драйвера Lan указывали 100 Mb/Full-Duplex, ситуация не изменилась. ";
                }
                if (chkRouterFaulty.isSelected() && chkRouterReplacement.isSelected()) {
                    reqest = reqest + "Напрямую всё в норме. Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность и при необходимости заменить. ";
                } else if (chkRouterFaulty.isSelected()) {
                    reqest = reqest + "Напрямую всё в норме. Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность. ";
                }

                //---------------------------------------------------------------------------------------------------------------------------------------------
            } else if (tabBreaks.isSelected()) {


                //LOGIC for BREAKS
                //----------------------------------------------------------------------------------------------------------------------------------------------
                if (chkDisconnectsOnGN.isSelected()) {
                    if (txtDisconnectsOnGN.getText().equals("")) {
                        if (chkRouterFaultys.isSelected()) {
                            reqest = reqest + "Подозрение на неисправность роутера. Через роутер: ";
                        }
                    } else {
                        if (chkRouterFaultys.isSelected()) {
                            reqest = reqest + "Подозрение на неисправность комбо устр-ва. Через комбо: ";
                        }
                        reqest = reqest + "ГН: " + txtDisconnectsOnGN.getText() + ". ";
                    }
                } else {
                    if (chkRouterFaultys.isSelected()) {
                        reqest = reqest + "Подозрение на неисправность роутера. Через роутер: ";
                    }
                }
                reqest = reqest + "Частые разрывы соединения по причине " + comboReason.getEditor().getText() + ". ";
                if ((comboReason.getValue().equals("Lost-Carrier ") || comboReason.getValue().equals("Lost-Carrier") || comboReason.getValue().equals("Lost-Service")
                        || comboReason.getValue().equals("Port-Error") || comboReason.getValue().equals("NAS-Error") || comboReason.getValue().equals("NAS-Reboot")
                        || comboReason.getValue().equals("NAS-Request")) && !chkNeighborsMore3Disc.isSelected() && !chkAccumErros.isSelected()
                        && !chkPortFlopCheck.isSelected() && !chkSrotmControl.isSelected() && !chkStp.isSelected()) {
                    reqest = reqest + "Ошибок за портом, падений порта нет. В логах Storm Control и STP пусто. ";
                }
                if (chkNeighborsMore3Disc.isSelected()) {
                    reqest = reqest + "У соседей аналогичные разрывы в это же время. ";
                }
                if (chkAccumErros.isSelected()) {
                    reqest = reqest + "Копятся ошибки за портом. ";
                }
                if (chkPortFlopCheck.isSelected()) {
                    reqest = reqest + "Порт периодически падает. ";
                }
                if (chkSrotmControl.isSelected()) {
                    reqest = reqest + "В логах Storm Control фиксируется сетевой шторм. ";
                }
                if (chkStp.isSelected()) {
                    reqest = reqest + "В логах STP фигурируют записи new root selected. ";
                }
                if (chkDisconnectsOnGN.isSelected() && !txtDisconnectsOnGN.getText().equals("")) {
                    if (chkRouterFaultys.isSelected() && chkZamena.isSelected()) {
                        reqest = reqest + "Напрямую всё в норме. Комбо перезагружали, сбрасывали, перенастраивали. Требуется проверить комбо на работоспособность и при необходимости заменить. ";
                    } else if (chkRouterFaultys.isSelected()) {
                        reqest = reqest + "Напрямую всё в норме. Комбо перезагружали, сбрасывали, перенастраивали. Требуется проверить комбо на работоспособность. ";
                    }
                } else {
                    if (chkRouterFaultys.isSelected() && chkZamena.isSelected()) {
                        reqest = reqest + "Напрямую всё в норме. Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность и при необходимости заменить. ";
                    } else if (chkRouterFaultys.isSelected()) {
                        reqest = reqest + "Напрямую всё в норме. Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность. ";
                    }
                }

                //---------------------------------------------------------------------------------------------------------------------------------------------
            } else if (tabSpeed.isSelected()) {
                //LOGIC for Internet speed:
                //----------------------------------------------------------------------------------------------------------------------------------------------
                if (chkRouterFaultyses.isSelected()) {
                    reqest = reqest + "Подозрение на неисправность роутера. ";
                    if (chkDiffWifi.isSelected()) {
                        reqest = reqest + "Через роутер по wi-fi: " + comboDiffWifi.getEditor().getText() + ". ";
                    } else {
                        reqest = reqest + "Через роутер по патч-корду: ";
                    }
                }

                reqest = reqest + "Низкая скорость. ";

                if (chkSpeedST.isSelected()) {
                    reqest = reqest + "По ST: Download: " + txtfieldSpeedSTDownload.getText() + " Мбит/с, Upload: " + txtfieldSpeedSTUpload.getText() +
                            " Мбит/с. (Должно быть " + txtfieldSpeedSTMustBe.getText() + " Мбит/с). ";
                }
                if (chkSpeedIperf.isSelected()) {
                    reqest = reqest + "По Iperf: " + txtfieldSpeedIperfSpeed.getText() + " Мбит/c до г.: " + comboSpeedIperfCity.getEditor().getText() + ". ";
                }
                try {
                    if (chkExternalPing.isSelected()) {
                        reqest = reqest + "При пинге до " + txtfieldExternalPingAddr.getText() + " " + txtfieldExternalPingSend.getText()
                                + " пакетами по " + txtfieldExternalPingSize.getText() + " байт: " + (int) (100 - 100 * (Double.parseDouble(txtfieldExternalPingReceived.getText()) / Double.parseDouble(txtfieldExternalPingSend.getText())))
                                + "% потерь. ";
                    }
                } catch (Exception e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Ошибка");
                    alert.setHeaderText(null);
                    alert.setContentText("Введите корректное число полученных/отправленных пакетов до " + txtfieldExternalPingAddr.getText() + "!");

                    alert.showAndWait();
                }


                try {
                    if (chkDNSPing.isSelected()) {
                        reqest = reqest + "При пинге до ST " + txtfieldDNSSend.getText()
                                + " пакетами по " + txtfieldDNSSize.getText() + " байт: " + (int) (100 - 100 * (Double.parseDouble(txtfieldDNSRecived.getText()) / Double.parseDouble(txtfieldDNSSend.getText())))
                                + "% потерь. ";
                    }
                } catch (Exception e) {
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Ошибка");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Введите корректное число полученных/отправленных пакетов до ST!");
                    alert2.showAndWait();
                }

                try {
                    if (chkSwitchPing.isSelected()) {
                        reqest = reqest + " При пинге до коммутатора (Ip: " + txtfieldSwitchIP.getText() + ") " + txtfieldSwitchSend.getText() +
                                " пакетами по " + txtfieldSwitchSize.getText() + " байт: " + (int) (100 - 100 * (Double.parseDouble(txtfieldSwitchRecived.getText()) / Double.parseDouble(txtfieldSwitchSend.getText()))) + "% потерь.  Клиент подключен к порту: " + txtfieldSwitchPort.getText() + ". ";
                    }
                } catch (Exception e) {
                    Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
                    alert3.setTitle("Ошибка");
                    alert3.setHeaderText(null);
                    alert3.setContentText("Введите корректное число полученных/отправленных пакетов до коммутатора!");
                    alert3.showAndWait();
                }

                if (txtErrorsOnPortSpeed.getText().equals("0")) {
                    reqest = reqest + "Ошибок за портом нет. ";
                } else {
                    reqest = reqest + "Ошибок за портом: " + txtErrorsOnPortSpeed.getText() + ". ";
                    if (chkErrorsOnPortSpeedUp.isSelected()) {
                        reqest = reqest + "Число ошибок растет. ";
                    }
                }

                if (chkRouterFaultyses.isSelected()) {
                    reqest = reqest + "Напрямую скорость согласно ТП. ";
                    if (chkDiffWifi.isSelected()) {
                        reqest = reqest + "Канал меняли. ";
                    }
                    if (!chkZamenas.isSelected()) {
                        reqest = reqest + " Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность. ";
                    } else {
                        reqest = reqest + " Роутер перезагружали, сбрасывали, перенастраивали. Требуется проверить роутер на работоспособность и при необходимости заменить. ";
                    }
                }

            }
            //----------------------------------------------------------------------------------------------------------------------------------------------

        } else if (tabTV.isSelected()) {
            //logic for create requests on the Дом.руТВ tab:
            if (tabCktv.isSelected()) {
                reqest = reqest + "ЦКТВ. ";

                if (chkFaulty.isSelected() && radioCKTVDecoder.isSelected()) {
                    reqest = reqest + "Подозрение на неисправность декодера. ";
                } else if (chkFaulty.isSelected() && radioCamModule.isSelected()) {
                    reqest = reqest + "Подозрение на неисправность Cam-модуля. ";
                }


                if (chkSpillageImage.isSelected()) {
                    if (chkSpillageImage.isSelected() && chkFadingImage.isSelected()) {
                        reqest = reqest + "Наблюдается рассыпание, замирание изображения. ";
                    } else {
                        reqest = reqest + "Наблюдается рассыпание изображения. ";
                    }
                }
                if (chkFadingImage.isSelected() && !(chkSpillageImage.isSelected() && chkFadingImage.isSelected())) {
                    reqest = reqest + "Наблюдается замирание изображения. ";
                }
                if (chkBroadcastingInterruption.isSelected()) {
                    reqest = reqest + "Прерывается вещание на нескольких каналах. ";
                }
                if (chkNoBrodcastOnAllChannels.isSelected()) {
                    reqest = reqest + "Нет вещания на всех каналах. ";
                }
                if (chkNoBrodcastOnCoddedChannels.isSelected()) {
                    reqest = reqest + "Нет вещания на закодированных каналах. ";
                }
                if (chkNoBrodcastOnSomeChannels.isSelected()) {
                    TextInputDialog dialog = new TextInputDialog(" частотах");
                    dialog.setTitle("Пожалуйста уточните");
                    dialog.setHeaderText("На каких именно каналах нет вещания?");
                    dialog.setContentText("Нет вещания на:");

// Traditional way to get the response value.
                    Optional<String> result = dialog.showAndWait();
                    String ch = "";
                    if (result.isPresent()) {
                        ch = result.get();
                    }

// The Java 8 way to get the response value (with lambda expression).

                    reqest = reqest + "Нет вещания на " + ch + ". ";
                }

                if (chkDontOpenPortal.isSelected()) {
                    reqest = reqest + "Не открывается портал. ";
                }

                if (chkNoSound.isSelected()) {
                    TextInputDialog dialog = new TextInputDialog(" каналах");
                    dialog.setTitle("Пожалуйста уточните");
                    dialog.setHeaderText("На каких каналах нет звука?");
                    dialog.setContentText("Нет звука на:");

                    Optional<String> result = dialog.showAndWait();
                    String so = "";
                    if (result.isPresent()) {
                        so = result.get();
                    }

                    reqest = reqest + "Нет звука на " + so + ". ";
                }

                if (radioCKTVDecoder.isSelected()) {
                    if (chkDecoderRestarted.isSelected() && chkDecoderRebootet.isSelected()) {
                        reqest = reqest + "Декодер перезагружали, сбрасывали, перенастраивали. ";
                    } else {
                        if (chkDecoderRestarted.isSelected()) {
                            reqest = reqest + "Декодер перезагружали. ";
                        }
                        if (chkDecoderRebootet.isSelected()) {
                            reqest = reqest + "Декодер сбрасывали, перенастраивали. ";
                        }
                    }
                }
                if (radioCamModule.isSelected()) {
                    if (chkCamChannelsResearched.isSelected()) {
                        reqest = reqest + "Каналы пересканировали. ";
                    }
                    if (chkCamInsered.isSelected()) {
                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setTitle("Уточните пожалуста.");
                        alert.setHeaderText("Как вставлен Cam-модуль?");
                        alert.setContentText("Обычно логотипом к стене.");

                        ButtonType buttonTypeOne = new ButtonType("Логотипом к стене");
                        ButtonType buttonTypeTwo = new ButtonType("Логотипом к экрану");
                        ButtonType buttonTypeCancel = new ButtonType("Отмена", ButtonBar.ButtonData.CANCEL_CLOSE);

                        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeCancel);
                        String ss = "";
                        Optional<ButtonType> result = alert.showAndWait();
                        if (result.get() == buttonTypeOne) {
                            // ... user chose "One"
                            ss = "логотипом к стене. ";
                        } else if (result.get() == buttonTypeTwo) {
                            // ... user chose "Two"
                            ss = "логотипом к дисплею. ";
                        } else {
                            // ... user chose CANCEL or closed the dialog
                            ss = "верно. ";
                        }
                        reqest = reqest + "Сам-модуль достали, вставили " + ss;
                    }

                }
                if (chkCardInsered.isSelected()) {
                    reqest = reqest + "Карту достали, вставили верно. ";
                }
                if (chkSubscription.isSelected()) {
                    reqest = reqest + "Данные по подписке обновили. ";
                }

                if (ctvShowChk.isSelected() && ctvShowBtnYes.isSelected()) {
                    reqest = reqest + "КТВ показывает. ";
                } else if (ctvShowChk.isSelected() && ctvShowBtnNo.isSelected()) {
                    reqest = reqest + "КТВ не показывает. ";
                }

                if (chkFaulty.isSelected() && radioCKTVDecoder.isSelected()) {
                    if (chkReplacement.isSelected()) {
                        reqest = reqest + "Требуется проверить декодер на работоспособность и при необходимости заменить. ";
                    } else {
                        reqest = reqest + "Требуется проверить декодер на работоспособность. ";
                    }

                } else if (chkFaulty.isSelected() && radioCamModule.isSelected()) {
                    if (chkReplacement.isSelected()) {
                        reqest = reqest + "Требуется проверить Cam-модуль на работоспособность и при необходимости заменить. ";
                    } else {
                        reqest = reqest + "Требуется проверить Cam-модуль на работоспособность. ";
                    }
                }
                if (chkCheckKTV.isSelected()) {
                    reqest = reqest + "Требуется проверить линию КТВ. ";
                }


            } else if (tabKTV.isSelected()) {
                if (ktvQalityOfSignal.isSelected()) {
                    String sbd = "";
                    if (ktvInterferencel.isSelected()) {
                        sbd = sbd + "Помехи/рябь. ";
                    }
                    if (ktvNoSound.isSelected()) {
                        sbd = sbd + "Нет звука. ";
                    }
                    if (ktvBlackAndWhiteImage.isSelected()) {
                        sbd = sbd + "Ч/Б изображение. ";
                    }
                    reqest = reqest + "Клиента не устраивает качество сигнала (" + sbd + "). ";

                }
                if (ktvNoSignal.isSelected()) {
                    reqest = reqest + "Нет сигнала на ";
                    if (ktvNoSignalAll.isSelected()) {
                        reqest = reqest + "всех каналах. ";
                    } else {

                        TextInputDialog dialog = new TextInputDialog("");
                        dialog.setTitle("Пожалуйста уточните");
                        dialog.setHeaderText("На каких именно каналах нет вещания?");
                        dialog.setContentText("Нет вещания на:");

// Traditional way to get the response value.
                        Optional<String> result = dialog.showAndWait();
                        String ch = "";
                        if (result.isPresent()) {
                            ch = result.get();
                        }

// The Java 8 way to get the response value (with lambda expression).

                        reqest = reqest + ch + " каналах. ";
                    }
                }

                if (chkChannelsResearcheded.isSelected()) {
                    reqest = reqest + "Каналы пересканировали. ";
                }

                if (chkCabelContinuity.isSelected() && chkCheckLevelSignal.isSelected()) {
                    reqest = reqest + "Требуется проверить целостность кабеля и уровень сигнала. ";
                } else if (chkCabelContinuity.isSelected()) {
                    reqest = reqest + "Требуется проверить целостность кабеля. ";
                } else if (chkCheckLevelSignal.isSelected()) {
                    reqest = reqest + "Требуется проверить уровень сигнала. ";
                }
            }

        } else if (tabPhone.isSelected()) {
            reqest = reqest + "ГН: " + txtGNum.getText() + ". ";
            if (noSession.isSelected()) {
                reqest = reqest + "Адаптер не устанавливает сессию. ";

                if (radioPhoneOperStatUp.isSelected()) {
                    reqest = reqest + "Линк есть. ";
                } else {
                    reqest = reqest + "За портом клиента нет линка. ";
                }
                if (radioPhoneMacVisiableNo.isSelected()) {
                    reqest = reqest + "Мак-адрес не виден. ";
                } else {
                    reqest = reqest + "Мак-адрес виден. ";
                }

                if (chkAdapterReboted.isSelected()) {
                    reqest = reqest + "Адаптер перезагружали. ";
                }
            } else if (tabIncOut.isSelected()) {
                if (chkNoIncConnection.isSelected() && chkNoOutConnection.isSelected()) {
                    if (chkWithSpecificNumber.isSelected()) {
                        reqest = reqest + "Отсутствует входящая и исходящая связь с номером: " + txtfieldWithSpecificNumber.getText() + ". ";
                        if (radioBeepInHandsetYes.isSelected()) {
                            reqest = reqest + "Гудок в трубке есть. ";
                        } else {
                            reqest = reqest + "Гудка в трубке нет. ";
                        }
                    } else {
                        reqest = reqest + "Отсутствует входящая и исходящая связь. ";
                        if (radioBeepInHandsetYes.isSelected()) {
                            reqest = reqest + "Гудок в трубке есть. ";
                        } else {
                            reqest = reqest + "Гудка в трубке нет. ";
                        }
                    }


                } else if (chkNoIncConnection.isSelected()) {


                    ///////////////////////////////////////////////
                    if (chkWithSpecificNumber.isSelected()) {
                        reqest = reqest + "Отсутствует входящая связь с номером: " + txtfieldWithSpecificNumber.getText() + ". ";
                        if (radioNumberMatch.isSelected()) {
                            reqest = reqest + "Номер, закрепленный за приложением и установленный в адаптер, совпадают. ";
                        } else {
                            reqest = reqest + "Номер, закрепленный за приложением и установленный в адаптер, не совпадают. ";
                        }
                    } else {
                        reqest = reqest + "Отсутствует входящая связь. ";
                        if (radioNumberMatch.isSelected()) {
                            reqest = reqest + "Номер, закрепленный за приложением и установленный в адаптер, совпадают. ";
                        } else {
                            reqest = reqest + "Номер, закрепленный за приложением и установленный в адаптер, не совпадают. ";
                        }
                    }
                } else if (chkNoOutConnection.isSelected()) {
                    if (chkWithSpecificNumber.isSelected()) {
                        reqest = reqest + "Отсутствует исходящая связь с номером: " + txtfieldWithSpecificNumber.getText() + ". ";
                    } else
                        reqest = reqest + "Отсутствует исходящая связь. ";
                    }


                ///////
                if (chkAdapterReboteded.isSelected()) {
                    reqest = reqest + "Адаптер перезагружали. ";
                }

                if (chkSipRegistration.isSelected()) {
                    if (radioSipRegistrationYes.isSelected())
                        reqest = reqest + "SIP-регистрация проходит. ";
                    else
                        reqest = reqest + "SIP-регистрация не проходит. ";
                }

                if (chkCallFromOffice.isSelected()) {
                    if (radioCallFromOfficeYes.isSelected())
                        reqest = reqest + "Звонок из офиса проходит. ";
                    else
                        reqest = reqest + "Звонок из офиса так же не проходит. ";
                }

                if (chkOtherTA.isSelected()) {
                    if (radioOtherTAYes.isSelected()) {
                        reqest = reqest + "С другого ТА сложность так же сохраняется. ";
                    } else {
                        reqest = reqest + "Другим ТА нет возможности проверить. ";
                    }
                }

                if (chkNoOutConnection.isSelected()) {
                    if (!txtMoroMoro.getText().equals("")) {
                        reqest = reqest + "При проверке через Moro-Moro код ошибки: " + txtMoroMoro.getText() + ". ";
                    }
                }
                if (chkNoIncConnection.isSelected() && !txtSamplesIncNumbers.getText().equals("")) {
                    reqest = reqest + "Примеры номеров, до которых клиенту не удалось дозвониться: " + txtSamplesIncNumbers.getText() + ". ";
                }
                if (chkNoOutConnection.isSelected() && !txtSamplesOutNumbers.getText().equals("")) {
                    reqest = reqest + "Примеры номеров, на которые звонил клиент: " + txtSamplesOutNumbers.getText() + ". ";
                }

            } else if (tabQalityOfComm.isSelected()) {
                if (radioCharacterTresk.isSelected()) {
                    String trt = "";
                    if (chkIncNapr.isSelected() && !chkOutNapr.isSelected()) {
                        trt = " при входящей связи";
                    } else if (!chkIncNapr.isSelected() && chkOutNapr.isSelected()) {
                        trt = " при исходящей связи";
                    } else if (chkIncNapr.isSelected() && chkOutNapr.isSelected()) {
                        trt = " при входящей и исходящей связи";
                    }
                    reqest = reqest + "Посторонние шумы в трубке (треск, шум, т.п.)" + trt + ". ";
                } else if (radioCharacterLowVoliume.isSelected()) {
                    String trt = "";
                    if (chkIncNapr.isSelected() && !chkOutNapr.isSelected()) {
                        trt = " при входящей связи";
                    } else if (!chkIncNapr.isSelected() && chkOutNapr.isSelected()) {
                        trt = " при исходящей связи";
                    } else if (chkIncNapr.isSelected() && chkOutNapr.isSelected()) {
                        trt = " при входящей и исходящей связи";
                    }
                    reqest = reqest + "Тихая слышимость" + trt + ". ";
                }


                if (chkWhoHerarsClient.isSelected() && !chkWhoHerarsSob.isSelected()) {
                    reqest = reqest + "Слышит только клиент. ";
                } else if (!chkWhoHerarsClient.isSelected() && chkWhoHerarsSob.isSelected()) {
                    reqest = reqest + "Слышит только собеседник клиента. ";
                } else if (chkWhoHerarsClient.isSelected() && chkWhoHerarsSob.isSelected()) {
                    reqest = reqest + "Слышит как клиент, так и его собеседник. ";
                }
                if (chkLossToGateway.isSelected() && !txtfieldLossToGateway.getText().equals("")) {
                    reqest = reqest + "При опросе шлюза " + txtfieldLossToGateway.getText() + "% потерь. ";
                } else {
                    reqest = reqest + "При опросе шлюза потерь нет. ";
                }
                if (chkLossToSwitch.isSelected()) {
                    if (txtfieldLossToSwitch.getText().equals("") || txtfieldLossToSwitch.getText().equals("0")) {
                        reqest = reqest + "При опросе коммутатора потерь нет. ";
                    } else {
                        reqest = reqest + "При опросе коммутатора " + txtfieldLossToSwitch.getText() + "% потерь. ";
                    }
                }
                if (chkErrorsForPort.isSelected()) {
                    if (txtfieldErrorsForPort.getText().equals("") || txtfieldErrorsForPort.equals("0")) {
                        reqest = reqest + "Ошибок за портом нет. ";
                    } else {
                        reqest = reqest + "Ошибок за портом: " + txtfieldErrorsForPort.getText() + ". ";
                        if (chkErrorsRastut.isSelected()) {
                            reqest = reqest + "Ошибки растут. ";
                        }
                    }
                }
                if (radioOtherTAANo.isSelected()) {
                    reqest = reqest + "С другого ТА сложность сохраняется. ";
                } else if (radioOtherTAAYes.isSelected()) {
                    reqest = reqest + "С другого ТА нет возможности проверить. ";
                }
                if (chkShluzRebooted.isSelected()) {
                    reqest = reqest + "Адаптер перезагружали. ";
                }
                if (chkSignalAmplification.isSelected()) {
                    if (radioSignalAmplificationUp.isSelected()) {
                        reqest = reqest + "Усиление сигнала на выходе увеличили. ";
                    } else {
                        reqest = reqest + "Усиление сигнала на выходе уменьшали. ";
                    }
                }
                if (chkIncNapr.isSelected() && !txtAreaSamplesInc.getText().equals("")) {
                    reqest = reqest + "Примеры номеров входящей связи: " + txtAreaSamplesInc.getText() + ". ";
                }
                if (chkOutNapr.isSelected() && !txtAreaSamplesOut.getText().equals("")) {
                    reqest = reqest + "Примеры номеров исходящей связи: " + txtAreaSamplesOut.getText() + ". ";
                }
                if (txtAreaSamplesInc.getText().equals("") && txtAreaSamplesOut.getText().equals("")) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Внимание!");
                    alert.setHeaderText("Не забудьте примеры номеров!");

                    alert.showAndWait();
                }

            } else if (tabIVR.isSelected()) {
                if (chkAon.isSelected() && radioAonNotWork.isSelected()) {
                    reqest = reqest + "Не срабатывает определитель номера при входящих вызовах. Включен Евро АОН. ";
                } else if (chkAon.isSelected() && radioAonIncorrectWork.isSelected()) {
                    reqest = reqest + "Некорректно работает определитель номера. Примеры номеров, которые звонили клиенту: "
                            + txtfieldSimplesOfNumber.getText() + ". Номер, который по факту определяется у клиента: " +
                            txtfieldDetectedNumber.getText() + ". ";
                }
                if (chkIVR.isSelected()) {
                    reqest = reqest + "Не срабатывает донабор в голосовом меню ";
                    if (radioThrough7.isSelected()) {
                        reqest = reqest + "при звонке через 7. ";
                    } else if (radioThrough7and8.isSelected()) {
                        reqest = reqest + "при звонке через 7 и 8. ";
                    } else {
                        reqest = reqest + "при наборе через городской номер. ";
                    }
                    reqest = reqest + "Примеры номеров, где клиент пытался использовать IVR: " +
                            txtfieldNumberSimpleses.getText() + ". ";
                }
                if (chkTime.isSelected()) {
                    reqest = reqest + "Со слов клиента, на трубке сбивается время. ";
                }
            }


        }
        if (tabInternet.isSelected() || tabTV.isSelected() || tabPhone.isSelected()) {
            if (clientConflict.isSelected()) {
                reqest = reqest + "Клиент конфликтный. ";
            }

            if (soSlovClienta.isSelected() && podklychenieCabelya.isSelected()) {
                reqest = reqest + "Со слов клиента, кабель подключен плотно и повреждений не имеет. ";
            } else if (podklychenieCabelya.isSelected()) {
                reqest = reqest + "Подключение кабеля проверено, повреждений нет. ";
            }

        }
        textReqest.setWrapText(true);
        textReqest.setText(reqest);
    }

    public void ClearAllClicked() {
        textReqest.setText("");
        radioNetCableNotConnected.setSelected(true);
        radioOperStatDown.setSelected(true);
        radioMacVisiableNo.setSelected(true);
        radioCommutIsControlledYes.setSelected(true);
        radioMacOfNeighborsNo.setSelected(true);
        radioMacBelongsNo.setSelected(true);
        txtMacVisiable.setDisable(true);
        radioMacVisiableNo.setDisable(true);
        radioMacVisiableYes.setDisable(true);
        txtMacOfNeighbors.setDisable(true);
        radioMacOfNeighborsNo.setDisable(true);
        radioMacOfNeighborsYes.setDisable(true);
        txtMacBelongs.setDisable(true);
        radioMacBelongsNo.setDisable(true);
        radioMacBelongsYes.setDisable(true);

        chkBreaks.setSelected(false);
        chkBreaks1Pair.setSelected(false);
        chkBreaks2Pair.setSelected(false);
        chkBreaks1Pair.setDisable(true);
        chkBreaks2Pair.setDisable(true);
        txtfieldBreaks1Pair.setDisable(true);
        txtfieldBreaks2Pair.setDisable(true);
        txtBreaks1Pair.setDisable(true);
        txtBreaks2Pair.setDisable(true);
        txtfieldBreaks1Pair.setText("");
        txtfieldBreaks2Pair.setText("");

        chkPortNoReaction.setSelected(false);
        chkPortRestarted.setSelected(false);
        chkPortMode.setSelected(false);
        chkRouterFaulty.setSelected(false);
        chkRouterReplacement.setSelected(false);
        chkProblemPort.setSelected(false);
        comboPortMode.setValue("10 Mbit");

        chkNoSessionsOfNeighbors.setSelected(false);
        chkNoSessionsOfNeighbors.setVisible(false);
        chkMagistralPortNo.setSelected(false);
        chkMagistralPortNo.setVisible(false);

        soSlovClienta.setSelected(false);
        podklychenieCabelya.setSelected(false);
        udobnoeVremya.setSelected(false);
        clientConflict.setSelected(false);
        fromPPd.setSelected(false);
        szWithoutGraffic.setSelected(false);
        onHold.setSelected(false);
        garantService.setSelected(false);
        contactPhone.setText("");
        timeSz.setValue("");
        dateCZ.setValue(null);

        chkDisconnectsOnGN.setSelected(false);
        chkNeighborsMore3Disc.setSelected(false);
        chkAccumErros.setSelected(false);
        chkPortFlopCheck.setSelected(false);
        chkSrotmControl.setSelected(false);
        chkStp.setSelected(false);
        chkRouterFaultys.setSelected(false);
        chkZamena.setSelected(false);

        txtDisconnectsOnGN.setText("");
        comboReason.setValue("Lost-Carrier");


        chkExternalPing.setSelected(false);
        txtfieldExternalPingSize.setText("1400");
        txtfieldExternalPingSend.setText("30");
        txtfieldExternalPingReceived.setText("");
        txtfieldExternalPingAddr.setText("ya.ru");
        txtfieldExternalPingSize.setDisable(true);
        txtfieldExternalPingSend.setDisable(true);
        txtfieldExternalPingReceived.setDisable(true);
        txtfieldExternalPingAddr.setDisable(true);

        chkDNSPing.setSelected(false);
        txtfieldDNSSize.setText("1400");
        txtfieldDNSSize.setDisable(true);
        txtfieldDNSSend.setText("30");
        txtfieldDNSSend.setDisable(true);
        txtfieldDNSRecived.setText("");
        txtfieldDNSRecived.setDisable(true);

        chkSwitchPing.setSelected(false);
        txtfieldSwitchSize.setText("1400");
        txtfieldSwitchSize.setDisable(true);
        txtfieldSwitchSend.setText("30");
        txtfieldSwitchSend.setDisable(true);
        txtfieldSwitchRecived.setText("");
        txtfieldSwitchRecived.setDisable(true);
        txtfieldSwitchIP.setText("0.0.0.0");
        txtfieldSwitchIP.setDisable(true);
        txtfieldSwitchPort.setText("");
        txtfieldSwitchPort.setDisable(true);

        txtErrorsOnPortSpeed.setText("0");
        chkErrorsOnPortSpeedUp.setSelected(false);
        chkRouterFaultyses.setSelected(false);

        chkSpeedST.setSelected(false);
        txtfieldSpeedSTDownload.setDisable(true);
        txtfieldSpeedSTDownload.setText("");
        txtfieldSpeedSTUpload.setDisable(true);
        txtfieldSpeedSTUpload.setText("");
        txtfieldSpeedSTMustBe.setDisable(true);
        txtfieldSpeedSTMustBe.setText("");

        chkSpeedIperf.setSelected(false);
        txtfieldSpeedIperfSpeed.setText("");
        comboSpeedIperfCity.setValue("");

        chkDiffWifi.setSelected(false);
        chkDiffWifi.setDisable(true);
        chkZamenas.setSelected(false);
        chkZamenas.setDisable(true);
        comboDiffWifi.setDisable(true);
        comboDiffWifi.setValue("Низкий уровень сигнала");


        chkSpillageImage.setSelected(false);
        chkFadingImage.setSelected(false);
        chkBroadcastingInterruption.setSelected(false);
        chkNoBrodcastOnAllChannels.setSelected(false);
        chkNoBrodcastOnCoddedChannels.setSelected(false);
        chkNoBrodcastOnSomeChannels.setSelected(false);
        chkDontOpenPortal.setSelected(false);
        chkNoSound.setSelected(false);

        ctvShowChk.setSelected(false);
        ctvShowBtnYes.setSelected(true);
        ctvShowBtnYes.setDisable(true);
        ctvShowBtnNo.setDisable(true);

        chkCheckKTV.setSelected(false);
        chkFaulty.setSelected(false);
        chkReplacement.setSelected(false);
        chkSubscription.setSelected(false);
        chkCardInsered.setSelected(false);
        chkDecoderRestarted.setSelected(false);
        chkDecoderRebootet.setSelected(false);
        chkCamChannelsResearched.setSelected(false);
        chkCamInsered.setSelected(false);
        radioCKTVDecoder.setSelected(true);


        ktvQalityOfSignal.setSelected(false);
        ktvInterferencel.setSelected(false);
        ktvInterferencel.setDisable(true);
        ktvNoSound.setSelected(false);
        ktvNoSound.setDisable(true);
        ktvBlackAndWhiteImage.setSelected(false);
        ktvBlackAndWhiteImage.setDisable(true);


        ktvNoSignal.setSelected(false);
        ktvNoSignalAll.setSelected(true);
        ktvNoSignalAll.setDisable(true);
        ktvNoSignalOnSome.setDisable(true);


        chkCabelContinuity.setSelected(false);
        chkCheckLevelSignal.setSelected(false);
        chkChannelsResearcheded.setSelected(false);


        txtGNum.setText("");
        radioPhoneOperStatDown.setSelected(true);

        radioPhoneMacVisiableNo.setSelected(true);
        radioPhoneMacVisiableNo.setDisable(true);
        radioPhoneMacVisiableYes.setDisable(true);

        chkAdapterReboted.setSelected(false);


        chkNoIncConnection.setSelected(false);
        chkNoOutConnection.setSelected(false);
        chkSipRegistration.setSelected(false);
        radioSipRegistrationYes.setSelected(true);
        radioSipRegistrationYes.setDisable(true);
        radioSipRegistrationNo.setDisable(true);

        chkCallFromOffice.setSelected(false);
        radioCallFromOfficeYes.setSelected(true);
        radioCallFromOfficeYes.setDisable(true);
        radioCallFromOfficeNo.setDisable(true);

        txtMoroMoro.setText("");

        chkWithSpecificNumber.setSelected(false);
        txtfieldWithSpecificNumber.setText("");
        txtfieldWithSpecificNumber.setDisable(true);

        radioNumberMatch.setSelected(true);
        radioNumberMatch.setDisable(true);
        radioNumberNoMatch.setDisable(true);

        chkOtherTA.setSelected(false);

        radioBeepInHandsetNo.setSelected(false);
        radioBeepInHandsetYes.setSelected(false);
        radioBeepInHandsetNo.setDisable(true);
        radioBeepInHandsetYes.setDisable(true);

        radioOtherTANo.setSelected(false);
        radioOtherTAYes.setSelected(false);
        radioOtherTANo.setDisable(true);
        radioOtherTAYes.setDisable(true);

        chkAdapterReboteded.setSelected(false);

        txtSamplesIncNumbers.setDisable(true);
        txtSamplesOutNumbers.setDisable(true);
        txtSamplesIncNumbers.setText("");
        txtSamplesOutNumbers.setText("");

        radioCharacterTresk.setSelected(true);
        chkIncNapr.setSelected(false);
        chkOutNapr.setSelected(false);
        chkWhoHerarsClient.setSelected(false);
        chkWhoHerarsSob.setSelected(false);
        radioOtherTAAYes.setSelected(true);

        chkLossToSwitch.setSelected(false);
        txtfieldLossToSwitch.setText("0");
        txtfieldLossToSwitch.setDisable(true);

        chkLossToGateway.setSelected(false);
        txtfieldLossToGateway.setText("");
        txtfieldLossToGateway.setDisable(true);

        chkShluzRebooted.setSelected(false);

        chkSignalAmplification.setSelected(false);
        radioSignalAmplificationUp.setSelected(true);
        radioSignalAmplificationUp.setDisable(true);
        radioSignalAmplificationDown.setDisable(true);

        chkErrorsForPort.setSelected(false);
        txtfieldErrorsForPort.setDisable(true);
        txtfieldErrorsForPort.setText("0");
        chkErrorsRastut.setSelected(false);
        chkErrorsRastut.setDisable(true);

        txtAreaSamplesInc.setDisable(true);
        txtAreaSamplesInc.setText("");
        txtAreaSamplesOut.setDisable(true);
        txtAreaSamplesOut.setText("");

        chkAon.setSelected(false);
        radioAonNotWork.setSelected(true);
        radioAonNotWork.setDisable(true);
        radioAonIncorrectWork.setDisable(true);
        lableSimplesOfNumber.setDisable(true);
        txtfieldSimplesOfNumber.setDisable(true);
        txtfieldSimplesOfNumber.setText("");
        lableDetectedNumber.setDisable(true);
        txtfieldDetectedNumber.setDisable(true);
        txtfieldDetectedNumber.setText("");

        chkIVR.setSelected(false);
        labelFormatOfNumber.setDisable(true);
        radioThrough7.setSelected(true);
        radioThrough7.setDisable(true);
        radioThrough7and8.setDisable(true);
        radioDialingLandlineNumber.setDisable(true);
        labelNumberSimpleses.setDisable(true);
        txtfieldNumberSimpleses.setDisable(true);
        txtfieldNumberSimpleses.setText("");

        chkTime.setSelected(false);


    }

    public void CopyClicked() {
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(textReqest.getText());
        clipboard.setContent(content);
    }

    public void TextexeClicked() throws IOException, URISyntaxException {
        String test = new String("212.33.255.58");
        launchBrowser(test);

    }

    private void launchBrowser(String uriStr) {
        Desktop desktop;
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                // launch browser
                URI uri;
                try {
                    uri = new URI("http://" + uriStr);
                    desktop.browse(uri);
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                } catch (URISyntaxException use) {
                    use.printStackTrace();
                }
            }
        }
    }

    //logic for remember

    public TextField txtRemNumDog;
    public TextField txtRemNumPhone;
    public TextField txtRemComment;
    public ComboBox comboHours;
    public ComboBox comboMinutes;
    public ListView listviewRemember;

    public TabPane remTabPane;


    public void CreateRememberClicked() {
        // Create the custom dialog.
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Добавить напоминание");
        dialog.setHeaderText("Введите пожалуйста номер договора и телефон:");


// Set the button types.
        ButtonType loginButtonType = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

// Create the username and password labels and fields.
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(40, 170, 10, 10));

        TextField dog = new TextField();
        dog.setPromptText("№ договора");
        TextField kt = new TextField();
        kt.setPromptText("№ телефона");
        TextArea komm = new TextArea();
        komm.setPromptText("Комментарий");
        komm.setWrapText(true);
        ComboBox Hours = new ComboBox(FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        Hours.setPromptText("Часов ");
        Hours.setEditable(true);
        ComboBox Minuts = new ComboBox(FXCollections.observableArrayList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55));
        Minuts.setPromptText("Минут");
        Minuts.setEditable(true);

        grid.add(new Label("1. Введите номер договора:"), 0, 0);
        grid.add(dog, 1, 0);
        grid.add(new Label("2. Введите контактный телефон:"), 0, 1);
        grid.add(kt, 1, 1);
        grid.add(new Label("3. Напомнить через:"), 0, 2);
        Hours.setPrefWidth(80);
        Minuts.setPrefWidth(80);
        HBox settime = new HBox(Hours, Minuts);

        grid.add(settime, 1, 2);
        grid.add(new Label("4. Введите комментарий:"), 0, 3);
        komm.setPrefWidth(50);
        grid.add(komm, 1, 3);




        dialog.getDialogPane().setContent(grid);


        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                if (!dog.equals("")) {
                    String hrs = null;
                    String mnts = null;

                    try {
                        Long.parseLong(dog.getText());
                        hrs = Hours.getEditor().getText();
                        if (hrs.equals("")) {
                            hrs = "0";
                        }
                        mnts = Minuts.getEditor().getText();
                        if (mnts.equals("")) {
                            mnts = "0";
                        }

                        Tab tab = new Tab();
                        tab.setText(dog.getText());


                        GridPane grids = new GridPane();

                        grids.setHgap(10);
                        grids.setVgap(10);
                        grids.setPadding(new Insets(40, 250, 10, 10));

                        TextField dogs = new TextField(dog.getText());
                        dog.setPromptText("№ договора");
                        dogs.setPrefWidth(110);
                        TextField kts = new TextField(kt.getText());
                        kt.setPromptText("№ телефона");
                        kts.setPrefWidth(110);
                        TextArea komms = new TextArea(komm.getText());
                        komms.setWrapText(true);
                        komm.setPromptText("Комментарий");
                        komms.setPrefWidth(150);
                        Label Time = new Label("  Напоминание через: " + hrs + " ч. " + mnts + " мин.");

                        Time.setFont(new Font("System", 15));


                        Label ss = new Label("Номер договора:");
                        grids.add(ss, 0, 0);
                        grids.add(dogs, 1, 0);
                        Label sd = new Label("Контактный телефон:");

                        grids.add(sd, 0, 1);
                        grids.add(kts, 1, 1);
                        Label sds = new Label("Комментарий:");

                        grids.add(sds, 0, 2);
                        grids.add(komms, 1, 2);

                        Label label = new Label();
                        label.setFont(new Font("System", 10));
                        HBox hBox = new HBox(Time);
                        VBox vBox = new VBox(label, hBox, grids);
                        tab.setContent(vBox);


                        remTabPane.getTabs().add(tab);

                        Long Secs = Long.parseLong(hrs) * 3600 + Long.parseLong(mnts) * 60;


                        Thread t = new Thread(new Runnable() {
                            public Long Hourses;
                            public Long Minuts;
                            public Long Seconds;


                            public void run() {

                                for (Long i = Secs; i >= 0; i--) {
                                    Long j = i;

                                    Hourses = j / 3600;
                                    j = j - Hourses * 3600;
                                    System.out.println("Часов: " + Hourses);


                                    Minuts = j / 60;
                                    j = j - Minuts * 60;
                                    Seconds = j;
                                    System.out.println("Минут: " + Minuts);
                                    System.out.println("Секунд: " + j);

                                    final Long finalJ = j;

                                    Platform.runLater(() -> Time.setText("  Напоминание через: " + Hourses + " ч. " + Minuts + " мин. " + finalJ + " сек."));
                                    System.out.println(i);
                                    try {
                                        Thread.sleep(20);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }


                                }

                                String bip = "ring.mp3";
                                Media hit = new Media(bip);
                                MediaPlayer mediaPlayer = new MediaPlayer(hit);
                                mediaPlayer.play();
                            }

                        });
                        t.start();

                        tab.setOnClosed(new EventHandler<javafx.event.Event>() {
                            @Override
                            public void handle(Event event) {
                                t.stop();
                            }
                        });

                    } catch (Exception e) {
                        System.out.println(e);
                        Alert alert = new Alert(Alert.AlertType.WARNING);
                        alert.setTitle("Внимание!!!");
                        alert.setHeaderText("Введите корректный номер договора!");
                        alert.showAndWait();
                    }



                }


                return null;
            }
            return null;
        });

        dialog.showAndWait();


    }

//    public class Timer extends Thread {
//        public Long Hourses;
//        public Long Minuts;
//        public Long Seconds;
//        public Long Secs;
//
//        public Long getSecs() {
//            return Secs;
//        }
//
//        public Long getHourses() {
//            return Hourses;
//        }
//
//        public Long getMinuts() {
//            return Minuts;
//        }
//
//        public Long getSeconds() {
//            return Seconds;
//        }
//
//        public Timer(Long Secs)
//        {
//            this.Secs = Secs;
//        }
//
//
//        public void run()
//        {
//            for (Long i = Secs; i>=0; i-- )
//            {
//
//                System.out.println(i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Long j=i;
//                if (j/3600>0)
//                {
//                    Hourses = j/3600;
//                    j = j - Hourses*3600;
//                    System.out.println("Часов: " + Hourses);
//                }
//                if (j/60>0)
//                {
//                    Minuts = j/60;
//                    j = j - Minuts*60;
//                    Seconds = j;
//                    System.out.println("Минут: " + Minuts);
//                    System.out.println("Секунд: " + j);
//                }
//
//            }
//
//        }
//
//
//    }
}



