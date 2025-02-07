/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.service;

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

import com.nbp.farm.application.stages.service.exception.NoSuchFarmApplicationStagesException;
import com.nbp.farm.application.stages.service.model.FarmApplicationStages;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for FarmApplicationStages. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see FarmApplicationStagesLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface FarmApplicationStagesLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.farm.application.stages.service.service.impl.FarmApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the farm application stages local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link FarmApplicationStagesLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the farm application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmApplicationStages the farm application stages
	 * @return the farm application stages that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FarmApplicationStages addFarmApplicationStages(
		FarmApplicationStages farmApplicationStages);

	/**
	 * Creates a new farm application stages with the primary key. Does not add the farm application stages to the database.
	 *
	 * @param farmApplicationStagesId the primary key for the new farm application stages
	 * @return the new farm application stages
	 */
	@Transactional(enabled = false)
	public FarmApplicationStages createFarmApplicationStages(
		long farmApplicationStagesId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the farm application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmApplicationStages the farm application stages
	 * @return the farm application stages that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public FarmApplicationStages deleteFarmApplicationStages(
		FarmApplicationStages farmApplicationStages);

	/**
	 * Deletes the farm application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages that was removed
	 * @throws PortalException if a farm application stages with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public FarmApplicationStages deleteFarmApplicationStages(
			long farmApplicationStagesId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmApplicationStagesModelImpl</code>.
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
	public FarmApplicationStages fetchFarmApplicationStages(
		long farmApplicationStagesId);

	/**
	 * Returns the farm application stages matching the UUID and group.
	 *
	 * @param uuid the farm application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmApplicationStages fetchFarmApplicationStagesByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	/**
	 * Returns the farm application stages with the primary key.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages
	 * @throws PortalException if a farm application stages with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmApplicationStages getFarmApplicationStages(
			long farmApplicationStagesId)
		throws PortalException;

	/**
	 * Returns the farm application stages matching the UUID and group.
	 *
	 * @param uuid the farm application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching farm application stages
	 * @throws PortalException if a matching farm application stages could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmApplicationStages getFarmApplicationStagesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the farm application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of farm application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmApplicationStages> getFarmApplicationStageses(
		int start, int end);

	/**
	 * Returns all the farm application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the farm application stageses
	 * @param companyId the primary key of the company
	 * @return the matching farm application stageses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmApplicationStages>
		getFarmApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of farm application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the farm application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching farm application stageses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmApplicationStages>
		getFarmApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<FarmApplicationStages> orderByComparator);

	/**
	 * Returns the number of farm application stageses.
	 *
	 * @return the number of farm application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFarmApplicationStagesesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmApplicationStages> getFarmByCI(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmApplicationStages getFarmByCI_SN(String caseId, String stageName)
		throws NoSuchFarmApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmApplicationStages getFarmByCI_ST(String caseId, String status)
		throws NoSuchFarmApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmApplicationStages getFarmByCI_ST_SN(
			String CaseId, String stageStatus, String StageName)
		throws NoSuchFarmApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmApplicationStages getFarmByFAI(long farmApplicationId)
		throws NoSuchFarmApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmApplicationStages> getFarmBySN(String stageName);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getfarmCurrentStage(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getFarmerDistinctStages();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Long getFarmSeenCases();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmApplicationStages> getFAS_StageName_Status(
		String stageName, String status);

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
	 * Updates the farm application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmApplicationStages the farm application stages
	 * @return the farm application stages that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FarmApplicationStages updateFarmApplicationStages(
		FarmApplicationStages farmApplicationStages);

	public FarmApplicationStages updateFarmApplicationStages(
		String caseId, String stageName, Date stageStartDate, Date stageEndDate,
		String duration, String stageStatus);

}