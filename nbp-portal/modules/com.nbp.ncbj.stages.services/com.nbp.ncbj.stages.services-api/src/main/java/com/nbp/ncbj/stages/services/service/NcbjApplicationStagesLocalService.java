/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjApplicationStagesException;
import com.nbp.ncbj.stages.services.model.NcbjApplicationStages;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for NcbjApplicationStages. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationStagesLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface NcbjApplicationStagesLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.ncbj.stages.services.service.impl.NcbjApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the ncbj application stages local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link NcbjApplicationStagesLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the ncbj application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public NcbjApplicationStages addNcbjApplicationStages(
		NcbjApplicationStages ncbjApplicationStages);

	/**
	 * Creates a new ncbj application stages with the primary key. Does not add the ncbj application stages to the database.
	 *
	 * @param ncbjStagesApplicationId the primary key for the new ncbj application stages
	 * @return the new ncbj application stages
	 */
	@Transactional(enabled = false)
	public NcbjApplicationStages createNcbjApplicationStages(
		long ncbjStagesApplicationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the ncbj application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages that was removed
	 * @throws PortalException if a ncbj application stages with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public NcbjApplicationStages deleteNcbjApplicationStages(
			long ncbjStagesApplicationId)
		throws PortalException;

	/**
	 * Deletes the ncbj application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public NcbjApplicationStages deleteNcbjApplicationStages(
		NcbjApplicationStages ncbjApplicationStages);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages fetchNcbjApplicationStages(
		long ncbjStagesApplicationId);

	/**
	 * Returns the ncbj application stages matching the UUID and group.
	 *
	 * @param uuid the ncbj application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages fetchNcbjApplicationStagesByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getManufacturingApplicaitonCurrentStages(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<NcbjApplicationStages> getMiningByCI(String caseId)
		throws NoSuchNcbjApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages getMiningByCI_SN(
			String caseId, String stageName)
		throws NoSuchNcbjApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages getMiningByCI_ST(
			String caseId, String stageStatus)
		throws NoSuchNcbjApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages getMiningByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws NoSuchNcbjApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getNcbjApplicaitonCurrentStages(String caseId);

	/**
	 * Returns the ncbj application stages with the primary key.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages
	 * @throws PortalException if a ncbj application stages with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages getNcbjApplicationStages(
			long ncbjStagesApplicationId)
		throws PortalException;

	/**
	 * Returns the ncbj application stages matching the UUID and group.
	 *
	 * @param uuid the ncbj application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application stages
	 * @throws PortalException if a matching ncbj application stages could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages getNcbjApplicationStagesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of ncbj application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<NcbjApplicationStages> getNcbjApplicationStageses(
		int start, int end);

	/**
	 * Returns all the ncbj application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj application stageses
	 * @param companyId the primary key of the company
	 * @return the matching ncbj application stageses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<NcbjApplicationStages>
		getNcbjApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of ncbj application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncbj application stageses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<NcbjApplicationStages>
		getNcbjApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<NcbjApplicationStages> orderByComparator);

	/**
	 * Returns the number of ncbj application stageses.
	 *
	 * @return the number of ncbj application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getNcbjApplicationStagesesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages getNCBJByCI(String caseId)
		throws NoSuchNcbjApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages getNcbjByCI_SN(String caseId, String stageName)
		throws NoSuchNcbjApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public NcbjApplicationStages getNcbjByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws NoSuchNcbjApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getNcbjDistinctStages();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Long getNCBJSeenCases();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Long getQuarrySeenCases();

	public List<NcbjApplicationStages> gtNcbjApplicationStages_By_SN(
		String stageName);

	/**
	 * Updates the ncbj application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public NcbjApplicationStages updateNcbjApplicationStages(
		NcbjApplicationStages ncbjApplicationStages);

	public NcbjApplicationStages updateNcbjApplicationStages(
		String caseId, String stageName, Date stageStartDate, Date stageEndDate,
		String duration, String stageStatus);

}