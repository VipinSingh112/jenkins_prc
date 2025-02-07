/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionCarRentCondition;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AttractionCarRentCondition. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AttractionCarRentConditionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentConditionLocalService
 * @generated
 */
public class AttractionCarRentConditionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AttractionCarRentConditionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the attraction car rent condition to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentConditionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentCondition the attraction car rent condition
	 * @return the attraction car rent condition that was added
	 */
	public static AttractionCarRentCondition addAttractionCarRentCondition(
		AttractionCarRentCondition attractionCarRentCondition) {

		return getService().addAttractionCarRentCondition(
			attractionCarRentCondition);
	}

	/**
	 * Creates a new attraction car rent condition with the primary key. Does not add the attraction car rent condition to the database.
	 *
	 * @param attractionCarRenConditId the primary key for the new attraction car rent condition
	 * @return the new attraction car rent condition
	 */
	public static AttractionCarRentCondition createAttractionCarRentCondition(
		long attractionCarRenConditId) {

		return getService().createAttractionCarRentCondition(
			attractionCarRenConditId);
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
	 * Deletes the attraction car rent condition from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentConditionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentCondition the attraction car rent condition
	 * @return the attraction car rent condition that was removed
	 */
	public static AttractionCarRentCondition deleteAttractionCarRentCondition(
		AttractionCarRentCondition attractionCarRentCondition) {

		return getService().deleteAttractionCarRentCondition(
			attractionCarRentCondition);
	}

	/**
	 * Deletes the attraction car rent condition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentConditionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition that was removed
	 * @throws PortalException if a attraction car rent condition with the primary key could not be found
	 */
	public static AttractionCarRentCondition deleteAttractionCarRentCondition(
			long attractionCarRenConditId)
		throws PortalException {

		return getService().deleteAttractionCarRentCondition(
			attractionCarRenConditId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionModelImpl</code>.
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

	public static AttractionCarRentCondition fetchAttractionCarRentCondition(
		long attractionCarRenConditId) {

		return getService().fetchAttractionCarRentCondition(
			attractionCarRenConditId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction car rent condition with the primary key.
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition
	 * @throws PortalException if a attraction car rent condition with the primary key could not be found
	 */
	public static AttractionCarRentCondition getAttractionCarRentCondition(
			long attractionCarRenConditId)
		throws PortalException {

		return getService().getAttractionCarRentCondition(
			attractionCarRenConditId);
	}

	/**
	 * Returns a range of all the attraction car rent conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent conditions
	 * @param end the upper bound of the range of attraction car rent conditions (not inclusive)
	 * @return the range of attraction car rent conditions
	 */
	public static List<AttractionCarRentCondition>
		getAttractionCarRentConditions(int start, int end) {

		return getService().getAttractionCarRentConditions(start, end);
	}

	/**
	 * Returns the number of attraction car rent conditions.
	 *
	 * @return the number of attraction car rent conditions
	 */
	public static int getAttractionCarRentConditionsCount() {
		return getService().getAttractionCarRentConditionsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static AttractionCarRentCondition getJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentConditionException {

		return getService().getJTB_ByApplicationId(jtbApplicationId);
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
	 * Updates the attraction car rent condition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentConditionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentCondition the attraction car rent condition
	 * @return the attraction car rent condition that was updated
	 */
	public static AttractionCarRentCondition updateAttractionCarRentCondition(
		AttractionCarRentCondition attractionCarRentCondition) {

		return getService().updateAttractionCarRentCondition(
			attractionCarRentCondition);
	}

	public static AttractionCarRentConditionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AttractionCarRentConditionLocalService>
		_serviceSnapshot = new Snapshot<>(
			AttractionCarRentConditionLocalServiceUtil.class,
			AttractionCarRentConditionLocalService.class);

}