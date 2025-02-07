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

import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DetailOfApplicantSecTwo. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.DetailOfApplicantSecTwoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantSecTwoLocalService
 * @generated
 */
public class DetailOfApplicantSecTwoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.DetailOfApplicantSecTwoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the detail of applicant sec two to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantSecTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicantSecTwo the detail of applicant sec two
	 * @return the detail of applicant sec two that was added
	 */
	public static DetailOfApplicantSecTwo addDetailOfApplicantSecTwo(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		return getService().addDetailOfApplicantSecTwo(detailOfApplicantSecTwo);
	}

	/**
	 * Creates a new detail of applicant sec two with the primary key. Does not add the detail of applicant sec two to the database.
	 *
	 * @param detailOfAppliSecTwoId the primary key for the new detail of applicant sec two
	 * @return the new detail of applicant sec two
	 */
	public static DetailOfApplicantSecTwo createDetailOfApplicantSecTwo(
		long detailOfAppliSecTwoId) {

		return getService().createDetailOfApplicantSecTwo(
			detailOfAppliSecTwoId);
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
	 * Deletes the detail of applicant sec two from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantSecTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicantSecTwo the detail of applicant sec two
	 * @return the detail of applicant sec two that was removed
	 */
	public static DetailOfApplicantSecTwo deleteDetailOfApplicantSecTwo(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		return getService().deleteDetailOfApplicantSecTwo(
			detailOfApplicantSecTwo);
	}

	/**
	 * Deletes the detail of applicant sec two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantSecTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two that was removed
	 * @throws PortalException if a detail of applicant sec two with the primary key could not be found
	 */
	public static DetailOfApplicantSecTwo deleteDetailOfApplicantSecTwo(
			long detailOfAppliSecTwoId)
		throws PortalException {

		return getService().deleteDetailOfApplicantSecTwo(
			detailOfAppliSecTwoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoModelImpl</code>.
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

	public static DetailOfApplicantSecTwo fetchDetailOfApplicantSecTwo(
		long detailOfAppliSecTwoId) {

		return getService().fetchDetailOfApplicantSecTwo(detailOfAppliSecTwoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the detail of applicant sec two with the primary key.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two
	 * @throws PortalException if a detail of applicant sec two with the primary key could not be found
	 */
	public static DetailOfApplicantSecTwo getDetailOfApplicantSecTwo(
			long detailOfAppliSecTwoId)
		throws PortalException {

		return getService().getDetailOfApplicantSecTwo(detailOfAppliSecTwoId);
	}

	/**
	 * Returns a range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @return the range of detail of applicant sec twos
	 */
	public static List<DetailOfApplicantSecTwo> getDetailOfApplicantSecTwos(
		int start, int end) {

		return getService().getDetailOfApplicantSecTwos(start, end);
	}

	/**
	 * Returns the number of detail of applicant sec twos.
	 *
	 * @return the number of detail of applicant sec twos
	 */
	public static int getDetailOfApplicantSecTwosCount() {
		return getService().getDetailOfApplicantSecTwosCount();
	}

	public static DetailOfApplicantSecTwo getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfApplicantSecTwoException {

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
	 * Updates the detail of applicant sec two in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantSecTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicantSecTwo the detail of applicant sec two
	 * @return the detail of applicant sec two that was updated
	 */
	public static DetailOfApplicantSecTwo updateDetailOfApplicantSecTwo(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		return getService().updateDetailOfApplicantSecTwo(
			detailOfApplicantSecTwo);
	}

	public static DetailOfApplicantSecTwoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DetailOfApplicantSecTwoLocalService>
		_serviceSnapshot = new Snapshot<>(
			DetailOfApplicantSecTwoLocalServiceUtil.class,
			DetailOfApplicantSecTwoLocalService.class);

}