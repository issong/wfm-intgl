package com._360scheduling.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-10-10T09:08:14.201+09:00
 * Generated source version: 2.6.2
 *
 */
@WebService(targetNamespace = "http://360Scheduling.com/Interfaces/", name = "ServicesSoap")
@XmlSeeAlso({ObjectFactory.class, com._360scheduling.schema.dsscheduledata.ObjectFactory.class})
public interface ServicesSoap {

    @WebResult(name = "SendDataTo360FromFileResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "SendDataTo360FromFile", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360FromFile")
    @WebMethod(operationName = "SendDataTo360FromFile", action = "http://360Scheduling.com/Interfaces/SendDataTo360FromFile")
    @ResponseWrapper(localName = "SendDataTo360FromFileResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360FromFileResponse")
    public java.lang.String sendDataTo360FromFile(
        @WebParam(name = "filePath", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String filePath,
        @WebParam(name = "nDataType", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nDataType,
        @WebParam(name = "bSynchronous", targetNamespace = "http://360Scheduling.com/Interfaces/")
        boolean bSynchronous,
        @WebParam(name = "bNoResponse", targetNamespace = "http://360Scheduling.com/Interfaces/")
        boolean bNoResponse
    );

    @RequestWrapper(localName = "SendStringDataTo360SyncNoResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendStringDataTo360SyncNoResponse")
    @WebMethod(operationName = "SendStringDataTo360SyncNoResponse", action = "http://360Scheduling.com/Interfaces/SendStringDataTo360SyncNoResponse")
    @ResponseWrapper(localName = "SendStringDataTo360SyncNoResponseResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendStringDataTo360SyncNoResponseResponse")
    public void sendStringDataTo360SyncNoResponse(
        @WebParam(name = "strInputXML", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String strInputXML,
        @WebParam(name = "nDataType", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nDataType
    );

    @WebResult(name = "FileInterfaceInputResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "FileInterfaceInput", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.FileInterfaceInput")
    @WebMethod(operationName = "FileInterfaceInput", action = "http://360Scheduling.com/Interfaces/FileInterfaceInput")
    @ResponseWrapper(localName = "FileInterfaceInputResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.FileInterfaceInputResponse")
    public java.lang.String fileInterfaceInput(
        @WebParam(name = "filePath", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String filePath
    );

    @WebResult(name = "SendDataTo360SyncResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "SendDataTo360Sync", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360Sync")
    @WebMethod(operationName = "SendDataTo360Sync", action = "http://360Scheduling.com/Interfaces/SendDataTo360Sync")
    @ResponseWrapper(localName = "SendDataTo360SyncResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360SyncResponse")
    public int sendDataTo360Sync(
        @WebParam(name = "dsInput", targetNamespace = "http://360Scheduling.com/Interfaces/")
        com._360scheduling.interfaces.SendDataTo360Sync.DsInput dsInput,
        @WebParam(name = "nDataType", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nDataType
    );

    @WebResult(name = "SendXmlDocumentResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "SendXmlDocument", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendXmlDocument")
    @WebMethod(operationName = "SendXmlDocument", action = "http://360Scheduling.com/Interfaces/SendXmlDocument")
    @ResponseWrapper(localName = "SendXmlDocumentResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendXmlDocumentResponse")
    public int sendXmlDocument(
        @WebParam(name = "xml", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String xml
    );

    @WebResult(name = "StandardInterfaceInputSyncResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "StandardInterfaceInputSync", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.StandardInterfaceInputSync")
    @WebMethod(operationName = "StandardInterfaceInputSync", action = "http://360Scheduling.com/Interfaces/StandardInterfaceInputSync")
    @ResponseWrapper(localName = "StandardInterfaceInputSyncResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.StandardInterfaceInputSyncResponse")
    public int standardInterfaceInputSync(
        @WebParam(name = "dsInput", targetNamespace = "http://360Scheduling.com/Interfaces/")
        com._360scheduling.interfaces.StandardInterfaceInputSync.DsInput dsInput
    );

    @WebResult(name = "SendDataTo360Result", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "SendDataTo360", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360")
    @WebMethod(operationName = "SendDataTo360", action = "http://360Scheduling.com/Interfaces/SendDataTo360")
    @ResponseWrapper(localName = "SendDataTo360Response", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360Response")
    public int sendDataTo360(
        @WebParam(name = "dsInput", targetNamespace = "http://360Scheduling.com/Interfaces/")
        com._360scheduling.interfaces.SendDataTo360.DsInput dsInput,
        @WebParam(name = "nDataType", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nDataType
    );

    @WebResult(name = "StandardInterfaceInputResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "StandardInterfaceInput", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.StandardInterfaceInput")
    @WebMethod(operationName = "StandardInterfaceInput", action = "http://360Scheduling.com/Interfaces/StandardInterfaceInput")
    @ResponseWrapper(localName = "StandardInterfaceInputResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.StandardInterfaceInputResponse")
    public int standardInterfaceInput(
        @WebParam(name = "dsInput", targetNamespace = "http://360Scheduling.com/Interfaces/")
        com._360scheduling.interfaces.StandardInterfaceInput.DsInput dsInput
    );

    @WebResult(name = "SendStringDataTo360SyncResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "SendStringDataTo360Sync", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendStringDataTo360Sync")
    @WebMethod(operationName = "SendStringDataTo360Sync", action = "http://360Scheduling.com/Interfaces/SendStringDataTo360Sync")
    @ResponseWrapper(localName = "SendStringDataTo360SyncResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendStringDataTo360SyncResponse")
    public int sendStringDataTo360Sync(
        @WebParam(name = "strInputXML", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String strInputXML,
        @WebParam(name = "nDataType", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nDataType
    );

    @WebResult(name = "ReceiveStringDataResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "ReceiveStringData", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveStringData")
    @WebMethod(operationName = "ReceiveStringData", action = "http://360Scheduling.com/Interfaces/ReceiveStringData")
    @ResponseWrapper(localName = "ReceiveStringDataResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveStringDataResponse")
    public boolean receiveStringData(
        @WebParam(name = "strOutputXML", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String strOutputXML
    );

    @RequestWrapper(localName = "SendDataTo360SyncNoResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360SyncNoResponse")
    @WebMethod(operationName = "SendDataTo360SyncNoResponse", action = "http://360Scheduling.com/Interfaces/SendDataTo360SyncNoResponse")
    @ResponseWrapper(localName = "SendDataTo360SyncNoResponseResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360SyncNoResponseResponse")
    public void sendDataTo360SyncNoResponse(
        @WebParam(name = "dsInput", targetNamespace = "http://360Scheduling.com/Interfaces/")
        com._360scheduling.interfaces.SendDataTo360SyncNoResponse.DsInput dsInput,
        @WebParam(name = "nDataType", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nDataType
    );

    @WebResult(name = "SendStringDataTo360Result", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "SendStringDataTo360", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendStringDataTo360")
    @WebMethod(operationName = "SendStringDataTo360", action = "http://360Scheduling.com/Interfaces/SendStringDataTo360")
    @ResponseWrapper(localName = "SendStringDataTo360Response", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendStringDataTo360Response")
    public int sendStringDataTo360(
        @WebParam(name = "strInputXML", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String strInputXML,
        @WebParam(name = "nDataType", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nDataType
    );

    @WebResult(name = "ReceiveWorkbenchDataResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "ReceiveWorkbenchData", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveWorkbenchData")
    @WebMethod(operationName = "ReceiveWorkbenchData", action = "http://360Scheduling.com/Interfaces/ReceiveWorkbenchData")
    @ResponseWrapper(localName = "ReceiveWorkbenchDataResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveWorkbenchDataResponse")
    public com._360scheduling.interfaces.ReceiveWorkbenchDataResult receiveWorkbenchData(
        @WebParam(name = "strInputXML", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String strInputXML,
        @WebParam(name = "strLanguageId", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String strLanguageId
    );

    @RequestWrapper(localName = "SendStringDataTo360NoResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendStringDataTo360NoResponse")
    @WebMethod(operationName = "SendStringDataTo360NoResponse", action = "http://360Scheduling.com/Interfaces/SendStringDataTo360NoResponse")
    @ResponseWrapper(localName = "SendStringDataTo360NoResponseResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendStringDataTo360NoResponseResponse")
    public void sendStringDataTo360NoResponse(
        @WebParam(name = "strInputXML", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String strInputXML,
        @WebParam(name = "nDataType", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nDataType
    );

    @RequestWrapper(localName = "ReceiveData", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveData")
    @WebMethod(operationName = "ReceiveData", action = "http://360Scheduling.com/Interfaces/ReceiveData")
    @ResponseWrapper(localName = "ReceiveDataResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveDataResponse")
    public void receiveData(
        @WebParam(name = "dsOutput", targetNamespace = "http://360Scheduling.com/Interfaces/")
        com._360scheduling.interfaces.ReceiveData.DsOutput dsOutput
    );

    @WebResult(name = "UploadFileFromConfigPathResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "UploadFileFromConfigPath", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.UploadFileFromConfigPath")
    @WebMethod(operationName = "UploadFileFromConfigPath", action = "http://360Scheduling.com/Interfaces/UploadFileFromConfigPath")
    @ResponseWrapper(localName = "UploadFileFromConfigPathResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.UploadFileFromConfigPathResponse")
    public java.lang.String uploadFileFromConfigPath();

    @RequestWrapper(localName = "SendDataTo360NoResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360NoResponse")
    @WebMethod(operationName = "SendDataTo360NoResponse", action = "http://360Scheduling.com/Interfaces/SendDataTo360NoResponse")
    @ResponseWrapper(localName = "SendDataTo360NoResponseResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendDataTo360NoResponseResponse")
    public void sendDataTo360NoResponse(
        @WebParam(name = "dsInput", targetNamespace = "http://360Scheduling.com/Interfaces/")
        com._360scheduling.interfaces.SendDataTo360NoResponse.DsInput dsInput,
        @WebParam(name = "nDataType", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nDataType
    );

    @WebResult(name = "InputAndWaitResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "InputAndWait", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.InputAndWait")
    @WebMethod(operationName = "InputAndWait", action = "http://360Scheduling.com/Interfaces/InputAndWait")
    @ResponseWrapper(localName = "InputAndWaitResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.InputAndWaitResponse")
    public com._360scheduling.interfaces.InputAndWaitResponse.InputAndWaitResult inputAndWait(
        @WebParam(name = "dsInput", targetNamespace = "http://360Scheduling.com/Interfaces/")
        com._360scheduling.interfaces.InputAndWait.DsInput dsInput,
        @WebParam(name = "minimumPlanQuality", targetNamespace = "http://360Scheduling.com/Interfaces/")
        double minimumPlanQuality,
        @WebParam(name = "maxWaitMinutes", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int maxWaitMinutes,
        @WebParam(name = "nPlanTypesRequired", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int nPlanTypesRequired
    );

    @WebResult(name = "TestConnectionResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "TestConnection", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.TestConnection")
    @WebMethod(operationName = "TestConnection", action = "http://360Scheduling.com/Interfaces/TestConnection")
    @ResponseWrapper(localName = "TestConnectionResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.TestConnectionResponse")
    public java.lang.String testConnection();

    @WebResult(name = "SendTestDocumentResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
    @RequestWrapper(localName = "SendTestDocument", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendTestDocument")
    @WebMethod(operationName = "SendTestDocument", action = "http://360Scheduling.com/Interfaces/SendTestDocument")
    @ResponseWrapper(localName = "SendTestDocumentResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.SendTestDocumentResponse")
    public int sendTestDocument(
        @WebParam(name = "xml", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String xml,
        @WebParam(name = "licenceKey", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String licenceKey,
        @WebParam(name = "broadcastId", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String broadcastId,
        @WebParam(name = "path", targetNamespace = "http://360Scheduling.com/Interfaces/")
        java.lang.String path,
        @WebParam(name = "planQuality", targetNamespace = "http://360Scheduling.com/Interfaces/")
        double planQuality,
        @WebParam(name = "waitMinutes", targetNamespace = "http://360Scheduling.com/Interfaces/")
        int waitMinutes
    );
}
