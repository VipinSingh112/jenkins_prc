/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SpecificReqPropLicActivity. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.SpecificReqPropLicActivityLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SpecificReqPropLicActivityLocalService
 * @generated
 */
public class SpecificReqPropLicActivityLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.SpecificReqPropLicActivityLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the specific req prop lic activity to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 * @return the specific req prop lic activity that was added
	 */
	public static SpecificReqPropLicActivity addSpecificReqPropLicActivity(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		return getService().addSpecificReqPropLicActivity(
			specificReqPropLicActivity);
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
	 * Creates a new specific req prop lic activity with the primary key. Does not add the specific req prop lic activity to the database.
	 *
	 * @param specificReqPropLicActivityId the primary key for the new specific req prop lic activity
	 * @return the new specific req prop lic activity
	 */
	public static SpecificReqPropLicActivity createSpecificReqPropLicActivity(
		long specificReqPropLicActivityId) {

		return getService().createSpecificReqPropLicActivity(
			specificReqPropLicActivityId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the specific req prop lic activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 * @throws PortalException if a specific req prop lic activity with the primary key could not be found
	 */
	public static SpecificReqPropLicActivity deleteSpecificReqPropLicActivity(
			long specificReqPropLicActivityId)
		throws PortalException {

		return getService().deleteSpecificReqPropLicActivity(
			specificReqPropLicActivityId);
	}

	/**
	 * Deletes the specific req prop lic activity from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 */
	public static SpecificReqPropLicActivity deleteSpecificReqPropLicActivity(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		return getService().deleteSpecificReqPropLicActivity(
			specificReqPropLicActivity);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl</code>.
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

	public static SpecificReqPropLicActivity fetchSpecificReqPropLicActivity(
		long specificReqPropLicActivityId) {

		return getService().fetchSpecificReqPropLicActivity(
			specificReqPropLicActivityId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static SpecificReqPropLicActivity getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSpecificReqPropLicActivityException {

		return getService().getHsraById(hsraApplicationId);
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
	 * Returns a range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @return the range of specific req prop lic activities
	 */
	public static List<SpecificReqPropLicActivity>
		getSpecificReqPropLicActivities(int start, int end) {

		return getService().getSpecificReqPropLicActivities(start, end);
	}

	/**
	 * Returns the number of specific req prop lic activities.
	 *
	 * @return the number of specific req prop lic activities
	 */
	public static int getSpecificReqPropLicActivitiesCount() {
		return getService().getSpecificReqPropLicActivitiesCount();
	}

	/**
	 * Returns the specific req prop lic activity with the primary key.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity
	 * @throws PortalException if a specific req prop lic activity with the primary key could not be found
	 */
	public static SpecificReqPropLicActivity getSpecificReqPropLicActivity(
			long specificReqPropLicActivityId)
		throws PortalException {

		return getService().getSpecificReqPropLicActivity(
			specificReqPropLicActivityId);
	}

	/**
	 * Updates the specific req prop lic activity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 * @return the specific req prop lic activity that was updated
	 */
	public static SpecificReqPropLicActivity updateSpecificReqPropLicActivity(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		return getService().updateSpecificReqPropLicActivity(
			specificReqPropLicActivity);
	}

	public static SpecificReqPropLicActivityLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SpecificReqPropLicActivityLocalService>
		_serviceSnapshot = new Snapshot<>(
			SpecificReqPropLicActivityLocalServiceUtil.class,
			SpecificReqPropLicActivityLocalService.class);

}