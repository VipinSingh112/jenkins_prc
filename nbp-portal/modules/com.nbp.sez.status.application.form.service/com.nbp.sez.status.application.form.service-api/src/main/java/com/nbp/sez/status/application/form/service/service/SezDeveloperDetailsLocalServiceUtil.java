/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDeveloperDetails;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezDeveloperDetails. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezDeveloperDetailsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezDeveloperDetailsLocalService
 * @generated
 */
public class SezDeveloperDetailsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezDeveloperDetailsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez developer details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDeveloperDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperDetails the sez developer details
	 * @return the sez developer details that was added
	 */
	public static SezDeveloperDetails addSezDeveloperDetails(
		SezDeveloperDetails sezDeveloperDetails) {

		return getService().addSezDeveloperDetails(sezDeveloperDetails);
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
	 * Creates a new sez developer details with the primary key. Does not add the sez developer details to the database.
	 *
	 * @param sezDeveloperDetailsId the primary key for the new sez developer details
	 * @return the new sez developer details
	 */
	public static SezDeveloperDetails createSezDeveloperDetails(
		long sezDeveloperDetailsId) {

		return getService().createSezDeveloperDetails(sezDeveloperDetailsId);
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
	 * Deletes the sez developer details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDeveloperDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details that was removed
	 * @throws PortalException if a sez developer details with the primary key could not be found
	 */
	public static SezDeveloperDetails deleteSezDeveloperDetails(
			long sezDeveloperDetailsId)
		throws PortalException {

		return getService().deleteSezDeveloperDetails(sezDeveloperDetailsId);
	}

	/**
	 * Deletes the sez developer details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDeveloperDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperDetails the sez developer details
	 * @return the sez developer details that was removed
	 */
	public static SezDeveloperDetails deleteSezDeveloperDetails(
		SezDeveloperDetails sezDeveloperDetails) {

		return getService().deleteSezDeveloperDetails(sezDeveloperDetails);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsModelImpl</code>.
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

	public static SezDeveloperDetails fetchSezDeveloperDetails(
		long sezDeveloperDetailsId) {

		return getService().fetchSezDeveloperDetails(sezDeveloperDetailsId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static SezDeveloperDetails getDeveloperDetailsBy_Id(
			long sezApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDeveloperDetailsException {

		return getService().getDeveloperDetailsBy_Id(sezApplicationId);
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
	 * Returns the sez developer details with the primary key.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details
	 * @throws PortalException if a sez developer details with the primary key could not be found
	 */
	public static SezDeveloperDetails getSezDeveloperDetails(
			long sezDeveloperDetailsId)
		throws PortalException {

		return getService().getSezDeveloperDetails(sezDeveloperDetailsId);
	}

	/**
	 * Returns a range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @return the range of sez developer detailses
	 */
	public static List<SezDeveloperDetails> getSezDeveloperDetailses(
		int start, int end) {

		return getService().getSezDeveloperDetailses(start, end);
	}

	/**
	 * Returns the number of sez developer detailses.
	 *
	 * @return the number of sez developer detailses
	 */
	public static int getSezDeveloperDetailsesCount() {
		return getService().getSezDeveloperDetailsesCount();
	}

	/**
	 * Updates the sez developer details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDeveloperDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDeveloperDetails the sez developer details
	 * @return the sez developer details that was updated
	 */
	public static SezDeveloperDetails updateSezDeveloperDetails(
		SezDeveloperDetails sezDeveloperDetails) {

		return getService().updateSezDeveloperDetails(sezDeveloperDetails);
	}

	public static SezDeveloperDetailsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezDeveloperDetailsLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezDeveloperDetailsLocalServiceUtil.class,
			SezDeveloperDetailsLocalService.class);

}