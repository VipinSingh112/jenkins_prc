/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

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

import com.nbp.quarry.stage.service.exception.NoSuchQuarryApplicationStageException;
import com.nbp.quarry.stage.service.model.QuarryApplicationStage;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for QuarryApplicationStage. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationStageLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface QuarryApplicationStageLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.quarry.stage.service.service.impl.QuarryApplicationStageLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the quarry application stage local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link QuarryApplicationStageLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the quarry application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public QuarryApplicationStage addQuarryApplicationStage(
		QuarryApplicationStage quarryApplicationStage);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new quarry application stage with the primary key. Does not add the quarry application stage to the database.
	 *
	 * @param quarryAppStagesId the primary key for the new quarry application stage
	 * @return the new quarry application stage
	 */
	@Transactional(enabled = false)
	public QuarryApplicationStage createQuarryApplicationStage(
		long quarryAppStagesId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the quarry application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage that was removed
	 * @throws PortalException if a quarry application stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public QuarryApplicationStage deleteQuarryApplicationStage(
			long quarryAppStagesId)
		throws PortalException;

	/**
	 * Deletes the quarry application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public QuarryApplicationStage deleteQuarryApplicationStage(
		QuarryApplicationStage quarryApplicationStage);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
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
	public QuarryApplicationStage fetchQuarryApplicationStage(
		long quarryAppStagesId);

	/**
	 * Returns the quarry application stage matching the UUID and group.
	 *
	 * @param uuid the quarry application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QuarryApplicationStage fetchQuarryApplicationStageByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getFilmDistinctStages();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getManufacturingApplicaitonCurrentStages(String caseId);

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

	/**
	 * Returns the quarry application stage with the primary key.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage
	 * @throws PortalException if a quarry application stage with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QuarryApplicationStage getQuarryApplicationStage(
			long quarryAppStagesId)
		throws PortalException;

	/**
	 * Returns the quarry application stage matching the UUID and group.
	 *
	 * @param uuid the quarry application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application stage
	 * @throws PortalException if a matching quarry application stage could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QuarryApplicationStage getQuarryApplicationStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of quarry application stages
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<QuarryApplicationStage> getQuarryApplicationStages(
		int start, int end);

	/**
	 * Returns all the quarry application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application stages
	 * @param companyId the primary key of the company
	 * @return the matching quarry application stages, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<QuarryApplicationStage>
		getQuarryApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of quarry application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching quarry application stages, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<QuarryApplicationStage>
		getQuarryApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<QuarryApplicationStage> orderByComparator);

	/**
	 * Returns the number of quarry application stages.
	 *
	 * @return the number of quarry application stages
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getQuarryApplicationStagesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<QuarryApplicationStage> getQuarryByCI(String caseId)
		throws NoSuchQuarryApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QuarryApplicationStage getQuarryByCI_SN(
			String caseId, String stageName)
		throws NoSuchQuarryApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QuarryApplicationStage getQuarryByCI_ST(
			String caseId, String stageStatus)
		throws NoSuchQuarryApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QuarryApplicationStage getQuarryByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws NoSuchQuarryApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QuarryApplicationStage getQuarryByCId(String caseId)
		throws NoSuchQuarryApplicationStageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getQuarryDistinctStages();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Long getQuarrySeenCases();

	public List<QuarryApplicationStage> gtQuarryApplicationStage_By_SN(
		String stageName);

	/**
	 * Updates the quarry application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public QuarryApplicationStage updateQuarryApplicationStage(
		QuarryApplicationStage quarryApplicationStage);

	public QuarryApplicationStage updateQuarryApplicationStage(
		String caseId, String stageName, Date stageStartDate, Date stageEndDate,
		String duration, String stageStatus);

}