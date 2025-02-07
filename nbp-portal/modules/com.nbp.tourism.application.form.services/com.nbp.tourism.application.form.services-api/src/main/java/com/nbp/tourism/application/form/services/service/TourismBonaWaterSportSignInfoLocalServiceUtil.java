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

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportSignInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismBonaWaterSportSignInfo. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaWaterSportSignInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportSignInfoLocalService
 * @generated
 */
public class TourismBonaWaterSportSignInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaWaterSportSignInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the tourism bona water sport sign info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportSignInfo the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info that was added
	 */
	public static TourismBonaWaterSportSignInfo
		addTourismBonaWaterSportSignInfo(
			TourismBonaWaterSportSignInfo tourismBonaWaterSportSignInfo) {

		return getService().addTourismBonaWaterSportSignInfo(
			tourismBonaWaterSportSignInfo);
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
	 * Creates a new tourism bona water sport sign info with the primary key. Does not add the tourism bona water sport sign info to the database.
	 *
	 * @param tourismBonaWSSignId the primary key for the new tourism bona water sport sign info
	 * @return the new tourism bona water sport sign info
	 */
	public static TourismBonaWaterSportSignInfo
		createTourismBonaWaterSportSignInfo(long tourismBonaWSSignId) {

		return getService().createTourismBonaWaterSportSignInfo(
			tourismBonaWSSignId);
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
	 * Deletes the tourism bona water sport sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWSSignId the primary key of the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info that was removed
	 * @throws PortalException if a tourism bona water sport sign info with the primary key could not be found
	 */
	public static TourismBonaWaterSportSignInfo
			deleteTourismBonaWaterSportSignInfo(long tourismBonaWSSignId)
		throws PortalException {

		return getService().deleteTourismBonaWaterSportSignInfo(
			tourismBonaWSSignId);
	}

	/**
	 * Deletes the tourism bona water sport sign info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportSignInfo the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info that was removed
	 */
	public static TourismBonaWaterSportSignInfo
		deleteTourismBonaWaterSportSignInfo(
			TourismBonaWaterSportSignInfo tourismBonaWaterSportSignInfo) {

		return getService().deleteTourismBonaWaterSportSignInfo(
			tourismBonaWaterSportSignInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportSignInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportSignInfoModelImpl</code>.
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

	public static TourismBonaWaterSportSignInfo
		fetchTourismBonaWaterSportSignInfo(long tourismBonaWSSignId) {

		return getService().fetchTourismBonaWaterSportSignInfo(
			tourismBonaWSSignId);
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
	 * Returns the tourism bona water sport sign info with the primary key.
	 *
	 * @param tourismBonaWSSignId the primary key of the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info
	 * @throws PortalException if a tourism bona water sport sign info with the primary key could not be found
	 */
	public static TourismBonaWaterSportSignInfo
			getTourismBonaWaterSportSignInfo(long tourismBonaWSSignId)
		throws PortalException {

		return getService().getTourismBonaWaterSportSignInfo(
			tourismBonaWSSignId);
	}

	/**
	 * Returns a range of all the tourism bona water sport sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sport sign infos
	 * @param end the upper bound of the range of tourism bona water sport sign infos (not inclusive)
	 * @return the range of tourism bona water sport sign infos
	 */
	public static List<TourismBonaWaterSportSignInfo>
		getTourismBonaWaterSportSignInfos(int start, int end) {

		return getService().getTourismBonaWaterSportSignInfos(start, end);
	}

	/**
	 * Returns the number of tourism bona water sport sign infos.
	 *
	 * @return the number of tourism bona water sport sign infos
	 */
	public static int getTourismBonaWaterSportSignInfosCount() {
		return getService().getTourismBonaWaterSportSignInfosCount();
	}

	public static TourismBonaWaterSportSignInfo getTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportSignInfoException {

		return getService().getTourismById(tourismApplicationId);
	}

	/**
	 * Updates the tourism bona water sport sign info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportSignInfo the tourism bona water sport sign info
	 * @return the tourism bona water sport sign info that was updated
	 */
	public static TourismBonaWaterSportSignInfo
		updateTourismBonaWaterSportSignInfo(
			TourismBonaWaterSportSignInfo tourismBonaWaterSportSignInfo) {

		return getService().updateTourismBonaWaterSportSignInfo(
			tourismBonaWaterSportSignInfo);
	}

	public static TourismBonaWaterSportSignInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TourismBonaWaterSportSignInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			TourismBonaWaterSportSignInfoLocalServiceUtil.class,
			TourismBonaWaterSportSignInfoLocalService.class);

}