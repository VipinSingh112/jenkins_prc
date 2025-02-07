/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthcareEquipHeadingList;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HealthcareEquipHeadingList. This utility wraps
 * <code>com.nbp.healthcare.application.form.service.service.impl.HealthcareEquipHeadingListLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HealthcareEquipHeadingListLocalService
 * @generated
 */
public class HealthcareEquipHeadingListLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.healthcare.application.form.service.service.impl.HealthcareEquipHeadingListLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the healthcare equip heading list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthcareEquipHeadingListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthcareEquipHeadingList the healthcare equip heading list
	 * @return the healthcare equip heading list that was added
	 */
	public static HealthcareEquipHeadingList addHealthcareEquipHeadingList(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		return getService().addHealthcareEquipHeadingList(
			healthcareEquipHeadingList);
	}

	/**
	 * Creates a new healthcare equip heading list with the primary key. Does not add the healthcare equip heading list to the database.
	 *
	 * @param healthcareEquipHeadingListId the primary key for the new healthcare equip heading list
	 * @return the new healthcare equip heading list
	 */
	public static HealthcareEquipHeadingList createHealthcareEquipHeadingList(
		long healthcareEquipHeadingListId) {

		return getService().createHealthcareEquipHeadingList(
			healthcareEquipHeadingListId);
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
	 * Deletes the healthcare equip heading list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthcareEquipHeadingListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthcareEquipHeadingList the healthcare equip heading list
	 * @return the healthcare equip heading list that was removed
	 */
	public static HealthcareEquipHeadingList deleteHealthcareEquipHeadingList(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		return getService().deleteHealthcareEquipHeadingList(
			healthcareEquipHeadingList);
	}

	/**
	 * Deletes the healthcare equip heading list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthcareEquipHeadingListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list that was removed
	 * @throws PortalException if a healthcare equip heading list with the primary key could not be found
	 */
	public static HealthcareEquipHeadingList deleteHealthcareEquipHeadingList(
			long healthcareEquipHeadingListId)
		throws PortalException {

		return getService().deleteHealthcareEquipHeadingList(
			healthcareEquipHeadingListId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListModelImpl</code>.
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

	public static HealthcareEquipHeadingList fetchHealthcareEquipHeadingList(
		long healthcareEquipHeadingListId) {

		return getService().fetchHealthcareEquipHeadingList(
			healthcareEquipHeadingListId);
	}

	public static HealthcareEquipHeadingList get_HL_HD(
			String healthcareDescription)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthcareEquipHeadingListException {

		return getService().get_HL_HD(healthcareDescription);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the healthcare equip heading list with the primary key.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list
	 * @throws PortalException if a healthcare equip heading list with the primary key could not be found
	 */
	public static HealthcareEquipHeadingList getHealthcareEquipHeadingList(
			long healthcareEquipHeadingListId)
		throws PortalException {

		return getService().getHealthcareEquipHeadingList(
			healthcareEquipHeadingListId);
	}

	/**
	 * Returns a range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @return the range of healthcare equip heading lists
	 */
	public static List<HealthcareEquipHeadingList>
		getHealthcareEquipHeadingLists(int start, int end) {

		return getService().getHealthcareEquipHeadingLists(start, end);
	}

	/**
	 * Returns the number of healthcare equip heading lists.
	 *
	 * @return the number of healthcare equip heading lists
	 */
	public static int getHealthcareEquipHeadingListsCount() {
		return getService().getHealthcareEquipHeadingListsCount();
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
	 * Updates the healthcare equip heading list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthcareEquipHeadingListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthcareEquipHeadingList the healthcare equip heading list
	 * @return the healthcare equip heading list that was updated
	 */
	public static HealthcareEquipHeadingList updateHealthcareEquipHeadingList(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		return getService().updateHealthcareEquipHeadingList(
			healthcareEquipHeadingList);
	}

	public static HealthcareEquipHeadingListLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HealthcareEquipHeadingListLocalService>
		_serviceSnapshot = new Snapshot<>(
			HealthcareEquipHeadingListLocalServiceUtil.class,
			HealthcareEquipHeadingListLocalService.class);

}