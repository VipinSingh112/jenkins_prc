/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JADSCNoticeOfAppearance. This utility wraps
 * <code>com.nbp.jadsc.application.form.service.service.impl.JADSCNoticeOfAppearanceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCNoticeOfAppearanceLocalService
 * @generated
 */
public class JADSCNoticeOfAppearanceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.application.form.service.service.impl.JADSCNoticeOfAppearanceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc notice of appearance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCNoticeOfAppearanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscNoticeOfAppearance the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was added
	 */
	public static JADSCNoticeOfAppearance addJADSCNoticeOfAppearance(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		return getService().addJADSCNoticeOfAppearance(jadscNoticeOfAppearance);
	}

	/**
	 * Creates a new jadsc notice of appearance with the primary key. Does not add the jadsc notice of appearance to the database.
	 *
	 * @param jadscNOAId the primary key for the new jadsc notice of appearance
	 * @return the new jadsc notice of appearance
	 */
	public static JADSCNoticeOfAppearance createJADSCNoticeOfAppearance(
		long jadscNOAId) {

		return getService().createJADSCNoticeOfAppearance(jadscNOAId);
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
	 * Deletes the jadsc notice of appearance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCNoticeOfAppearanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscNoticeOfAppearance the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was removed
	 */
	public static JADSCNoticeOfAppearance deleteJADSCNoticeOfAppearance(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		return getService().deleteJADSCNoticeOfAppearance(
			jadscNoticeOfAppearance);
	}

	/**
	 * Deletes the jadsc notice of appearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCNoticeOfAppearanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was removed
	 * @throws PortalException if a jadsc notice of appearance with the primary key could not be found
	 */
	public static JADSCNoticeOfAppearance deleteJADSCNoticeOfAppearance(
			long jadscNOAId)
		throws PortalException {

		return getService().deleteJADSCNoticeOfAppearance(jadscNOAId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCNoticeOfAppearanceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCNoticeOfAppearanceModelImpl</code>.
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

	public static JADSCNoticeOfAppearance fetchJADSCNoticeOfAppearance(
		long jadscNOAId) {

		return getService().fetchJADSCNoticeOfAppearance(jadscNOAId);
	}

	/**
	 * Returns the jadsc notice of appearance matching the UUID and group.
	 *
	 * @param uuid the jadsc notice of appearance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance
		fetchJADSCNoticeOfAppearanceByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchJADSCNoticeOfAppearanceByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc notice of appearance with the primary key.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance
	 * @throws PortalException if a jadsc notice of appearance with the primary key could not be found
	 */
	public static JADSCNoticeOfAppearance getJADSCNoticeOfAppearance(
			long jadscNOAId)
		throws PortalException {

		return getService().getJADSCNoticeOfAppearance(jadscNOAId);
	}

	public static JADSCNoticeOfAppearance getJADSCNoticeOfAppearanceBy_Id(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return getService().getJADSCNoticeOfAppearanceBy_Id(jadscApplicationId);
	}

	/**
	 * Returns the jadsc notice of appearance matching the UUID and group.
	 *
	 * @param uuid the jadsc notice of appearance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc notice of appearance
	 * @throws PortalException if a matching jadsc notice of appearance could not be found
	 */
	public static JADSCNoticeOfAppearance
			getJADSCNoticeOfAppearanceByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getJADSCNoticeOfAppearanceByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of jadsc notice of appearances
	 */
	public static List<JADSCNoticeOfAppearance> getJADSCNoticeOfAppearances(
		int start, int end) {

		return getService().getJADSCNoticeOfAppearances(start, end);
	}

	/**
	 * Returns all the jadsc notice of appearances matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc notice of appearances
	 * @param companyId the primary key of the company
	 * @return the matching jadsc notice of appearances, or an empty list if no matches were found
	 */
	public static List<JADSCNoticeOfAppearance>
		getJADSCNoticeOfAppearancesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getJADSCNoticeOfAppearancesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jadsc notice of appearances matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc notice of appearances
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc notice of appearances, or an empty list if no matches were found
	 */
	public static List<JADSCNoticeOfAppearance>
		getJADSCNoticeOfAppearancesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return getService().getJADSCNoticeOfAppearancesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc notice of appearances.
	 *
	 * @return the number of jadsc notice of appearances
	 */
	public static int getJADSCNoticeOfAppearancesCount() {
		return getService().getJADSCNoticeOfAppearancesCount();
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
	 * Updates the jadsc notice of appearance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCNoticeOfAppearanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscNoticeOfAppearance the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was updated
	 */
	public static JADSCNoticeOfAppearance updateJADSCNoticeOfAppearance(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		return getService().updateJADSCNoticeOfAppearance(
			jadscNoticeOfAppearance);
	}

	public static JADSCNoticeOfAppearanceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JADSCNoticeOfAppearanceLocalService>
		_serviceSnapshot = new Snapshot<>(
			JADSCNoticeOfAppearanceLocalServiceUtil.class,
			JADSCNoticeOfAppearanceLocalService.class);

}