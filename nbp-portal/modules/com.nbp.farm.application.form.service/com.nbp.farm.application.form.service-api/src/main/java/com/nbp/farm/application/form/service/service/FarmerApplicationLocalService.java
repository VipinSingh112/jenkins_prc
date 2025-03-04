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

package com.nbp.farm.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerApplicationException;
import com.nbp.farm.application.form.service.model.FarmerApplication;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for FarmerApplication. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface FarmerApplicationLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.farm.application.form.service.service.impl.FarmerApplicationLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the farmer application local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link FarmerApplicationLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the farmer application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplication the farmer application
	 * @return the farmer application that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FarmerApplication addFarmerApplication(
		FarmerApplication farmerApplication);

	/**
	 * Creates a new farmer application with the primary key. Does not add the farmer application to the database.
	 *
	 * @param farmerApplicationId the primary key for the new farmer application
	 * @return the new farmer application
	 */
	@Transactional(enabled = false)
	public FarmerApplication createFarmerApplication(long farmerApplicationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the farmer application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplication the farmer application
	 * @return the farmer application that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public FarmerApplication deleteFarmerApplication(
		FarmerApplication farmerApplication);

	/**
	 * Deletes the farmer application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application that was removed
	 * @throws PortalException if a farmer application with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public FarmerApplication deleteFarmerApplication(long farmerApplicationId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerApplicationModelImpl</code>.
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
	public FarmerApplication fetchFarmerApplication(long farmerApplicationId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the farmer application with the primary key.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application
	 * @throws PortalException if a farmer application with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmerApplication getFarmerApplication(long farmerApplicationId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmerApplication getFarmerApplicationByAppNo(
			String applicationNumber)
		throws NoSuchFarmerApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmerApplication getFarmerApplicationByCaseId(String caseId)
		throws NoSuchFarmerApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmerApplication getFarmerApplicationByRT_AppNo(
			String requestType, String expiredLicenseappNumber)
		throws NoSuchFarmerApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmerApplication> getFarmerApplicationByS_U(
			long userId, int status)
		throws NoSuchFarmerApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmerApplication> getFarmerApplicationByStatus(int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmerApplication> getFarmerApplicationByUser(long userId);

	/**
	 * Returns a range of all the farmer applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of farmer applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FarmerApplication> getFarmerApplications(int start, int end);

	/**
	 * Returns the number of farmer applications.
	 *
	 * @return the number of farmer applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFarmerApplicationsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FarmerApplication getFarmerById(long ApplicationId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getFarmerDistinctCategories();

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
	 * Updates the farmer application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplication the farmer application
	 * @return the farmer application that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FarmerApplication updateFarmerApplication(
		FarmerApplication farmerApplication);

}