/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

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

import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveApplicationStagesException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStages;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for ExplosiveApplicationStages. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveApplicationStagesLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ExplosiveApplicationStagesLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.explosives.competency.stages.service.service.impl.ExplosiveApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the explosive application stages local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ExplosiveApplicationStagesLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the explosive application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 * @return the explosive application stages that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ExplosiveApplicationStages addExplosiveApplicationStages(
		ExplosiveApplicationStages explosiveApplicationStages);

	/**
	 * Creates a new explosive application stages with the primary key. Does not add the explosive application stages to the database.
	 *
	 * @param expApplicationStagesId the primary key for the new explosive application stages
	 * @return the new explosive application stages
	 */
	@Transactional(enabled = false)
	public ExplosiveApplicationStages createExplosiveApplicationStages(
		long expApplicationStagesId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the explosive application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 * @return the explosive application stages that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public ExplosiveApplicationStages deleteExplosiveApplicationStages(
		ExplosiveApplicationStages explosiveApplicationStages);

	/**
	 * Deletes the explosive application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages that was removed
	 * @throws PortalException if a explosive application stages with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public ExplosiveApplicationStages deleteExplosiveApplicationStages(
			long expApplicationStagesId)
		throws PortalException;

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl</code>.
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
	public ExplosiveApplicationStages fetchExplosiveApplicationStages(
		long expApplicationStagesId);

	/**
	 * Returns the explosive application stages matching the UUID and group.
	 *
	 * @param uuid the explosive application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosiveApplicationStages
		fetchExplosiveApplicationStagesByUuidAndGroupId(
			String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosiveApplicationStages> getCAS_BY_SN(String stageName);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosiveApplicationStages> getCAS_CaseId(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosiveApplicationStages> getCAS_SNAndSS(
		String stageName, String status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getCretiveCurrentStages(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosiveApplicationStages getEXP_By_CaseId(String caseId)
		throws NoSuchExplosiveApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosiveApplicationStages> getEXP_BY_SN(String stageName);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosiveApplicationStages getEXP_CAI(long expApplicationId)
		throws NoSuchExplosiveApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosiveApplicationStages> getEXP_CaseId(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosiveApplicationStages getEXP_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosiveApplicationStages getEXP_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchExplosiveApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosiveApplicationStages getEXP_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosiveApplicationStages> getEXP_SNAndSS(
		String stageName, String status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getExplosiceDistinctStages();

	/**
	 * Returns the explosive application stages with the primary key.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages
	 * @throws PortalException if a explosive application stages with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosiveApplicationStages getExplosiveApplicationStages(
			long expApplicationStagesId)
		throws PortalException;

	/**
	 * Returns the explosive application stages matching the UUID and group.
	 *
	 * @param uuid the explosive application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive application stages
	 * @throws PortalException if a matching explosive application stages could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosiveApplicationStages
			getExplosiveApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of explosive application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosiveApplicationStages> getExplosiveApplicationStageses(
		int start, int end);

	/**
	 * Returns all the explosive application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive application stageses
	 * @param companyId the primary key of the company
	 * @return the matching explosive application stageses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosiveApplicationStages>
		getExplosiveApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of explosive application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosive application stageses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosiveApplicationStages>
		getExplosiveApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the number of explosive application stageses.
	 *
	 * @return the number of explosive application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getExplosiveApplicationStagesesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getExplosiveCurrentStages(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Long getExplosiveSeenCases();

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

	/**
	 * Updates the explosive application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 * @return the explosive application stages that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ExplosiveApplicationStages updateExplosiveApplicationStages(
		ExplosiveApplicationStages explosiveApplicationStages);

	public ExplosiveApplicationStages updateExplosiveApplicationStages(
		String caseId, String stageName, Date stageStartDate, Date stageEndDate,
		String duration, String stageStatus);

}