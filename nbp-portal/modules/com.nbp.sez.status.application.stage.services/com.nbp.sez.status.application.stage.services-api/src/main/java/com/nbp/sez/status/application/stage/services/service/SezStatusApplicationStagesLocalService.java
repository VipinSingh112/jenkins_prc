/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusApplicationStagesException;
import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStages;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for SezStatusApplicationStages. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationStagesLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface SezStatusApplicationStagesLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the sez status application stages local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link SezStatusApplicationStagesLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the sez status application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationStages the sez status application stages
	 * @return the sez status application stages that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public SezStatusApplicationStages addSezStatusApplicationStages(
		SezStatusApplicationStages sezStatusApplicationStages);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new sez status application stages with the primary key. Does not add the sez status application stages to the database.
	 *
	 * @param SezStatusApplicationStagesId the primary key for the new sez status application stages
	 * @return the new sez status application stages
	 */
	@Transactional(enabled = false)
	public SezStatusApplicationStages createSezStatusApplicationStages(
		long SezStatusApplicationStagesId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the sez status application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages that was removed
	 * @throws PortalException if a sez status application stages with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public SezStatusApplicationStages deleteSezStatusApplicationStages(
			long SezStatusApplicationStagesId)
		throws PortalException;

	/**
	 * Deletes the sez status application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationStages the sez status application stages
	 * @return the sez status application stages that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public SezStatusApplicationStages deleteSezStatusApplicationStages(
		SezStatusApplicationStages sezStatusApplicationStages);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesModelImpl</code>.
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
	public SezStatusApplicationStages fetchSezStatusApplicationStages(
		long SezStatusApplicationStagesId);

	/**
	 * Returns the sez status application stages matching the UUID and group.
	 *
	 * @param uuid the sez status application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusApplicationStages
		fetchSezStatusApplicationStagesByUuidAndGroupId(
			String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

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
	public List<SezStatusApplicationStages> getSAS_CaseId(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusApplicationStages getSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusApplicationStages getSAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchSezStatusApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusApplicationStages getSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusApplicationStages getSAS_SAI(long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getSezDistinctStages();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Long getSezSeenCases();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusApplicationStages getSezStatusApplications_By_CI(
			String caseId)
		throws NoSuchSezStatusApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezStatusApplicationStages> getSezStatusApplicationsList_By_SN(
		String stageName);

	/**
	 * Returns the sez status application stages with the primary key.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages
	 * @throws PortalException if a sez status application stages with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusApplicationStages getSezStatusApplicationStages(
			long SezStatusApplicationStagesId)
		throws PortalException;

	/**
	 * Returns the sez status application stages matching the UUID and group.
	 *
	 * @param uuid the sez status application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status application stages
	 * @throws PortalException if a matching sez status application stages could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezStatusApplicationStages
			getSezStatusApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of sez status application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezStatusApplicationStages> getSezStatusApplicationStageses(
		int start, int end);

	/**
	 * Returns all the sez status application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status application stageses
	 * @param companyId the primary key of the company
	 * @return the matching sez status application stageses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezStatusApplicationStages>
		getSezStatusApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of sez status application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status application stageses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezStatusApplicationStages>
		getSezStatusApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns the number of sez status application stageses.
	 *
	 * @return the number of sez status application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSezStatusApplicationStagesesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getSezStatusCurrentStages(String caseId)
		throws NoSuchSezStatusApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getSezStatusWFMCurrentStages(String caseId)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Updates the sez status application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationStages the sez status application stages
	 * @return the sez status application stages that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public SezStatusApplicationStages updateSezStatusApplicationStages(
		SezStatusApplicationStages sezStatusApplicationStages);

	public SezStatusApplicationStages updateSezStatusApplicationStages(
		String caseId, String stageName, Date stageStartDate, Date stageEndDate,
		String duration, String stageStatus);

}