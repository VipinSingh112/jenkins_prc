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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.stages.service.model.FarmPermit;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FarmPermit. This utility wraps
 * <code>com.nbp.farm.application.stages.service.service.impl.FarmPermitLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FarmPermitLocalService
 * @generated
 */
public class FarmPermitLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.farm.application.stages.service.service.impl.FarmPermitLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the farm permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmPermit the farm permit
	 * @return the farm permit that was added
	 */
	public static FarmPermit addFarmPermit(FarmPermit farmPermit) {
		return getService().addFarmPermit(farmPermit);
	}

	/**
	 * Creates a new farm permit with the primary key. Does not add the farm permit to the database.
	 *
	 * @param farmPermitId the primary key for the new farm permit
	 * @return the new farm permit
	 */
	public static FarmPermit createFarmPermit(long farmPermitId) {
		return getService().createFarmPermit(farmPermitId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the farm permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmPermit the farm permit
	 * @return the farm permit that was removed
	 */
	public static FarmPermit deleteFarmPermit(FarmPermit farmPermit) {
		return getService().deleteFarmPermit(farmPermit);
	}

	/**
	 * Deletes the farm permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit that was removed
	 * @throws PortalException if a farm permit with the primary key could not be found
	 */
	public static FarmPermit deleteFarmPermit(long farmPermitId)
		throws PortalException {

		return getService().deleteFarmPermit(farmPermitId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static FarmPermit fetchFarmPermit(long farmPermitId) {
		return getService().fetchFarmPermit(farmPermitId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static FarmPermit getFarmBY_CI(String caseId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmPermitException {

		return getService().getFarmBY_CI(caseId);
	}

	/**
	 * Returns the farm permit with the primary key.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit
	 * @throws PortalException if a farm permit with the primary key could not be found
	 */
	public static FarmPermit getFarmPermit(long farmPermitId)
		throws PortalException {

		return getService().getFarmPermit(farmPermitId);
	}

	/**
	 * Returns a range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @return the range of farm permits
	 */
	public static List<FarmPermit> getFarmPermits(int start, int end) {
		return getService().getFarmPermits(start, end);
	}

	/**
	 * Returns the number of farm permits.
	 *
	 * @return the number of farm permits
	 */
	public static int getFarmPermitsCount() {
		return getService().getFarmPermitsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the farm permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmPermit the farm permit
	 * @return the farm permit that was updated
	 */
	public static FarmPermit updateFarmPermit(FarmPermit farmPermit) {
		return getService().updateFarmPermit(farmPermit);
	}

	public static FarmPermit updateFarmPermit(
		String caseId, String PIRPermtNumber, java.util.Date dateofIssue,
		java.util.Date dateofExpiration, long docFileEntryId) {

		return getService().updateFarmPermit(
			caseId, PIRPermtNumber, dateofIssue, dateofExpiration,
			docFileEntryId);
	}

	public static FarmPermit updateFarmPermit(
		String caseId, String PIRPermtNumber, java.util.Date dateofIssue,
		java.util.Date dateofExpiration, long docFileEntryId,
		String durationOfPermit) {

		return getService().updateFarmPermit(
			caseId, PIRPermtNumber, dateofIssue, dateofExpiration,
			docFileEntryId, durationOfPermit);
	}

	public static FarmPermitLocalService getService() {
		return _service;
	}

	private static volatile FarmPermitLocalService _service;

}