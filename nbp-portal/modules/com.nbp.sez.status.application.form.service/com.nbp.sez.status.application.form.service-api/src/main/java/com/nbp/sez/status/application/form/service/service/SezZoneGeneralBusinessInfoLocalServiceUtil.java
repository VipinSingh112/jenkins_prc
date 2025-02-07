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

import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezZoneGeneralBusinessInfo. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezZoneGeneralBusinessInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBusinessInfoLocalService
 * @generated
 */
public class SezZoneGeneralBusinessInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezZoneGeneralBusinessInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez zone general business info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBusinessInfo the sez zone general business info
	 * @return the sez zone general business info that was added
	 */
	public static SezZoneGeneralBusinessInfo addSezZoneGeneralBusinessInfo(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		return getService().addSezZoneGeneralBusinessInfo(
			sezZoneGeneralBusinessInfo);
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
	 * Creates a new sez zone general business info with the primary key. Does not add the sez zone general business info to the database.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key for the new sez zone general business info
	 * @return the new sez zone general business info
	 */
	public static SezZoneGeneralBusinessInfo createSezZoneGeneralBusinessInfo(
		long sezZoneGeneralBusinessInfoId) {

		return getService().createSezZoneGeneralBusinessInfo(
			sezZoneGeneralBusinessInfoId);
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
	 * Deletes the sez zone general business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info that was removed
	 * @throws PortalException if a sez zone general business info with the primary key could not be found
	 */
	public static SezZoneGeneralBusinessInfo deleteSezZoneGeneralBusinessInfo(
			long sezZoneGeneralBusinessInfoId)
		throws PortalException {

		return getService().deleteSezZoneGeneralBusinessInfo(
			sezZoneGeneralBusinessInfoId);
	}

	/**
	 * Deletes the sez zone general business info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBusinessInfo the sez zone general business info
	 * @return the sez zone general business info that was removed
	 */
	public static SezZoneGeneralBusinessInfo deleteSezZoneGeneralBusinessInfo(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		return getService().deleteSezZoneGeneralBusinessInfo(
			sezZoneGeneralBusinessInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBusinessInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBusinessInfoModelImpl</code>.
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

	public static SezZoneGeneralBusinessInfo fetchSezZoneGeneralBusinessInfo(
		long sezZoneGeneralBusinessInfoId) {

		return getService().fetchSezZoneGeneralBusinessInfo(
			sezZoneGeneralBusinessInfoId);
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

	public static SezZoneGeneralBusinessInfo getSezById(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneGeneralBusinessInfoException {

		return getService().getSezById(sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone general business info with the primary key.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info
	 * @throws PortalException if a sez zone general business info with the primary key could not be found
	 */
	public static SezZoneGeneralBusinessInfo getSezZoneGeneralBusinessInfo(
			long sezZoneGeneralBusinessInfoId)
		throws PortalException {

		return getService().getSezZoneGeneralBusinessInfo(
			sezZoneGeneralBusinessInfoId);
	}

	/**
	 * Returns a range of all the sez zone general business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general business infos
	 * @param end the upper bound of the range of sez zone general business infos (not inclusive)
	 * @return the range of sez zone general business infos
	 */
	public static List<SezZoneGeneralBusinessInfo>
		getSezZoneGeneralBusinessInfos(int start, int end) {

		return getService().getSezZoneGeneralBusinessInfos(start, end);
	}

	/**
	 * Returns the number of sez zone general business infos.
	 *
	 * @return the number of sez zone general business infos
	 */
	public static int getSezZoneGeneralBusinessInfosCount() {
		return getService().getSezZoneGeneralBusinessInfosCount();
	}

	/**
	 * Updates the sez zone general business info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBusinessInfo the sez zone general business info
	 * @return the sez zone general business info that was updated
	 */
	public static SezZoneGeneralBusinessInfo updateSezZoneGeneralBusinessInfo(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		return getService().updateSezZoneGeneralBusinessInfo(
			sezZoneGeneralBusinessInfo);
	}

	public static SezZoneGeneralBusinessInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezZoneGeneralBusinessInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezZoneGeneralBusinessInfoLocalServiceUtil.class,
			SezZoneGeneralBusinessInfoLocalService.class);

}