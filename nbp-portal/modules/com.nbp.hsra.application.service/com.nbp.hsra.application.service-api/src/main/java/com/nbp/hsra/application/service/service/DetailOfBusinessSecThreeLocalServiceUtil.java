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

import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DetailOfBusinessSecThree. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.DetailOfBusinessSecThreeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfBusinessSecThreeLocalService
 * @generated
 */
public class DetailOfBusinessSecThreeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.DetailOfBusinessSecThreeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the detail of business sec three to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfBusinessSecThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfBusinessSecThree the detail of business sec three
	 * @return the detail of business sec three that was added
	 */
	public static DetailOfBusinessSecThree addDetailOfBusinessSecThree(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		return getService().addDetailOfBusinessSecThree(
			detailOfBusinessSecThree);
	}

	/**
	 * Creates a new detail of business sec three with the primary key. Does not add the detail of business sec three to the database.
	 *
	 * @param detailOfBusinessSecThreeId the primary key for the new detail of business sec three
	 * @return the new detail of business sec three
	 */
	public static DetailOfBusinessSecThree createDetailOfBusinessSecThree(
		long detailOfBusinessSecThreeId) {

		return getService().createDetailOfBusinessSecThree(
			detailOfBusinessSecThreeId);
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
	 * Deletes the detail of business sec three from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfBusinessSecThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfBusinessSecThree the detail of business sec three
	 * @return the detail of business sec three that was removed
	 */
	public static DetailOfBusinessSecThree deleteDetailOfBusinessSecThree(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		return getService().deleteDetailOfBusinessSecThree(
			detailOfBusinessSecThree);
	}

	/**
	 * Deletes the detail of business sec three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfBusinessSecThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three that was removed
	 * @throws PortalException if a detail of business sec three with the primary key could not be found
	 */
	public static DetailOfBusinessSecThree deleteDetailOfBusinessSecThree(
			long detailOfBusinessSecThreeId)
		throws PortalException {

		return getService().deleteDetailOfBusinessSecThree(
			detailOfBusinessSecThreeId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeModelImpl</code>.
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

	public static DetailOfBusinessSecThree fetchDetailOfBusinessSecThree(
		long detailOfBusinessSecThreeId) {

		return getService().fetchDetailOfBusinessSecThree(
			detailOfBusinessSecThreeId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the detail of business sec three with the primary key.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three
	 * @throws PortalException if a detail of business sec three with the primary key could not be found
	 */
	public static DetailOfBusinessSecThree getDetailOfBusinessSecThree(
			long detailOfBusinessSecThreeId)
		throws PortalException {

		return getService().getDetailOfBusinessSecThree(
			detailOfBusinessSecThreeId);
	}

	/**
	 * Returns a range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @return the range of detail of business sec threes
	 */
	public static List<DetailOfBusinessSecThree> getDetailOfBusinessSecThrees(
		int start, int end) {

		return getService().getDetailOfBusinessSecThrees(start, end);
	}

	/**
	 * Returns the number of detail of business sec threes.
	 *
	 * @return the number of detail of business sec threes
	 */
	public static int getDetailOfBusinessSecThreesCount() {
		return getService().getDetailOfBusinessSecThreesCount();
	}

	public static DetailOfBusinessSecThree getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfBusinessSecThreeException {

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
	 * Updates the detail of business sec three in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfBusinessSecThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfBusinessSecThree the detail of business sec three
	 * @return the detail of business sec three that was updated
	 */
	public static DetailOfBusinessSecThree updateDetailOfBusinessSecThree(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		return getService().updateDetailOfBusinessSecThree(
			detailOfBusinessSecThree);
	}

	public static DetailOfBusinessSecThreeLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DetailOfBusinessSecThreeLocalService>
		_serviceSnapshot = new Snapshot<>(
			DetailOfBusinessSecThreeLocalServiceUtil.class,
			DetailOfBusinessSecThreeLocalService.class);

}