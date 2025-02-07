/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcraVerifyWeighingDate. This utility wraps
 * <code>com.nbp.ncra.application.form.service.service.impl.NcraVerifyWeighingDateLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDateLocalService
 * @generated
 */
public class NcraVerifyWeighingDateLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncra.application.form.service.service.impl.NcraVerifyWeighingDateLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncra verify weighing date to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDate the ncra verify weighing date
	 * @return the ncra verify weighing date that was added
	 */
	public static NcraVerifyWeighingDate addNcraVerifyWeighingDate(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		return getService().addNcraVerifyWeighingDate(ncraVerifyWeighingDate);
	}

	/**
	 * Creates a new ncra verify weighing date with the primary key. Does not add the ncra verify weighing date to the database.
	 *
	 * @param ncraVerifyWeighingDateId the primary key for the new ncra verify weighing date
	 * @return the new ncra verify weighing date
	 */
	public static NcraVerifyWeighingDate createNcraVerifyWeighingDate(
		long ncraVerifyWeighingDateId) {

		return getService().createNcraVerifyWeighingDate(
			ncraVerifyWeighingDateId);
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
	 * Deletes the ncra verify weighing date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date that was removed
	 * @throws PortalException if a ncra verify weighing date with the primary key could not be found
	 */
	public static NcraVerifyWeighingDate deleteNcraVerifyWeighingDate(
			long ncraVerifyWeighingDateId)
		throws PortalException {

		return getService().deleteNcraVerifyWeighingDate(
			ncraVerifyWeighingDateId);
	}

	/**
	 * Deletes the ncra verify weighing date from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDate the ncra verify weighing date
	 * @return the ncra verify weighing date that was removed
	 */
	public static NcraVerifyWeighingDate deleteNcraVerifyWeighingDate(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		return getService().deleteNcraVerifyWeighingDate(
			ncraVerifyWeighingDate);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateModelImpl</code>.
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

	public static NcraVerifyWeighingDate fetchNcraVerifyWeighingDate(
		long ncraVerifyWeighingDateId) {

		return getService().fetchNcraVerifyWeighingDate(
			ncraVerifyWeighingDateId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static NcraVerifyWeighingDate getNcraVerify_By_Date(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDateException {

		return getService().getNcraVerify_By_Date(ncraApplicationId);
	}

	/**
	 * Returns the ncra verify weighing date with the primary key.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date
	 * @throws PortalException if a ncra verify weighing date with the primary key could not be found
	 */
	public static NcraVerifyWeighingDate getNcraVerifyWeighingDate(
			long ncraVerifyWeighingDateId)
		throws PortalException {

		return getService().getNcraVerifyWeighingDate(ncraVerifyWeighingDateId);
	}

	/**
	 * Returns a range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @return the range of ncra verify weighing dates
	 */
	public static List<NcraVerifyWeighingDate> getNcraVerifyWeighingDates(
		int start, int end) {

		return getService().getNcraVerifyWeighingDates(start, end);
	}

	/**
	 * Returns the number of ncra verify weighing dates.
	 *
	 * @return the number of ncra verify weighing dates
	 */
	public static int getNcraVerifyWeighingDatesCount() {
		return getService().getNcraVerifyWeighingDatesCount();
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
	 * Updates the ncra verify weighing date in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDate the ncra verify weighing date
	 * @return the ncra verify weighing date that was updated
	 */
	public static NcraVerifyWeighingDate updateNcraVerifyWeighingDate(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		return getService().updateNcraVerifyWeighingDate(
			ncraVerifyWeighingDate);
	}

	public static NcraVerifyWeighingDateLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcraVerifyWeighingDateLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcraVerifyWeighingDateLocalServiceUtil.class,
			NcraVerifyWeighingDateLocalService.class);

}