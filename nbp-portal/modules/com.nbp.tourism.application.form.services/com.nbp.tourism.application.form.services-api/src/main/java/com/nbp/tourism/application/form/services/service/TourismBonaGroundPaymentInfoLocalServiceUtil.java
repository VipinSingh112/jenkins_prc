/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundPaymentInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismBonaGroundPaymentInfo. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaGroundPaymentInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundPaymentInfoLocalService
 * @generated
 */
public class TourismBonaGroundPaymentInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaGroundPaymentInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the tourism bona ground payment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundPaymentInfo the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was added
	 */
	public static TourismBonaGroundPaymentInfo addTourismBonaGroundPaymentInfo(
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		return getService().addTourismBonaGroundPaymentInfo(
			tourismBonaGroundPaymentInfo);
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
	 * Creates a new tourism bona ground payment info with the primary key. Does not add the tourism bona ground payment info to the database.
	 *
	 * @param tourismBonaGroundPayId the primary key for the new tourism bona ground payment info
	 * @return the new tourism bona ground payment info
	 */
	public static TourismBonaGroundPaymentInfo
		createTourismBonaGroundPaymentInfo(long tourismBonaGroundPayId) {

		return getService().createTourismBonaGroundPaymentInfo(
			tourismBonaGroundPayId);
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
	 * Deletes the tourism bona ground payment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was removed
	 * @throws PortalException if a tourism bona ground payment info with the primary key could not be found
	 */
	public static TourismBonaGroundPaymentInfo
			deleteTourismBonaGroundPaymentInfo(long tourismBonaGroundPayId)
		throws PortalException {

		return getService().deleteTourismBonaGroundPaymentInfo(
			tourismBonaGroundPayId);
	}

	/**
	 * Deletes the tourism bona ground payment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundPaymentInfo the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was removed
	 */
	public static TourismBonaGroundPaymentInfo
		deleteTourismBonaGroundPaymentInfo(
			TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		return getService().deleteTourismBonaGroundPaymentInfo(
			tourismBonaGroundPaymentInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundPaymentInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundPaymentInfoModelImpl</code>.
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

	public static TourismBonaGroundPaymentInfo
		fetchTourismBonaGroundPaymentInfo(long tourismBonaGroundPayId) {

		return getService().fetchTourismBonaGroundPaymentInfo(
			tourismBonaGroundPayId);
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
	 * Returns the tourism bona ground payment info with the primary key.
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info
	 * @throws PortalException if a tourism bona ground payment info with the primary key could not be found
	 */
	public static TourismBonaGroundPaymentInfo getTourismBonaGroundPaymentInfo(
			long tourismBonaGroundPayId)
		throws PortalException {

		return getService().getTourismBonaGroundPaymentInfo(
			tourismBonaGroundPayId);
	}

	/**
	 * Returns a range of all the tourism bona ground payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground payment infos
	 * @param end the upper bound of the range of tourism bona ground payment infos (not inclusive)
	 * @return the range of tourism bona ground payment infos
	 */
	public static List<TourismBonaGroundPaymentInfo>
		getTourismBonaGroundPaymentInfos(int start, int end) {

		return getService().getTourismBonaGroundPaymentInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona ground payment infos.
	 *
	 * @return the number of tourism bona ground payment infos
	 */
	public static int getTourismBonaGroundPaymentInfosCount() {
		return getService().getTourismBonaGroundPaymentInfosCount();
	}

	public static TourismBonaGroundPaymentInfo getTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundPaymentInfoException {

		return getService().getTourismById(tourismApplicationId);
	}

	/**
	 * Updates the tourism bona ground payment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundPaymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundPaymentInfo the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was updated
	 */
	public static TourismBonaGroundPaymentInfo
		updateTourismBonaGroundPaymentInfo(
			TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		return getService().updateTourismBonaGroundPaymentInfo(
			tourismBonaGroundPaymentInfo);
	}

	public static TourismBonaGroundPaymentInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TourismBonaGroundPaymentInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			TourismBonaGroundPaymentInfoLocalServiceUtil.class,
			TourismBonaGroundPaymentInfoLocalService.class);

}