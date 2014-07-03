package org.airavata.appcatalog.cpi;

import org.apache.airavata.model.appcatalog.computeresource.*;

import java.util.List;
import java.util.Map;

public interface ComputeResource {
    /**
     * This function will add a compute resource description to the database
     * @param description compute resource description
     * @return unique resource ID generated by airavata
     */
    String addComputeResource (ComputeResourceDescription description) throws AppCatalogException;

    /**
     * This method will update compute resource
     * @param computeResourceId unique compute resource id
     * @param updatedComputeResource updated compute resource
     */
    void updateComputeResource (String computeResourceId, ComputeResourceDescription updatedComputeResource) throws AppCatalogException;
    /**
     * This function will add a SSHJobSubmission to the database
     * @param sshJobSubmission sshJobSubmission object
     * @return unique submission ID generated by airavata
     */
    String addSSHJobSubmission (SSHJobSubmission sshJobSubmission) throws AppCatalogException;

    /**
     * This will add a SSHJobSubmission protocol to the database
     * @param computeResourceId compute resource id
     * @param jobSubmissionId job submission id
     */
    void addSSHJobSubmissionProtocol(String computeResourceId, String jobSubmissionId) throws AppCatalogException;

    /**
     * This method will add a GSISSHJobSubmission to the database
     * @param gsisshJobSubmission GSISSHJobSubmission object
     * @return uniquely generated submission id
     */
    String addGSISSHJobSubmission (GSISSHJobSubmission gsisshJobSubmission) throws AppCatalogException;

    /**
     * This will add a GSISSHJobSubmission protocol to the database
     * @param computeResourceId compute resource id
     * @param jobSubmissionId job submission id
     */
    void addGSISSHJobSubmissionProtocol (String computeResourceId, String jobSubmissionId) throws AppCatalogException;

    /**
     * This method will add a GlobusJobSubmission to the database
     * @param globusJobSubmission GSISSHJobSubmission object
     * @return uniquely generated submission id
     */
    String addGlobusJobSubmission (GlobusJobSubmission globusJobSubmission) throws AppCatalogException;

    /**
     * This will add a GlobusJobSubmission protocol to the database
     * @param computeResourceId compute resource id
     * @param jobSubmissionId job submission id
     */
    void addGlobusJobSubmissionProtocol (String computeResourceId, String jobSubmissionId) throws AppCatalogException;

    /**
     * This method will add a SCPData movement to the database
     * @param scpDataMovement SCPData movement object
     * @return uniquely generated data move id
     */
    String addScpDataMovement (SCPDataMovement scpDataMovement) throws AppCatalogException;

    /**
     * This will add a SCPDataMovement protocol to the database
     * @param computeResourceId compute resource id
     * @param dataMoveId data movement id
     */
    void addScpDataMovementProtocol (String computeResourceId, String dataMoveId) throws AppCatalogException;

    /**
     * This method will add a GridFTP Data movement to the database
     * @param gridFTPDataMovement GridFTP Data movement object
     * @return uniquely generated data move id
     */
    String addGridFTPDataMovement (GridFTPDataMovement gridFTPDataMovement) throws AppCatalogException;

    /**
     * This will add a GridFTPDataMovement protocol to the database
     * @param computeResourceId compute resource id
     * @param dataMoveId data movement id
     */
    void addGridFTPDataMovementProtocol (String computeResourceId, String dataMoveId) throws AppCatalogException;

    /**
     * This method will retrieve compute resource object on given resource id
     * @param resourceId unique resource id
     * @return ComputeResource object
     */
    ComputeResourceDescription getComputeResource (String resourceId) throws AppCatalogException;

    /**
     * This method will return a list of computeResource descriptions according to given search criteria
     * @param filters map should be provided as the field name and it's value
     * @return list of compute resources
     */
    List<ComputeResourceDescription> getComputeResourceList (Map<String, String> filters) throws AppCatalogException;

    /**
     * This method will retrieve GSISSHJobSubmission object
     * @param submissionId unique submission id
     * @return GSISSHSubmission object
     */
    GSISSHJobSubmission getGSISSHJobSubmission (String submissionId) throws AppCatalogException;

    /**
     * This method will return a list of GSISSHSubmission objects according to given search criteria
     * @param filters map should be provided as the field name and it's value
     * @return list of GSISSHSubmission objects
     */
    List<GSISSHJobSubmission> getGSISSHJobSubmissionList (Map<String, String> filters) throws AppCatalogException;

    /**
     * This method will retrieve GlobusJobSubmission object
     * @param submissionId unique submission id
     * @return GlobusJobSubmission object
     */
    GlobusJobSubmission getGlobusJobSubmission (String submissionId) throws AppCatalogException;

    /**
     * This method will return a list of GlobusJobSubmission objects according to given search criteria
     * @param filters map should be provided as the field name and it's value
     * @return list of GlobusJobSubmission objects
     */
    List<GlobusJobSubmission> getGlobusJobSubmissionList (Map<String, String> filters) throws AppCatalogException;

    /**
     * This method will retrieve GSISSHJobSubmission object
     * @param submissionId unique submission id
     * @return GSISSHSubmission object
     */
    SSHJobSubmission getSSHJobSubmission (String submissionId) throws AppCatalogException;

    /**
     * This method will return a list of GSISSHSubmission objects according to given search criteria
     * @param filters map should be provided as the field name and it's value
     * @return list of GSISSHSubmission objects
     */
    List<SSHJobSubmission> getSSHJobSubmissionList (Map<String, String> filters) throws AppCatalogException;
    /**
     * This method will retrieve SCP Data movement object
     * @param dataMoveId unique data move id
     * @return SCPDataMovement object
     */
    SCPDataMovement getSCPDataMovement (String dataMoveId) throws AppCatalogException;

    /**
     * This method will return a list of SCPDataMovement objects according to given search criteria
     * @param filters map should be provided as the field name and it's value
     * @return list of SCPDataMovement objects
     */
    List<SCPDataMovement> getSCPDataMovementList (Map<String, String> filters) throws AppCatalogException;

    /**
     * This method will retrieve GridFTPDataMovement object
     * @param dataMoveId unique data move id
     * @return GridFTPDataMovement object
     */
    GridFTPDataMovement getGridFTPDataMovement (String dataMoveId) throws AppCatalogException;

    /**
     * This method will return a list of GridFTPDataMovement objects according to given search criteria
     * @param filters map should be provided as the field name and it's value
     * @return list of GridFTPDataMovement objects
     */
    List<GridFTPDataMovement> getGridFTPDataMovementList (Map<String, String> filters) throws AppCatalogException;

    /**
     * This method will check whether the given resource already exists in the system
     * @param resourceId unique resource id
     * @return true or false
     */
    boolean isComputeResourceExists (String resourceId) throws AppCatalogException;

    /**
     * This method will remove given resource from the system
     * @param resourceId unique resource id
     */
    void removeComputeResource (String resourceId) throws AppCatalogException;

}
