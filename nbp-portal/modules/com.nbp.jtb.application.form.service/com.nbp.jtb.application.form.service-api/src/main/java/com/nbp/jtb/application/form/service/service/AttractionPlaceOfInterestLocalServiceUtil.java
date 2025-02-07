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

import com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AttractionPlaceOfInterest. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.AttractionPlaceOfInterestLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionPlaceOfInterestLocalService
 * @generated
 */
public class AttractionPlaceOfInterestLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.AttractionPlaceOfInterestLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the attraction place of interest to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionPlaceOfInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionPlaceOfInterest the attraction place of interest
	 * @return the attraction place of interest that was added
	 */
	public static AttractionPlaceOfInterest addAttractionPlaceOfInterest(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		return getService().addAttractionPlaceOfInterest(
			attractionPlaceOfInterest);
	}

	/**
	 * Creates a new attraction place of interest with the primary key. Does not add the attraction place of interest to the database.
	 *
	 * @param attractionPlaceOfInterestId the primary key for the new attraction place of interest
	 * @return the new attraction place of interest
	 */
	public static AttractionPlaceOfInterest createAttractionPlaceOfInterest(
		long attractionPlaceOfInterestId) {

		return getService().createAttractionPlaceOfInterest(
			attractionPlaceOfInterestId);
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
	 * Deletes the attraction place of interest from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionPlaceOfInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionPlaceOfInterest the attraction place of interest
	 * @return the attraction place of interest that was removed
	 */
	public static AttractionPlaceOfInterest deleteAttractionPlaceOfInterest(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		return getService().deleteAttractionPlaceOfInterest(
			attractionPlaceOfInterest);
	}

	/**
	 * Deletes the attraction place of interest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionPlaceOfInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest that was removed
	 * @throws PortalException if a attraction place of interest with the primary key could not be found
	 */
	public static AttractionPlaceOfInterest deleteAttractionPlaceOfInterest(
			long attractionPlaceOfInterestId)
		throws PortalException {

		return getService().deleteAttractionPlaceOfInterest(
			attractionPlaceOfInterestId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionPlaceOfInterestModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionPlaceOfInterestModelImpl</code>.
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

	public static AttractionPlaceOfInterest fetchAttractionPlaceOfInterest(
		long attractionPlaceOfInterestId) {

		return getService().fetchAttractionPlaceOfInterest(
			attractionPlaceOfInterestId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction place of interest with the primary key.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest
	 * @throws PortalException if a attraction place of interest with the primary key could not be found
	 */
	public static AttractionPlaceOfInterest getAttractionPlaceOfInterest(
			long attractionPlaceOfInterestId)
		throws PortalException {

		return getService().getAttractionPlaceOfInterest(
			attractionPlaceOfInterestId);
	}

	/**
	 * Returns a range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @return the range of attraction place of interests
	 */
	public static List<AttractionPlaceOfInterest> getAttractionPlaceOfInterests(
		int start, int end) {

		return getService().getAttractionPlaceOfInterests(start, end);
	}

	/**
	 * Returns the number of attraction place of interests.
	 *
	 * @return the number of attraction place of interests
	 */
	public static int getAttractionPlaceOfInterestsCount() {
		return getService().getAttractionPlaceOfInterestsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static AttractionPlaceOfInterest getJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionPlaceOfInterestException {

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
	 * Updates the attraction place of interest in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionPlaceOfInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionPlaceOfInterest the attraction place of interest
	 * @return the attraction place of interest that was updated
	 */
	public static AttractionPlaceOfInterest updateAttractionPlaceOfInterest(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		return getService().updateAttractionPlaceOfInterest(
			attractionPlaceOfInterest);
	}

	public static AttractionPlaceOfInterestLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AttractionPlaceOfInterestLocalService>
		_serviceSnapshot = new Snapshot<>(
			AttractionPlaceOfInterestLocalServiceUtil.class,
			AttractionPlaceOfInterestLocalService.class);

}