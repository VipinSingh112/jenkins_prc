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

import com.nbp.tourism.application.form.services.model.TourismSummaryAddBox;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismSummaryAddBox. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismSummaryAddBoxLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismSummaryAddBoxLocalService
 * @generated
 */
public class TourismSummaryAddBoxLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismSummaryAddBoxLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the tourism summary add box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismSummaryAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismSummaryAddBox the tourism summary add box
	 * @return the tourism summary add box that was added
	 */
	public static TourismSummaryAddBox addTourismSummaryAddBox(
		TourismSummaryAddBox tourismSummaryAddBox) {

		return getService().addTourismSummaryAddBox(tourismSummaryAddBox);
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
	 * Creates a new tourism summary add box with the primary key. Does not add the tourism summary add box to the database.
	 *
	 * @param tourismSummaryBoxId the primary key for the new tourism summary add box
	 * @return the new tourism summary add box
	 */
	public static TourismSummaryAddBox createTourismSummaryAddBox(
		long tourismSummaryBoxId) {

		return getService().createTourismSummaryAddBox(tourismSummaryBoxId);
	}

	public static void deleteBYId(long applicatioId) {
		getService().deleteBYId(applicatioId);
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
	 * Deletes the tourism summary add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismSummaryAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box that was removed
	 * @throws PortalException if a tourism summary add box with the primary key could not be found
	 */
	public static TourismSummaryAddBox deleteTourismSummaryAddBox(
			long tourismSummaryBoxId)
		throws PortalException {

		return getService().deleteTourismSummaryAddBox(tourismSummaryBoxId);
	}

	/**
	 * Deletes the tourism summary add box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismSummaryAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismSummaryAddBox the tourism summary add box
	 * @return the tourism summary add box that was removed
	 */
	public static TourismSummaryAddBox deleteTourismSummaryAddBox(
		TourismSummaryAddBox tourismSummaryAddBox) {

		return getService().deleteTourismSummaryAddBox(tourismSummaryAddBox);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxModelImpl</code>.
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

	public static TourismSummaryAddBox fetchTourismSummaryAddBox(
		long tourismSummaryBoxId) {

		return getService().fetchTourismSummaryAddBox(tourismSummaryBoxId);
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

	public static List<TourismSummaryAddBox> getTAP_TAI(long applicationId) {
		return getService().getTAP_TAI(applicationId);
	}

	/**
	 * Returns the tourism summary add box with the primary key.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box
	 * @throws PortalException if a tourism summary add box with the primary key could not be found
	 */
	public static TourismSummaryAddBox getTourismSummaryAddBox(
			long tourismSummaryBoxId)
		throws PortalException {

		return getService().getTourismSummaryAddBox(tourismSummaryBoxId);
	}

	/**
	 * Returns a range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @return the range of tourism summary add boxes
	 */
	public static List<TourismSummaryAddBox> getTourismSummaryAddBoxes(
		int start, int end) {

		return getService().getTourismSummaryAddBoxes(start, end);
	}

	/**
	 * Returns the number of tourism summary add boxes.
	 *
	 * @return the number of tourism summary add boxes
	 */
	public static int getTourismSummaryAddBoxesCount() {
		return getService().getTourismSummaryAddBoxesCount();
	}

	/**
	 * Updates the tourism summary add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismSummaryAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismSummaryAddBox the tourism summary add box
	 * @return the tourism summary add box that was updated
	 */
	public static TourismSummaryAddBox updateTourismSummaryAddBox(
		TourismSummaryAddBox tourismSummaryAddBox) {

		return getService().updateTourismSummaryAddBox(tourismSummaryAddBox);
	}

	public static TourismSummaryAddBoxLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TourismSummaryAddBoxLocalService>
		_serviceSnapshot = new Snapshot<>(
			TourismSummaryAddBoxLocalServiceUtil.class,
			TourismSummaryAddBoxLocalService.class);

}