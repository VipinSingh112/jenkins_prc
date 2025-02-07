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

import com.nbp.hsra.application.service.model.FitPropBusinessInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FitPropBusinessInfo. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.FitPropBusinessInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropBusinessInfoLocalService
 * @generated
 */
public class FitPropBusinessInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.FitPropBusinessInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the fit prop business info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropBusinessInfo the fit prop business info
	 * @return the fit prop business info that was added
	 */
	public static FitPropBusinessInfo addFitPropBusinessInfo(
		FitPropBusinessInfo fitPropBusinessInfo) {

		return getService().addFitPropBusinessInfo(fitPropBusinessInfo);
	}

	/**
	 * Creates a new fit prop business info with the primary key. Does not add the fit prop business info to the database.
	 *
	 * @param fitPropBusinessInfoId the primary key for the new fit prop business info
	 * @return the new fit prop business info
	 */
	public static FitPropBusinessInfo createFitPropBusinessInfo(
		long fitPropBusinessInfoId) {

		return getService().createFitPropBusinessInfo(fitPropBusinessInfoId);
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
	 * Deletes the fit prop business info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropBusinessInfo the fit prop business info
	 * @return the fit prop business info that was removed
	 */
	public static FitPropBusinessInfo deleteFitPropBusinessInfo(
		FitPropBusinessInfo fitPropBusinessInfo) {

		return getService().deleteFitPropBusinessInfo(fitPropBusinessInfo);
	}

	/**
	 * Deletes the fit prop business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info that was removed
	 * @throws PortalException if a fit prop business info with the primary key could not be found
	 */
	public static FitPropBusinessInfo deleteFitPropBusinessInfo(
			long fitPropBusinessInfoId)
		throws PortalException {

		return getService().deleteFitPropBusinessInfo(fitPropBusinessInfoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropBusinessInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropBusinessInfoModelImpl</code>.
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

	public static FitPropBusinessInfo fetchFitPropBusinessInfo(
		long fitPropBusinessInfoId) {

		return getService().fetchFitPropBusinessInfo(fitPropBusinessInfoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the fit prop business info with the primary key.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info
	 * @throws PortalException if a fit prop business info with the primary key could not be found
	 */
	public static FitPropBusinessInfo getFitPropBusinessInfo(
			long fitPropBusinessInfoId)
		throws PortalException {

		return getService().getFitPropBusinessInfo(fitPropBusinessInfoId);
	}

	/**
	 * Returns a range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @return the range of fit prop business infos
	 */
	public static List<FitPropBusinessInfo> getFitPropBusinessInfos(
		int start, int end) {

		return getService().getFitPropBusinessInfos(start, end);
	}

	/**
	 * Returns the number of fit prop business infos.
	 *
	 * @return the number of fit prop business infos
	 */
	public static int getFitPropBusinessInfosCount() {
		return getService().getFitPropBusinessInfosCount();
	}

	public static FitPropBusinessInfo getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropBusinessInfoException {

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
	 * Updates the fit prop business info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropBusinessInfo the fit prop business info
	 * @return the fit prop business info that was updated
	 */
	public static FitPropBusinessInfo updateFitPropBusinessInfo(
		FitPropBusinessInfo fitPropBusinessInfo) {

		return getService().updateFitPropBusinessInfo(fitPropBusinessInfo);
	}

	public static FitPropBusinessInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FitPropBusinessInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			FitPropBusinessInfoLocalServiceUtil.class,
			FitPropBusinessInfoLocalService.class);

}