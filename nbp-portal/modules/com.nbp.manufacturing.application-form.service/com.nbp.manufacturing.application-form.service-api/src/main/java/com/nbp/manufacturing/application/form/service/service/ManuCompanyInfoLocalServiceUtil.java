/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ManuCompanyInfo. This utility wraps
 * <code>com.nbp.manufacturing.application.form.service.service.impl.ManuCompanyInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoLocalService
 * @generated
 */
public class ManuCompanyInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.form.service.service.impl.ManuCompanyInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manu company info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfo the manu company info
	 * @return the manu company info that was added
	 */
	public static ManuCompanyInfo addManuCompanyInfo(
		ManuCompanyInfo manuCompanyInfo) {

		return getService().addManuCompanyInfo(manuCompanyInfo);
	}

	/**
	 * Creates a new manu company info with the primary key. Does not add the manu company info to the database.
	 *
	 * @param manuCompanyInfoId the primary key for the new manu company info
	 * @return the new manu company info
	 */
	public static ManuCompanyInfo createManuCompanyInfo(
		long manuCompanyInfoId) {

		return getService().createManuCompanyInfo(manuCompanyInfoId);
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
	 * Deletes the manu company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info that was removed
	 * @throws PortalException if a manu company info with the primary key could not be found
	 */
	public static ManuCompanyInfo deleteManuCompanyInfo(long manuCompanyInfoId)
		throws PortalException {

		return getService().deleteManuCompanyInfo(manuCompanyInfoId);
	}

	/**
	 * Deletes the manu company info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfo the manu company info
	 * @return the manu company info that was removed
	 */
	public static ManuCompanyInfo deleteManuCompanyInfo(
		ManuCompanyInfo manuCompanyInfo) {

		return getService().deleteManuCompanyInfo(manuCompanyInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoModelImpl</code>.
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

	public static ManuCompanyInfo fetchManuCompanyInfo(long manuCompanyInfoId) {
		return getService().fetchManuCompanyInfo(manuCompanyInfoId);
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

	public static ManuCompanyInfo getMA_CI_MAI(long applicationId) {
		return getService().getMA_CI_MAI(applicationId);
	}

	public static ManuCompanyInfo getManuById(long applicationId) {
		return getService().getManuById(applicationId);
	}

	/**
	 * Returns the manu company info with the primary key.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info
	 * @throws PortalException if a manu company info with the primary key could not be found
	 */
	public static ManuCompanyInfo getManuCompanyInfo(long manuCompanyInfoId)
		throws PortalException {

		return getService().getManuCompanyInfo(manuCompanyInfoId);
	}

	/**
	 * Returns a range of all the manu company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @return the range of manu company infos
	 */
	public static List<ManuCompanyInfo> getManuCompanyInfos(
		int start, int end) {

		return getService().getManuCompanyInfos(start, end);
	}

	/**
	 * Returns the number of manu company infos.
	 *
	 * @return the number of manu company infos
	 */
	public static int getManuCompanyInfosCount() {
		return getService().getManuCompanyInfosCount();
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
	 * Updates the manu company info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfo the manu company info
	 * @return the manu company info that was updated
	 */
	public static ManuCompanyInfo updateManuCompanyInfo(
		ManuCompanyInfo manuCompanyInfo) {

		return getService().updateManuCompanyInfo(manuCompanyInfo);
	}

	public static ManuCompanyInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManuCompanyInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			ManuCompanyInfoLocalServiceUtil.class,
			ManuCompanyInfoLocalService.class);

}