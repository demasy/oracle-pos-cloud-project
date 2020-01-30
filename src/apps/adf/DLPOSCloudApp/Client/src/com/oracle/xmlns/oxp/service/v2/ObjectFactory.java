
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.oxp.service.v2 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("http://xmlns.oracle.com/oxp/service/v2", "fault");
    private final static QName _Fault1_QNAME = new QName("http://xmlns.oracle.com/oxp/service/v2", "fault1");
    private final static QName _Fault2_QNAME = new QName("http://xmlns.oracle.com/oxp/service/v2", "fault2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.oxp.service.v2
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTemplate }
     *
     */
    public GetTemplate createGetTemplate() {
        return new GetTemplate();
    }

    /**
     * Create an instance of {@link GetTemplateResponse }
     *
     */
    public GetTemplateResponse createGetTemplateResponse() {
        return new GetTemplateResponse();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     *
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link OperationFailedException }
     *
     */
    public OperationFailedException createOperationFailedException() {
        return new OperationFailedException();
    }

    /**
     * Create an instance of {@link InvalidParametersException }
     *
     */
    public InvalidParametersException createInvalidParametersException() {
        return new InvalidParametersException();
    }

    /**
     * Create an instance of {@link CreateReport }
     *
     */
    public CreateReport createCreateReport() {
        return new CreateReport();
    }

    /**
     * Create an instance of {@link CreateReportResponse }
     *
     */
    public CreateReportResponse createCreateReportResponse() {
        return new CreateReportResponse();
    }

    /**
     * Create an instance of {@link GetReportDefinitionInSession }
     *
     */
    public GetReportDefinitionInSession createGetReportDefinitionInSession() {
        return new GetReportDefinitionInSession();
    }

    /**
     * Create an instance of {@link GetReportDefinitionInSessionResponse }
     *
     */
    public GetReportDefinitionInSessionResponse createGetReportDefinitionInSessionResponse() {
        return new GetReportDefinitionInSessionResponse();
    }

    /**
     * Create an instance of {@link ReportDefinition }
     *
     */
    public ReportDefinition createReportDefinition() {
        return new ReportDefinition();
    }

    /**
     * Create an instance of {@link UpdateReportDefinitionInSession }
     *
     */
    public UpdateReportDefinitionInSession createUpdateReportDefinitionInSession() {
        return new UpdateReportDefinitionInSession();
    }

    /**
     * Create an instance of {@link UpdateReportDefinitionInSessionResponse }
     *
     */
    public UpdateReportDefinitionInSessionResponse createUpdateReportDefinitionInSessionResponse() {
        return new UpdateReportDefinitionInSessionResponse();
    }

    /**
     * Create an instance of {@link UpdateTemplateForReportInSession }
     *
     */
    public UpdateTemplateForReportInSession createUpdateTemplateForReportInSession() {
        return new UpdateTemplateForReportInSession();
    }

    /**
     * Create an instance of {@link UpdateTemplateForReportInSessionResponse }
     *
     */
    public UpdateTemplateForReportInSessionResponse createUpdateTemplateForReportInSessionResponse() {
        return new UpdateTemplateForReportInSessionResponse();
    }

    /**
     * Create an instance of {@link GetReportParameters }
     *
     */
    public GetReportParameters createGetReportParameters() {
        return new GetReportParameters();
    }

    /**
     * Create an instance of {@link ReportRequest }
     *
     */
    public ReportRequest createReportRequest() {
        return new ReportRequest();
    }

    /**
     * Create an instance of {@link GetReportParametersResponse }
     *
     */
    public GetReportParametersResponse createGetReportParametersResponse() {
        return new GetReportParametersResponse();
    }

    /**
     * Create an instance of {@link ParamNameValues }
     *
     */
    public ParamNameValues createParamNameValues() {
        return new ParamNameValues();
    }

    /**
     * Create an instance of {@link RunReport }
     *
     */
    public RunReport createRunReport() {
        return new RunReport();
    }

    /**
     * Create an instance of {@link RunReportResponse }
     *
     */
    public RunReportResponse createRunReportResponse() {
        return new RunReportResponse();
    }

    /**
     * Create an instance of {@link ReportResponse }
     *
     */
    public ReportResponse createReportResponse() {
        return new ReportResponse();
    }

    /**
     * Create an instance of {@link GetTemplateAvailableLocales }
     *
     */
    public GetTemplateAvailableLocales createGetTemplateAvailableLocales() {
        return new GetTemplateAvailableLocales();
    }

    /**
     * Create an instance of {@link GetTemplateAvailableLocalesResponse }
     *
     */
    public GetTemplateAvailableLocalesResponse createGetTemplateAvailableLocalesResponse() {
        return new GetTemplateAvailableLocalesResponse();
    }

    /**
     * Create an instance of {@link RunReportInSession }
     *
     */
    public RunReportInSession createRunReportInSession() {
        return new RunReportInSession();
    }

    /**
     * Create an instance of {@link RunReportInSessionResponse }
     *
     */
    public RunReportInSessionResponse createRunReportInSessionResponse() {
        return new RunReportInSessionResponse();
    }

    /**
     * Create an instance of {@link RunDataModel }
     *
     */
    public RunDataModel createRunDataModel() {
        return new RunDataModel();
    }

    /**
     * Create an instance of {@link RunDataModelResponse }
     *
     */
    public RunDataModelResponse createRunDataModelResponse() {
        return new RunDataModelResponse();
    }

    /**
     * Create an instance of {@link RunDataModelInSession }
     *
     */
    public RunDataModelInSession createRunDataModelInSession() {
        return new RunDataModelInSession();
    }

    /**
     * Create an instance of {@link RunDataModelInSessionResponse }
     *
     */
    public RunDataModelInSessionResponse createRunDataModelInSessionResponse() {
        return new RunDataModelInSessionResponse();
    }

    /**
     * Create an instance of {@link GetReportDefinition }
     *
     */
    public GetReportDefinition createGetReportDefinition() {
        return new GetReportDefinition();
    }

    /**
     * Create an instance of {@link GetReportDefinitionResponse }
     *
     */
    public GetReportDefinitionResponse createGetReportDefinitionResponse() {
        return new GetReportDefinitionResponse();
    }

    /**
     * Create an instance of {@link GetMobileAppDefinition }
     *
     */
    public GetMobileAppDefinition createGetMobileAppDefinition() {
        return new GetMobileAppDefinition();
    }

    /**
     * Create an instance of {@link GetMobileAppDefinitionResponse }
     *
     */
    public GetMobileAppDefinitionResponse createGetMobileAppDefinitionResponse() {
        return new GetMobileAppDefinitionResponse();
    }

    /**
     * Create an instance of {@link MobileAppDefinition }
     *
     */
    public MobileAppDefinition createMobileAppDefinition() {
        return new MobileAppDefinition();
    }

    /**
     * Create an instance of {@link GetMobileAppDefinitionInSession }
     *
     */
    public GetMobileAppDefinitionInSession createGetMobileAppDefinitionInSession() {
        return new GetMobileAppDefinitionInSession();
    }

    /**
     * Create an instance of {@link GetMobileAppDefinitionInSessionResponse }
     *
     */
    public GetMobileAppDefinitionInSessionResponse createGetMobileAppDefinitionInSessionResponse() {
        return new GetMobileAppDefinitionInSessionResponse();
    }

    /**
     * Create an instance of {@link GetReportSampleData }
     *
     */
    public GetReportSampleData createGetReportSampleData() {
        return new GetReportSampleData();
    }

    /**
     * Create an instance of {@link GetReportSampleDataResponse }
     *
     */
    public GetReportSampleDataResponse createGetReportSampleDataResponse() {
        return new GetReportSampleDataResponse();
    }

    /**
     * Create an instance of {@link GetReportSampleDataInSession }
     *
     */
    public GetReportSampleDataInSession createGetReportSampleDataInSession() {
        return new GetReportSampleDataInSession();
    }

    /**
     * Create an instance of {@link GetReportSampleDataInSessionResponse }
     *
     */
    public GetReportSampleDataInSessionResponse createGetReportSampleDataInSessionResponse() {
        return new GetReportSampleDataInSessionResponse();
    }

    /**
     * Create an instance of {@link GetXDOSchema }
     *
     */
    public GetXDOSchema createGetXDOSchema() {
        return new GetXDOSchema();
    }

    /**
     * Create an instance of {@link GetXDOSchemaResponse }
     *
     */
    public GetXDOSchemaResponse createGetXDOSchemaResponse() {
        return new GetXDOSchemaResponse();
    }

    /**
     * Create an instance of {@link GetXDOSchemaInSession }
     *
     */
    public GetXDOSchemaInSession createGetXDOSchemaInSession() {
        return new GetXDOSchemaInSession();
    }

    /**
     * Create an instance of {@link GetXDOSchemaInSessionResponse }
     *
     */
    public GetXDOSchemaInSessionResponse createGetXDOSchemaInSessionResponse() {
        return new GetXDOSchemaInSessionResponse();
    }

    /**
     * Create an instance of {@link GetTemplateAvailableLocalesInSession }
     *
     */
    public GetTemplateAvailableLocalesInSession createGetTemplateAvailableLocalesInSession() {
        return new GetTemplateAvailableLocalesInSession();
    }

    /**
     * Create an instance of {@link GetTemplateAvailableLocalesInSessionResponse }
     *
     */
    public GetTemplateAvailableLocalesInSessionResponse createGetTemplateAvailableLocalesInSessionResponse() {
        return new GetTemplateAvailableLocalesInSessionResponse();
    }

    /**
     * Create an instance of {@link GetTemplateAvailableXLIFFs }
     *
     */
    public GetTemplateAvailableXLIFFs createGetTemplateAvailableXLIFFs() {
        return new GetTemplateAvailableXLIFFs();
    }

    /**
     * Create an instance of {@link GetTemplateAvailableXLIFFsResponse }
     *
     */
    public GetTemplateAvailableXLIFFsResponse createGetTemplateAvailableXLIFFsResponse() {
        return new GetTemplateAvailableXLIFFsResponse();
    }

    /**
     * Create an instance of {@link GetTemplateAvailableXLIFFsInSession }
     *
     */
    public GetTemplateAvailableXLIFFsInSession createGetTemplateAvailableXLIFFsInSession() {
        return new GetTemplateAvailableXLIFFsInSession();
    }

    /**
     * Create an instance of {@link GetTemplateAvailableXLIFFsInSessionResponse }
     *
     */
    public GetTemplateAvailableXLIFFsInSessionResponse createGetTemplateAvailableXLIFFsInSessionResponse() {
        return new GetTemplateAvailableXLIFFsInSessionResponse();
    }

    /**
     * Create an instance of {@link GetTemplateInSession }
     *
     */
    public GetTemplateInSession createGetTemplateInSession() {
        return new GetTemplateInSession();
    }

    /**
     * Create an instance of {@link GetTemplateInSessionResponse }
     *
     */
    public GetTemplateInSessionResponse createGetTemplateInSessionResponse() {
        return new GetTemplateInSessionResponse();
    }

    /**
     * Create an instance of {@link GetReportParametersInSession }
     *
     */
    public GetReportParametersInSession createGetReportParametersInSession() {
        return new GetReportParametersInSession();
    }

    /**
     * Create an instance of {@link GetReportParametersInSessionResponse }
     *
     */
    public GetReportParametersInSessionResponse createGetReportParametersInSessionResponse() {
        return new GetReportParametersInSessionResponse();
    }

    /**
     * Create an instance of {@link GetTemplateParameters }
     *
     */
    public GetTemplateParameters createGetTemplateParameters() {
        return new GetTemplateParameters();
    }

    /**
     * Create an instance of {@link GetTemplateParametersResponse }
     *
     */
    public GetTemplateParametersResponse createGetTemplateParametersResponse() {
        return new GetTemplateParametersResponse();
    }

    /**
     * Create an instance of {@link ParamNameValue }
     *
     */
    public ParamNameValue createParamNameValue() {
        return new ParamNameValue();
    }

    /**
     * Create an instance of {@link GetTemplateParametersInSession }
     *
     */
    public GetTemplateParametersInSession createGetTemplateParametersInSession() {
        return new GetTemplateParametersInSession();
    }

    /**
     * Create an instance of {@link GetTemplateParametersInSessionResponse }
     *
     */
    public GetTemplateParametersInSessionResponse createGetTemplateParametersInSessionResponse() {
        return new GetTemplateParametersInSessionResponse();
    }

    /**
     * Create an instance of {@link GetListOfSubjectArea }
     *
     */
    public GetListOfSubjectArea createGetListOfSubjectArea() {
        return new GetListOfSubjectArea();
    }

    /**
     * Create an instance of {@link GetListOfSubjectAreaResponse }
     *
     */
    public GetListOfSubjectAreaResponse createGetListOfSubjectAreaResponse() {
        return new GetListOfSubjectAreaResponse();
    }

    /**
     * Create an instance of {@link GetListOfSubjectAreaInSession }
     *
     */
    public GetListOfSubjectAreaInSession createGetListOfSubjectAreaInSession() {
        return new GetListOfSubjectAreaInSession();
    }

    /**
     * Create an instance of {@link GetListOfSubjectAreaInSessionResponse }
     *
     */
    public GetListOfSubjectAreaInSessionResponse createGetListOfSubjectAreaInSessionResponse() {
        return new GetListOfSubjectAreaInSessionResponse();
    }

    /**
     * Create an instance of {@link CreateReportInSession }
     *
     */
    public CreateReportInSession createCreateReportInSession() {
        return new CreateReportInSession();
    }

    /**
     * Create an instance of {@link CreateReportInSessionResponse }
     *
     */
    public CreateReportInSessionResponse createCreateReportInSessionResponse() {
        return new CreateReportInSessionResponse();
    }

    /**
     * Create an instance of {@link UpdateReportDefinition }
     *
     */
    public UpdateReportDefinition createUpdateReportDefinition() {
        return new UpdateReportDefinition();
    }

    /**
     * Create an instance of {@link UpdateReportDefinitionResponse }
     *
     */
    public UpdateReportDefinitionResponse createUpdateReportDefinitionResponse() {
        return new UpdateReportDefinitionResponse();
    }

    /**
     * Create an instance of {@link UpdateMobileAppDefinition }
     *
     */
    public UpdateMobileAppDefinition createUpdateMobileAppDefinition() {
        return new UpdateMobileAppDefinition();
    }

    /**
     * Create an instance of {@link UpdateMobileAppDefinitionResponse }
     *
     */
    public UpdateMobileAppDefinitionResponse createUpdateMobileAppDefinitionResponse() {
        return new UpdateMobileAppDefinitionResponse();
    }

    /**
     * Create an instance of {@link UpdateMobileAppDefinitionInSession }
     *
     */
    public UpdateMobileAppDefinitionInSession createUpdateMobileAppDefinitionInSession() {
        return new UpdateMobileAppDefinitionInSession();
    }

    /**
     * Create an instance of {@link UpdateMobileAppDefinitionInSessionResponse }
     *
     */
    public UpdateMobileAppDefinitionInSessionResponse createUpdateMobileAppDefinitionInSessionResponse() {
        return new UpdateMobileAppDefinitionInSessionResponse();
    }

    /**
     * Create an instance of {@link UploadTemplateForReport }
     *
     */
    public UploadTemplateForReport createUploadTemplateForReport() {
        return new UploadTemplateForReport();
    }

    /**
     * Create an instance of {@link UploadTemplateForReportResponse }
     *
     */
    public UploadTemplateForReportResponse createUploadTemplateForReportResponse() {
        return new UploadTemplateForReportResponse();
    }

    /**
     * Create an instance of {@link UploadTemplateForReportInSession }
     *
     */
    public UploadTemplateForReportInSession createUploadTemplateForReportInSession() {
        return new UploadTemplateForReportInSession();
    }

    /**
     * Create an instance of {@link UploadTemplateForReportInSessionResponse }
     *
     */
    public UploadTemplateForReportInSessionResponse createUploadTemplateForReportInSessionResponse() {
        return new UploadTemplateForReportInSessionResponse();
    }

    /**
     * Create an instance of {@link UpdateTemplateForReport }
     *
     */
    public UpdateTemplateForReport createUpdateTemplateForReport() {
        return new UpdateTemplateForReport();
    }

    /**
     * Create an instance of {@link UpdateTemplateForReportResponse }
     *
     */
    public UpdateTemplateForReportResponse createUpdateTemplateForReportResponse() {
        return new UpdateTemplateForReportResponse();
    }

    /**
     * Create an instance of {@link RemoveTemplateForReport }
     *
     */
    public RemoveTemplateForReport createRemoveTemplateForReport() {
        return new RemoveTemplateForReport();
    }

    /**
     * Create an instance of {@link RemoveTemplateForReportResponse }
     *
     */
    public RemoveTemplateForReportResponse createRemoveTemplateForReportResponse() {
        return new RemoveTemplateForReportResponse();
    }

    /**
     * Create an instance of {@link RemoveTemplateForReportInSession }
     *
     */
    public RemoveTemplateForReportInSession createRemoveTemplateForReportInSession() {
        return new RemoveTemplateForReportInSession();
    }

    /**
     * Create an instance of {@link RemoveTemplateForReportInSessionResponse }
     *
     */
    public RemoveTemplateForReportInSessionResponse createRemoveTemplateForReportInSessionResponse() {
        return new RemoveTemplateForReportInSessionResponse();
    }

    /**
     * Create an instance of {@link UploadXLIFFForReport }
     *
     */
    public UploadXLIFFForReport createUploadXLIFFForReport() {
        return new UploadXLIFFForReport();
    }

    /**
     * Create an instance of {@link UploadXLIFFForReportResponse }
     *
     */
    public UploadXLIFFForReportResponse createUploadXLIFFForReportResponse() {
        return new UploadXLIFFForReportResponse();
    }

    /**
     * Create an instance of {@link UpdateXLIFFForReportInSession }
     *
     */
    public UpdateXLIFFForReportInSession createUpdateXLIFFForReportInSession() {
        return new UpdateXLIFFForReportInSession();
    }

    /**
     * Create an instance of {@link UpdateXLIFFForReportInSessionResponse }
     *
     */
    public UpdateXLIFFForReportInSessionResponse createUpdateXLIFFForReportInSessionResponse() {
        return new UpdateXLIFFForReportInSessionResponse();
    }

    /**
     * Create an instance of {@link UpdateXLIFFForReport }
     *
     */
    public UpdateXLIFFForReport createUpdateXLIFFForReport() {
        return new UpdateXLIFFForReport();
    }

    /**
     * Create an instance of {@link UpdateXLIFFForReportResponse }
     *
     */
    public UpdateXLIFFForReportResponse createUpdateXLIFFForReportResponse() {
        return new UpdateXLIFFForReportResponse();
    }

    /**
     * Create an instance of {@link UploadXLIFFForReportInSession }
     *
     */
    public UploadXLIFFForReportInSession createUploadXLIFFForReportInSession() {
        return new UploadXLIFFForReportInSession();
    }

    /**
     * Create an instance of {@link UploadXLIFFForReportInSessionResponse }
     *
     */
    public UploadXLIFFForReportInSessionResponse createUploadXLIFFForReportInSessionResponse() {
        return new UploadXLIFFForReportInSessionResponse();
    }

    /**
     * Create an instance of {@link UploadReportDataChunk }
     *
     */
    public UploadReportDataChunk createUploadReportDataChunk() {
        return new UploadReportDataChunk();
    }

    /**
     * Create an instance of {@link UploadReportDataChunkResponse }
     *
     */
    public UploadReportDataChunkResponse createUploadReportDataChunkResponse() {
        return new UploadReportDataChunkResponse();
    }

    /**
     * Create an instance of {@link UploadReportDataChunkInSession }
     *
     */
    public UploadReportDataChunkInSession createUploadReportDataChunkInSession() {
        return new UploadReportDataChunkInSession();
    }

    /**
     * Create an instance of {@link UploadReportDataChunkInSessionResponse }
     *
     */
    public UploadReportDataChunkInSessionResponse createUploadReportDataChunkInSessionResponse() {
        return new UploadReportDataChunkInSessionResponse();
    }

    /**
     * Create an instance of {@link DownloadReportDataChunk }
     *
     */
    public DownloadReportDataChunk createDownloadReportDataChunk() {
        return new DownloadReportDataChunk();
    }

    /**
     * Create an instance of {@link DownloadReportDataChunkResponse }
     *
     */
    public DownloadReportDataChunkResponse createDownloadReportDataChunkResponse() {
        return new DownloadReportDataChunkResponse();
    }

    /**
     * Create an instance of {@link ReportDataChunk }
     *
     */
    public ReportDataChunk createReportDataChunk() {
        return new ReportDataChunk();
    }

    /**
     * Create an instance of {@link DownloadReportDataChunkInSession }
     *
     */
    public DownloadReportDataChunkInSession createDownloadReportDataChunkInSession() {
        return new DownloadReportDataChunkInSession();
    }

    /**
     * Create an instance of {@link DownloadReportDataChunkInSessionResponse }
     *
     */
    public DownloadReportDataChunkInSessionResponse createDownloadReportDataChunkInSessionResponse() {
        return new DownloadReportDataChunkInSessionResponse();
    }

    /**
     * Create an instance of {@link RemoveObjectFromCache }
     *
     */
    public RemoveObjectFromCache createRemoveObjectFromCache() {
        return new RemoveObjectFromCache();
    }

    /**
     * Create an instance of {@link RemoveObjectFromCacheResponse }
     *
     */
    public RemoveObjectFromCacheResponse createRemoveObjectFromCacheResponse() {
        return new RemoveObjectFromCacheResponse();
    }

    /**
     * Create an instance of {@link RemoveObjectFromCacheInSession }
     *
     */
    public RemoveObjectFromCacheInSession createRemoveObjectFromCacheInSession() {
        return new RemoveObjectFromCacheInSession();
    }

    /**
     * Create an instance of {@link RemoveObjectFromCacheInSessionResponse }
     *
     */
    public RemoveObjectFromCacheInSessionResponse createRemoveObjectFromCacheInSessionResponse() {
        return new RemoveObjectFromCacheInSessionResponse();
    }

    /**
     * Create an instance of {@link TemplateFormatLabelValue }
     *
     */
    public TemplateFormatLabelValue createTemplateFormatLabelValue() {
        return new TemplateFormatLabelValue();
    }

    /**
     * Create an instance of {@link ArrayOfTemplateFormatLabelValue }
     *
     */
    public ArrayOfTemplateFormatLabelValue createArrayOfTemplateFormatLabelValue() {
        return new ArrayOfTemplateFormatLabelValue();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     *
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link TemplateFormatsLabelValues }
     *
     */
    public TemplateFormatsLabelValues createTemplateFormatsLabelValues() {
        return new TemplateFormatsLabelValues();
    }

    /**
     * Create an instance of {@link ArrayOfTemplateFormatsLabelValues }
     *
     */
    public ArrayOfTemplateFormatsLabelValues createArrayOfTemplateFormatsLabelValues() {
        return new ArrayOfTemplateFormatsLabelValues();
    }

    /**
     * Create an instance of {@link ArrayOfParamNameValue }
     *
     */
    public ArrayOfParamNameValue createArrayOfParamNameValue() {
        return new ArrayOfParamNameValue();
    }

    /**
     * Create an instance of {@link MetaData }
     *
     */
    public MetaData createMetaData() {
        return new MetaData();
    }

    /**
     * Create an instance of {@link ArrayOfMetaData }
     *
     */
    public ArrayOfMetaData createArrayOfMetaData() {
        return new ArrayOfMetaData();
    }

    /**
     * Create an instance of {@link MetaDataList }
     *
     */
    public MetaDataList createMetaDataList() {
        return new MetaDataList();
    }

    /**
     * Create an instance of {@link JDBCDataSource }
     *
     */
    public JDBCDataSource createJDBCDataSource() {
        return new JDBCDataSource();
    }

    /**
     * Create an instance of {@link FileDataSource }
     *
     */
    public FileDataSource createFileDataSource() {
        return new FileDataSource();
    }

    /**
     * Create an instance of {@link BIPDataSource }
     *
     */
    public BIPDataSource createBIPDataSource() {
        return new BIPDataSource();
    }

    /**
     * Create an instance of {@link MobileTemplateFormatsLabelValues }
     *
     */
    public MobileTemplateFormatsLabelValues createMobileTemplateFormatsLabelValues() {
        return new MobileTemplateFormatsLabelValues();
    }

    /**
     * Create an instance of {@link ArrayOfMobileTemplateFormatsLabelValues }
     *
     */
    public ArrayOfMobileTemplateFormatsLabelValues createArrayOfMobileTemplateFormatsLabelValues() {
        return new ArrayOfMobileTemplateFormatsLabelValues();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessDeniedException }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessDeniedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oxp/service/v2", name = "fault")
    public JAXBElement<AccessDeniedException> createFault(AccessDeniedException value) {
        return new JAXBElement<AccessDeniedException>(_Fault_QNAME, AccessDeniedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationFailedException }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationFailedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oxp/service/v2", name = "fault1")
    public JAXBElement<OperationFailedException> createFault1(OperationFailedException value) {
        return new JAXBElement<OperationFailedException>(_Fault1_QNAME, OperationFailedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidParametersException }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidParametersException }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oxp/service/v2", name = "fault2")
    public JAXBElement<InvalidParametersException> createFault2(InvalidParametersException value) {
        return new JAXBElement<InvalidParametersException>(_Fault2_QNAME, InvalidParametersException.class, null,
                                                           value);
    }

}
